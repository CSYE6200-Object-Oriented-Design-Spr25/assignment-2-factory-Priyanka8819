package edu.neu.csye6200;

class ServiceItem extends Item {
    public ServiceItem(String csv) {
        super(Integer.parseInt(csv.split(",")[0]), csv.split(",")[1], Double.parseDouble(csv.split(",")[2]));
    }
    @Override
    public String toString() { return "ServiceItem: " + id + ", " + name + ", " + price; }
}
