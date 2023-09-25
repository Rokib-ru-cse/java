package designpattern.structural.adapter;

public class Main {

    public static void main(String[] args) {
        EnemyAttacker enemyAttacker = new EnemyRobotAdapter(new EnemyRobot());
        enemyAttacker.fireWeapon();
        enemyAttacker.driveForward();
        enemyAttacker.assignDriver("rokib");
    }
}
