# Hito 2: Entrega de las prácticas de la Unidad 2

**Módulo:** 0489 - Programación multimedia y dispositivos móviles (PMDM)  
**Unidad:** Unidad 2. Programación de aplicaciones móviles  
**Centro:** Prometeo by thePower  

---

## 👥 Integrantes de la pareja

* **Juan Pablo Perdiz**
* **Agustín Scandolo**

---

## 📋 Reparto de tareas y responsabilidades

Para la realización y entrega de este hito, el trabajo se ha distribuido equitativamente de la siguiente manera:

### **Juan Pablo Perdiz**
* **Práctica 1 (`1_EnrutamientoAvanzado`):** Desarrollo de la aplicación con Fragmentos, Navigation, SafeArgs y deep links.
* **Práctica 2 (`2_MisTareas`):** Desarrollo de la primera versión de la app de tareas con `RecyclerView`, `Adapter`, `ViewHolder` y los tres tipos de menús.
* **Práctica 3 (`3_MisTareas2`):** Evolución de la app anterior incorporando persistencia con `SharedPreferences`, diálogos (`AlertDialog`, `DatePicker`), `Toast` y `Snackbar`.

### **Agustín Scandolo**
* **Práctica 4 (`4_MiBiblioteca`):** Desarrollo de la aplicación de gestión de libros utilizando persistencia local con Room (Entidad, DAO, Base de datos) y manejo de hilos.
* **Práctica 5 (`5_NoticiasFP`):** Desarrollo de la aplicación aplicando componentes de Material Design (Tema, `Toolbar`, `NavigationDrawer`, `CardView`, `Chip`, `FAB` y modo oscuro).
* **Documentación (`evidencias/`):** Recopilación de las capturas de ejecución de las cinco aplicaciones, redacción de los pies explicativos y elaboración del documento final `Hito2_Evidencias_Perdiz_Scandolo.pdf`.

---

## 📁 Estructura del repositorio

El repositorio `PMDM_U2_Perdiz_Scandolo` está organizado siguiendo la estructura obligatoria para permitir abrir cada proyecto de forma independiente desde Android Studio (`File → Open`):

```text
PMDM_U2_Perdiz_Scandolo/
├── README.md                                  # Documentación del proyecto y reparto de tareas
├── .gitignore                                 # Exclusión de archivos autogenerados de Gradle y Android Studio
├── 1_EnrutamientoAvanzado/                    # Proyecto 1: Enrutamiento avanzado
├── 2_MisTareas/                               # Proyecto 2: Mis Tareas 1 (Listas y menús)
├── 3_MisTareas2/                              # Proyecto 3: Mis Tareas 2 (Preferencias y diálogos)
├── 4_MiBiblioteca/                            # Proyecto 4: Mi Biblioteca (Room e hilos)
├── 5_NoticiasFP/                              # Proyecto 5: Noticias FP (Material Design)
└── evidencias/
    └── Hito2_Evidencias_Perdiz_Scandolo.pdf   # Documento PDF con las pruebas de funcionamiento
```

## 🚀 Instrucciones de ejecución

1. Clonar este repositorio en una ruta local sin sincronización en la nube (por ejemplo, `C:\AndroidProjects\`):
   ```bash
   git clone https://github.com/USUARIO/PMDM_U2_Perdiz_Scandolo.git
   ```
2. Abrir **Android Studio**.
3. Seleccionar `File → Open` y elegir individualmente la carpeta raíz de cualquiera de los 5 proyectos numerados (donde se encuentra el archivo `settings.gradle.kts`).
4. Esperar a que Gradle sincronice las dependencias y ejecutar la aplicación en un emulador o dispositivo físico.
