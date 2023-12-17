package itbs.pbo;

class MesinHonda extends Mesin {
    public MesinHonda() {
        super("Honda");
    }

    @Override
    public int getTambahanKecepatan() {
        return 10;
    }

    @Override
    public int getKuranganKecepatan() {
        return 5;
    }
}
