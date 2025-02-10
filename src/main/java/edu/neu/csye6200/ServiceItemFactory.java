package edu.neu.csye6200;

class ServiceItemFactory implements ItemFactory {
    private static final ServiceItemFactory instance = new ServiceItemFactory();
    private ServiceItemFactory() {}
    public static ServiceItemFactory getInstance() { return instance; }
    @Override
    public Item createItem(String csv) { return new ServiceItem(csv); }
}
