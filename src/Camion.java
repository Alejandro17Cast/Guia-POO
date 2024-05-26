public class Camion extends vehiculoCarga {

    private int numEjes;

    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;

    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;

    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de Ejes: " + numEjes);
    }

    @Override
    public void realizarMantenimiento(){
        super.realizarMantenimiento();
        System.out.println("Cambio de aceite");
        System.out.println("Mantenimiento de frenos");
        System.out.println("Cambio de llantas");
    }
     
      public void costoMantenimiento(double kmrecorridos, double costoporkm){
        double CostodeMantenimiento= kmrecorridos*costoporkm; 
        System.out.println("El costo total del matenimiento es: "+CostodeMantenimiento);
      }



}
