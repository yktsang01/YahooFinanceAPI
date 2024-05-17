package yahoofinance.test;

import org.junit.Test;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class YahooFinanceTests {

    @Test
    public void loadIndexHSI() throws IOException {
        Stock hsi = YahooFinance.get("^HSI");
        assertNotNull(hsi);
    }

    @Test
    public void loadEquityIBM() throws IOException {
        Stock ibm = YahooFinance.get("IBM");
        assertNotNull(ibm);
    }

}
