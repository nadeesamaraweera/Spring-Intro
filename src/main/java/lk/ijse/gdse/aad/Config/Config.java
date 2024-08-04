package lk.ijse.gdse.aad.Config;


import lk.ijse.gdse.aad.beans.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages ="lk.ijse.gdse.aad")
public class Config {
    @Bean //Method level Annotaion
    public Order order(){
        return  new Order();
    }
}
