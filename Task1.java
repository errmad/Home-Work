import java.util.Arrays;

public class Task1 {
// *линейный поиск
    public static int linearSearch(String arr[], String elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }

// решение

    // факториал
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * fact(n - 1);
        }
    }

    // таблица умножения
    public static void table(){

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i*j < 10) {
                    System.out.print(i * j + "  ");
                }
                else {
                    System.out.print(i*j + " ");
                }
            }
            System.out.println();
        }
    }

    // сумма цифр числа
    public static int sum(int n){
        int s = 0;
        while(n != 0){

            s += (n % 10);
            n/=10;
        }
        return s;
    }

    // проверка на високосный год
    public static boolean isLeapYear(int year) {

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear)
        {
            return true;
        } else
            return false;
    }
    // количество дней в году
    public static int daysInYear(int year) {
        if (isLeapYear(year)){
            return 366;
        } else {
            return 365;
        }
    }

    // номер дня недели
    public static int dayOfTheWeek(String n){
        String[] arrayWeek = new String[] {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        return linearSearch(arrayWeek,n)+1;
    }

    // вывод массива
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));

    }

    //вывод двойного массива
    public static int[] printArray(int[][] array2D){
        System.out.print("[");
        for (int i = 0; i < (array2D[0].length)-1; i++) {
            System.out.print(array2D[0][i]+", ");
        }
        System.out.println(array2D[0][(array2D[0].length)-1]+"]");

        System.out.print("[");
        for (int i = 0; i < (array2D[1].length)-1; i++) {
            System.out.print(array2D[1][i]+", ");
        }
        System.out.println(array2D[1][(array2D[1].length)-1]+"]");
        return new int[0];
    }

    // сортировка массива
    public static int[] sort(int[] array1D){
        int b = array1D.length;
        Arrays.sort(array1D,0,b);
        return array1D;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }


}