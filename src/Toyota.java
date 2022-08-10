public class Toyota extends Car implements  Printable{

    public Toyota(String motor, int year , int volume) {
        super(motor, year);
        this.volume = volume;
    }
    private  int volume;

    @Override
    public void print() {
        System.out.println("Volume: " +volume + " "+"Year: "+ getYear() +" "+ "Motor: "+ getMotor());
    }
}
