package pl.blackslu.pp5.creditcard.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.blackslu.pp5.creditcard.model.CreditCard;
import pl.blackslu.pp5.creditcard.model.CreditCardFacade;

import java.util.Arrays;
import java.util.List;


@RestController  //Usage of XML, JSON etc.
public class CardsController {

    @Autowired
    CreditCardFacade creditCardFacade;

    public CardsController(CreditCardFacade creditCardFacade){
        this.creditCardFacade = creditCardFacade;
    }

    @GetMapping("/api/test-it")
    public List<String> httpHelloWorld(){
        return Arrays.asList("Hello", "World", "It's", "Working");
    }

    @GetMapping("/api/cards/balances")
    public List<CreditCard> listSummary(){
        return creditCardFacade.getCardsReport();
    }
}
