package Praktik;

public class Buku extends Perpus {
    private String judul;
    
    public Buku (String judul, String jenis, String penerbit, int jumhal){
        super(jenis , penerbit, jumhal);
        this.judul = judul;
    }
    
    @Override
    public void info (){
        System.out.println("Judul: "+ this.judul);
        super.info();
    }
}
