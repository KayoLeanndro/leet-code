package twosun;

public class TwoSum {
	
	public static void main(String[] args) {
		int [] nums = new int[]{2,1,11,7,15, 9, 1};
		int target = 9;
		
		System.out.println(twoSum(nums, target));
	}
	
	public static int[] twoSum(int[] nums, int target) {

	    for(int i = 0; i < nums.length ; i++ ){
	    	for(int y = i + 1; y < nums.length; y ++) {
	    		
	    		int resultado = nums[i] + nums[y];
	    		
	    		if(resultado == target) {
	    			System.out.printf("Index %s, Yndex %s", i, y);
	    			return new int[] {i,y};
	    		}
	    	}
	    }
	    
	    return null;
	}
	
}






