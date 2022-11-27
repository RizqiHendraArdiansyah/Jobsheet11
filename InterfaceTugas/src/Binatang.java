public abstract class Binatang {
    protected String nama;
    protected int jmlhKaki;

    public Binatang(String nama, int jmlhKaki){
        this.nama = nama;
        this.jmlhKaki = jmlhKaki;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKaki(int jmlhKaki){
        this.jmlhKaki = jmlhKaki;
    }
    public int getKaki(){
        return jmlhKaki;
    }

    abstract void displayBinatang();
    
}
