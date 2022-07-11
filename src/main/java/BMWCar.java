public abstract class BMWCar {

    abstract void activeCollisionDetection();  // not all cars have it, so can't put in Car

    public String notifyOutOfGas() {
        return "Out of gas!";
    }

}
