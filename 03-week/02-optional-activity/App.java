public class App {

    public static void main(String[] args) {

        // Crear tarjeta con saldo inicial válido
        TarjetaTransporte tarjeta = new TarjetaTransporte("T001", 5000);

        tarjeta.resumen();

        // 1️⃣ Recarga válida
        tarjeta.recargar(3000);

        // 2️⃣ Pago válido
        tarjeta.pagarPasaje(2500);

        // 3️⃣ Pago sin saldo suficiente
        tarjeta.pagarPasaje(10000);

        // 4️⃣ Pago con tarjeta desactivada
        tarjeta.desactivar();
        tarjeta.pagarPasaje(1000);

        // Reactivar y mostrar resumen final
        tarjeta.activar();
        tarjeta.resumen();
    }
}