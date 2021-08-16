package edu.nested_classes.inner_class;

public class Car {

    String color;
    int doorCount;
    Engine engine;


    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;

        System.out.println("Пример создания объекта inner class`а в конструкторе внешнего класса");
        System.out.println("this.engine = this.new Engine(horsePower);");

        this.engine = this.new Engine(horsePower);



    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public  class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
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

        Car car = new Car("red", 4, 135);

         System.out.println(car);

    }
}
