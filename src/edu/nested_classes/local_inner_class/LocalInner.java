package edu.nested_classes.local_inner_class;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21, 4);
    }

}

class Math {

    public void getResult (final int delimoe, final int delitel) {
        //int delimoe = 21;

        class Delenie {

            public int getChastnoe () {
                return delimoe/delitel;
            }

            public int getOstatok () {
                return delimoe % delitel;
            }

        }

        Delenie delenie = new Delenie();

        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delitel);
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}
