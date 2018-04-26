public class SubArray {
	public int max(int x,int y) {
		if(x>y)
			return x;
		else
			return y;
	}
	public int maxSubArr(int[] arr) {
		int sum=arr[0];
		int sub_sum=arr[0];
		for(int i=1;i<arr.length;i++) {
		sub_sum=max(arr[i],sub_sum+arr[i]);
		sum=max(sub_sum,sum);
		}
		return sum;
	}
}