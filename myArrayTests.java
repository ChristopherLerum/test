import static org.junit.Assert.*;
import org.junit.*;

public class myArrayTests {
        @Test
        public void test1ReverseInPlace() {
            int[] input1 = { 1,2,3 };
            ArrayExamples.reverseInPlace(input1);
            assertArrayEquals(new int[]{ 3,2,1 }, input1);
        }
        @Test
        public void test2ReverseInPlace() {
            int[] input1 = { 1 };
            ArrayExamples.reverseInPlace(input1);
            assertArrayEquals(new int[]{ 1 }, input1);
        }
}
