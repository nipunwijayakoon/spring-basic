package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FullStackCourse implements Course {

    private PriceCalc priceCalc;


    @Autowired
//  Qualifier
    public FullStackCourse(PriceCalc priceCalc) {
        this.priceCalc = priceCalc;
    }

    public String getProgramName() {
        return "FullStack";
    }

    public String calculateCost() {
        return priceCalc.getPrice();
    }
}
