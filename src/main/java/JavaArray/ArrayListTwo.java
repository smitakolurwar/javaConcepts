package JavaArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTwo {

    public static void main(String[] args) {

        List<Integer> parentListWithNumbers = new ArrayList<>();

        parentListWithNumbers.add(10);
        parentListWithNumbers.add(25);
        parentListWithNumbers.add(51);
        parentListWithNumbers.add(54);

        System.out.println(parentListWithNumbers);
        System.out.println(parentListWithNumbers.get(1));
        System.out.println("Size" + parentListWithNumbers.size());

    }
}
