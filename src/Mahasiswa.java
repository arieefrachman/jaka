public class Mahasiswa {
    private String nama;
    private String alamat;
    private int umur;

    public void makan(){
        System.out.println(this.nama +" sedang makan");
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void tampil(){
        System.out.println(this.nama+" "+this.alamat+" "+this.umur);
    }
}

