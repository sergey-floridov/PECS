package org.example;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {

        List<Animal> animals = new ArrayList<>();
        List<Mammalia> mammalias = new ArrayList<>();
        List<Carnivora> carnivoras = new ArrayList<>();
        List<Felidae> felidaes = new ArrayList<>();
        List<FelisCatus> cats = new ArrayList<>();
        List<FelisCatus> cats2 = new ArrayList<>();



//      Что можно добавлять в разные листы? (ковариантность)
        felidaes.add(new FelisCatus());
//        felidaes.add(new Animal());  // сломаем следующий код
//        felidaes.forEach(x-> x.test4());

//        пример инвариантности
//        animals = cats2;

//       проверяем возможность добавления листов разных классов
        processUpperBounded(cats);

//        проверяем возможность добавления листов разных классов
        processLowerBounded(carnivoras);
    }


    /*PE
     *Producer(Поставщик) Extends
     * ковариантность
     */
    public static void processUpperBounded(List<? extends Carnivora> carnivoras) {
//        carnivoras.add(new Carnivora());//compilation error
        carnivoras.add(null);  // в такую коллекцию мы можем добавлять элементы типа null
        Carnivora carnivora = carnivoras.get(0);  // Тип переменной Carnivora или родители
        carnivora.test3();
    }


    /*CS
     *Consumer(Потребитель) Super
     * контравариантность
     */
    public static void processLowerBounded(List<? super Carnivora> carnivoras) {
//        carnivoras.add(new Animal()); //compilation error
//        carnivoras.add(new Mammalia()); //compilation error
        carnivoras.add(new Carnivora());
        carnivoras.add(new FelisCatus());
//        Carnivora carnivora1 = carnivoras.get(0);//compilation error

        Object carnivora = carnivoras.get(0);  //но все-таки прочитать и сохранить можем, пердварительно проверив на instanceof
        if (carnivora instanceof Carnivora) {
            Carnivora myEmployee = (Carnivora) carnivora;
        }
    }
}
