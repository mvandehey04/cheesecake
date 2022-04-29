/**
 * @purpose Display different flavored cheese cake and calculate it's ingredients. 
 *
 * @author Madeline Vande Hey
 * @version 2/16/22
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args){
        //initializing and declareing an ArrayList and adding in objects as elements
        // initialize arraylist
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
            // create cheese cake objects   
            CheeseCakeV1 blueberry = new CheeseCakeV1("Blueberry", 5);
            CheeseCakeV1 strawberry = new CheeseCakeV1("Strawberry", 6);
            CheeseCakeV1 cherry = new CheeseCakeV1("Cherry", 4);
            CheeseCakeV1 jalapeno = new CheeseCakeV1("Jalapeno", 1);
            CheeseCakeV1 dillPickle = new CheeseCakeV1("Dill Pickle", 2);
            CheeseCakeV1 fig = new CheeseCakeV1("Fig", 3);

            // add cheese cake to the ArrayList
            cake.add(blueberry);
            cake.add(strawberry);
            cake.add(cherry);
            cake.add(jalapeno);
            cake.add(dillPickle);
            cake.add(fig);
        
        //calls several methods for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
            dataRecord.calcSugar();
        }
        
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            dataRecord = cake.get(index);
            // print each CheeseCake's data
            System.out.printf("%s %3d %3s", "|", index, "|");
            System.out.println(dataRecord.toString());
        }
    }
}


