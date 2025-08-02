package Student;

public class Students {
    int age;
    String name;

    public Students(String Name, int Age) {
        this.name = Name;
        this.age = Age;
    }

    private String Name;
    private int Age;
    public void sayHello() {
        System.out.println("Xin chao, toi ten la " + name + ", nam nay " + age + " tuoi");
    }
    public String getName(String Name) {
        return this.name;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public int getAge (int age){
        return this.age;
    }
    public void setAge (int age){
        this.age = Age;
    }
}



