
public class Drink {
	
	private int type;
	private char size;
	
	Drink(int type,char size) {
		this.type = type;
		this.size = size;
		
	}
	
	Drink(){
		this(0,' ');
	}
	
	public String getTypeName() {
        if (this.type == 1) {
            return "Hot";
        }
        else if (this.type == 2){
            return "Cold";
        }
        return null;

        }

    int getTypePrice() {
        if (this.type == 1) {
            return 10;
        }
        else if (this.type == 2){
            return 20;
        }
        return 0;
    }
    
    String getSizeName() {
        if (this.size == 's' || this.size == 'S') {
            return "Small";
        }
        else if (this.size == 'm' || this.size == 'M') {
            return "Medium";
        }
        else if (this.size == 'l' || this.size == 'L'){
            return "Large";
        }
        return null;
    }
    
    int getSizePrice() {
        if (this.size == 's' || this.size == 'S') {
            return 15;
        }
        else if (this.size == 'm' || this.size == 'M') {
            return 20;
        }
        else if (this.size == 'l' || this.size == 'L'){
            return 25;
        }
        return 0;
    }
    
    int getTotalPrice() {
        return getTypePrice() + getSizePrice();
    }

}
