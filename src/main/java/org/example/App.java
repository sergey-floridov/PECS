package org.example;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {

        List<Animal> animals = new ArrayList();
        animals.add(new Animal());
        List<Mammalia> mammalias = new ArrayList();
        List<Carnivora> carnivoras = new ArrayList();
        List<Felidae> felidaes = new ArrayList();
        List<FelisCatus> cats = new ArrayList();

//      Что можно добавлять в разные листы?
//        felidaes.add(new Animal());  // сломаем следующий код
//        felidaes.forEach(x-> x.test4());


//       проверяем возможность добавления листов разных классов
        processUpperBounded(cats);

//        проверяем возможность добавления листов разных классов
        processLowerBounded(carnivoras);
    }


    /*PE
     *Producer(Поставщик) Extends
     */
    public static void processUpperBounded(List<? extends Carnivora> carnivoras) {
//        carnivoras.add(new Carnivora());//compilation error
        carnivoras.add(null);  // в такую коллекцию мы можем добавлять элементы типа null
        Carnivora carnivora = carnivoras.get(0);
        carnivora.test3();
    }


    /*CS
     *Consumer(Поставщик) Super
     */
    public static void processLowerBounded(List<? super Carnivora> carnivoras) {
//        carnivoras.add(new Animal()); //compilation error
//        carnivoras.add(new Mammalia()); //compilation error
        carnivoras.add(new Carnivora());
        carnivoras.add(new FelisCatus());
        Object carnivora = carnivoras.get(0);
        Object carnivora2 = carnivoras.get(0);
        if (carnivora instanceof Carnivora) {
            Carnivora myEmployee = (Carnivora) carnivora;
        }
//       Carnivora carnivora1 = carnivoras.get(0);//compilation error
    }
}
