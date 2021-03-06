/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap.left.join;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public boolean someLibraryMethod() {

        return true;
    }

    public static ArrayList<String> leftJoin(HashTable hashTable1, HashTable hashTable2){

        ArrayList<String> arrayList=new ArrayList<>();
        String[][] arrays=new String[hashTable1.getAllKeys().size()][];
        for (int i = 0; i < hashTable1.getAllKeys().size(); i++) {
            String key=hashTable1.getAllKeys().get(i);
            arrays[i]=new String[]{key,hashTable1.get(key),hashTable2.get(key)};
            arrayList.add(Arrays.toString(arrays[i]));
        }
        return arrayList;
    }
    public static void main(String[] args) {
        HashTable hashTable1=new HashTable();
        hashTable1.add("Ahmad","good");
        hashTable1.add("Noor","bad");
        hashTable1.add("Ali","noob");
        hashTable1.add("Mohammad","excellent");
        hashTable1.get("Noor");
        HashTable hashTable2=new HashTable();
        hashTable2.add("Ahmad","css");
        hashTable2.add("Noor","java");
        hashTable2.add("Ali","javaScript");
        hashTable2.add("Lila","excellent");
        System.out.println(leftJoin(hashTable1,hashTable2));


    }
}
