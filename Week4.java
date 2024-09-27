public class Week4 {
    public static int max2Int(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int minArray (int[] array) {
        int frag = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < frag) {
               frag = array[i];
            }
        }
        return frag;
    }

    public static String calculateBMI(double weight, double height){
        double bmi = weight / (height * height);
        double lamTron = Math.round(bmi * 10.0) / 10.0;
        if (lamTron < 18.5) {
            return "Thiếu cân";
        } else if (lamTron < 23) {
            return "Bình thường";
        } else if (lamTron < 25) {
            return "Thừa cân";
        }
        return "Béo phì";
    }
}
