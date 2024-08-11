package lk.ijse.gdse.aad.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Customer")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Customer {
    public Customer(){
        System.out.println("Hello customer");
    }
}
