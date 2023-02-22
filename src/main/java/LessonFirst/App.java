package LessonFirst;

public class App {
    private int i = 123;

    public void print(){
        System.out.println("from method print i = " + i);
    }

    public static void main(String[] args) {
        App app1 = new App();
        System.out.println("main i = " + app1.i);
        app1.print();

        App app2 = new App();
        app2.i = 456;
        System.out.println("main2 i = " + app2.i);
        System.out.println("main1 i = " + app1.i);
    }
}
