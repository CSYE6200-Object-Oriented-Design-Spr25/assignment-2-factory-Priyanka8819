package edu.neu.csye6200;

class ElectronicItemFactory implements ItemFactory {
    private static ElectronicItemFactory instance;
    private ElectronicItemFactory() {}
    public static synchronized ElectronicItemFactory getInstance() {
        if (instance == null) {
            instance = new ElectronicItemFactory();
        }
        return instance;
    }
    @Override
    public Item createItem(String csv) { return new ElectronicItem(csv); }
}