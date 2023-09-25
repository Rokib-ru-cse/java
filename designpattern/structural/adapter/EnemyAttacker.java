package designpattern.structural.adapter;

public interface EnemyAttacker {
    void fireWeapon();

    void driveForward();

    void assignDriver(String driverName);
}
