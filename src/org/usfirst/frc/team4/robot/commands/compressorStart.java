package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class compressorStart extends Command {

    public compressorStart() {
       requires(Robot.pneu);
    }

    protected void initialize() {
    	Robot.pneu.bothArmsNeutral();
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
