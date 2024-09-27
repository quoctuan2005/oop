public class Week4 {
    public static int max2Int(int a, int b) {
        return Math.max(a,b);
    }
    public static int minArray (int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static String calculateBMI(double weight, double height) {
        double BMI = weight / Math.pow( height, 2);
        double round = Math.round(BMI * 10.0) / 10.0;

        if (round < 18.5) {
            return "Thiếu cân";
        }
        else if (round >= 18.5 && round <= 22.9) {
            return  "Bình thường";
        }
        else if (round >= 23 && round <= 24.9) {
            return  "Thừa cân";
        }
        else {
            return  "Béo phì";
        }
    }
}
