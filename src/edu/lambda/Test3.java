package edu.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){

        ArrayList<Car> al = new ArrayList<>();

        for(int i = 0; i <3; i++) {
            al.add(carSupplier.get());
        }

        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {

        //Мы создали метод, который принимает объект типа Car и реализацию интерфейса Consumer<Car>
        //Действия над объектом типа Car прописываются при вызове метода
        carConsumer.accept(car);

    }

    public static void main(String[] args) {

        System.out.println("Пример использования функционального интерфейса Supplier" +
                "\n" + "У этого интерфейса один абстрактный метод get, который использует параметризованный тип объекта и возвращает объект того же типа:" +
                "\n" + "public interface Supplier<T> {\n" +
                "\n" +
                "    /**\n" +
                "     * Gets a result.\n" +
                "     *\n" +
                "     * @return a result\n" +
                "     */\n" +
                "    T get();\n" +
                "}" +
                "");
        System.out.println("");
        System.out.println("Поэтому лямбда выражение будет выглядеть так:");

        Supplier<Car> carSupplier = () -> new Car("Nissan Tiida", "Silver metallic", 1.6);

        System.out.println("Supplier<Car> carSupplier = () -> new Car(\"Nissan Tiida\", \"Silver metallic\", 1.6));");

        System.out.println("Сначала мы создаем ссылочную переменную с типом Car: Supplier<Car> carSupplier =..." +
                "\n" + "Затем прописываем лямбда выражение");

        System.out.println("Мы должны сделать реализацию метода get, поэтому" +
                "\n" + "в левой части выражения указаны скобки ()->..., так как метод get не имеет входных параметров");
        System.out.println("");
        System.out.println("В правой части выражения мы должны вернуть объект типа Car, поэтому мы его создаем через конструктор" +
                "\n" + "...-> new Car(\\\"Nissan Tiida\\\", \\\"Silver metallic\\\", 1.6));\"");

        ArrayList<Car> ourCars = createThreeCars(carSupplier);

        System.out.println("Our cars: " + ourCars);


        System.out.println("--------------");
        System.out.println("");
        System.out.println("Пример использования функционального интерфейса Consumer" +
                "\n" + "Интерфейс имеет один абстрактный метод accept, который выполняет некоторые действия над передаваемым в качестве параметра объектом");

        Car car1 = ourCars.get(0);
        System.out.println(car1);
        System.out.println("Проводим действия над объектом Car, сразу прописывая их через лямбда выражение" +
                "\n" + "(car) -> { car.colour = \"red\"; car.engine = 2.5;}");
        changeCar(car1, (car) -> { car.colour = "red"; car.engine = 2.5;});
        System.out.println(car1);
    }

}

class Car {
    String model;
    String colour;
    Double engine;

    public Car(String model, String colour, Double engine) {
        this.model = model;
        this.colour = colour;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                '}';
    }
}
