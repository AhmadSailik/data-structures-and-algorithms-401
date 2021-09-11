package hashmap.left.join;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTable extends LinkedList {

    int size=5;
    LinkedList[]arrs= new LinkedList[size];
    public void add(String key,String value){
        if (arrs[getHashCode(key)]==null){
            arrs[getHashCode(key)] = new LinkedList();
            arrs[getHashCode(key)].insert(key,value);
        }else {
            LinkedList pref=arrs[getHashCode(key)];
            arrs[getHashCode(key)] = new LinkedList();
            arrs[getHashCode(key)]=pref;
            arrs[getHashCode(key)].insert(key,value);
        }
    }
    public boolean isContain(String key){
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i]==null){
                arrs[i] = new LinkedList();
            }
            if (arrs[i].isContains(key)){
                return true;
            }
        }
        return false;
    }
    public String get(String key){
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i]==null){
                arrs[i] = new LinkedList();
            }
            if (!arrs[i].get(key).equals("NULL")){
                return arrs[i].get(key);
            }
        }
        return "NULL";
    }

    public ArrayList<String> getAllKeys(){
        ArrayList<String> arrayList=new ArrayList<>();
        for (int i = 0; i < arrs.length; i++) {

            arrs[i].getKeys(arrayList);
//            arrs[i].getKeys();
        }
        return arrayList;

    }

    public String print(){

        return Arrays.toString(arrs);
    }
    public void printBucket(){
        for (int i = 0; i < arrs.length; i++) {
            System.out.println("Bucket "+i+": "+arrs[i]);
        }
    }
    public int getHashCode(String key){
        int code=key.hashCode()%size;
        if (code>=0){
            return code;
        }else {
            return code*-1;
        }
    }
}
