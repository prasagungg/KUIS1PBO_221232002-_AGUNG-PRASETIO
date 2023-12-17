package itbs.pbo;

class MesinNissan extends Mesin {
    public MesinNissan() {
        super("Nissan");
    }

    @Override
    public int getTambahanKecepatan() {
        if (this.getKecepatan() < 300) {
            return 20;
        }
        return 0;
    }

    @Override
    public int getKuranganKecepatan() {
        if (this.getKecepatan() > 0) {
            return 15;
        }
        return 0;
    }
}
