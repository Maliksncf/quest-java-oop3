public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
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
    @Override
    public void takeOff() {
        this.flying = true;
        System.out.println(this.getName() + " takes off in the sky.");
    }

    @Override
    public void ascend(int meters) {
        if(this.flying) {
            this.altitude += meters;
            System.out.println(this.getName() + " Cherry flies upward, altitude : " + this.getAltitude());
        } else {
            System.out.println(this.getName() + " is not flying");
        }
    }

    @Override
    public void glide() {
        if(this.flying) {
            System.out.println("It glides into the air.");
        } else {
            System.out.println(this.getName() + " is not flying");
        }
    }

    @Override
    public void descend(int meters) {
        if(this.flying) {
            this.altitude = Math.max(this.getAltitude() - meters, 1);;
            System.out.println(this.getName() + " Cherry flies downward, altitude : " + this.getAltitude());
        } else {
            System.out.println(this.getName() + " is already on the ground");
        }
    }

    @Override
    public void land() {
        if(this.getAltitude() > 1) {
            System.out.println(this.getName() + " is too high, it can't lands.");
        } else {
            System.out.println(this.getName() + " lands on the ground.");
        }
    }
}
