class App{
    static class Tarea {

        private String titulo;
        private String descripcion;
        private boolean completada;

        public Tarea(String titulo, String descripcion) {
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.completada = false;
        }

        public void marcarComoHecha() {
            completada = true;
        }

        public void marcarComoPendiente() {
            completada = false;
        }

        public String resumen() {
            String estado = completada ? "Completada" : "Pendiente";
            return "Título de la tareas: " + titulo +
                    "\nDescripción de la tarea: " + descripcion +
                    "\nEstado: " + estado;
        }
    }

    public static void main(String[] args) {

        Tarea t1 = new Tarea("Estudiar", "Repasar POO");
        Tarea t2 = new Tarea("Ejercicio", "30 minutos");
        Tarea t3 = new Tarea("Leer", "20 páginas");
        Tarea t4 = new Tarea("Ir a correr","Correr por Neiva");

        System.out.println("ESTADO INICIAL");
        System.out.println(t1.resumen());
        System.out.println(t2.resumen());
        System.out.println(t3.resumen());

        t1.marcarComoHecha();
        t3.marcarComoHecha();

        t3.marcarComoPendiente();

        System.out.println("DESPUÉS DE CAMBIOS");
        System.out.println(t1.resumen());
        System.out.println(t2.resumen());
        System.out.println(t3.resumen());
    }
}