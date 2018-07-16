package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Subsystems.Robot;
import org.firstinspires.ftc.teamcode.Util.Gyro;

@TeleOp(name = "intAccTester")
@Disabled
public class DoubleIntegrationTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Robot robot = new Robot();
        Gyro gyro = new Gyro();
        ElapsedTime time = new ElapsedTime();
        double timeElapsedMiliseconds;
        double timeElapsedSeconds;

        double areaVelocityX = 0;
        double areaPositionX = 0;

        double areaVelocityY = 0;
        double areaPositionY = 0;

        double sumOfPosX = 0;
        double sumOfPosY = 0;

        int counter = 0;

        waitForStart();
        while (opModeIsActive()){

            time.startTime();

            telemetry.addData("Acceleration", gyro.getAccelerationX() + " (m/s)2");
            telemetry.addData("Velocity", areaVelocityX + " m/s");
            telemetry.addData("X Position", sumOfPosX + " m");
            telemetry.addData("Y Position", sumOfPosY + " m");
            telemetry.update();

            if (time.milliseconds() >= 5){
                timeElapsedMiliseconds = time.milliseconds();
                time.reset();
                timeElapsedSeconds = timeElapsedMiliseconds/1000;
                areaVelocityX = (timeElapsedSeconds/1000)*gyro.getAccelerationX();
                areaPositionX = (timeElapsedSeconds/1000)*areaVelocityX;
                areaVelocityY = (timeElapsedSeconds/1000)*gyro.getAccelerationY();
                areaPositionY = (timeElapsedSeconds/1000)*areaVelocityY;
                sumOfPosX += areaPositionX;
                sumOfPosY += areaPositionY;
            }

        }
    }
}
