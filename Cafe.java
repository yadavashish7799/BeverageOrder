package niksbeverage;



import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Cafe {
  private List<Beverages> list;
  Cafe()
  {
      list=new ArrayList<>();
  }
  public void putDrinks(Beverages b)
  {
      list.add(b);
  }
  public List<Beverages> getDrinkList()
  {
      return list;
  }
}