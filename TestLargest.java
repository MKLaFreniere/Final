package Final;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestLargest  {
	private Largest temp1;
	
	public void testPositive(){
		int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        temp1 = new Largest();
        int maxValue = temp1.largest(arr);

        assertSame("Wrong Pos", 11, maxValue);
	}
	
	public void testNegative(){
		int[] arr = new int[4];
        arr[0] = -11;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        temp1 = new Largest();
        int maxValue = temp1.largest(arr);

        assertSame("Wrong Neg", -7, maxValue);
	}
}


