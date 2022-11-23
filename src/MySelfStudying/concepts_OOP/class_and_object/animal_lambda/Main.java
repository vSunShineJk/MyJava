package MySelfStudying.concepts_OOP.class_and_object.animal_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", true, false));
        animals.add(new Animal("tiger", false, true));
        animals.add(new Animal("Frog", true, true));
        animals.add(new Animal("Bird", false, false));
        animals.add(new Animal("Kangaroo", false, true));

        System.out.println(animals);

        System.out.println(sort(animals, new Checker()));

        System.out.println(
                sort(animals,
                (Animal obj) -> {
                            return obj.canJump;
                }
        ));

        System.out.println(sort(animals, e -> e.canSwim && e.canJump));

        System.out.println(sort(animals, e -> !e.canJump));

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,4,5,67,8,9,3,2,4,6,3,43,4,5,1,2,3,5,7,9,5,3));

        nums.removeIf(e -> e%2 == 0);

        int a = 5;

        Predicate<Integer> isValid = (e) -> { return e >= 5; };

        System.out.println(isValid.test(a));

        nums.forEach(System.out::println);

        Predicate<Integer> isValidAge = Main::isValidAge;

        System.out.println(isValidAge.test(17));
    }

    public static List<Animal> sort (List<Animal> animals, Check checker) {
        List<Animal> checkedAnimals = new ArrayList<>();

        for (Animal eachAnimal : animals) {
            if (checker.check(eachAnimal)) {
                checkedAnimals.add(eachAnimal);
            }
        }

        return checkedAnimals;
    }

    public static boolean isValidAge(int age) {
        if (age >= 18) return true;
        return false;
    }
}
