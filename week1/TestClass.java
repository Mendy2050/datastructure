package Data_structure_NCI.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mendy
 * @create 2023-01-26 15:10
 */
public class TestClass {


    public static void print(List<String> arr) {
        for (String current : arr) {
            System.out.print(current + " ");
        }
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        list.add("bye");
        TestClass.print(list);


        //1、Add a String to the list
        list.add("Exam");

        System.out.println();
        TestClass.print(list);


        //2、 add an Integer to the list
        //  list.add(123); // ———— type verification failled when I tried to add an Integer


        //3、 Remove the item at index 0
        list.remove(0);

        System.out.println();
        TestClass.print(list);


        //4、Insert an item at index 1 (add(int index, E element)
        list.add(1, "Boy");

        System.out.println();
        TestClass.print(list);


        //5、 Remove the first occurrence of a String
        list.remove("World");

        System.out.println();
        TestClass.print(list);


        //6、 Use set(int index, E element)
        list.set(2, "Girl");

        System.out.println();
        TestClass.print(list);


        //7、method would allow us to test if an object is to be found in the list
        boolean ifBoyExist = list.contains("Boy");
        System.out.println();
        System.out.println(ifBoyExist);


        // normal for loop
//        for(int i =0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }

        //8、
        // (1）Create a new ArrayList to store strings
        ArrayList<String> newList = new ArrayList<>();


        // (2）add 4 strings to the new ArrayList.
        newList.add("Another");
        newList.add("List");
        newList.add("For");
        newList.add("You");

        System.out.println();
        TestClass.print(newList);

        //（3）Thereafter，utilize the addAll(Collection c) to add all of the second list to the first one.
        list.addAll(newList);

        System.out.println();
        TestClass.print(list);


        //9、clear() on one of your ArrayList instances —— clean the old list
        list.clear();

        System.out.println();
        TestClass.print(list);
        System.out.println("Next line of list");


        //10、Create an ArrayList which stores Person instances.
        ArrayList<Person> personList = new ArrayList<>();
        Person p1 = new Person("Tom", 30);
        Person p2 = new Person("Mary", 35);
        Person p3 = new Person("Lily", 29);
        Person p4 = new Person("Lisa", 31);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

        System.out.println();
        System.out.println(personList);

    }

}





