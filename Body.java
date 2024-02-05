public class Body {
    public static final double Gravity = 6.67e-11;
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

    public Body(double xxPos, double yyPos, double xxVel,
    double yyVel, double mass, String imgFileName) {
        this.xxPos = xxPos;
        this.yyPos = yyPos;
        this.xxVel = xxVel;
        this.yyVel = yyVel;
        this.mass = mass;
        this.imgFileName = imgFileName;
    }

    public Body(Body b) {
        this.xxPos = b.xxPos;
        this.yyPos = b.yyPos;
        this.xxVel = b.xxVel;
        this.yyVel = b.yyVel;
        this.mass = b.mass;
        this.imgFileName = b.imgFileName;
    }

    public double calcDistance(Body b) {
        double dx = this.xxPos - b.xxPos;
        double dy = this.yyPos - b.yyPos;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double calcForceExertedBy(Body b) {
        double force = 0.0;
        double radius = this.calcDistance(b);
        force = (Gravity * this.mass * b.mass) / (radius * radius); 
        return force;
    }

    public double calcForceExertedByX(Body b) {
        double forceX = 0;
        double Force = this.calcForceExertedBy(b);
        if(this.xxPos > b.xxPos) {
            forceX = (Force * (this.xxPos - b.xxPos)) / this.calcDistance(b); 
            return forceX;
        } else {
            forceX = (Force * (b.xxPos - this.xxPos)) / this.calcDistance(b); 
            return forceX;
        }
    }

    public double calcForceExertedByY(Body b) {
        double forceY = 0;
        double Force = this.calcForceExertedBy(b);
        if (this.yyPos > b.yyPos) {
            forceY = (Force * (this.yyPos - b.yyPos)) / this.calcDistance(b);
            return forceY;
        } else {
            forceY = (Force * (b.yyPos - this.yyPos)) / this.calcDistance(b);
            return forceY;
        }
    }
}