public class Kedelai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;

    public Kedelai(String nama, int jmlhKaki, String suara, String warnaBulu){
        super(nama, jmlhKaki);
        this.suara = suara;
        this.warnaBulu= warnaBulu;
    }

    @Override
    public void displayMakan() {
        String makanan = "Tumbuhan";
        System.out.println("Makanan : " + makanan);
        
    }

    @Override
    void displayBinatang() {
        String jenis = "Herbivora";
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
