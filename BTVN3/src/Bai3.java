import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String Correct = "Correct";
        final String Incorrect = "Incorrect";
        double a = 0 + (101 - 0) * Math.random();
        double b = 0 + (101 - 0) * Math.random();
        double x = a + b;
        double c = 0 + (201 - 0) * Math.random();
        String nhap = "";
        System.out.print("\n" + Math.round(a) + " + " + Math.round(b) + " = " + Math.round(c));
        do {
            System.out.print("\n Phép toán này Correct hay Incorrect: ");
            nhap = sc.nextLine();
            nhap.trim();
            if(!nhap.equalsIgnoreCase(Correct) && !nhap.equalsIgnoreCase(Incorrect)){
                System.out.print("\n Hay nhập Correct hoặc Incorrect!");
            }
        }
        while (!nhap.equalsIgnoreCase(Correct) && !nhap.equalsIgnoreCase(Incorrect));
        if(nhap.equalsIgnoreCase(Correct) && x==c){
            System.out.print("\n Bạn đã trả lời đúng :))");
        }
        else if(nhap.equalsIgnoreCase(Correct) && x!=c){
            System.out.print("\n Bạn đã trả lời sai :((");
        }
        else if(nhap.equalsIgnoreCase(Incorrect) && x!=c){
            System.out.print("\n Bạn đã trả lời đúng :))");
        }
        else if(nhap.equalsIgnoreCase(Incorrect) && x==c){
            System.out.print("\n Bạn đã trả lời sai :((");
        }
    }
}