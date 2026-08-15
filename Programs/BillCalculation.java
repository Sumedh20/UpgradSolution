import java.util.*;
public class BillCalculation
{
    public static void main(String[] args) {
        //float[] unit = {5.5F,6.5F,7.5F,8.5F};
        final float METER_CHARGE= 100;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Bill Consumption");
        float unit = s.nextFloat();
        int bill = calculateBill(METER_CHARGE, unit);
        System.out.println("The total bill is:"+bill);


    }

    private static int calculateBill( float charge, float unit) {
        //The array is traversed

        if(unit<=100)
        {
            unit = unit * 5.5f + charge;

        } else if (unit>= 101 && unit <=200) {
            unit = unit *6.5f + charge;

        } else if (unit >=201 && unit <= 300) {
            unit = unit * 7.5f +charge;

        }
        else
            unit = (float) (unit * 8.5)+charge;

    return (int) unit;
    }

}
