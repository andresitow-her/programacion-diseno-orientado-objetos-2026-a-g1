public class App {

    public static void main(String[] args) {

        // Reserva con desayuno
        ReservaHotel r1 = new ReservaHotel(
                "R001",
                "Andres Herrera",
                3,
                150000,
                true
        );

        // Reserva sin desayuno (constructor alterno)
        ReservaHotel r2 = new ReservaHotel(
                "R002",
                "Maria Lopez",
                2,
                120000
        );

        // Otra reserva con desayuno
        ReservaHotel r3 = new ReservaHotel(
                "R003",
                "Carlos Perez",
                5,
                100000,
                false
        );

        // Imprimir reservas
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}