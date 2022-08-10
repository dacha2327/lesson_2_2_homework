public abstract class Car implements Printable{
    private String motor;
    private int year;

    public String getMotor() {
        return motor;
    }

    public int getYear() {
        return year;
    }

    public Car(String motor, int year) {
        this.motor = motor;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println(getMotor()+" " + getYear());
    }
}
