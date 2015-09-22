package org.usfirst.frc.team4.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4.robot.Robot;

/**
 *Code improved with the help of Joseph Chorbajian
 */
public class rightArmOpen extends Command {

    public rightArmOpen() {
    	requires(Robot.pneu);
    }

    protected void initialize() {
    	Robot.pneu.rightArmOpen();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
