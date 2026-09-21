public class ArbolInventario {
    private Producto raiz;

    public ArbolInventario() {
        this.raiz = null;
    }

    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    private Producto insertarRecursivo(Producto actual, int id, String nombre) {
        if (actual == null) {
            return new Producto(id, nombre);
        }
        if (id < actual.id) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, id, nombre);
        } else if (id > actual.id) {
            actual.derecho = insertarRecursivo(actual.derecho, id, nombre);
        } else {
            System.out.println("-> Error: El producto con ID " + id + " ya existe.");
        }
        return actual;
    }

    public void mostrarInorden() {
        if (raiz == null) {
            System.out.println("El inventario esta vacio.");
        } else {
            inordenRecursivo(raiz);
        }
    }

    private void inordenRecursivo(Producto actual) {
        if (actual != null) {
            inordenRecursivo(actual.izquierdo);
            System.out.println("ID: " + actual.id + " | Nombre: " + actual.nombre);
            inordenRecursivo(actual.derecho);
        }
    }

    public void buscar(int id) {
        Producto encontrado = buscarRecursivo(raiz, id);
        if (encontrado != null) {
            System.out.println("-> Producto encontrado: ID " + encontrado.id + " - " + encontrado.nombre);
        } else {
            System.out.println("-> El producto con ID " + id + " NO existe en el inventario.");
        }
    }

    private Producto buscarRecursivo(Producto actual, int id) {
        if (actual == null || actual.id == id) {
            return actual;
        }
        if (id < actual.id) {
            return buscarRecursivo(actual.izquierdo, id);
        }
        return buscarRecursivo(actual.derecho, id);
    }
}