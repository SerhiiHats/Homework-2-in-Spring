import java.util.Map;

public class CarrencyCalculator {
    private String codeNationalCurrency;
    private Map<String, Double> currencyRate;

    public CarrencyCalculator(Map<String, Double> currency) {
        this.currencyRate = currency;
    }

    public String getCodeNationalCurrency() {
        return codeNationalCurrency;
    }

    public void setCodeNationalCurrency(String codeNationalCurrency) {
        this.codeNationalCurrency = codeNationalCurrency;
    }

    public Map<String, Double> getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(Map<String, Double> currencyRate) {
        this.currencyRate = currencyRate;
    }
}
