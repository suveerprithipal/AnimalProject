package com.nz.gentrack.mydemoproject.JunitTests;

import com.nz.gentrack.mydemoproject.domain.animal.Animal;
import com.nz.gentrack.mydemoproject.domain.animal.Cat;
import com.nz.gentrack.mydemoproject.domain.animal.Dog;
import org.junit.Test;

public class AnimalTest {

    Animal dog = new Dog();
    Animal cat = new Cat();

    @Test
    public void testDogSound(){
       System.out.println( dog.getNoise());
    }

}
