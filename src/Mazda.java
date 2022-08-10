public class Mazda extends Car implements Printable{

    public Mazda(String motor, int year , String seatLeather) {
        super(motor, year);
        this.seatLeather = seatLeather;
    }
    private String seatLeather;

    public String getSeatLeather() {
        return seatLeather;
    }
    @Override
    public void print() {
        System.out.println("leather: " +seatLeather + " "+"Year: "+ getYear() +" "+ "Motor: "+ getMotor());
    }
}
