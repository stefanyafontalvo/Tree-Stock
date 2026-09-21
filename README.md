# Sistema de Inventario "Tree-Stock"

## 1. Objetivo del Proyecto
El objetivo de este proyecto es implementar un sistema de gestión de inventarios mediante un **Árbol Binario de Búsqueda (ABB)** desarrollado en Java, aplicando estructuras de datos dinámicas sin uso de librerías automáticas de colecciones.

---

## 2. Marco Teórico

### ¿Qué es un Árbol Binario de Búsqueda (ABB)?
Un Árbol Binario de Búsqueda es una estructura de datos no lineal y dinámica compuesta por nodos. Cada nodo contiene un valor principal (en este caso, un `Producto` con su `ID` y `Nombre`) y hasta dos referencias o punteros llamados `izquierdo` y `derecho`.

La propiedad fundamental del ABB es la siguiente:
- Los nodos ubicados en el subárbol **izquierdo** contienen identificadores (IDs) **menores** que el nodo actual.
- Los nodos ubicados en el subárbol **derecho** contienen identificadores (IDs) **mayores** que el nodo actual.

### Aplicación de la Recursividad
La recursividad es la técnica mediante la cual un método se llama a sí mismo para resolver un problema dividiéndolo en subproblemas más pequeños:
1. **Inserción:** Al registrar un nuevo producto, el método compara su `ID` con el nodo actual. Si es menor, se llama recursivamente hacia la izquierda; si es mayor, hacia la derecha, hasta encontrar una posición libre (`null`).
2. **Recorrido Inorden:** Para listar el inventario ordenado de menor a mayor, el árbol visita de manera recursiva el subárbol izquierdo, procesa el nodo actual y finalmente recorre el subárbol derecho.
3. **Búsqueda:** Permite encontrar un producto en tiempo $O(\log n)$ en el mejor de los casos, descendiendo por la rama izquierda o derecha según la comparación del `ID`.

---

## 3. Estructura de Clases
- **`Producto.java`**: Representa el nodo del árbol con `id`, `nombre` y sus referencias `izquierdo` y `derecho`.
- **`ArbolInventario.java`**: Contiene la lógica central del ABB (métodos recursivos para insertar, buscar y recorrer en inorden).
- **`Main.java`**: Presenta la interfaz de consola interactiva basada en un menú `switch-case`.

---

## 4. Instrucciones de Compilación y Ejecución

1. Abrir la terminal en la carpeta raíz del proyecto.
2. Compilar todas las clases del proyecto:
   ```bash
   javac *.java