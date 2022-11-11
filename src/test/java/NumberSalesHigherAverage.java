import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StartsServices;

public class NumberSalesHigherAverage {
    @org.junit.jupiter.api.Test

    public void shouldFindNumberSaleUnderAverage() {
        StartsServices service = new StartsServices();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNumber = 5;
        long actualNumber = service.numberSalesHigher(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);

    }
}
