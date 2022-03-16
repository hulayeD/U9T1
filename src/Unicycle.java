public class Unicycle extends Vehicle
{
    private int seats;

    public Unicycle(String name, int wheels, int seats)
    {
        super(name,wheels);
        this.seats=seats;
    }

    public int getSeats()
    {
        return seats;
    }
    public void Spin()
    {
        System.out.println("The Unicycle has spun");
    }
}
