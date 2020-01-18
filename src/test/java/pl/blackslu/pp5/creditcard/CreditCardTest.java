package pl.blackslu.pp5.creditcard;

import org.junit.Assert;
import org.junit.Test;
import pl.blackslu.pp5.creditcard.model.CreditBelowLimitException;
import pl.blackslu.pp5.creditcard.model.CreditCard;

import java.math.BigDecimal;

public class CreditCardTest {

    public static final int INITIAL_LIMIT = 1000;

    @Test
    public void itAllowAssignLimitToCreditCard() {
        //Arrange // Given
        CreditCard creditCard = thereIsCreditCard();
        //Act //When
        creditCard.assignLimit(BigDecimal.valueOf(INITIAL_LIMIT));
        //Assert // Then // Expect
        Assert.assertEquals(BigDecimal.valueOf(INITIAL_LIMIT), creditCard.limit());
    }

    private CreditCard thereIsCreditCard() {
        return new CreditCard("123456789");
    }

    @Test
    public void denyAssignLimitBelowMinimum(){
        CreditCard creditCard = thereIsCreditCard();

        try {
            creditCard.assignLimit(BigDecimal.valueOf(500));
            Assert.fail("Exception should be thrown. BANG");
        } catch(CreditBelowLimitException e){
            Assert.assertTrue(true);
        }

    }
    @Test
    public void withdrawFromCard(){
        //Arrange // Given
        CreditCard creditCard = thereIsCreditCard();
        creditCard.assignLimit(BigDecimal.valueOf(INITIAL_LIMIT));
        //Act //When
        creditCard.withdraw(BigDecimal.valueOf(200));
        //Assert // Then // Expect
        Assert.assertEquals(creditCard.currentBalance(), BigDecimal.valueOf(800));
    }
}
