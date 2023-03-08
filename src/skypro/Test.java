package skypro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        System.out.println("-------------------1----------------");

        SomeTestNumber number1 = new SomeTestNumber(1);
        SomeTestNumber number2 = new SomeTestNumber(-1);

        List<SomeTestNumber> number = new ArrayList<>();
        number.add(number1);
        number.add(number2);

        Predicate<SomeTestNumber> predicate = new Predicate<SomeTestNumber>() {
            @Override
            public boolean test(SomeTestNumber someNumber) {
                return someNumber.getNumber() > 0;
            }
        };
        for (SomeTestNumber someNumber : number) {
            System.out.println(predicate.test(someNumber));
        }
        Predicate<SomeTestNumber> predicate1 = (someNumber) -> someNumber.getNumber() > 0;

        for (SomeTestNumber someNumber : number) {
            System.out.println(predicate1.test(someNumber));
        }
        System.out.println("-------------------2----------------");
        SomeTestName name1 = new SomeTestName("Alex");
        SomeTestName name2 = new SomeTestName("John");

        List<SomeTestName> name = Arrays.asList(
                name1 = new SomeTestName("Alex"),
                name2 = new SomeTestName("John")
        );
        Consumer<SomeTestName> consumer = new Consumer<>() {
            @Override
            public void accept(SomeTestName someName) {
                System.out.println("Hi " + someName.getName());
            }
        };
        for (SomeTestName someName : name) {
            consumer.accept(someName);
        }
        Consumer<SomeTestName> consumer1 = (someName) -> System.out.println("Hi " + someName.getName());

        for (SomeTestName someName : name) {
            consumer1.accept(someName);
        }
        System.out.println("-------------------3----------------");
        SomeTestDouble doubleNumber1 = new SomeTestDouble(12.6);
        SomeTestDouble doubleNumber2 = new SomeTestDouble(11.3d);

        List<SomeTestDouble> doublesNumber = Arrays.asList(
                doubleNumber1 = new SomeTestDouble(12.6),
                doubleNumber2 = new SomeTestDouble(11.3)
        );

        Function<SomeTestDouble, Long> function = new Function<>() {

            @Override
            public Long apply(SomeTestDouble someDouble) {
                return (long) someDouble.getDoubleNumber();
            }
        };
        for (SomeTestDouble someDouble : doublesNumber) {
            System.out.println(function.apply(someDouble));
        }
        Function<SomeTestDouble, Long> function1 = (someTestDouble) -> (long) someTestDouble.getDoubleNumber();

        for (SomeTestDouble someDouble : doublesNumber) {
            System.out.println(function1.apply(someDouble));
        }
        System.out.println("-------------------4----------------");

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(100);
            }
        };
        System.out.println(supplier.get());

        Supplier<Integer> supplier1 = () -> new Random().nextInt(100);
        System.out.println(supplier1.get());

        System.out.println("-------------------5----------------");


    }

    public static <T, U> Function<T, U> ternaryOperator(Predicate<? super T> condition,
                                                        Function<? super T, ? extends U> ifTrue,
                                                        Function<? super T, ? extends U> ifFalse) {

        T t = null;
        if (condition.test(t) == true) {
            ifTrue.apply(t);
        } else if (condition.test(t) == false) {
            ifFalse.apply(t);
        }

        return null;
    }


    public static void ifTrue() {
        System.out.println("If True");
    }

    public static void ifFalse() {
        System.out.println("if False");
    }

}