package com.niuke;

public class NiuKe {
	    public static int JumpFloor(int target) {
//	    	target = 80;
	    	if(target <= 0){
	    		return 0;
	    	}else if(target ==1){
	    		return 1;
	    	}else if(target ==2){
	    		return 2;
	    	}else	    		
			  return JumpFloor(target -1)+JumpFloor(target-2);
	    }
	    public static void main(String[] args) {
			int a =20;
			System.out.println(JumpFloor(a));
		}
	   
}
