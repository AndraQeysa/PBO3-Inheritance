package Praktik;

public class Perpus {

    private String jenis;
    private String penerbit;
    private int jumhal;

    public Perpus(String jenis, String penerbit, int jumhal) {
        this.jenis = jenis;
        this.penerbit = penerbit;
        this.jumhal = jumhal;
    }

    public void info() {
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Penerbit: " + this.penerbit);
        System.out.println("Jumlah Halaman: " + this.jumhal);
    }
}
