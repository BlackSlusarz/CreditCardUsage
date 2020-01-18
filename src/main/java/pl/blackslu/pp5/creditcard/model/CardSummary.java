package pl.blackslu.pp5.creditcard.model;

import java.math.BigDecimal;

public class CardSummary {
    public String number;
    public BigDecimal balance;


    public CardSummary(String number, BigDecimal balance) {
        this.balance = balance;
        this.number = number;
    }

}
