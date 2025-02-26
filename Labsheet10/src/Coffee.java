
public class Coffee extends Drink{
	
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;

	Coffee(int type,char sizeCoffee,int typeCoffee,Barista barista) {
		
		super(type, sizeCoffee);
        this.typeCoffee = typeCoffee;
        this.sizeCoffee = sizeCoffee;
        this.barista = barista;
	}
	
	Coffee(int type,int typeCoffee){
        super(type, ' ');
        this.typeCoffee = typeCoffee;
        this.barista = null;
        this.sizeCoffee = ' ';
    }
	
    public Barista getBarista() {
        return barista;
    }
    
    public String getTypeName() {
        if (this.typeCoffee == 1) {
            return "Americano";
        }
        else if (this.typeCoffee == 2){
            return "Espresso";
        }
        else if (this.typeCoffee == 3){
            return "Cappuccino";
        }
        return null;
    }
    
    public int getTypePrice() {
        if (this.typeCoffee == 1) {
            return 50;
        }
        else if (this.typeCoffee == 2){
            return 55;
        }
        else if (this.typeCoffee == 3){
            return 65;
        }
        return 0;
    }
    
    public String getSizeName() {
        if (this.sizeCoffee == 's' || this.sizeCoffee == 'S') {
            return "Short";
        }
        else if (this.sizeCoffee == 't' || this.sizeCoffee == 'T') {
            return "Tall";
        }
        else if (this.sizeCoffee == 'g' || this.sizeCoffee == 'G'){
            return "Grande";
        }
        else if (this.sizeCoffee == 'v' || this.sizeCoffee == 'V'){
            return "Venti";
        }
        return null;
    }
    
    public int getSizePrice() {
        if (this.sizeCoffee == 's' || this.sizeCoffee == 'S') {
            return 100;
        }
        else if (this.sizeCoffee == 't' || this.sizeCoffee == 'T') {
            return 150;
        }
        else if (this.sizeCoffee == 'g' || this.sizeCoffee == 'G'){
            return 200;
        }
        else if (this.sizeCoffee == 'v' || this.sizeCoffee == 'V'){
            return 250;
        }
        return 0;
    }
    
    public int getTotalPrice() {
        return super.getTypePrice() + getTypePrice() + getSizePrice();
    }
    
    public String toString() {
        return super.getTypeName()+" "+ getTypeName() +" " + "("+getSizeName()+") is "
        + getTotalPrice() + " baht";
    }

}
