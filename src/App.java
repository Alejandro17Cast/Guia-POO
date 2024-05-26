public class App {
    public static void main(String[] args) throws Exception {
      
        Auto auto=new Auto("Toyota", "Supra MK5", 2022, 2000, 5);

        Camion camion= new Camion("Ford", "Zt", 2011, 1500, 2000); 

         System.out.println("                        ");
         System.out.println("\t\t Informacion del Auto");
         System.out.println("                        ");
         auto.mostrarInfo();

         System.out.println("                        ");
         System.out.println("\t\t Informacion del camion: ");
         System.out.println("                        ");
         camion.mostrarInfo();
    }
}
