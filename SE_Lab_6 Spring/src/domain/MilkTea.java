package domain;
import org.springframework.stereotype.Component;

@Component
public interface MilkTea {

    public String prepareIngredients();
    public String mix();
}
