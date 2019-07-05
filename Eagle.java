package src;

public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = true;
        this.altitude = 0;
    }

    @Override
    public void takeOff() {
        if (this.flying && this.altitude == 0) {
            System.out.printf("%s is is taking off  in the air.%n", this.getName());
        }
    }

    @Override
    public int ascend(int meters){
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf("%s is flying down : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }


    @Override
    public int descend(int meters){
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s is flying up  : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land(){
        System.out.println("Land on the ground");
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
