import observer.Observer1;
import observer.Observer2;
import observer.Observer3;
import subject.Subject1;
import subject.Subject2;

public class App {
    public static void main(String[] args) {
        Subject1 sub1 = new Subject1();
        Subject2 sub2 = new Subject2();

        Observer1 ob1 = new Observer1();
        Observer2 ob2 = new Observer2();
        Observer3 ob3 = new Observer3();

        sub1.register(ob1);
        sub1.register(ob2);

        sub2.register(ob2);
        sub2.register(ob3);

        sub1.setMyValue(50);
        System.out.println();

        sub2.setMyValue(250);
        System.out.println();

        sub1.unregister(ob2);

        sub1.setMyValue(550);
        System.out.println();

        sub2.setMyValue(750);
    }
}
