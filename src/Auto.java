public class Auto extends VehiculoPasajero {

    private String tipoCombustible;

    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje, numPasajeros);

    }

    // Constructor

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;

    }



    @Override
    public void mostrarInfo() {
      super.mostrarInfo();
      System.out.println("Tipo de combustible: " +tipoCombustible);
  }







}
