import static org.junit.Assert.*;
import org.junit.*;

public class myArrayTests {
        @Test
        public void testReverseInPlace() {
            int[] input1 = { 1,2,3 };
            ArrayExamples.reverseInPlace(input1);
            assertArrayEquals(new int[]{ 3,2,1 }, input1);
        }
        @Test
        public void testReverseInPlace() {
            int[] input1 = { 1 };
            ArrayExamples.reverseInPlace(input1);
            assertArrayEquals(new int[]{ 1 }, input1);
        }
}
