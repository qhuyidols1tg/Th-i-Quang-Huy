import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi của bạn: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhập chiều cao của bạn: ");
        double chieucao = sc.nextDouble();
        System.out.println("Xin chào " + name + " bạn " + tuoi + " Tuổi và cao " + chieucao + " mét" );
    }
}
