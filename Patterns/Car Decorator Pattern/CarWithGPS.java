class CarWithGPS implements CarDecorator {

    private Car car;

    @Override
    public void setCar(Car car) {
       this.car = car;
    }
    public String assemble()
    {
        car.assemble();
        return "The car has GPS";
    }
    
}