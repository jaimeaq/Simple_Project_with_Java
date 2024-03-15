package calculator;

import java.util.List;

public class Store {

    private float income = 0;
    private float netIncome = 0;
    private List<Item> items;
    private float staffExpenses = 0;
    private float otherExpenses = 0;

    public Store(List<Item> items) {
        this.items = items;
    }

    private void calculateTotalIncome() {
        income = 0;
        for(Item item : items) {
            income += item.getEarnedAmount();
        }
    }

    private void calculateNetIncome() {
        netIncome = getIncome() - staffExpenses - otherExpenses;
    }

    public float getIncome() {
        calculateTotalIncome();
        return income;
    }

    public float getNetIncome() {
        calculateNetIncome();
        return netIncome;
    }

    public String earningsReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Earned amount:\n");
        for (Item item : items) {
            sb.append(item.getName()).append(": $")
                    .append((int) item.getEarnedAmount() + "\n");
        }
        sb.append("\n").append("Income: $").append((int) getIncome());
        return sb.toString();
    }

    public String netIncomeReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Net income: $").append((int) getNetIncome());
        return sb.toString();
    }

    public void setStaffExpenses(float staffExpenses) {
        this.staffExpenses = staffExpenses;
    }

    public void setOtherExpenses(float otherExpenses) {
        this.otherExpenses = otherExpenses;
    }
}
