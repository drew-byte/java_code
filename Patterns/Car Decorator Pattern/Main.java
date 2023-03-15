class Main { 
    public static void main(String[] args) {
        

        Car car = new BasicCar();
        CarWithAC ac = new CarWithAC();
        ac.setCar(car);

        System.out.println(ac.getClass().getSimpleName() + ": " + ac.assemble());
        
        CarWithGPS gps = new CarWithGPS();
        gps.setCar(ac);

        System.out.println(gps.getClass().getSimpleName() + ": " + gps.assemble());
    


    }
}