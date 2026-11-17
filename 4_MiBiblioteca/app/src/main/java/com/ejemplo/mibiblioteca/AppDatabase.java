package com.ejemplo.mibiblioteca;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executors;

/**
 * BASE DE DATOS: une las entidades y da acceso a los DAO.
 * Patrón singleton: una sola instancia para toda la app.
 */
@Database(entities = {Libro.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract LibroDao libroDao();

    private static volatile AppDatabase instancia;

    public static AppDatabase getInstance(Context context) {
        if (instancia == null) {
            synchronized (AppDatabase.class) {
                if (instancia == null) {
                    instancia = Room.databaseBuilder(
                                    context.getApplicationContext(),
                                    AppDatabase.class,
                                    "biblioteca.db")          // nombre del fichero SQLite
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return instancia;
    }

    private static final RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            Executors.newSingleThreadExecutor().execute(() -> {
                LibroDao dao = instancia.libroDao();
                dao.insertar(new Libro("Cien años de soledad", "Gabriel García Márquez", 417));
                dao.insertar(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863));
                dao.insertar(new Libro("1984", "George Orwell", 328));
                dao.insertar(new Libro("El Principito", "Antoine de Saint-Exupéry", 96));
            });
        }
    };
}
