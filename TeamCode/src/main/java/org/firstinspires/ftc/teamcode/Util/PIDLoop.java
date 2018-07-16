package org.firstinspires.ftc.teamcode.Util;

public class PIDLoop {

    private double kp;
    private double ki;
    private double kd;

    private double target;

    private double error = 1;
    private double pastError;
    private double sumError;

    public PIDLoop(double kp, double ki, double kd)
    {
        this.kp = kp;
        this.ki = ki;
        this.kd = kd;
    }

    public double getKp()
    {
        return this.kp;
    }

    public double getKd()
    {
        return this.kd;
    }

    public double getKi()
    {
        return this.ki;
    }

    public void setTarget(double target)
    {
        this.target = target;
    }

    public double pLoop(double input)
    {
        error = target - input;
        return (kp*error);
    }

    public double pidLoop(double input, double dt)
    {
        pastError = error;
        error = target - input;
        sumError += pastError;

        if((sumError)>1)
            sumError = 1 / sumError;

        return kp * error + (((error)-pastError)/dt)*kd + ki*sumError;
    }

}
