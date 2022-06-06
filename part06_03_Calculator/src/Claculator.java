public class Claculator {

    private int value;

    public Claculator(int value) {
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
