package nyc.c4q.jvvlives2005;

/** Inheritance and Interfaces
 You have a rental company.  RentCo (or name it something else).  You rent cars.
 Cars can drive, turn, check gas, and refill.  And play music.

 Now, it turns out that you have really bad marketing, so most of your customers are construction companies.
 You're going to start renting generators and tractors.

 Create an interface "Refillable" that defines the refill process.

 Modify the part of your program that checks and refills Car classes to use the interface.

 Modify Car to implement Refillable, and test that the whole thing still works.

 Create a Generator class that implements Refillable.  It should have a method similar to "drive", but called "generate".

 Write a similar list of generators, and loop through them similar to how we're calling "drive" on cars.

 Run all that, and refill everything.

 Bonus, create the "Tractor" class.  Make a base class "Vehicle", that both Car and Tractor will extend.
 Move the relevant methods from Car to Vehicle.  Add some methods to Tractor that could do things that the Car
 probably couldn't do (just the method signatures.  They don't need to "do" anything).

 **/



import java.sql.Ref;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList cars = new ArrayList<Car>();
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());

        for(int i=0; i<5; i++)
        {
            driveCars(cars);
            refillCars(cars);
        }
    }

    static void driveCars(ArrayList<Car> cars)
    {
        for (Car car : cars)
        {
            car.drive(new Random().nextInt(10));
            System.out.println("Gas remaining: "+ car.getGas());
        }
    }

    static void refillCars(ArrayList<Refillable> refillables)
    {
        for (Refillable car : refillables)
        {
            if(car.isEmpty())
            {
                car.refill();
                System.out.println("Refilling...");
            }
        }
    }


}
