package org.firstinspires.ftc.robotcontroller;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "MecanumTeleOP")
public class TeleOp_Mecanum extends OpMode{
    @Override
    public void init() {
        telemetry.addData("Init","Completed" );
        telemetry.update();

    }

    @Override
    public void loop() {
        telemetry.addData("Loop", "Is Running");
        telemetry.update();
    }
}
