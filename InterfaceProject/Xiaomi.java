package InterfaceProject;


class Xiaomi implements Phone {

    private int Volume;
    private boolean isPowerOn;

    public Xiaomi(){
        this.Volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat Datang di XIAOMI");
        System.out.println("Android Version 11");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn){
            if (this.Volume == MAX_VOLUME){
                System.out.println("Volume FULL!!");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {
                this.Volume += 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan Handphone terlebih dahulu");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn){
            if (this.Volume == MIN_VOLUME){
                System.out.println("Volume = 0% ");
            } else {
                this.Volume -=10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan Handphone terlebih dahulu");
        }
    }

    private int getVolume() {
        return this.Volume;
    }

}
