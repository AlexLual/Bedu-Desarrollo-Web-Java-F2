public class Application {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Beto");
        Singleton Singleton2 = Singleton.getInstance("Betos");

        System.out.println(singleton.value);
        System.out.println(Singleton2.value);
    }
}