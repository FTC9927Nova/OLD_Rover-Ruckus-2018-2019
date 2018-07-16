package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

public class Robot {

    private DcMotor l1;
    private DcMotor l2;
    private DcMotor r1;
    private DcMotor r2;


    private int leftTarget;
    private int rightTarget;


    public void setLeftPower(double power)
    {
        power = Range.clip(power, -1,1);
        l1.setPower(power);
        l2.setPower(power);
    }

    public void setRightPower(double power)
    {
        power = Range.clip(power, -1,1);
        r1.setPower(power);
        r2.setPower(power);
    }

    public void setLeftTarget(int target)
    {
        l1.setTargetPosition(target);
        l2.setTargetPosition(target);
    }

    public void setRightTarget(int target)
    {
        r1.setTargetPosition(target);
        r2.setTargetPosition(target);
    }

    public int getRightTarget(){
        return r1.getTargetPosition();
    }

    public int getLeftTarget(){
        return l1.getTargetPosition();
    }

    public int getLeftCurrentPosition()
    {
        return l1.getCurrentPosition();
    }

    public int getRightCurrentPosition()
    {

        return r1.getCurrentPosition();
    }

}
