package factory;

import java.util.Random;

public class Bot {
    
    private String name;
    private Double runSpeed;
    private Integer lifeCounter;
    private Integer attackDamage;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = "Machine Boss";
    }
    public Double getRunSpeed()
    {
        return runSpeed;
    }
    public void setRunSpeed(Double runSpeed)
    {
        this.runSpeed = 8.9;
    }
     public Integer getLifeCounter() {
        return lifeCounter;
    }

    public void setLifeCounter(Integer lifeCounter) {
        this.lifeCounter = 30;
    }

    public Integer getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(Integer attackDamage) {
        this.attackDamage = 5;
    }
    public static void atkOrDfnd()
    {
        Random rand = new Random();
        int choice = rand.nextInt(1);
    }
    
}
