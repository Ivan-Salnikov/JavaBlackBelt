package edu.nested_classes.inner_class;

public class Car2 {

    String color;
    int doorCount;
    Engine engine;


    public Car2(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;

        System.out.println("Пример создания объекта inner class`а, НЕ в конструкторе внешнего объекта");

    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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

class Test2 {
    public static void main(String[] args) {

        Car2 car2 = new Car2("Black", 4);

        System.out.println("Двигателя еще нет");
        System.out.println(car2);
        System.out.println("Создаем двигатель   ");
        System.out.println("Car2.Engine engine = car2.new Engine(125);");
        Car2.Engine engine = car2.new Engine(125);
        System.out.println(engine);
        System.out.println("но двигатель еще не установлен в машину");
        System.out.println(car2);
        System.out.println("Устанавливаем двигатель в машину   car2.setEngine(engine);");
        car2.setEngine(engine);
        System.out.println(car2);

    }
}
