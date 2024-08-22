package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.commands.DriveCommand;

public class Robot extends TimedRobot {

    private final DriveSubsystem m_driveSubsystem = new DriveSubsystem(); 
    private final XboxController m_driverController = new XboxController(Constants.OIConstants.kDriverControllerPort); 

    @Override
    public void robotInit() {
        CommandScheduler.getInstance().schedule(new DriveCommand(m_driveSubsystem, m_driverController)); 
    }

    @Override
    public void teleopPeriodic() {
        CommandScheduler.getInstance().run(); 
    }

    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run(); 
    }
}
