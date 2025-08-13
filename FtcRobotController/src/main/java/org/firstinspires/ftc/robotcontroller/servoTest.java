package org.firstinspires.ftc.robotcontroller;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class servoTest extends OpMode {

    public Servo servo;
    int servoCounter;

    @Override
    public void init() {
        servo = hardwareMap.get(Servo.class, "servo");
        servoCounter = 0; //set servo to 0 when init pressed


        servo.setPosition(0.0);
        telemetry.addData("Servo Position:", servo.getPosition());
        telemetry.update();

    }

    @Override
    public void loop() {

        if (gamepad1.a) {
            servoCounter = 1;
        }
        if (gamepad1.y) {
            servoCounter = 2;

        }
        if (gamepad1.b) {
            servoCounter = 3;
        }
        if (gamepad1.x) {
            servoCounter = 4;
        }

        // TODO: THIS is the control logic for the servo based on the gamepad instruction
        if (servoCounter == 1) {
            // if Button A is pressed, set servo pos 0.5;
            servo.setPosition(0.5);
            telemetry.addData("Button A Servo Position:", servo.getPosition());

        }
        if (servoCounter == 2) {
            // if Button Y is pressed, set servo pos 1.0;
            servo.setPosition(1.0);
            telemetry.addData("Button Y Servo Position:", servo.getPosition());

        }
        if (servoCounter == 3) {
            // if Button B is pressed, set servo pos 0.25;
            servo.setPosition(0.25);
            telemetry.addData("Button B Servo Position:", servo.getPosition());

        }
        if (servoCounter == 4) {
            // if Button X is pressed, set servo pos 0.75;
            servo.setPosition(0.75);
            telemetry.addData("Button X Servo Position:", servo.getPosition());

        }
    }
}
