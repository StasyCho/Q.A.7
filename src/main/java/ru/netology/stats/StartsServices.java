package ru.netology.stats;

public class StartsServices {
    public int sumMonth(long[] month) {
        long sum = 0;
        for (int i = 0; i < month.length; i++) {
            sum = sum + month[i];
        }
        return (int) sum;
    }

    public float averageSumMonth(long[] month) {
        long sum = 0;
        long averageSum = 0;
        for (int i = 0; i < month.length; i++) {
            sum = sum + month[i];
            averageSum = sum / 12;
        }
        return (long) averageSum;
    }

    public long numberSalesUnder(long[] sales) { //количество месяцев в которых продажи ниже среднего
        long number = 0;
        long sum = 0;
        long averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            averageSum = sum / 12;
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                number = number + 1;
            }
        }
        return number;
    }

    public long numberSalesHigher(long[] sales) { ////количество месяцев в которых продажи выше среднего
        long number = 0;
        long sum = 0;
        long averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            averageSum = sum / 12;
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                number = number + 1;
            }
        }
        return number;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
}
