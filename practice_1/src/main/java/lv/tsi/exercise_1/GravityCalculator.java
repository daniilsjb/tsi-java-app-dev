package lv.tsi.exercise_1;

class GravityCalculator {

    static final double GRAVITY = -9.81; // Earth's gravity in m/s^2

    public static void main(String[] args) {
        var fallingTime = (args.length > 0) ? Integer.parseInt(args[0]) : 0;
        var initialPosition = (args.length > 1) ? Double.parseDouble(args[1]) : 0.0;
        var initialVelocity = (args.length > 2) ? Double.parseDouble(args[2]) : 0.0;

        var finalPosition = calculatePosition(fallingTime, initialPosition, initialVelocity);
        System.out.println("Position in " + fallingTime + " seconds: " + finalPosition);
    }

    public static double calculatePosition(int t, double x0, double v0) {
        return (t * t) * GRAVITY * 0.5 + v0 * t + x0;
    }
}
