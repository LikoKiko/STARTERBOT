package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {

    private final PWMSparkMax m_leftMotor = new PWMSparkMax(Constants.DriveConstants.kLeftMotorPort); 
    private final PWMSparkMax m_rightMotor = new PWMSparkMax(Constants.DriveConstants.kRightMotorPort); 
    private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotor, m_rightMotor); 

    public DriveSubsystem() {}

    public void arcadeDrive(double speed, double rotation) {
        m_drive.arcadeDrive(speed, rotation); 
    }
}
