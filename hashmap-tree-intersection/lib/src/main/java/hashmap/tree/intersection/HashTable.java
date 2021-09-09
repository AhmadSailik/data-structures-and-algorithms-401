package hashmap.tree.intersection;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTable extends LinkedList {

    int size=5;
    LinkedList[]arrs= new LinkedList[size];
    public void add(Integer key,int value){
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
    public boolean isContain(Integer key){
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
    public String print(){

        return Arrays.toString(arrs);
    }
    public int getHashCode(Integer key){
        int code=key.toString().hashCode()%size;
        if (code>=0){
            return code;
        }else {
            return code*-1;
        }
    }
}
