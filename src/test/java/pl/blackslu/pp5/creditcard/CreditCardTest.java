package pl.blackslu.pp5.creditcard;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditCardTest {

    public static final int INITIAL_LIMIT = 1000;

    @Test
    public void itAllowAssignLimitToCreditCard() {
        //Arrange // Given
        CreditCard creditCard = new CrediCard();
        //Act //When
        creditCard.assignLimit(BigDecimal.valueOf(INITIAL_LIMIT));
        //Assert // Then // Expect
        Assert.assertEquals(BigDecimal.valueOf(INITIAL_LIMIT), creditCard.limit());
    }
}