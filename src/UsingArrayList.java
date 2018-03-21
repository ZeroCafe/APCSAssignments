import java.util.ArrayList;
import java.util.Scanner;
public class UsingArrayList {
    public static void main(String[] args){
        // An arrayList that represents the items on Herm's Plate
        int initialNumOnPlate = 4;
        ArrayList<String> plate = new ArrayList<String>();
        String dia1 = "Herm, it's that time of the day again-it's time you pick the item's you have on your plate.\n So " +
                "What do you have on your plate";
        System.out.println("Mom: "+dia1);

        String hermRes = "ummm, let me add some really fast";
        System.out.println("Herm:"+ hermRes);
        String hermInterDia = "SOOO Herm how many item would you like to add";
        System.out.println("Herm's inner voice: "+ hermInterDia);
        int addThisMany = 4;
        String hermInterRes = "Let's go with "+addThisMany+" items. I want to add 4 item's. ";
        System.out.println("Herm's response to himself:"+ hermInterRes);


        //Ask the user for 1. Ask the user for 4 items of food to put on Herman’s plate. Each of these items should be added
        //to Herman’s “plate” (ArrayList<String>) using the add method.
        addItemsToPlate(initialNumOnPlate,plate);
        printPlateStatus(plate);
        //2. Herman doesn’t like everything that was put there, so he removes the 3rd item added. (use
        //remove)
        System.out.println("Herm removed " + plate.get(2) + " from his plate.");
        plate.remove(2);//ArrayList start at zero
        printPlateStatus(plate);
        //3)Herman decides he does not want the last item added to his plate, but instead wants “ice cream”.
        //Change (by using the method set) the last item added (which can be found by using size() – 1) to
        //“ice cream”.
        int lastItemAdded = plate.size()-1;
        String prefferedItem = "ice cream";
        System.out.println("Herm swaps "+ plate.get(lastItemAdded) + " with " +prefferedItem);
        plate.set(lastItemAdded,prefferedItem);
        printPlateStatus(plate);
        //4. Herman’s mom asks if Herman got some “green beans”. Did he? Use the contains method to
        //        determine if Herman has “green beans” and print to the screen if he does or does not.
        String anImportantQuestion = "Did I hear green beans? I better have heard green beans. Well???";
        System.out.println("Mom: "+ anImportantQuestion);

        boolean containsGreenBean = plate.contains("green beans");
        if(containsGreenBean){
            System.out.println("Herm: Indeed, You did hear green beans.");
        }else{
            System.out.println("Herm: No, Mom you heard wrong. I hate those green twigs.");
        }

        //5. Herman eats his food in order so he would like to add a salad to the front of his plate.
        printPlateStatus(plate);
        String addItemToFront = "Salad";
        System.out.println(" Because he's quirky, Herm adds a " + addItemToFront + " to the front of his plate.");
        plate.add(0, addItemToFront);
        printPlateStatus(plate);
    //6) Herman’s mom then asks where his salad is located. (use the indexOf method to determine
    //   what spot on Herman’s plate the salad is – it should be in the first spot)
        String anotherBigMomQ  = "Mom: The grape vine told me that you added "+ addItemToFront + "to your plate.\n Where did you add it? ";
        System.out.println(anotherBigMomQ);
        String resToQaboutSalad = "Have a gander at my entire plate. \n" + plate.toString();
        System.out.println("Herm:"+ resToQaboutSalad);
    //7)  Munch, munch. Herman eats his food. Go through Herman’s plate and munch all his food by
    //    using the clear method.
        String eatItAll = "  Yumm. Chew. Scarf. Yumm!!!";
        for(String item:  plate ){
            System.out.println(item + eatItAll);
        }
        System.out.println("Herm ate all of the food on his plate");
        plate.clear();
        printPlateStatus(plate);

    }
    private static void printPlateStatus(ArrayList<String> plate){
        System.out.println("Herm's plate now contains: \t" + plate.toString());
    }

    /**
     * addItem: retrieves a value from the user to be added to the user's plate
     * @return: item to add to plate
     */
    private static String addItem(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter an item to add to Herm's Plate");
        return input.nextLine();
    }

    /**
     * Add a number of items to the user's plate
     * @param numberOfItems: the number of items to be added to the user's plate
     * @param plate: an arraylist of food items
     */
    private static void addItemsToPlate(int numberOfItems,ArrayList plate){
        for (int i = 0; i < numberOfItems ; i++) {
            plate.add(addItem());
        }
    }

}
