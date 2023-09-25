package designpattern.structural.adapter;

public class EnemyRobot {

    public void smashWithHand() {
        System.out.println("Enemy Robot is smashing With Hand");
    }

    public void walkForward() {
        System.out.println("Enemy Robot is walking Forward");
    }

    public void reactToHuman(String name) {
        System.out.println("Enemy Robot is reacting with Human " + name);
    }

}
