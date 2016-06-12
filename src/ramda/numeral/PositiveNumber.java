package ramda.numeral;

public class PositiveNumber {

    private Number number;
    
    public PositiveNumber(Number number) {
        setNumber(number);
    }
    
    public void setNumber(Number number){
        if ((int) number <= 0) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }
    
    public Number getNumber(){
        return number;
    }
    

    public boolean isPositive() {
        return true;
    }
    
    @Override
    public String toString() {
        return number.toString();
    }
}
