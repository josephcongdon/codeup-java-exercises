package EnumExercise;

public enum Toyotas {
    Corolla("sedan"),
    Camry("sedan"),
    Tundra("truck"),
    Tacoma("truck"),
    RAVFour("suv"),
    FourRunner("suv"),
    HighLander("suv"),
    Prius("sedan"),
    Avalon("sedan"),
    Sienna("van");

    String typeOfCar;

    Toyotas( String typeOfCar){
        this.typeOfCar = typeOfCar;
    }
}
