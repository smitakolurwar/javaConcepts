package JavaArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {

    public static void main(String[] args) {

        // List<String> parentList = new ArrayList<>();

        ArrayList<String> parentList = new ArrayList<>();


        parentList.add("Smita");
        parentList.add("Preeti");
        parentList.add("Veda");
        parentList.add("Amit");
        parentList.add("Manu");

        System.out.println(parentList);
        System.out.println(parentList.get(3));
        parentList.remove(4);
        System.out.println(parentList);

        for (int i = 0; i < parentList.size(); i++) {

            System.out.println("Current Index" + i);
            System.out.println(parentList.get(i));

        }
    }

}




