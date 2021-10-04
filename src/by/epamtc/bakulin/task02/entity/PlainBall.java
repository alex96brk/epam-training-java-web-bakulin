package by.epamtc.bakulin.task02.entity;

import java.io.Serializable;

public class PlainBall implements Serializable {

    /*
    * Default ball material is Rubber, density 1200.0 kg/m3
    * Default wall thickness 2.5 mm = 0.0025 m
    * */
    private static final double BALL_DEFAULT_DENSITY = 1200.0;
    private static final double BALL_DEFAULT_WALL_THICKNESS = 0.0025;

    private String ballColor;
    private double ballDiameter;
    private double ballWeight;

    public PlainBall(String ballColor, double ballDiameter) {
        this.ballColor = ballColor;
        this.ballDiameter = ballDiameter;
        this.ballWeight = calculateBallWeight(ballDiameter, BALL_DEFAULT_WALL_THICKNESS , BALL_DEFAULT_DENSITY);
    }

    @Override
    public String toString() {
        return String.format("PlainBall{ ballColor = %s, ballDiameter = %.3f(m), ballWeight = %.3f(kg)}", ballColor, ballDiameter, ballWeight);
    }

    public String getBallColor() {
        return ballColor;
    }

    public double getBallDiameter() {
        return ballDiameter;
    }

    public double getBallWeight() {
        return ballWeight;
    }

    public void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }

    private static double calculateBallWeight(double ballDiameter, double ballWallThickness, double ballDensity) {
        double ballSphereVolume = Math.PI * Math.pow(ballDiameter, 3) * (1.0 / 6);
        double ballCavityVolume = Math.PI * Math.pow(ballDiameter - 2 * ballWallThickness, 3) * (1.0 / 6);
        double ballVolume = ballSphereVolume - ballCavityVolume;

        return ballDensity * ballVolume;
    }



}
