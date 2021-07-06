package inheritance;

import java.time.Instant;


// Super method gets overriden. Super class calls base method in super constructor.
public class Sub extends Super{
    private final Instant instant;

    Sub(){
        instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args){
        Sub sub = new Sub();
        sub.overrideMe();
    }
}

