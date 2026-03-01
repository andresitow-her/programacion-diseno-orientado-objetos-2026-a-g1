public class TarjetaTransporte {

    //Atributos privados (Encapsulamiento)
    private String codigo;
    private double saldo;
    private boolean activa;

    //Constructor
    public TarjetaTransporte(String codigo, double saldoInicial) {

        this.codigo = codigo;

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("El saldo inicial no puede ser negativo. Se asignó 0.");
        }

        this.activa = true; // La tarjeta inicia activa
    }

    // Metodo recargar
    public void recargar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Recarga exitosa. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto debe ser mayor a 0.");
        }
    }

    //Metodo pagar pasaje
    public void pagarPasaje(double valorPasaje) {

        if (!activa) {
            System.out.println("No se puede pagar. La tarjeta está desactivada.");
            return;
        }

        if (valorPasaje <= 0) {
            System.out.println("El valor del pasaje debe ser mayor a 0.");
            return;
        }

        if (saldo >= valorPasaje) {
            saldo -= valorPasaje;
            System.out.println("Pago realizado con éxito. Saldo restante: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    //Activar tarjeta
    public void activar() {
        activa = true;
        System.out.println("Tarjeta activada.");
    }

    // Desactivar tarjeta
    public void desactivar() {
        activa = false;
        System.out.println("Tarjeta desactivada.");
    }

    //Obtener saldo
    public double getSaldo() {
        return saldo;
    }

    public void resumen() {
        System.out.println("----- RESUMEN TARJETA -----");
        System.out.println("Código: " + codigo);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Estado: " + (activa ? "Activa" : "Desactivada"));
        System.out.println("----------------------------");
    }
}