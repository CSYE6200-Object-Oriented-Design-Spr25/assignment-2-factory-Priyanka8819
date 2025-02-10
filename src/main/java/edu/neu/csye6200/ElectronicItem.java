package edu.neu.csye6200;

class ElectronicItem extends Item {
    public ElectronicItem(String csv) {
        super(Integer.parseInt(csv.split(",")[0]), csv.split(",")[1], Double.parseDouble(csv.split(",")[2]));
    }
    @Override
    public String toString() { return "ElectronicItem: " + id + ", " + name + ", " + price; }
}
