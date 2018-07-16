package org.firstinspires.ftc.teamcode.Util;

public class RobotConstants
{
    private final double WHEEL_DIAMETER = 4;
    private final double WHEEL_CIRCUMFERENCE = Math.PI * WHEEL_DIAMETER;

    private final int DRIVE_TOLERANCE = 50;
    private final double TURN_TOLERANCE = 1;
    //TODO: TEST FOR VALS
    public final int ENCODER_TICKS_PER_REVOLUTION = 0;

    public int getTICKS_PER_INCH() {
        return (int)(ENCODER_TICKS_PER_REVOLUTION / WHEEL_CIRCUMFERENCE);
    }

    public int getDRIVE_TOLERANCE()
    {
        return DRIVE_TOLERANCE;
    }
    public double getTurnTolerance()
    {
        return TURN_TOLERANCE;
    }

}





