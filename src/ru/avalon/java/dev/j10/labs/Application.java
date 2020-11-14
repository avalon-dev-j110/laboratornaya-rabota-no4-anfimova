package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Application {

    public static void main(String[] args) {

        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив следует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */

	    String[] strings = new String[20];
		initStrings(strings);

		/*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярами созданного класса.
	     */

	    PersonToSort[] persons = new PersonToSort[20];
		initPersonsToSort(persons);
		System.out.println("Persons before sorting");
		printPersonArray(persons);

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */

        Sort sortSmth = new SortSmth();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */

		Comparator comparator = new StringComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */

		sortSmth.sort(persons);
		System.out.println("Persons after sorting");
		printPersonArray(persons);

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */

		System.out.println("Strings before sorting");
		printStringArray(strings);

      	sortSmth.sort(strings);
		System.out.println("Strings after sorting");
		printStringArray(strings);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */

        sortSmth.sort(strings, comparator);
		System.out.println("Strings after comparator");
		printStringArray(strings);

    }

	private static void initStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
//			Random random = new Random();
//			strings[i] = "String_" + random.nextInt(20);
			strings[i] = UUID.randomUUID().toString().substring(0, 2);
		}
	}

	private static void initPersonsToSort(PersonToSort[] persons) {
		for (int i = 0; i < persons.length; i++) {
			Random random = new Random();
			persons[i] = new PersonToSort();
			persons[i].setName("N_" + random.nextInt(20));
			Random dateRandom = new Random();
			persons[i].setBirthDate(new Date(System.currentTimeMillis() - dateRandom.nextInt()));
//			persons[i].setBirthDate(new Date(dateRandom.nextLong()));
		}
	}

	private static void printPersonArray(PersonToSort[] persons) {
		for (int i = 0; i < persons.length; i++) {
			String printString = persons[i].getName() + " " + persons[i].getBirthDate();
			if (i == persons.length - 1) {
				System.out.println(printString + " ");
				System.out.println("--------");
			} else {
				System.out.println(printString + " ");
			}
		}
	}

    private static void printStringArray(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if (i == strings.length - 1) {
				System.out.println(strings[i] + " ");
				System.out.println("--------");
			} else {
				System.out.print(strings[i] + " ");
			}
		}
	}

}
