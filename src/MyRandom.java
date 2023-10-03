import java.util.Random;

public class MyRandom {
    Random rnd = new Random();

    public int nesteHeltall(int nedre, int ovre) {
        return rnd.nextInt(ovre - nedre) + nedre;
    }

    public double nesteDesimaltall(double nedre, double ovre) {
        return rnd.nextDouble(ovre - nedre) + nedre;
    }

    public void testClient() {
        int nedre1 = 5;
        int ovre1 = 10;

        double nedre2 = 2;
        double ovre2 = 4;

        for (int i = 0; i < 100; i++) {
            int result = this.nesteHeltall(nedre1, ovre1);
            if (result >= ovre1 || result < nedre1) {
                System.out.println("feilfeilfeilintintint");
            }
            System.out.println("Neste heltall (5,10): " + result );
        }
        for (int i = 0; i < 100; i++) {
            double result = this.nesteDesimaltall(nedre2, ovre2);
            if (result >= ovre2 || result < nedre2) {
                System.out.println("FEILFEILFEILDOUBLEDOUBLEDOUBLE");
            }
            System.out.println("Neste desimaltall (2, 4): " + result);
        }
    }
}
