// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */

 import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public final class Constants {

public final PWMSparkMax m_left1 = new PWMSparkMax(1);
public final PWMSparkMax m_left2 = new PWMSparkMax(0);
public final PWMSparkMax m_right2 = new PWMSparkMax(3);
public final PWMSparkMax m_right1 = new PWMSparkMax(2);

MotorControllerGroup leftGroup = new MotorControllerGroup(m_left1, m_left2);
MotorControllerGroup rightGroup = new MotorControllerGroup(m_right1, m_right2);

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
