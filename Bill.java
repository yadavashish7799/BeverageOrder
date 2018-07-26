package niksbeverage;


import java.util.HashMap;
import java.util.Map;

public class Bill {
    private int i=1;
    private double  total=0;
    private double tax=0;

    public void generateBill(Map<Integer,Beverages> ID,Map<Integer,Integer> orderList)
    {
        for (Map.Entry<Integer, Integer> entry2 : orderList.entrySet()) {
            System.out.printf("%2d %20s %2d %3d\n",i,ID.get(entry2.getKey()).getName(),entry2.getValue(),ID.get(entry2.getKey()).getPrice() * entry2.getValue());
            total+= ID.get(entry2.getKey()).getPrice() * entry2.getValue();
            tax +=(ID.get(entry2.getKey()).getTax()*entry2.getValue()*ID.get(entry2.getKey()).getPrice());
            i++;
        }
        tax=tax/100.0;
        System.out.printf("%20s %10.2f\n","Total",total);
        System.out.printf("%20s %10.2f\n","Tax",tax);
        System.out.printf("%20s %10.2f\n","Net",total+tax);
    }
}
