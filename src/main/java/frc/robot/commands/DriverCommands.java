package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Swerve;


public class DriverCommands extends Command {

    Swerve m_Swerve = new Swerve();

    public DriverCommands(Swerve m_Swerve) {
        this.m_Swerve = m_Swerve;
        addRequirements(m_Swerve);

    }    

    public void setDrection() {
        m_Swerve.setHeading(m_Swerve.getHeading());
    }

}
