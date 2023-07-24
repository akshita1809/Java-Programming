import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		double basic = sc.nextDouble();
		char grade = sc.next().charAt(0);
		
		double hra = 0.2 * basic;
        double da = 0.5 * basic;
		int allowance;
		
		if(grade == 'A') {
			allowance = 1700;
		}
		
		else if(grade == 'B') {
			allowance = 1500;
		}
		
		else {
			allowance = 1300;
		}
		
		double pf = 0.11 * basic;
		double totalSalary = basic + hra + da + allowance - pf;
		
		// Math.round(double d) return long
		long ans = Math.round(totalSalary);
		System.out.println(ans);
		   
	}
}
