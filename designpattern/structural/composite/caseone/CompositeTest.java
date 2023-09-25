package designpattern.structural.composite.caseone;

public class CompositeTest {

    public static void main(String[] args) {
        Component hdd = new Leaf(5000, "HDD");
        Component mouse = new Leaf(500, "Mouse");
        Component monitor = new Leaf(30000, "Monitor");
        Component ram = new Leaf(3000, "RAM");
        Component processor = new Leaf(15000, "Processor");

        Composite peripheral = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("computer");


        motherBoard.addComponent(processor);
        motherBoard.addComponent(ram);

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);

        cabinet.addComponent(hdd);
        cabinet.addComponent(motherBoard);

        computer.addComponent(cabinet);
        computer.addComponent(peripheral);

//        peripheral.showPrice();
        computer.showPrice();

    }
}
