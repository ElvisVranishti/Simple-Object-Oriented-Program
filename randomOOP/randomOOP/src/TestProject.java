//Elvis Vranishti
public class TestProject {
    public static void main(String[] args) throws Exception {

        //Toyota Fleet Creation
        ToyotaFleet toyotaCar = new ToyotaFleet("Corolla", "Blue", 3, 30);
        ToyotaFleet toyotaSUV = new ToyotaFleet("RAV4", "Black", 4, 1500);
        ToyotaFleet toyotaTruck = new ToyotaFleet("Tundra", "Silver", 4, 20);
        //Honda Fleet Creation
        HondaFleet hondaCar = new HondaFleet("Accord", "Black", 3, 2000);
        HondaFleet hondaSUV = new HondaFleet("CRV", "White", 4, 10);
        HondaFleet hondaTruck = new HondaFleet("Ridgeline", "Red", 4, 1500);
        //Toyota Route Creation
        ToyotaRoutes ArlingtonHeights = new ToyotaRoutes("Arlington Heights", "Des Plaines", 30, 40, 0.85, true);
        ToyotaRoutes Chicago = new ToyotaRoutes("Downtown Chicago", "O'Hare", 1500, 55, 0.70, false);
        ToyotaRoutes Palatine = new ToyotaRoutes("Palatine", "Gurnee", 20, 60, 0.65, true);
        //Honda Route Creation
        HondaRoutes Wheeling = new HondaRoutes("Wheeling", "Chicago", 2000, 60, 1.20, true);
        HondaRoutes Wilmette = new HondaRoutes("Wilmette", "Milwaukee", 10, 105, 1.75, false);
        HondaRoutes Zion = new HondaRoutes("Zion", "Chicago", 1500, 80, 1.35, true);
        //LinkedList
        System.out.println("Original Linked List");
        LinkedList list = new LinkedList();

        //If list is empty and trying to remove node exception
        //System.out.println("If list is empty and trying to remove a node");
        //list.remove(1,"Corolla");
        //System.out.println(list);
        //System.out.println("\n");

        list.insert(1, "Corolla");
        list.insert(2, "RAV4");
        list.insert(3, "Tundra");
        list.insert(4, "Accord");
        list.insert(5, "CRV");
        System.out.println(list);
        System.out.println("\n");

        //Inserting node to linked list
        System.out.println("Adding one more node to the list");
        list.insert(6, "Ridgeline");
        System.out.println(list);
        System.out.println("\n");

        FileCreator fc = new FileCreator();
        fc.writeFile(toyotaCar.getCity());

        System.out.println("\n");
        System.out.println("The cost for a taxi with a " + toyotaCar.getModel() + " from " + ArlingtonHeights.getM_pickUpLocation() + " to " + ArlingtonHeights.getM_dropOffLocation() + " is " + ArlingtonHeights.priceCalc());
        System.out.println("The cost for a taxi with a " + toyotaSUV.getModel() + " from " + Chicago.getM_pickUpLocation() + " to " + Chicago.getM_dropOffLocation() + " is " + Chicago.priceCalc());
        System.out.println("The cost for a taxi with a " + toyotaTruck.getModel() + " from " + Palatine.getM_pickUpLocation() + " to " + Palatine.getM_dropOffLocation() + " is " + Palatine.priceCalc());
        System.out.println("\n");
        System.out.println("The cost for a taxi with a " + hondaCar.getModel() + " from " + Wheeling.getM_pickUpLocation() + " to " + Wheeling.getM_dropOffLocation() + " is " + Wheeling.priceCalc());
        System.out.println("The cost for a taxi with a " + hondaSUV.getModel() + " from " + Wilmette.getM_pickUpLocation() + " to " + Wilmette.getM_dropOffLocation() + " is " + Wilmette.priceCalc());
        System.out.println("The cost for a taxi with a " + hondaTruck.getModel() + " from " + Zion.getM_pickUpLocation() + " to " + Zion.getM_dropOffLocation() + " is " + Zion.priceCalc());
        System.out.println("\n");
        System.out.println("Is route from " + ArlingtonHeights.getM_pickUpLocation() + " to " + ArlingtonHeights.getM_dropOffLocation() + " round trip? " + ArlingtonHeights.isRoundTrip());
        System.out.println("Is route from " + Chicago.getM_pickUpLocation() + " to " + Chicago.getM_dropOffLocation() + " round trip? " + Chicago.isRoundTrip());
        System.out.println("Is route from " + Palatine.getM_pickUpLocation() + " to " + Palatine.getM_dropOffLocation() + " round trip? " + Palatine.isRoundTrip());
        System.out.println("\n");
        System.out.println("Is route from " + Wheeling.getM_pickUpLocation() + " to " + Wheeling.getM_dropOffLocation() + " round trip? " + Wheeling.isRoundTrip());
        System.out.println("Is route from " + Wilmette.getM_pickUpLocation() + " to " + Wilmette.getM_dropOffLocation() + " round trip? " + Wilmette.isRoundTrip());
        System.out.println("Is route from " + Zion.getM_pickUpLocation() + " to " + Zion.getM_dropOffLocation() + " round trip? " + Zion.isRoundTrip());
        System.out.println("\n");
        System.out.println("Total Mileage for " + toyotaCar.getModel() + " after trip "+ArlingtonHeights.priceCalc());
        System.out.println("Total Mileage for " + toyotaSUV.getModel() + " after trip "+Chicago.priceCalc());
        System.out.println("Total Mileage for " + toyotaTruck.getModel() + " after trip "+Palatine.priceCalc());
        System.out.println("\n");
        System.out.println("Total Mileage for " + hondaCar.getModel() + " after trip "+Wheeling.priceCalc());
        System.out.println("Total Mileage for " + hondaSUV.getModel() + " after trip "+Wilmette.priceCalc());
        System.out.println("Total Mileage for " + hondaTruck.getModel() + " after trip "+Zion.priceCalc());
        System.out.println("\n");
        System.out.println("Is " + ArlingtonHeights.getM_pickUpLocation() + " to " + ArlingtonHeights.getM_dropOffLocation() + " a major trip (> 50 miles)? " + ArlingtonHeights.isMajorTrip());
        System.out.println("Is " + Chicago.getM_pickUpLocation() + " to " + Chicago.getM_dropOffLocation() + " a major trip (> 50 miles)? " + Chicago.isMajorTrip());
        System.out.println("Is " + Palatine.getM_pickUpLocation() + " to " + Palatine.getM_dropOffLocation() + " a major trip (> 50 miles)? " + Palatine.isMajorTrip());
        System.out.println("\n");
        System.out.println("Is " + Wheeling.getM_pickUpLocation() + " to " + Wheeling.getM_dropOffLocation() + " a major trip (> 50 miles)? " + Wheeling.isMajorTrip());
        System.out.println("Is " + Wilmette.getM_pickUpLocation() + " to " + Wilmette.getM_dropOffLocation() + " a major trip (> 50 miles)? " + Wilmette.isMajorTrip());
        System.out.println("Is " + Zion.getM_pickUpLocation() + " to " + Zion.getM_dropOffLocation() + " a major trip (> 50 miles)? " + Zion.isMajorTrip());

    }



}
