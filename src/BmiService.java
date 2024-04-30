public class BmiService {

    public int calculate(int weight, double height) {
        int result;
        result = (int) ((int) weight / (height * height));
        return result;
    }
}