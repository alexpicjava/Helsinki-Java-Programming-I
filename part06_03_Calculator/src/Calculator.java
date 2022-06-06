public class Calculator{

    private int value;

    public Calculator(int value) {
        this.value = value;
    }
    public void add(int number){
        this.value = this.value + number;
    }
    public void subtract(int number){
        this.value = this.value + number;
    }
    public int getValue(){
        return this.value;
    }
}
