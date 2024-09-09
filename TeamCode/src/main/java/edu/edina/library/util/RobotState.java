package edu.edina.library.util;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class RobotState {
    private static RobotState robotState = null;

//    mecanum drive properties
    public double leftStickX;
    public double leftStickY;
    public double rightStickX;

    public RobotState() {
    }

    public static synchronized RobotState getInstance()
    {
        if (robotState == null) {
            robotState = new RobotState();
        }

        return robotState;
    }

    public void telemetry(Telemetry telemetry, RobotHardware hardware) {
    }
}
