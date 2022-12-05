package domain;
import org.springframework.stereotype.Component;

@Component
public class FlavoredMilkTea {
    private String sugarLevel;
    private String size;
    private MilkTea milkTea;

    public FlavoredMilkTea(String sugarLevel, String size, MilkTea milkTea){
        this.sugarLevel = sugarLevel;
        this.size = size;
        this.milkTea = milkTea;
    }

    public FlavoredMilkTea(){}

    public String getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(String sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public MilkTea getMilkTea() {
        return milkTea;
    }

    public void setMilkTea(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    public String toString(){
        return "Sugar Level: " + this.sugarLevel + "\nSize: " + this.size + "\n"
                + milkTea.prepareIngredients() + "\n" + milkTea.mix();
    }
}
