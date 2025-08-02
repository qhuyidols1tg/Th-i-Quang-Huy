package Student;

public class Car {
    private int maxSpeed;
    private String brand;
    public Car(int maxSpeed, String brand){
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }
    public void run(){
        System.out.println("Xe " + brand + " đang chạy với tốc độ tối đa " + maxSpeed + " km/h");
    }
    public String getBrand(String brand){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getMaxSpeed(int maxSpeed){
        return this.maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }


    }
