import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StartsServices;

public class MaxSalesTest {
    @org.junit.jupiter.api.Test

    public void shouldFindNumberMonthNaxSales() {
        StartsServices service = new StartsServices();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

}
