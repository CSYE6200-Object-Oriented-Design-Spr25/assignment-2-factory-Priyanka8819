package edu.neu.csye6200;

import java.io.IOException;
import java.util.Comparator;

class Store extends AbstractStore {
    @Override
    @SuppressWarnings("CallToPrintStackTrace")
    void demo() {
        try {
            // Load items using factories
            FoodItemFactory foodFactory = new FoodItemFactory();
            ElectronicItemFactory electronicFactory = ElectronicItemFactory.getInstance();
            ServiceItemFactory serviceFactory = ServiceItemFactory.getInstance();

            for (String line : FileUtil.readFile("FoodItemCSV.txt"))
                items.add(foodFactory.createItem(line));
            for (String line : FileUtil.readFile("ElectronicItemCSV.txt"))
                items.add(electronicFactory.createItem(line));
            for (String line : FileUtil.readFile("ServiceItemCSV.txt"))
                items.add(serviceFactory.createItem(line));

            System.out.println("Original List:");
            items.forEach(System.out::println);

            // Sorting by ID
            sortBy(Comparator.comparingInt(Item::getId));
            System.out.println("\nSorted by ID:");
            items.forEach(System.out::println);

            // Sorting by Name
            sortBy(Comparator.comparing(Item::getName));
            System.out.println("\nSorted by Name:");
            items.forEach(System.out::println);

            // Sorting by Price
            sortBy(Comparator.comparingDouble(Item::getPrice));
            System.out.println("\nSorted by Price:");
            items.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
