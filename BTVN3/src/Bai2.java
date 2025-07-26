import java.util.Scanner;
public class Bai2 {
    public static int kiemTra(String a, String b){
        for(int i=a.length()-1; i>=0 ;i--){
            b+=a.charAt(i);
        }
        if(b.equalsIgnoreCase(a)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "", b = "";
        System.out.print("\n Nhập chuỗi a: ");
        a = sc.nextLine();
        a.trim();
        if(kiemTra(a,b)==1){
            System.out.print("\n" + a.toUpperCase() + " là chuỗi đối xứng.");
        }
        else{
            System.out.print("\n" + a.toLowerCase() + " là chuỗi không đối xứng.");
        }
    }
}