package factory;


public class Bot {

    private String name;
    private Double runSpeed;
    private Integer lifeCounter;
    private Integer attackDamage;
    

    public String getName() {
        return name = "Machine Boss";
    }

    public Double getRunSpeed() {
        return runSpeed = 1.1;
    }

    public Integer getLifeCounter() {
        return lifeCounter = 30;
    }

    public Integer getAttackDamage() {
        return attackDamage = 2;
    }


}
