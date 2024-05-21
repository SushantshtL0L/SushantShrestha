import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args){
        /* Impoet ArrayList from java.util */
        ArrayList<String> names = new ArrayList<>();

        names.add("Gomez");
        names.add("Messi");
        names.add("Beckam");
        names.add("Neymar");

        /* To loop, find the length/element count, .size() */
        int namesLength = names.size();
        /* Loop same as array */
        for(int index = 0; index < namesLength; index ++){
            // Get each element with .get(index)
            String singleName = names.get(index);
            System.out.println("index : " + index + "Value"+ singleName);
        }
        
        /* Using for each in java, iterate with element/actual value */
        for(String element: names){
            System.out.println(element);
        }

        /*Task
             * make an ArrayLst animals
             * ["cat","tiger","dog","elephant"]
             * Make two more Arraylist called, wildAnimla, domesticAniamal
             * loop the animals
             * if the elements/value is"cat", "dog" add in domesticAniamls
             * if the element/value is"tiger","element" add in wildAnimal
             * print domestic animal , wildAnimal
             */
            ArrayList<String> animals= new ArrayList<>();
            animals.add("cat");
            animals.add("tiger");
            animals.add("dog");
            animals.add("elephant");
            int animalLenght= animals.size();
            //for loop
            ArrayList<String> domesticAnimals= new ArrayList<>();
            ArrayList<String> wildAnimal= new ArrayList<>();
            for(int index=0; index<animalLenght;index++){
                String singleAnimal= animals.get(index);
                if(singleAnimal =="cat"||singleAnimal=="dog"){
                    
                domesticAnimals.add(singleAnimal);

            }else{
                wildAnimal.add(singleAnimal);
            }
          

        }
          /*using for -each */
          for(String elem:animals){
            if(elem=="cat"|| elem=="dog"){
                domesticAnimals.add(elem);
            }
            else{
                wildAnimal.add(elem);
            }
        }
    }

}

}   





    
}
