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

    
     //Independiente 
     public void realizarMantenimiento(){
        System.out.println("\t\tMantenimiento del vehiculo ");
    System.out.println("Chequeo del tanque de combustible");
    System.out.println("Revision de faros");
    System.out.println("Cambio de aceite");
    System.out.println("Mantenimiento de frenos");
    System.out.println("Cambio de llantas");
      }





}
