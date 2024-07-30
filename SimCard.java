
public class SimCard
{
    //minute Price in Euro Cent
    private int inland;
    private int outland;
    private int leftDataVolume;
    public SimCard(int inland, int outland, int leftDataVolume)
    {
        this.inland = inland;
        this.outland = outland;
        this.leftDataVolume = leftDataVolume;
    }

    public int getinland(){
        return inland;
    }

    public int getoutland(){
        return outland;
    }

    public int getleftDataVolume(){
        return leftDataVolume;
    }

    public void setinland(int priceIn){
        inland = priceIn;
    }

    public void setOutland(int priceOut){
        outland = priceOut;        
    }

    public void setData(int dataVolume){
        leftDataVolume = dataVolume;
    }

    public int calling(int minutes, boolean countryinland){
        if (countryinland == true){
            int price = minutes * inland;
            return price;
        }
        else{
            int price = minutes * outland;
            return price;
        }
    }
    
    public void surfen(int dataUsed, boolean countryinland){
        if (countryinland == true){
            int deduction = dataUsed;
            leftDataVolume -= deduction;
        }
        else{
            int deduction = dataUsed;
            leftDataVolume -= deduction;
        }
    
    }
}

