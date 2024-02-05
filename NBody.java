public class NBody {
    public static double readRadius(String filename) {
        In in = new In(filename);
        int numberOfPlanets = in.readInt();
        double radius = in.readDouble();
        return radius;
    }

    public static Body[] readBodies(String filename) {
        In in = new In(filename);
        int numberOfPlanets = in.readInt();
        Body[] bodies = new Body[numberOfPlanets];
        System.out.print(bodies);
        double radius = in.readDouble();
        for (int i = 0; i < numberOfPlanets; i++) {
            double xxPos = in.readDouble();
            double yyPos = in.readDouble();
            double xxVel = in.readDouble();
            double yyVel = in.readDouble();
            double mass = in.readDouble();
            String imgFileName = in.readString();
            Body b = new Body(xxPos, yyPos, xxVel, yyVel, mass, imgFileName);
            bodies[i] = b;
        }
        return bodies;
    }
}
