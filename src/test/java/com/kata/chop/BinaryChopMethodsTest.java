package com.kata.chop;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertEquals;

public class BinaryChopMethodsTest {
    @Rule
    public TestName testName;

    BinaryChopMethods binaryChopMethods = new BinaryChopMethods();

    //Tests for recursiveBinaryChop
    @Test(expected = BinaryChopMethods.EmptyArrayException.class)
    public void recursive_method_should_fail_when_array_is_empty() throws Exception {
        binaryChopMethods.recursiveBinaryChop(1, new int[]{});
    }

    @Test(expected = BinaryChopMethods.ValueNotInArrayException.class)
    public void recursive_method_should_fail_when_array_not_in_list_1() throws Exception {
        binaryChopMethods.recursiveBinaryChop(4, new int[]{1, 2, 3});
    }

    @Test(expected = BinaryChopMethods.ValueNotInArrayException.class)
    public void recursive_method_should_fail_when_array_not_in_list_2() throws Exception {
        binaryChopMethods.recursiveBinaryChop(0, new int[]{1, 2, 3});
    }

    @Test(expected = BinaryChopMethods.ValueNotInArrayException.class)
    public void recursive_method_should_fail_when_array_not_in_list_3() throws Exception {
        binaryChopMethods.recursiveBinaryChop(3, new int[]{1, 2, 4});
    }

    @Test
    public void recursive_method_should_return_correct_value() throws Exception {
        assertEquals(3, binaryChopMethods.recursiveBinaryChop(4, new int[]{1, 2, 3, 4, 6, 9, 12, 25, 30, 35, 40, 50, 100}));
        assertEquals(0, binaryChopMethods.recursiveBinaryChop(1, new int[]{1, 2, 3, 5, 8, 13, 21}));
        assertEquals(6, binaryChopMethods.recursiveBinaryChop(21, new int[]{1, 2, 3, 5, 8, 13, 21}));
        assertEquals(1, binaryChopMethods.recursiveBinaryChop(2, new int[]{1, 2}));
    }

    //Tests for boundaryBinaryChop
    @Test
    public void boundary_method_should_fail_when_array_is_empty() throws Exception {
        assertThatThrownBy(() -> binaryChopMethods.boundaryBinaryChop(1, new int[]{}))
                .isInstanceOf(BinaryChopMethods.EmptyArrayException.class);
    }

    @Test
    public void boundary_method_should_fail_when_array_not_in_list() throws Exception {
        assertThatThrownBy(() -> binaryChopMethods.boundaryBinaryChop(4, new int[]{1, 2, 3}))
                .isInstanceOf(BinaryChopMethods.ValueNotInArrayException.class);
        assertThatThrownBy(() -> binaryChopMethods.boundaryBinaryChop(0, new int[]{1, 2, 3}))
                .isInstanceOf(BinaryChopMethods.ValueNotInArrayException.class);
        assertThatThrownBy(() -> binaryChopMethods.boundaryBinaryChop(3, new int[]{1, 2, 4}))
                .isInstanceOf(BinaryChopMethods.ValueNotInArrayException.class);
    }

    @Test
    public void boundary_method_should_return_correct_value_1() throws Exception {
        assertEquals(3, binaryChopMethods.boundaryBinaryChop(4, new int[]{1, 2, 3, 4, 6, 9, 12, 25, 30, 35, 40, 50, 100}));
    }

    @Test
    public void boundary_method_should_return_correct_value_2() throws Exception {
        assertEquals(0, binaryChopMethods.boundaryBinaryChop(1, new int[]{1, 2, 3, 5, 8, 13, 21}));
    }

    @Test
    public void boundary_method_should_return_correct_value_3() throws Exception {
        assertEquals(6, binaryChopMethods.boundaryBinaryChop(21, new int[]{1, 2, 3, 5, 8, 13, 21}));
    }

    @Test
    public void boundary_method_should_return_correct_value_4() throws Exception {
        assertEquals(1, binaryChopMethods.boundaryBinaryChop(2, new int[]{1, 2}));
    }

    //Tests for reductionBinaryChop
    @Test(expected = BinaryChopMethods.EmptyArrayException.class)
    public void reduction_method_should_fail_when_array_is_empty() throws Exception {
        binaryChopMethods.arrayReductionBinaryChop(1, new int[]{});
    }

    @Test(expected = BinaryChopMethods.ValueNotInArrayException.class)
    public void reduction_method_should_fail_when_array_not_in_list_1() throws Exception {
        binaryChopMethods.arrayReductionBinaryChop(4, new int[]{1, 2, 3});
    }

    @Test(expected = BinaryChopMethods.ValueNotInArrayException.class)
    public void reduction_method_should_fail_when_array_not_in_list_2() throws Exception {
        binaryChopMethods.arrayReductionBinaryChop(0, new int[]{1, 2, 3});
    }

    @Test(expected = BinaryChopMethods.ValueNotInArrayException.class)
    public void reduction_method_should_fail_when_array_not_in_list_3() throws Exception {
        binaryChopMethods.arrayReductionBinaryChop(3, new int[]{1, 2, 4});
    }

    @Test
    public void reduction_method_should_return_correct_value_1() throws Exception {
        assertEquals(3, binaryChopMethods.arrayReductionBinaryChop(4, new int[]{1, 2, 3, 4, 6, 9, 12, 25, 30, 35, 40, 50, 100}));
    }

    @Test
    public void reduction_method_should_return_correct_value_2() throws Exception {
        assertEquals(0, binaryChopMethods.arrayReductionBinaryChop(1, new int[]{1, 2, 3, 5, 8, 13, 21}));
    }

    @Test
    public void reduction_method_should_return_correct_value_3() throws Exception {
        assertEquals(6, binaryChopMethods.arrayReductionBinaryChop(21, new int[]{1, 2, 3, 5, 8, 13, 21}));
    }

    @Test
    public void reduction_method_should_return_correct_value_4() throws Exception {
        assertEquals(1, binaryChopMethods.arrayReductionBinaryChop(2, new int[]{1, 2}));
    }

    //Tests for movingViewBinaryChop
    @Test(expected = BinaryChopMethods.EmptyArrayException.class)
    public void view_method_should_fail_when_array_is_empty() throws Exception {
        binaryChopMethods.movingViewBinaryChop(1, new int[]{});
    }

    @Test(expected = BinaryChopMethods.ValueNotInArrayException.class)
    public void view_method_should_fail_when_array_not_in_list_1() throws Exception {
        binaryChopMethods.movingViewBinaryChop(4, new int[]{1, 2, 3});
    }

    @Test(expected = BinaryChopMethods.ValueNotInArrayException.class)
    public void view_method_should_fail_when_array_not_in_list_2() throws Exception {
        binaryChopMethods.movingViewBinaryChop(0, new int[]{1, 2, 3});
    }

    @Test(expected = BinaryChopMethods.ValueNotInArrayException.class)
    public void view_method_should_fail_when_array_not_in_list_3() throws Exception {
        binaryChopMethods.movingViewBinaryChop(3, new int[]{1, 2, 4});
    }

    @Test
    public void view_method_should_return_correct_value_1() throws Exception {
        assertEquals(3, binaryChopMethods.movingViewBinaryChop(4, new int[]{1, 2, 3, 4, 6, 9, 12, 25, 30, 35, 40, 50, 100}));
    }

    @Test
    public void view_method_should_return_correct_value_2() throws Exception {
        assertEquals(0, binaryChopMethods.movingViewBinaryChop(1, new int[]{1, 2, 3, 5, 8, 13, 21}));
    }

    @Test
    public void view_method_should_return_correct_value_3() throws Exception {
        assertEquals(6, binaryChopMethods.movingViewBinaryChop(21, new int[]{1, 2, 3, 5, 8, 13, 21}));
    }

    @Test
    public void view_method_should_return_correct_value_4() throws Exception {
        assertEquals(1, binaryChopMethods.movingViewBinaryChop(2, new int[]{1, 2}));
    }
}