package CostAccounting.Model;

public class FinAccount {
    private String sourceName;
    private Double sourceBalance;

    public FinAccount(String sourceName, Double sourceBalance) {
        this.sourceName = sourceName;
        this.sourceBalance = sourceBalance;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Double getSourceBalance() {
        return sourceBalance;
    }

    public void setSourceBalance(Double sourceBalance) {
        this.sourceBalance = sourceBalance;
    }

    @Override
    public String toString() {
        return "FinAccount{" +
                "sourceName='" + sourceName + '\'' +
                ", sourceBalance=" + sourceBalance +
                '}';
    }
}
