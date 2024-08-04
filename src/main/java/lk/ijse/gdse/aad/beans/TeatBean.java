package lk.ijse.gdse.aad.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component("TestBean")
public class TeatBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory is" + beanFactory);
    }




    @Override
    public void destroy() throws Exception {
//        System.out.println("bye");

    }

    @PreDestroy
    public void customerDelete(){
//        System.out.println("Customer Delete");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println("");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println("ApplicationContext"+ applicationContext);
    }
}
