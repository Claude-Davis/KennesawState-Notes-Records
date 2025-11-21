import java.util.ArrayList;

public class AdditionHandler extends MathHandler{

    public int arraylistHandler(ArrayList<Integer> numbers){
        int x = 0;

        for (int i=0; i<=numbers.size(); i++){
            x+= i;
        }

        return x;
    }
}
