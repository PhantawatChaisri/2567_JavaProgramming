
public class Product {
	private int unit;

    void setUnit(int unit) {
        this.unit = unit;

    }
    int getUnit(){
        return this.unit;
    }
    int getTotalPrice(){
        return this.unit * 100;
    }
    public String  toString(){
        return "You buy " + unit + " units ("+ getTotalPrice()+")." ;
    }

}
