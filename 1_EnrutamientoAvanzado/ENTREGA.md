# Entrega · Enrutamiento avanzado

## Funcionalidad implementada

- Formulario de nueva nota con validación de título y prioridad del 1 al 3.
- SafeArgs para pasar `tituloNota` y `prioridad` entre los destinos.
- Retorno con `popBackStack()`, conservando el contenido del formulario.
- Deep link con ambos argumentos: `notas://detalle/{tituloNota}/{prioridad}`.
- Ampliaciones realizadas: prioridad como argumento entero y deep link con dos datos.

## Prueba del deep link

Con la aplicación instalada en un emulador, ejecutar en PowerShell:

```powershell
& "$env:LOCALAPPDATA\Android\Sdk\platform-tools\adb.exe" shell am start -a android.intent.action.VIEW -d "notas://detalle/Comprar%20pan/2"
```

El destino esperado es «Detalle de la nota», con «Comprar pan» y prioridad 2.

## Respuestas

1. La Activity es el contenedor único de la app y aloja el NavHostFragment. Cada Fragment representa una pantalla con su propio layout y ciclo de vida.
2. Un fragmento del grafo puede declarar acciones (por ejemplo, FirstFragment a SecondFragment), argumentos (por ejemplo, `tituloNota` de tipo string) y deep links (por ejemplo, `notas://detalle/{tituloNota}/{prioridad}`).
3. SafeArgs genera `FirstFragmentDirections` para construir navegación tipada y `SecondFragmentArgs` para leer los argumentos. Las genera automáticamente el plugin de Gradle a partir del grafo.
4. `args.getTituloNota()` usa una clase generada y un nombre/tipo verificado al compilar. `getArguments().getString("tituloNota")` usa una clave de texto que puede escribirse mal sin que el compilador lo detecte.
5. `navigate()` hacia la pantalla inicial añade otra instancia al back stack. `popBackStack()` elimina la pantalla actual y vuelve a la instancia anterior.
6. `notas://` es el esquema; `detalle` identifica la ruta; `{tituloNota}` y `{prioridad}` son los valores que se extraen de la URI y se entregan al destino como argumentos.

## Capturas pendientes

Añadir aquí o en el documento final capturas de: formulario vacío con el aviso, detalle tras enviar una nota, regreso al formulario y apertura del deep link con adb.
