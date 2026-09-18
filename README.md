# Java OOP - Adapter Tasarım Deseni 🔌

Bu proje, yapısal tasarım desenlerinden (Structural Design Patterns) biri olan **Adapter (Adaptör)** deseninin kullanımını göstermektedir. Kodlar, birbiriyle uyumlu olmayan arayüzlere sahip sınıfların nasıl birlikte çalışabileceğini basit bir klima senaryosu üzerinden simüle eder.

Gerçek hayattaki priz dönüştürücüleri (adaptörler) gibi çalışır; elimizde önceden yazılmış, değiştiremediğimiz veya değiştirmek istemediğimiz eski bir yapı (`EskiKlima`) vardır ve bunu yeni sistemin beklediği standarda (`Cihaz`) uydurmamız gerekir.

**İçerilen OOP ve Tasarım Prensipleri:**
* **Target (Hedef Arayüz) - `Cihaz`:** İstemcinin (`Main` sınıfının) etkileşime geçmek istediği ve beklediği standart metotları (`ac`, `kapa`) tanımlayan arayüz.
* **Adaptee (Uyarlanacak Sınıf) - `EskiKlima`:** Kendi içinde farklı isimlendirmelere (`powerOn`, `powerOff`) sahip olan ve doğrudan yeni sisteme entegre edilemeyen mevcut sınıf.
* **Adapter (Adaptör Sınıfı) - `YeniKlima`:** `Cihaz` arayüzünü uygulayan (implements) ve içinde `EskiKlima` nesnesini barındıran köprü sınıfı. İstemciden gelen `ac()` çağrısını arka planda eski sınıfın `powerOn()` metoduna yönlendirerek (delegation) aradaki uyumsuzluğu çözer.

**Kullanılan Dil:**
* Java
