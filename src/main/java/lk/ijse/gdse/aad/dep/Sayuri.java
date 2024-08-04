package lk.ijse.gdse.aad.dep;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sayuri implements GoodGirl{

    @Override
    public void love(){
        System.out.println("Love u sadun");
        System.out.println("Love u sadun");
        System.out.println("Love u sadun");
        System.out.println("Love u sadun");

    }
}
