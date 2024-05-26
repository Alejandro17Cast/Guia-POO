public class vehiculoCarga extends vehiculo {

    private int capacidadCarga;

    // contructor
    public vehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga) {

        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;

    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;

    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de Carga: " + capacidadCarga + "kg");
    }

}
