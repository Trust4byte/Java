import java.util.Set;
import java.util.TreeSet;

public class Tipp {

    private Set<Integer> numbers = new TreeSet<>();

    public Tipp(){

    }

    public boolean add(int num){
        return numbers.add(num);

    }

    public int countNumbers(){
        return numbers.size();
    }

    public Set<Integer> getSet() {
        return numbers;
    }

    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }

    public int calcCorrect(Set<Integer> drawn){
        int count = 0;

        for(Integer ltZ : drawn){
            if (numbers.contains(ltZ))
                count++;
        }

        return count;
    }
}
