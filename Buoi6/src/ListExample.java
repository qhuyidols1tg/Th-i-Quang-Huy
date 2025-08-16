import java.util.ArrayList;
import java.util.List;
public class ListExample {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Danh sách trái cây: " + fruits);

        fruits.remove("Banana");
        System.out.println("Sau khi xóa: " + fruits);
        System.out.println("Phần tử đầu tiên: " + fruits.get(0));
    }

}
