import javax.sound.sampled.SourceDataLine;

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
public void realizarMantenimiento(){
    super.realizarMantenimiento();
    System.out.println("Chequeo del tanque de combustible");
    System.out.println("Revision de faros");
    System.out.println("Cambio de aceite");
}
 
  public void costoMantenimiento(double kmrecorridos, double costoporkm){
    double CostodeMantenimiento= kmrecorridos*costoporkm; 
    System.out.println("El costo total del matenimiento es: "+CostodeMantenimiento);
  }
  

}
