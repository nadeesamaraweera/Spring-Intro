package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.Config.Config;
import lk.ijse.gdse.aad.beans.Customer;
import lk.ijse.gdse.aad.beans.TeatBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args){
        var ctx =new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        TeatBean test = (TeatBean) ctx.getBean("test");

        ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
        boolean isSingletonTeatBean=beanFactory.isSingleton("test");
        System.out.println("Is TeatBean Singleton : " +isSingletonTeatBean);
        System.out.println(test);
//        ctx.getBeanFactory();
//        ctx.close();

        ctx.registerShutdownHook();


    }
}
