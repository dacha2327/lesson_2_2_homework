public class BMW extends  Car implements Printable{

    public BMW(String motor, int year , String driveUnit) {
        super(motor, year);
        this.driveUnit = driveUnit;
    }
    private  String driveUnit;

    public String getDriveUnit() {
        return driveUnit;
    }
    @Override
    public void print() {
        System.out.println("Drive unit: " +driveUnit + " "+"Year: "+ getYear() +" "+ "Motor: "+ getMotor());
    }

}
