import java.util.ArrayList;

public class FindAvg {
    Double total_sum;
    Integer denominator;
    Double average;

    public FindAvg(ArrayList<Double> nums) {
        ArrayList<Double> numbers = nums;
    }

    //calculate sum of all arraylist values
    public Double calculateTotal (ArrayList<Double> numbers) {
        Double sum = 0.0;

        for (int n=0; n<numbers.size(); n++) {
            sum += numbers.get(n);
        }

        this.total_sum = sum;

        return total_sum;
    }

    //calculate length of arraylist
    public Integer findDenominator(ArrayList<Double> numbers) {
        this.denominator = numbers.size();
        return denominator;
    }

    //calculate average
    public Double calculateAverage(Double sum, Integer denom) {
            this.average = sum / denom;
            return average;
    }






    //get the sum
    public String getSum() {
        return "Sum = " + total_sum;
    }

    //get the denominator 
    public String getDenom() {
        return "Denominator: " + denominator;
    }

    //get the average
    public String getAvg() {
        return "The average of your inputs is : " + average;
    }
}