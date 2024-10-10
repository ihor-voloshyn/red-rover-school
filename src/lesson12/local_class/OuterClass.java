package lesson12.local_class;

public class OuterClass {
    void display() {
        class LocalClass {
            void print() {
                System.out.println("Inside Local Class");
            }
        }
        LocalClass local = new LocalClass();
        local.print();
    }
}
