import java.util.ArrayList;
public class ArrayListClass{
    public static void main(String[] args){
    /* To use ArrayList import at the top like scanner from java.utils */
    ArrayList<String> animals = new ArrayList<>();
    /* size is automaticallu allocated according to the element */
    /* To add data in animals */
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Elephant");
    System.out.println(animals);
    /* Can add element directly to index, it will shift rest to + 1 of index */
    animals.add(1, "Tiger");
    System.out.println(animals);
    /* Notice how the previous 1 and rest are shifted by 1 index */

    /* To remove use .remove(index) */
    animals.remove(2);
    System.out.println(animals);
    /* It will remove the items/element in 2nd index */

    // To update  . set(index, value)
    animals.set(1, "Snake");
    System.out.println(animals);
    // to access cannot use [index] -> square bracket, use .get(index)
    System.out.println(animals.get(0)); // get 0th indexed element


    /* TASK
     * Make an ArrayList of int
     * {100, 200, 300, 400, 500}
     * remove the value 300
     * Add -100 at the first of array list
     * Change 200 -210
     * Change 400 - 420
     * Print the array List
     */
    ArrayList<Integer> IntegerArrayList = new ArrayList<>();

    IntegerArrayList.add(100);
    IntegerArrayList.add(200);
    IntegerArrayList.add(300);
    IntegerArrayList.add(400);
    IntegerArrayList.add(500);
    System.out.println(IntegerArrayList);

    IntegerArrayList.add(0, -100);
    System.out.println(IntegerArrayList);

    IntegerArrayList.remove(3);
    System.out.println(IntegerArrayList);

    IntegerArrayList.set(2, -210);
    IntegerArrayList.set(4, -420);
    System.out.println(IntegerArrayList);



    }
}       