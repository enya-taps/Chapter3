
/**
 * Beschreiben Sie hier die Klasse DualSimPhone.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class DualSimPhone
{
    private SimCard simcard1;
    private SimCard simcard2;
    
    public DualSimPhone(int inland1, int outland1, int leftData1, int inland2, int outland2, int leftdata2){
        simcard1 = new SimCard(inland1,outland1,leftData1);
        simcard2 = new SimCard(inland2,outland2,leftdata2);
       
    }
}
