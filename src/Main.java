import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Lists 01
Exercise: lists 1

define a testing class with a main() method where you:
create a not mutable List of strings called cityNames using asList() that you populate with 3 city names
try to add a 4th city name at the end of the List
if you get an exception, try to understand why and eventually comment the faulty code
try to change the 2nd item of the array, entering the value Tegucigalpa
print the content of cityNames
define a mutable empty List of strings called kingsOfRome
insert the names of the 7 kings of Rome into the mutable list
print the content of kingsOfRome
convert kingsOfRome into an array called kingsOfRomeArray, using new String[0] to determine the type of the array
change the value of the 7th king in kingsOfRomeArray with the value Lucius Tarquinius Supercar
print the content of kingsOfRomeArray
 */
public class Main {
    public static void main(String[] args) {
        final List<String> cityNames = Arrays.asList("Milano","Roma","Napoli");
        //cityNames.add("Palermo"); because the size of the Array (3) is not modifiable due to the 'final'
        cityNames.set(1,"Tegucigalpa");
        System.out.println(cityNames.toString());

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marco");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");
        System.out.println(kingsOfRome.toString());

        String []kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6]="Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}
