package org.firstinspires.ftc.robotcontroller;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp
public class MecanumEXDriveTrain extends OpMode {

    DcMotor RFMotor;
    DcMotor LFMotor;
    DcMotor RBMotor;
    DcMotor LBMotor;

    public void drivetrainSettings() {

        double horizontal;
        double vertical;
        double rotation;

        horizontal = gamepad1.left_stick_x;
        vertical = gamepad1.left_stick_y;
        rotation = gamepad1.right_stick_x;


        // TODO: Work on motor power logic and understanding above

    }

    @Override
    public void init() {
        RFMotor = hardwareMap.get(DcMotor.class, "RFMotor");
        LFMotor = hardwareMap.get(DcMotor.class, "LFMotor");
        RBMotor = hardwareMap.get(DcMotor.class, "RBMotor");
        LBMotor = hardwareMap.get(DcMotor.class, "LBMotor");


    }

    @Override
    public void loop() {

    }
}
