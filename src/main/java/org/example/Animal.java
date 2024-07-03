package org.example;


/* Животные - Animal
*  Млекопитающие - Mammalia(2)
*  Хищные - Carnivora(3)
*  Кошачьи - Felidae(4)
*  Кошка - FelisCatus(5)
*/
public class Animal {

    public String name;

    public Animal(String name){
        this.name = name;
    }

    public Animal(){
    }

    void test(){
        System.out.println("Я дышу");
    }
}
