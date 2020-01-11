/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;

public class Drivesub extends PIDSubsystem {
  /**
   * Creates a new Drivesub.
   */
  public Drivesub() {
    super(
        // The PIDController used by the subsystem
        new PIDController(0, 0, 0));
     }

  @Override
  public void useOutput(double output, double setpoint) {
    // Use the output here
  }

  @Override
  public double getMeasurement() {
    // Return the process variable measurement here
    return 0;
  }
  public WPI_TaronSRX lhMotor = new WPI_TaronSRX(Constants.lhMotorport);
  public WPI_TaronSRX lbMotor = new WPI_TaronSRX(Constants.lbMotorport);
  public WPI_TaronSRX rhMotor = new WPI_TaronSRX(Constants.Motorport);
  public WPI_TaronSRX rbMotor = new WPI_TaronSRX(Constants.rbMotorport);

}

