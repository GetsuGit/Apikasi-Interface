package InterfaceProject;

class PhoneUser {

    private Phone phone;

    public PhoneUser(Phone phone){
        this.phone = phone;
    }

    void turnOnThePhone(){
        this.phone.powerOn();
    }

    void turnOffThePhone(){
        this.phone.powerOff();
    }

    void turnPhoneLouder(){
        this.phone.volumeUp();
    }

    void makePhoneSilent(){
        this.phone.volumeDown();
    }
}
