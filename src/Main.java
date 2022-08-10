public class Main {
    public static void main(String[] args) {
        System.out.println(createObject("BMW"));
        System.out.println(createObject("Mazda"));
        System.out.println(createObject("Toyota"));
        System.out.println(createObject("ishebv"));
    }

    public static Car createObject(String className) {
        switch (className) {
            case "Mazda" -> {
                Mazda mazda = new Mazda("rotor", 2003 , "kacb");
                mazda.print();
                return mazda;
            }
            case "Toyota" -> {
                Toyota toyota = new Toyota("JZ", 1995, 3);
                toyota.print();
                return toyota;
            }
            case "BMW" -> {
                BMW bmw = new BMW("V8", 2008, "rear");
                bmw.print();
                return bmw;
            }
        }
        return null;
    }
}