package stack.queue.animal.shelter;

public class Animal {
    String type;
    int age;

    public Animal(String type,int age){
        this.type=type.toLowerCase();
        this.age=age;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
