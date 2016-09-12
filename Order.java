
/**
 * Chris Pfeiffer.APCS.Meme.9/12/16
 */
public class Order
{
    // instance variables - replace the example below with your own
    private String name;
    private int itemnum, quan;
    private double price, total;

    public Order()
    {
        name = "";
        itemnum = 0;
        quan = 0;
        price = 0;
        total = 0;
    }
    
    public Order(String n, int im, int q, double p)
    {
        name = n;
        itemnum = im;
        quan = q;
        price = p;

        total = price * quan;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNum()
    {
        return itemnum;
    }
    
    public int getQuan()
    {
        return quan;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public double getTotal()
    {
        return total;
    }
    
    public String toString()
    {
        return String.format("%-10s%10d%10d%10.2f%10.2f", name, itemnum, quan, "$" + price, "$" + total);//"Your order of: " + quan + " " + name + " (Item #" + itemnum + ") at: $" + price + "/item will cost: $" + total;
    }
}
