package lk.ijse.gdse.aad.Config;


import lk.ijse.gdse.aad.beans.Customer;
import lk.ijse.gdse.aad.beans.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages ="lk.ijse.gdse.aad") //nam kran package saha eke subpakages serch kranwa
@ComponentScan(basePackageClasses = Customer.class) //customer class eka vithrai search kranwa.


public class Config {
    @Bean //Method level Annotaion
    public Order order(){
        return  new Order();
    }
}
