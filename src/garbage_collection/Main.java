package garbage_collection;


class Phone{
    String name;
    String model;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Phone phone =  new Phone("Iphone", "16 Pro max");
        System.out.println(phone);
        phone = null;
        System.gc();
        System.out.println(phone);
    }
}
