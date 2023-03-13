package skypro;

public class SomeTestNumber {
    private int number;
    public SomeTestNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }

    @Override
    public String toString() {
        return "SomeTestNumber{" +
                "number=" + number +
                '}';
    }
}
