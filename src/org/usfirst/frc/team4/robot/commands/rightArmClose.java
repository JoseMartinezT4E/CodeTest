package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class rightArmClose extends Command {

    public rightArmClose() {
       requires(Robot.pneu);
    }
    
    protected void initialize() {
    	Robot.pneu.rightArmClose();
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
