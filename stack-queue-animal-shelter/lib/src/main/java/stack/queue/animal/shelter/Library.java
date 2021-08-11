/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue.animal.shelter;

import java.util.ArrayList;
import java.util.Objects;

public class Library {


    public boolean someLibraryMethod() {

        return true;
    }

    public static void main(String[] args) {
        Animal cat1=new Cat("cat",2);
        Animal dog1=new Dog("dog",1);
        Animal cat2=new Cat("cat",4);
        Animal dog2=new Dog("dog",3);
        Animal cow=new Animal("cow",9);

        AnimalShelter<Objects>animalShelter=new AnimalShelter<>();
        animalShelter.enqueue(cat1);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(dog2);
        animalShelter.enqueue(cow);

        System.out.println(animalShelter.getValueDog());
        System.out.println(animalShelter.getValueCat());
        System.out.println(animalShelter.dequeue("cat"));
        System.out.println(animalShelter.dequeue("dog"));
        System.out.println(animalShelter.dequeue("cow"));
    }
}
