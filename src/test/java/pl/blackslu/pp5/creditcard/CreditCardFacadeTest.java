package pl.blackslu.pp5.creditcard;

import org.junit.Assert;
import org.junit.Test;
import pl.blackslu.pp5.creditcard.model.CardSummary;
import pl.blackslu.pp5.creditcard.model.CreditCard;
import pl.blackslu.pp5.creditcard.model.CreditCardFacade;
import pl.blackslu.pp5.creditcard.model.InMemoryCreditCardStorage;

import java.math.BigDecimal;

public class CreditCardFacadeTest {

    private InMemoryCreditCardStorage creditCardStorage;

    @Test
    public void allowWithdrawFromCards(){
        thereIsCreditCardIdentifiedWithNumber("1234-56789");

        CreditCardFacade api = thereIsCCApi();
        api.withdraw("1234-56789", BigDecimal.valueOf(200));

        CardSummary summary = api.getSummary("1234-56789");
        Assert.assertNotNull(summary);
        Assert.assertEquals(summary.balance, BigDecimal.valueOf(800));

    }

    private CreditCardFacade thereIsCCApi() {
        return new CreditCardFacade();
    }

    private void thereIsCreditCardIdentifiedWithNumber(String number) {
        CreditCard creditCard = new CreditCard(number);
        creditCard.assignLimit(BigDecimal.valueOf(1000));

        creditCardStorage.add(creditCard);
    }
}
