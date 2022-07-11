public interface Car {

    //  interface methods (do not have a body)

    String start();  // can't have private methods, all is public
    String stop();
    float getGasLevel();
    String fillUpTank(GasType gasType,float amountOfGas); // GasType can be generic type or enum
    String drive(float meters);
    boolean isAirConditionPresent();
}
