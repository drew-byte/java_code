package domain;
import org.springframework.stereotype.Component;

@Component
public class WinterMelon implements MilkTea {
    @Override
    public String prepareIngredients() {
        return "Prepare kundol milktea!";
    }

    @Override
    public String mix() {
        return "Mix kundol milktea!";
    }
}
