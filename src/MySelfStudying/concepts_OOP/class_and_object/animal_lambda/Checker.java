package MySelfStudying.concepts_OOP.class_and_object.animal_lambda;

import java.util.ArrayList;
import java.util.List;

public class Checker implements Check{
    public boolean check(Animal animal) {
        return animal.canSwim;
    }
}
