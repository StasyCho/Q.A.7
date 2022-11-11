import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StartsServices;

public class MinSalesTest {
    @org.junit.jupiter.api.Test

    public void shouldFindNumberMonthNinSales() {
        StartsServices service = new StartsServices();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }
}
