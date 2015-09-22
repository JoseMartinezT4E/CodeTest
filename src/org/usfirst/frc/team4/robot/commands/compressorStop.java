package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class compressorStop extends Command {

    public compressorStop() {
    	requires(Robot.pneu);
    }

    protected void initialize() {
    	Robot.pneu.compressorStop();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
