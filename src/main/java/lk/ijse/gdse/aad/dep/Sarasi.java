package lk.ijse.gdse.aad.dep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Long Hair")
public class Sarasi implements GoodGirl{

    @Override
    public void love(){
        System.out.println("Love u sadun ummmma");
        System.out.println("Love u sadun ummmma");
        System.out.println("Love u sadun ummmma");
        System.out.println("Love u sadun ummmma");
        System.out.println("Love u sadun ummmma");
        System.out.println("Love u sadun ummmma");


    }


}
