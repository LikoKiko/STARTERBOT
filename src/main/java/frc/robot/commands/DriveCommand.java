package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends CommandBase { 
    private final DriveSubsystem m_driveSubsystem;
    private final XboxController m_controller; 
    public DriveCommand(DriveSubsystem subsystem, XboxController controller) {
        m_driveSubsystem = subsystem; 
        m_controller = controller; 
        addRequirements(m_driveSubsystem); 
    }

    @Override
    public void execute() {
        double speed = -m_controller.getLeftY(); // Speed left Y axis
        double rotation = m_controller.getRightX(); // Rotation X axis
        m_driveSubsystem.arcadeDrive(speed, rotation); 
    }

    @Override
    public boolean isFinished() {
        return false; // Never stop by himself
    }

    @Override
    public void end(boolean interrupted) {
        m_driveSubsystem.arcadeDrive(0, 0); 
    }
}
