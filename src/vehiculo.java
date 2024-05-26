public class vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    // Constructor
    public vehiculo(String marca, String modelo, int año, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }

    // GETySET
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;

    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;

    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;

    }

    // Metodo para mostrar la informacion del vehiculo

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Mdodelo: " + modelo);
        System.out.println("kilometraje: " + kilometraje);
        System.out.println("Año: " + año);


    }



    public void realizarMantenmiento() {
        System.out.println("\t\t\t Mantenimientos del vehiculo");
        System.out.println("1. Cambio de aceite");
        System.out.println("2. Cambio de focos");
        System.out.println("3. Limpieza del motor");
        System.out.println("4. Cambio de llantas");
        System.out.println("5. Arreglos de tricos ");
     }
}
