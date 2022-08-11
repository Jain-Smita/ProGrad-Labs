public class Currency {
    private String currencyNumber;
    private int currencyValue;

    public String getCurrencyNumber() {
        return currencyNumber;
    }

    public void setCurrencyNumber(String currencyNumber) {
        this.currencyNumber = currencyNumber;
    }

    public void setCurrencyValue(int currencyValue) {
        this.currencyValue = currencyValue;
    }

    public int checkReturnValue()
    {
        String revNumber="";
        int strLength = currencyNumber.length();
        for (int i = (strLength - 1); i >=0; --i) {
            revNumber = revNumber + currencyNumber.charAt(i);
        }

        if (currencyNumber.toLowerCase().equals(revNumber.toLowerCase())) {
            // Complete the formula
            return (/* formula here */);
        }
        else {
            return currencyValue;
        }
    }

}
