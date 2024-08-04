package lk.ijse.gdse.aad.dep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Long Hair")
@Wow
public class Shehara implements GoodGirl{

    @Override
    public void love(){
        System.out.println("Love u sadun........French kiss");
        System.out.println("Love u sadun........French kiss");
        System.out.println("Love u sadun........French kiss");
        System.out.println("Love u sadun........French kiss");
    }
}
