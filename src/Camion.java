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
