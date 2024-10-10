package lesson12.non_static_inner_class;

class OuterClass {
    private String message = "Hello from OuterClass!";

    class InnerClass {
        void printMessage() {
            System.out.println(message); // Имеет доступ к полям внешнего класса
        }
    }
}
