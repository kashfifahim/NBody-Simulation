public class TestBody {
    public static void main(String[] args) {
        Body b1 = new Body(0, 0, 0, 0, 10, "images/ball.gif");
        Body b2 = new Body(0, 0, 0, 0, 20, "images/earth.gif");

        double forceExertedByB2onB1 = b1.calcForceExertedBy(b2);
        System.out.println("The force exerted by Body 2 on Body 1 is: " + forceExertedByB2onB1 + " N");
    }
}