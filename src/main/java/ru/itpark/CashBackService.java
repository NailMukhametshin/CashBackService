package ru.itpark;

public class CashBackService {
    public int calculateCashBack(int standartPurchase, int hightPurchase,int specialPurchase){
        int standartPurchasePercent = 1;
        int hightPurchasePercent = 5;
        int specialPurchasePercent = 30;
        int maxMounthCashBack = 3_000;
        int result = standartPurchase * standartPurchasePercent / 100 + hightPurchase * hightPurchasePercent / 100 + specialPurchase * specialPurchasePercent / 100;
        if (result > maxMounthCashBack){
            result = maxMounthCashBack;
        }
        return result;
    }

}
