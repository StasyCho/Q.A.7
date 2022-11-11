import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StartsServices;

public class SumMonth {
    @org.junit.jupiter.api.Test

    public void shouldFindSumMonth() {
        StartsServices service = new StartsServices();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumMonth(month);

        Assertions.assertEquals(expectedSum, actualSum);

    }
}
