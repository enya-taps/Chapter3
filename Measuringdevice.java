
public class Measuringdevice
{
    //scale that could theoretically can be measured 
    private double min;
    private double max;
    //lowest and highest that actually got measured
    private double actMin;
    private double actMax;

    public Measuringdevice(){
        this.min = 0.0;
        this.max = 100.0;
        actMin = min - 1;
        actMax = max + 1;
    }

    public Measuringdevice(double min, double max){
        this.min = min;
        this.max = max;
    }

    private double getMin(){
        return min;
    }

    private double getMax(){
        return max;
    }

    public double getActMin(){
        return actMin;
    }

    public double getActMax(){
        return actMax;
    }

    private void setMin(double minnie){
        min = minnie;
    }

    private void setMax(double maxes){
        max = maxes;
    }

    private void setActMin(double actMinnie){
        actMin = actMinnie;
    }

    private void setActMax(double actMaxes){
        actMax = actMaxes;
    }

    public void measuring(double actual){
        if(actual >= min && actual <= max){
            if(this.actMin < min || actual < actMin ){
                this.actMin = actual;
            }
            if(this.actMax > max || actual >= actMax ){
                this.actMax = actual;
            }
        }
    }

    private void showing(){
        System.out.println("The current highest measured value: "+ this.actMax +"\n");
        System.out.println("The current lowest measured value: "+ this.actMin +"\n");
    }

    private double setBackMax(){
        double lastmeasuredMax = actMax;
        this.actMax = max + 1;
        return lastmeasuredMax;
    }

    private double setBackMin(){
        double lastmeasuredMin = actMin;
        this.actMin = min - 1;
        return lastmeasuredMin;
    }
}
