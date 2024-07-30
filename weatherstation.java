
/**
 * Beschreiben Sie hier die Klasse weatherstation.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class weatherstation
{
    private Measuringdevice thermometer;
    private Measuringdevice hydrometer;
    private Measuringdevice barometer;

    public weatherstation(){
        thermometer = new Measuringdevice(-50.0,80.0);
        hydrometer = new Measuringdevice(0.0, 100.0);
        barometer = new Measuringdevice(650.0,1200.0);
    }

    private void measure(double temperature, double humidity, double airpressure){
        thermometer.measuring(temperature);
        hydrometer.measuring(humidity);
        barometer.measuring(airpressure);

    }

    private void actValues(){
        System.out.println("The current highest measured value for the thermometer is: "+ thermometer.getActMax() +"\n");
        System.out.println("The current lowest measured value for the thermometeris: "+ thermometer.getActMin() +"\n");
        
        System.out.println("The current highest measured value for the hydrometer is: "+ hydrometer.getActMax() +"\n");
        System.out.println("The current lowest measured value for the hydrometer is: "+ hydrometer.getActMin() +"\n");
        
        System.out.println("The current highest measured value for the barometer is: "+ barometer.getActMax() +"\n");
        System.out.println("The current lowest measured value for the barometer is: "+ barometer.getActMin() +"\n");

    }
}

