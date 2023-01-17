public class Dosen extends Manusia{

    private String nid;

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public int getUmur() {
        return super.getUmur();
    }

    @Override
    public void setUmur(int umur) {
        super.setUmur(umur);
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }
}
