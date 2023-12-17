package itbs.pbo;

class MesinSuzuki extends Mesin {
    public MesinSuzuki() {
        super("Suzuki");
    }

    @Override
    public int getTambahanKecepatan() {
        if (this.getKecepatan() < 150) {
            return 15;
        }
        return 0;
    }

    @Override
    public int getKuranganKecepatan() {
        if (this.getKecepatan() > 0) {
            return 10;
        }
        return 0;
    }
}