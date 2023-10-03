public class Main {
    public static void main(String[] args) {
        System.out.println("ØVING 5 OPPGAVE 2");

        MyRandom yay = new MyRandom();
        //yay.testClient();

        System.out.println(yay.nesteHeltall(7, 13));
        System.out.println(yay.nesteHeltall(5, 89));
        System.out.println(yay.nesteHeltall(23, 57));

        System.out.println(yay.nesteDesimaltall(2, 6));
        System.out.println(yay.nesteDesimaltall(9, 10));
        System.out.println(yay.nesteDesimaltall(0, 100));
    }
}