public class Main {
    public static void main(String[] args) {
        Printable[] cars = {createObject("Mazda"),createObject("Toyota"), createObject("BMW")};
        for (Printable c1 :cars){
            c1.print();
        }
    }

    public static Car createObject(String className) {
        switch (className) {
            case "Mazda" -> {
                Mazda mazda = new Mazda("rotor", 2003 , "kacb");
                return mazda;
            }
            case "Toyota" -> {
                Toyota toyota = new Toyota("JZ", 1995, 3);
                return toyota;
            }
            case "BMW" -> {
                BMW bmw = new BMW("V8", 2008, "rear");
                return bmw;
            }
        }
        return null;
    }
}