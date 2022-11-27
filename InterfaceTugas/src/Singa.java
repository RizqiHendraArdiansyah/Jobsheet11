public class Singa extends Binatang implements IKarnivora{
    private String suara; 
    private String warnaBulu;

    public Singa(String nama, int jmlhKaki, String suara, String warnaBulu){
        super(nama, jmlhKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    
    @Override
    public void displayMakan() {
        String makanan = "Daging";
        System.out.println("Makanan : " + makanan);    
    }

    @Override
    void displayBinatang() {
        String jenis = "Karnivora";
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

