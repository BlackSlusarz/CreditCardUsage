package pl.blackslu.pp5.creditcard.model;

import java.util.List;

public class CreditCardFacade {

    private CreditCardStorage creditCardStorage;


    public CreditCardFacade(CreditCardStorage creditCardStorage){
        this.creditCardStorage = creditCardStorage;
    }

    public void withdraw(WithdrawCommand withdrawCommand) {
        CreditCard creditCard = creditCardStorage.load(withdrawCommand.getNumber());
        creditCard.withdraw(withdrawCommand.getAmount());
        creditCardStorage.add(creditCard);
    }

    public CardSummary getSummary(String number) {
        CreditCard creditCard = creditCardStorage.load(number);
        return creditCard.getSummary();
    }
    public List<CreditCard> getCardsReport(){
        return creditCardStorage.all();
    }
}
