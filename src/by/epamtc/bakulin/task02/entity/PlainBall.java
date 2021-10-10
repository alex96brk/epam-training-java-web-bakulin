package by.epamtc.bakulin.task02.entity;

import java.io.Serializable;
import java.util.Objects;

public class PlainBall implements Serializable {

    /*
    * Default ball material is Rubber, density 1200.0 kg/m3
    * Default wall thickness 2.5 mm = 0.0025 m
    * */
    private static final double BALL_DEFAULT_DENSITY = 1200.0;
    private static final double BALL_DEFAULT_WALL_THICKNESS = 0.0025;

    private String ballColor;
    private double ballDiameter;

    public PlainBall(String ballColor, double ballDiameter) {
        this.ballColor = ballColor;
        this.ballDiameter = ballDiameter;
    }

    public PlainBall() {}

    public String getBallColor() {
        return ballColor;
    }

    public double getBallDiameter() {
        return ballDiameter;
    }

    public void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }

    public void setBallDiameter(double ballDiameter) {
        this.ballDiameter = ballDiameter;
    }

    @Override
    public String toString() {
        return String.format("PlainBall{ ballColor = %s, ballDiameter = %.3f(m)}", ballColor, ballDiameter);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        PlainBall plainBall = (PlainBall) obj;
        return ballDiameter == this.ballDiameter && (ballColor == plainBall.ballColor
                || (ballColor != null && ballColor.equals(plainBall.getBallColor())));
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballColor, ballDiameter);
    }

    public double calculateBallWeight() {
        double ballSphereVolume = Math.PI * Math.pow(this.ballDiameter, 3) * (1.0 / 6);
        double ballCavityVolume = Math.PI * Math.pow(this.ballDiameter - 2 * BALL_DEFAULT_WALL_THICKNESS, 3) * (1.0 / 6);
        double ballVolume = ballSphereVolume - ballCavityVolume;

        return BALL_DEFAULT_DENSITY * ballVolume;
    }

    public static double calculateBallWeight(double ballDiameter, double ballWallThickness, double ballDensity) {
        double ballSphereVolume = Math.PI * Math.pow(ballDiameter, 3) * (1.0 / 6);
        double ballCavityVolume = Math.PI * Math.pow(ballDiameter - 2 * ballWallThickness, 3) * (1.0 / 6);
        double ballVolume = ballSphereVolume - ballCavityVolume;

        return ballDensity * ballVolume;
    }



}
