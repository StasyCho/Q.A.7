import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StartsServices;

public class AverageSum {
    @org.junit.jupiter.api.Test

    public void shouldFindAverageSumMonth() {
        StartsServices service = new StartsServices();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 15;
        float actualSum = service.averageSumMonth(month);

        Assertions.assertEquals(expectedSum, actualSum);

    }
}
