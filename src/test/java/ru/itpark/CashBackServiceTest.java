package ru.itpark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    @DisplayName("Тест на корректность подсчетов")
    void calculateCashBack() {

        {
            CashBackService service = new CashBackService();
            int cashBack = service.calculateCashBack(300, 500, 1000);
            assertEquals(328, cashBack);
        }

        {
            CashBackService service = new CashBackService();
            int cashBack = service.calculateCashBack(10000, 10000, 10000);
            assertEquals(3000, cashBack);
        }
    }
}