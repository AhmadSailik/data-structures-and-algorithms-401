/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Library {
    public boolean someLibraryMethod() {

        return true;
    }

    public static void main(String[] args) {
        HashTable hashTable=new HashTable();
        hashTable.add("ahmad",3);
        hashTable.add("ahmads",31);
        hashTable.add("noor",21);
        hashTable.add("mom",7);
        hashTable.add("noor",7);
        System.out.println(hashTable.get("noor"));
        System.out.println(hashTable.get("noorss"));
        System.out.println(hashTable.isContain("mom"));
        System.out.println(hashTable.isContain("xxxx"));
        System.out.println(hashTable.hash("noor"));
        System.out.println(hashTable.hash("llll"));
        System.out.println(hashTable.print());
        hashTable.printBucket();
    }
}