package domain;
import org.springframework.stereotype.Component;

@Component
public class Taro implements MilkTea {
    @Override
    public String prepareIngredients() {
        return "Prepare taro milktea!";
    }

    @Override
    public String mix() {
        return "Mix taro milktea!";
    }
}
