package edu.nested_classes.static_nested_class;

public class Car {

    String color;
    int doorCount;
    Engine engine;

    private static int countOfCar = 5;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
        Car.countOfCar++;
    }

    void  method ()  {
        System.out.println(Engine.countOfObjects);

        //System.out.println(Engine.horsePower; // будет ошибка, так как для доступа к нестатичной переменной нужно сначала создать объект
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My car{" +
                "countOfCar='" + Car.countOfCar + '\'' +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(countOfCar);
            //System.out.println(doorCount); // ошибка
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {

        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}

class Z extends Car.Engine{
    Z() {
        super(200);
    }
}