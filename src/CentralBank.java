public class CentralBank {
    int GetInterestRate (){
        return 0;
    }


}
class Boc extends CentralBank{
   int GetInterestRate (){
       return 8;
   }
        }
class PeoplesBank extends CentralBank{
    int GetInterestRate () {
        return 10;
    }
}
class CommercialBank extends CentralBank {
    int GetInterestRate () {
        return 12;
    }
}
class TestOverriding {
    public static void main(String[] args) {
        Boc b = new Boc();
        PeoplesBank p = new PeoplesBank();
        CommercialBank c = new CommercialBank();
        System.out.println("Interest Rate :- "+b.GetInterestRate() + "%");
        System.out.println("Interest Rate :- "+p.GetInterestRate() +"%");
        System.out.println("Interest Rate :- "+c.GetInterestRate() + "%");

    }
}