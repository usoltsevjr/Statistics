package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
       int totalSale = 0;

        for (int item : sales) {
            totalSale += item;
        }
        return totalSale;
    }


    public int calculateAVG(int [] sales) {
       int totalSum = calculateSum(sales);
       int numberMonth = sales.length;
       int AverageSum = totalSum / numberMonth;
       return AverageSum;
    }

    public int calculateIndexMaxSale(int[] sales) {
       int indexMaxSale = 0;
       for (int i = 0; i < sales.length; i++) {
           if (sales[i] >= sales[indexMaxSale]) {
               indexMaxSale = i;
           }
       }
        return indexMaxSale + 1;
    }

    public int calculateIndexMinSale(int [] sales) {
        int indexMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[indexMinSale]) {
                indexMinSale = i;
            }
        }
        return indexMinSale + 1;

    }

    public int calculateSalesUnderAVG(int[] sales) {
        int AverageSum = calculateAVG(sales);
        int amountMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < AverageSum) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }

    public int calculateSalesOverAVG(int[] sales) {
        int AverageSum = calculateAVG(sales);
        int amountMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > AverageSum) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }
}
