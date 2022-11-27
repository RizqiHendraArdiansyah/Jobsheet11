public class BinatangMain {
    public static void main(String[] args) {
        Kedelai kd = new Kedelai("Kedelai", 4, "Hehehehe", "Abu-Abu");
        Gorila gr = new Gorila("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa sg = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
    
        kd.displayData();
        System.out.println();
        gr.displayData();
        System.out.println();
        sg.displayData();
        System.out.println();
    }
}
