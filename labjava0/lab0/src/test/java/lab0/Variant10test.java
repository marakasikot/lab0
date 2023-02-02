package lab0;

import lab0.Variant10;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Variant10test {

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] { { 321, 12 }, {981, 18}, {295, 59}};
    }
    @Test(dataProvider = "integerProvider")
    public void integerTest(int p1, int p2) {
        assertEquals(new Variant10().integerNumbersTask(p1), p2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeIntegerTest() {
        new Variant10().integerNumbersTask(  1000);
    }


    ///////////////////
    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, int p2, boolean p3) {
        assertEquals(new Variant10().booleanTask(p1, p2), p3);
    }
    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] { { 5, 8, true }, { 4, 5, true }, {2, 4,  false } ,{1, 3,  false } };
    }

    ////////////////////
    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1, int p2, int p3) {
        assertEquals(new Variant10().ifTask(p1, p2), p3);
    }
    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { {1, 1, 0 }, {2, 3, 5 }, {6, 4, 10 } };
    }

    ///////////////////////
    @Test(dataProvider = "switchProvider")
    public void switchTest(char C, int n, String result) {
        assertEquals(new Variant10().switchTask(C, n), result);
    }
    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] { { 'N', 0, "North" }, { 'S', -1, "West" } };
    }


    /////////////////////////
    @Test(dataProvider = "forProvider")
    public void forTest(int p1, float p2) {
        assertEquals(new Variant10().forTask(p1), p2);
    }
    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] {{3, 11/6}, {2, 3/2}};
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeForTest() {
        new Variant10().forTask( 0);
    }



    ////////////////////////////////
    @Test(dataProvider = "whileProvider")
    public void whileTest(int p1, int p3) {
        assertEquals(new Variant10().whileTask(p1), p3);
    }
    @DataProvider
    public Object[][] whileProvider() {
        Object[][] objects = {{30, 3}, {20, 2}};
        return objects;
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeWhileTest() {
        new Variant10().whileTask( 1);
    }

    ///////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int[] array, int n, int[] arr) {
        assertEquals(new Variant10().arrayTask(array, n), arr);
    }
    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] { { new int[] { 1, 2, 4, 9, 8}, 5, new int[] { 2, 4, 8, 9, 1}}};
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeArrayTest() {
        new Variant10().arrayTask( new int[] { 1, 3, 9, 27, 81}, 0);
    }

    ///////////////////////////////////
    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[][] input, int n, int m, int[][] output) {
        assertEquals(new Variant10().twoDimensionArrayTask(input, n, m), output);
    }
    @DataProvider
    public Object[][] matrixProvider() {
        int[][] input = {{1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}};

        int[][] output = {{2, 4},
                {2, 4},
                {2, 4},
                {2, 4},
                {2, 4}};

        int[][] input1 = {{1, 7, 3, 4, 5},
                {1, 7, 3, 4, 5},
                {1, 7, 3, 4, 5},
                {1, 7, 3, 4, 5},
                {1, 7, 3, 4, 5}};

        int[][] output1 = {{7, 4},
                {7, 4},
                {7, 4},
                {7, 4},
                {7, 4}};

        int[][] input2 = {{1, 4, 3, 7, 4},
                {4, 6, 7, 8, 3},
                {3, 5, 6, 3, 2},
                {1, 2, 7, 5, 3}};

        int[][] output2 = {{4, 7},
                {6, 8},
                {5, 3},
                {2, 5}};

        return new Object[][] { {input, 5, 5, output}, {input1, 5, 5, output1}, {input2, 4, 5, output2} };

    }



}
