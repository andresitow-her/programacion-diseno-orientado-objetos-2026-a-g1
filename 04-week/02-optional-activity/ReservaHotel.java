public class ReservaHotel {

    //Atributos privados
    private String codigo;
    private String nombreHuesped;
    private int noches;
    private double valorNoche;
    private boolean incluyeDesayuno;

    //Constructor principal (recibe todo)
    public ReservaHotel(String codigo, String nombreHuesped,
                        int noches, double valorNoche, boolean incluyeDesayuno) {

        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }

        if (nombreHuesped == null || nombreHuesped.isEmpty()) {
            throw new IllegalArgumentException("El nombre del huésped no puede estar vacío.");
        }

        if (noches <= 0) {
            throw new IllegalArgumentException("Las noches deben ser mayores a 0.");
        }

        if (valorNoche <= 0) {
            throw new IllegalArgumentException("El valor por noche debe ser mayor a 0.");
        }

        this.codigo = codigo;
        this.nombreHuesped = nombreHuesped;
        this.noches = noches;
        this.valorNoche = valorNoche;
        this.incluyeDesayuno = incluyeDesayuno;
    }

    //Constructor alterno (sin desayuno)
    public ReservaHotel(String codigo, String nombreHuesped,
                        int noches, double valorNoche) {

        this(codigo, nombreHuesped, noches, valorNoche, false);
    }

    //Metodo para calcular total
    public double calcularTotal() {
        return noches * valorNoche;
    }

    //Representación clara
    @Override
    public String toString() {
        return "Reserva {" +
                "Código='" + codigo + '\'' +
                ", Huésped='" + nombreHuesped + '\'' +
                ", Noches=" + noches +
                ", Total=$" + calcularTotal() +
                ", Incluye desayuno=" + (incluyeDesayuno ? "Sí" : "No") +
                '}';
    }
}
