
public class PattanakarnBranch extends Product {
	private int payUnit(){
        return super.getUnit();

    }
    private int freeUnit() {
        return payUnit();

    }
    int getTotalPrice(){
        return payUnit() * 100;
    }
    public String toString(){
        return "You buy " + payUnit() + " units, get free "+ freeUnit() + " units ("+getTotalPrice()+")." ;
    }

}
