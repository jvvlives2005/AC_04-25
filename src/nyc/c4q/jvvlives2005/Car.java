package nyc.c4q.jvvlives2005;
/**
 * Created by c4q-joshelynvivas on 4/26/15.
 */
public class Car implements Refillable
{
    int gas = 0;

    public Car()
    {
        refill();
    }

    public void drive(int distance)
    {
        gas = gas - distance;
        if(gas < 0)
            gas = 0;
    }

    public boolean isEmpty()
    {
        return gas == 0;
    }

    public void refill()
    {
        gas = gas + 10;
    }

    public void playMusic()
    {
        //Pretend we coded this
    }

    public void turn(int amount)
    {
        //Really complex turn code that we don't care about
    }

    public int getGas()
    {
        return gas;
    }
}

