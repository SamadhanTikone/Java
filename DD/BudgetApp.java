

public class BudgetApp {
    public static void main(String []arg){

        // BasePizza p1 = new BasePizza(false);
        // p1.addExtraChesse();
        // // p1.addExtraToppings();
        // // p1.takeAway();
        // p1.getBill();

        DelexPizza d1 = new DelexPizza(true);
        d1.getBill();
    }
    
}

class BasePizza {

   private  int price;
   private boolean veg;
   private boolean isExtraChesseAdded = false;
   private boolean isExtraToppingsAdded =false;
   private boolean isTakeAwayAdded = false;
   private int basepizzaprice;

    public BasePizza (boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }
        else {
            this.price =400;
        }
        basepizzaprice = this.price;

    }


    public void addExtraChesse(){
        isExtraChesseAdded = true;;
        
            this.price +=100;
        
        
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
            
        this.price += 150;
        
    

    }

    public void takeAway(){
        isTakeAwayAdded = true;
        
        this.price += 50;
        
    }

    public void getBill(){
        String bill = "";

        bill += "Pizza:"+ basepizzaprice + "\n";
        if(isExtraChesseAdded){
            bill += "Cheese:"+ 100 + "\n";

        }
        if(isExtraToppingsAdded){
            bill += "Toppings:"+ 150 + "\n";

        }
        if(this.isTakeAwayAdded){
            bill += "Take Away:"+ 50 + "\n";

        }
  bill +=  "TOTAL :"+ this.price ;
        // System.out.println("TOTAL :"+ this.price);
        System.out.println(bill); 
    }
}

class DelexPizza extends BasePizza{

    public DelexPizza(boolean veg) {

        super(veg);
        super.addExtraToppings();
        super.addExtraChesse();
    }
    
 public void  addExtraToppings(){ };

  public void addExtraChesse(){ };

}
