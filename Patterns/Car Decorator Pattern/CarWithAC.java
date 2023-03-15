public class CarWithAC implements CarDecorator {

    private Car car;
    @Override
    public void setCar(Car car) {
        this.car = car;
    }
    

    @Override
    public String assemble() {
        car.assemble();
        return "The car is airconditioned";
    }


    
    
}
