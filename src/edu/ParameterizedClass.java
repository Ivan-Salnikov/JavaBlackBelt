package edu;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("ADA");
//        System.out.println(info1);
//
//        String s1 = info1.getValue();
//        System.out.println(s1);
//
//        Info<Integer> info2 = new Info<>(22);
//        System.out.println(info2);
//
//        int i2 = info2.getValue();
//        System.out.println(i2);
    }

//    public void abc (Info<String> info) {
//
//        String s = info.getValue();
//    }
//
//    public void abc (Info<Integer> info) {
//
//        Integer i = info.getValue();
//    }

}

class Info <T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString () {
        return "{[" + value  + "]}";
    }

    public T getValue () {
        return value;
    }
}

