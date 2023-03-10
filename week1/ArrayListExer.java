package Data_structure_NCI.week1;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Mendy
 * @create 2023-01-24 12:15
 */
public class ArrayListExer {

    @Test
    public void test1(){
        ArrayList<Integer> myInts = new ArrayList<>(20);

        for (int i = 0; i < 10; i++) {
            myInts.add(i);
        }
        System.out.println(myInts);


        for (int i = 0; i <10; i++) {
            myInts.set(i,(myInts.get(i)) * 3) ;
        }
        System.out.println(myInts);

        myInts.set(5,44);
        System.out.println(myInts);
        System.out.println("The size of the ArrayList is " + myInts.size());


    }

}
