package ru.aston.lessons.animalLib;

public interface IAnimalCounter {
    int count = 0;
    int countAnimal = 0;

    static int getCountAnimal() {
        return countAnimal;
    }

    int getCount();

    ;
}
