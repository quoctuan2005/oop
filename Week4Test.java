import org.junit.Test;
import org.junit.Assert;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        Assert.assertEquals(5, Week4.max2Int(5, 1));
    }

    @Test
    public void testMax2Int2() {
        Assert.assertEquals(10, Week4.max2Int(1, 10));
    }

    @Test
    public void testMax2Int3() {
        Assert.assertEquals(100, Week4.max2Int(100, 99));
    }

    @Test
    public void testMax2Int4() {
        Assert.assertEquals(823, Week4.max2Int(333, 823));
    }

    @Test
    public void testMax2Int5() {
        Assert.assertEquals(100, Week4.max2Int(50,100));
    }

    @Test
    public void testMinArray1() {
        int[] arr = { 1, 2, 3, 4, 5};
        Assert.assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray2() {
        int[] arr = { 100, 12, 299, 20, 111,234};
        Assert.assertEquals(12, Week4.minArray(arr));
    }

    @Test
    public void testMinArray3() {
        int[] arr = {60, 70, 80, 90, 11111};
        Assert.assertEquals(60, Week4.minArray(arr));
    }

    @Test
    public void testMinArray4() {
        int[] arr = {243, 20342, 2039, 111, 2932, 923432};
        Assert.assertEquals(111, Week4.minArray(arr));
    }

    @Test
    public void testMinArray5() {
        int[] arr = { -10, 23, -99, 202, 9292};
        Assert.assertEquals(-99, Week4.minArray(arr));
    }

    @Test
    public void testCalculateBMI1() {
        Assert.assertEquals("Béo phì", Week4.calculateBMI(85,1.7));
    }

    @Test
    public void testCalculateBMI2() {
        Assert.assertEquals("Thừa cân", Week4.calculateBMI(70, 1.7));
    }

    @Test
    public void testCalculateBMI3() {
        Assert.assertEquals("Bình thường", Week4.calculateBMI(70, 1.8));
    }

    @Test
    public void testCalculateBMI4() {
        Assert.assertEquals("Bình thường", Week4.calculateBMI(50, 1.6));
    }

    @Test
    public void testCalculateBMI5() {
        Assert.assertEquals("Thiếu cân", Week4.calculateBMI(50, 1.7));
    }
}