package edu.edina.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import edu.edina.library.domain.MecanumDrive;
import edu.edina.library.util.Robot;
import edu.edina.library.util.SmartGamepad;

public class TeleopOpMode extends OpMode {
    protected Robot robot;
    protected SmartGamepad driver1Gamepad;
    protected SmartGamepad driver2Gamepad;

    @Override
    public void init() {
        driver1Gamepad = new SmartGamepad(gamepad1);
        driver2Gamepad = new SmartGamepad(gamepad2);
    }

    // hit after init is called and before play
    // great place to put vision code to detect where to go for autonomous
    @Override
    public void init_loop() {
        telemetry.update();
    }

    @Override
    public void start() {
        robot.start();
    }

    @Override
    public void loop() {
        driver1Gamepad.update();
        driver2Gamepad.update();

        MecanumDrive.setProperties(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);

        robot.update();
        robot.telemetry();
    }

    @Override
    public  void stop() {
        robot.stop();
    }
}
