public class VehiculoPasajero extends vehiculo{



    private int numPasajeros; 


public VehiculoPasajero(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje);
       this.numPasajeros=numPasajeros; 
    }
    public int getNumPasajero() {
        return numPasajeros;
    }

    public void setNumPasajero(int numPasajeros) {
        this.numPasajeros = numPasajeros;

    }


  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Numero de Pasajero: " +numPasajeros);
}















}
