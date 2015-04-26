package nyc.c4q.jvvlives2005;
/**
 * Created by c4q-joshelynvivas on 4/26/15.
 */
public class Generator implements Refillable
{
    private int fuel = 0;

    public Generator(){

    }
    public void generate(int amount){
        fuel = fuel -  amount;
        if (fuel < 0 )
            fuel = 0;
    }

    public int getFuel(){
        return fuel;
    }

    @Override
    public boolean isEmpty(){
        return fuel == 0;
    }

    @Override
    public void refill (){
        fuel = fuel + 15;
    }

}