package org.firstinspires.ftc.robotcontroller;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name = "Telementary Test")
public class telementaryTest extends OpMode {



    @Override
    public void init() {
        telemetry.addData("Hardware:", "Has Been Initialized");

    }

    @Override
    public void loop() {
        // if else statement


        if (gamepad1.a) {
            telemetry.addData("Button A", "Is Being Pressed" );
            telemetry.update();


        }
        else if(gamepad1.b) {
            telemetry.addData("Button B", "Is Being Pressed" );
            telemetry.update();

        }
        else if(gamepad1.x) {
            telemetry.addData("Button X", "Is Being Pressed" );
            telemetry.update();

        } else if (gamepad1.y)  {
            telemetry.addData("Button Y", "Is Being Pressed" );
            telemetry.update();

        } else {
            telemetry.addData("No Button", "Is Being Pressed" );
        }

    }
}
