import Student.Car;
import Student.Students;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//       // Students s = new Students("Huy", 19);
//        //s.sayHello();
//        //s.setName("Trung");
//        //.setAge(60);
//        System.out.println(s.getName());

        Car xe =  new Car(90,"Huy");
        xe.run();
        if(max > xe.getMaxSpeed()){
            System.out.println("Xe không vượt quá tốc độ tối đa");
        } else
        {
            System.out.println("Xe chạy vượt quá tốc độ");

        }
        }
    }