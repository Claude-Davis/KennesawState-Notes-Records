import java.util.ArrayList;

public class ProductHandler extends MathHandler{
    public int arraylistHandler(ArrayList<Integer> numbers){
        int x = 1;

        for (int i=0; i<=numbers.size(); i++){
            x = x * i;

        }

        return x;
    }
}
