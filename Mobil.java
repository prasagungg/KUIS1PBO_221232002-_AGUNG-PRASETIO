package itbs.pbo;

class Mobil {
    private Mesin mesin;

    public Mobil(Mesin mesin) {
        this.mesin = mesin;
    }

    public void nyalakanMesin() {
        this.mesin.nyalakan();
    }

    public void matikanMesin() {
        this.mesin.matikan();
    }

    public void tambahKecepatan() {
        this.mesin.tambahKecepatan();
    }

    public void kurangKecepatan() {
        this.mesin.kurangKecepatan();
    }

    public int getKecepatan() {
        return this.mesin.getKecepatan();
    }
}

