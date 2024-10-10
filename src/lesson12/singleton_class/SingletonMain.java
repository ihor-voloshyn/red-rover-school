package lesson12.singleton_class;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();

        singletonClass2.setInfo("New class info");

        System.out.println(singletonClass1.getInfo());
        System.out.println(singletonClass2.getInfo());
    }
}
