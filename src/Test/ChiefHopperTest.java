package Test;

import ChiefHopper.BruteForceChiefHopper;
import ChiefHopper.ChiefHopper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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

        Assertions.assertNotEquals(3, result);
        Assertions.assertEquals(4, result);
        Assertions.assertNotEquals(5, result);

        Assertions.assertEquals(4, bf);
    }

    @Test // 99 buildings
    public void test2minEnergyMustBe1859(){
        String path = "src/Test/entries/test2entries.txt";
        arr = er.getEntries(path);
        int result = ch.result(arr);

        Assertions.assertNotEquals(1858, result);
        Assertions.assertEquals(1859, result);
        Assertions.assertNotEquals(1860, result);

    }

    @Test // 1000 buildings
    public void test3minEnergyMustBe33659(){
        String path = "src/Test/entries/test3entries.txt";
        arr = er.getEntries(path);
        int result = ch.result(arr);

        Assertions.assertNotEquals(33658, result);
        Assertions.assertEquals(33659, result);
        Assertions.assertNotEquals(33660, result);
    }

    @Test //10000 buildings
    public void test4minEnergyMustBe57957(){
        String path = "src/Test/entries/test4entries.txt";
        arr = er.getEntries(path);
        int result = ch.result(arr);

        Assertions.assertNotEquals(57956, result);
        Assertions.assertEquals(57957, result);
        Assertions.assertNotEquals(57958, result);
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

        Assertions.assertNotEquals(0, result);
        Assertions.assertEquals(1, result);
        Assertions.assertNotEquals(2, result);
    }

    @Test
    public void test6minEnergyMustBe2 (){

        arr.add(4);
        int result = ch.result(arr);
        int bf = bruteForce.bruteForceSerchForMinimumEnergy(arr);

        Assertions.assertNotEquals(1, result);
        Assertions.assertEquals(2, result);
        Assertions.assertNotEquals(3, result);

        Assertions.assertEquals(2, bf);
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

        Assertions.assertNotEquals(2, result);
        Assertions.assertEquals(3, result);
        Assertions.assertNotEquals(4, result);

        Assertions.assertEquals(3, bf);
    }

    @Test
    public void test8getMinEnerfyFromBruteForceMethodAndCompareToResultMethod(){
        String path = "src/Test/entries/test8entries.txt";
        arr = er.getEntries(path);
        int result = ch.result(arr);
        int bf = bruteForce.bruteForceSerchForMinimumEnergy(arr);

        Assertions.assertEquals(result, bf);
    }
}
