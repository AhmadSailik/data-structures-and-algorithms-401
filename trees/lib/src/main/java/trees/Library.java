/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Library {
    public boolean someLibraryMethod() {

        return true;
    }

    public static void main(String[] args) {

        BinarySearch binarySearch=new BinarySearch();
        binarySearch.add(40);
        binarySearch.add(20);
        binarySearch.add(50);
        binarySearch.add(100);
        binarySearch.add(10);
        binarySearch.add(25);
        binarySearch.add(120);
        binarySearch.add(45);
        binarySearch.add(130);
        binarySearch.add(110);
        binarySearch.add(90);
        binarySearch.add(42);

//        System.out.println(binarySearch.preOrder());
        System.out.println(binarySearch.inOrder());
//        System.out.println(binarySearch.postOrder());
//        System.out.println(binarySearch.arrayList);
//        System.out.println(binarySearch.contains(20));
//        System.out.println(binarySearch.contains(23));
//        System.out.println(binarySearch.contains(42));

    }
}
