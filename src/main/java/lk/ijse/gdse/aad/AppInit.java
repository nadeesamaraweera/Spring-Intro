package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.Config.Config;
import lk.ijse.gdse.aad.beans.Customer;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args){
        var ctx =new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
        boolean isSingletonCustomer=beanFactory.isSingleton("Customer");
        System.out.println("Is Customer Singleton : " +isSingletonCustomer);
//        ctx.close();
        ctx.getBeanFactory();
        ctx.registerShutdownHook();


    }
}
