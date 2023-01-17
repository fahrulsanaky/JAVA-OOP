public class Mahasiswa extends Manusia{

    private String nim;
    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public int getUmur() {
        return super.getUmur();
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
