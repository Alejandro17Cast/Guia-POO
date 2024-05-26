
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

  @Override
  public void realizarMantenmiento(){
      super.realizarMantenmiento();
      System.out.println("1. Limpieza del motor");
      System.out.println("2. Cambio de llantas");
      System.out.println("3. Arreglos de tricos ");
  }

  public void costoMantenimiento(double kmrecorridos, double costoporkm){
double CostoMantenimiento=kmrecorridos*costoporkm; 
System.out.println("El costo total por el mantenimiento es: "+CostoMantenimiento);

  }





}
