public class Gorila extends Binatang implements IKarnivora, IHerbivora {
    private String suara;
    private String warnaBulu;

    public Gorila(String nama, int jmlhKaki, String suara, String warnaBulu){
        super(nama, jmlhKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        String makanan1 = "Daging";
        String makanan2 = "Tumbuhan";
        System.out.println("Makanan : " + makanan1 + " + " + makanan2);
    }

    @Override
    void displayBinatang() {
        String jenis = "Karnivora + Herbivora";
        System.out.println("Jenis : " + jenis);
    }

    public void displayData(){
        displayBinatang();
        displayMakan();
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah Kaki : " + jmlhKaki);
        System.out.println("Suara : " + suara);
        System.out.println("Warna Bulu : " + warnaBulu);
    }    
}
