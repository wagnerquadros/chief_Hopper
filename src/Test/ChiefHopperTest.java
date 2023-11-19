package Test;

import ChiefHopper.BruteForceChiefHopper;
import ChiefHopper.ChiefHopper;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChiefHopperTest {

    ChiefHopper ch = new ChiefHopper();
    List<Integer> arr = new ArrayList<>();
    EntriesReader er = new EntriesReader();
    BruteForceChiefHopper bruteForce = new BruteForceChiefHopper();

    @Test
    public void test1minEnergyMustBe4 (){

        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        int result = ch.result(arr);
        int bf = bruteForce.bruteForceSerchForMinimumEnergy(arr);

        Assert.assertNotEquals(3, result);
        Assert.assertEquals(4, result);
        Assert.assertNotEquals(5, result);

        Assert.assertEquals(4, bf);
    }

    @Test // 99 buildings
    public void test2minEnergyMustBe1859(){
        String path = "src/Test/entries/test2entries.txt";
        arr = er.getEntries(path);
        int result = ch.result(arr);

        Assert.assertNotEquals(1858, result);
        Assert.assertEquals(1859, result);
        Assert.assertNotEquals(1860, result);

    }

    @Test // 1000 buildings
    public void test3minEnergyMustBe33659(){
        String path = "src/Test/entries/test3entries.txt";
        arr = er.getEntries(path);
        int result = ch.result(arr);

        Assert.assertNotEquals(33658, result);
        Assert.assertEquals(33659, result);
        Assert.assertNotEquals(33660, result);
    }

    @Test //10000 buildings
    public void test4minEnergyMustBe57957(){
        String path = "src/Test/entries/test4entries.txt";
        arr = er.getEntries(path);
        int result = ch.result(arr);

        Assert.assertNotEquals(57956, result);
        Assert.assertEquals(57957, result);
        Assert.assertNotEquals(57958, result);
    }

    @Test
    public void test5minEnergyMustBe3 (){

        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        int result = ch.result(arr);
        int bf = bruteForce.bruteForceSerchForMinimumEnergy(arr);

        Assert.assertNotEquals(0, result);
        Assert.assertEquals(1, result);
        Assert.assertNotEquals(2, result);
    }

    @Test
    public void test6minEnergyMustBe2 (){

        arr.add(4);
        int result = ch.result(arr);
        int bf = bruteForce.bruteForceSerchForMinimumEnergy(arr);

        Assert.assertNotEquals(1, result);
        Assert.assertEquals(2, result);
        Assert.assertNotEquals(3, result);

        Assert.assertEquals(2, bf);
    }

    @Test
    public void test7minEnergyMustBe3 (){

        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(2);

        int result = ch.result(arr);
        int bf = bruteForce.bruteForceSerchForMinimumEnergy(arr);

        Assert.assertNotEquals(2, result);
        Assert.assertEquals(3, result);
        Assert.assertNotEquals(4, result);

        Assert.assertEquals(3, bf);
    }

    @Test
    public void test8getMinEnerfyFromBruteForceMethodAndCompareToResultMethod(){
        String path = "src/Test/entries/test8entries.txt";
        arr = er.getEntries(path);
        int result = ch.result(arr);
        int bf = bruteForce.bruteForceSerchForMinimumEnergy(arr);

        Assert.assertEquals(result, bf);
    }
}
