package com.company;

public class Main {

    public static void main(String[] args) {
        int yearOfBirthday = 2004;
        int monthOfBirthday = 1;
        int dayOfBirthday = 20;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        boolean monthBiggerDay;
        double myAge = 17;
        double partYear = 0.0 / 12.0;
        char[] name = new char[3];
        name[0] = 'Я';
        name[1] = 'н';
        name[2] = 'а';
        myAge += partYear;

        System.out.println("Сумма года, месяца и дня рождения: " + sum);

        monthBiggerDay = monthOfBirthday > dayOfBirthday;

        System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);
        System.out.println("Массив с моим именем: " + name[0] + name[1] + name[2]);
        System.out.println("Мне " + myAge + " лет");
    }
}
