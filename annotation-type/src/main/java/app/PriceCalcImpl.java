package app;

import org.springframework.stereotype.Component;

@Component
public class PriceCalcImpl implements PriceCalc{
    public String getPrice() {
        return "FullStack 5000LKR";
    }
}
