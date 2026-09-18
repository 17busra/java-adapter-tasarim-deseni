
import java.util.*;

interface Cihaz{
  void ac();
  void kapa();
}

class EskiKlima{
  public void powerOn(){
    System.out.println("klima acildi");
  }
  
  public void powerOff(){
    System.out.println("klima kapatildi");
  }
}

  class YeniKlima implements Cihaz{
    private EskiKlima eskiKlima ;
    
    public YeniKlima(EskiKlima eskiKlima){
      this.eskiKlima = eskiKlima;
    }
     
    @Override
    public void ac(){
      eskiKlima.powerOn();
    }
    
    @Override
    public void kapa(){
      
      eskiKlima.powerOff();
      
    }
    
  }



public class Main {
    public static void main(String[] args) {

      
      EskiKlima eski = new EskiKlima();
      Cihaz adapter = new YeniKlima(eski);
      
      adapter.ac();
      adapter.kapa();
     
     
      
    }
}
