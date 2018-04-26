public class SubArray {
	//求两个数中的最大数
	private int max(int x,int y) {
		if(x>y)
			return x;
		else
			return y;
	}
	//最大子数组之和
	public int maxSubArr(int[] arr) {
		int sum=arr[0];			//最大值子数组和 
		int sub_sum=arr[0];			//中间数
		for(int i = 1;i < arr.length;i++) {
			sub_sum=max(arr[i],sub_sum+arr[i]);      
			sum=max(sub_sum,sum);
		}
		return sum;
	}
}