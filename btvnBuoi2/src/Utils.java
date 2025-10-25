import java.util.Arrays;

public class Utils {
    public static int tinhTong(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static int timMax(int[] arr) {
        int max = arr[0];
        for (int x : arr)
            if (x > max) max = x;
        return max;
    }

    public static int timMin(int[] arr) {
        int min = arr[0];
        for (int x : arr)
            if (x < min) min = x;
        return min;
    }

    public static void sapXepTangDan(int[] arr) {
        Arrays.sort(arr);
        System.out.print("Mảng sau khi sắp xếp: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
    public static boolean laNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void soNguyenToLonNhat(int[] arr) {
        int maxPrime = -1;
        for (int x : arr)
            if (laNguyenTo(x) && x > maxPrime)
                maxPrime = x;

        if (maxPrime == -1)
            System.out.println("Không có");
        else
            System.out.println("Số nguyên tố lớn nhất: " + maxPrime);
    }
}
