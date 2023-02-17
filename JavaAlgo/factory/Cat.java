package factory;

public class Cat implements Pet {

    private String petName;
    private Double runSpeed;
    private Integer lifeCounter;
    private Integer attackDamage;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Double getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(Double runSpeed) {
        this.runSpeed = runSpeed;
    }

    public Integer getLifeCounter() {
        return lifeCounter;
    }

    public void setLifeCounter(Integer lifeCounter) {
        this.lifeCounter = lifeCounter;
    }

    public Integer getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(Integer attackDamage) {
        this.attackDamage = attackDamage;
    }

    @Override
    public String showLove() {
        return "Keeps purring!";
    }

    @Override
    public String showHate() {
        // TODO Auto-generated method stub
        return "Crying!";
    }

}
