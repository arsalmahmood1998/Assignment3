public class Marathon {
	static String[] names = {
			"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
			"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
			"Aaron", "Kate"};
	static int[] times = {
			341, 273, 278, 250, 445, 402, 388, 275, 243, 334, 412, 393, 299,
			343, 317, 500};
	public static void main(String[] args) {
		runner(names,times);
		 }
	static void runner(String [] names,int[] times) {
		String bestRunner="null";
		int minTime=Integer.MAX_VALUE;
		String secondBestRunner="null";
		int secondMinimumTime=Integer.MAX_VALUE;
		for(int i=0;i< names.length;i++) {
			if(times[i]<minTime) {
				bestRunner=names[i];
				minTime=times[i];
				}
			}
		for(int i=0;i<names.length;i++) {
			if(times[i]!=minTime && times[i]<secondMinimumTime ) {
				secondBestRunner=names[i];
				secondMinimumTime=times[i];
				}
			}
		System.out.println("Best runner:"+bestRunner+ " minimum time: "+minTime);
		System.out.println("Second best runner:"+secondBestRunner+ "  time:"+secondMinimumTime);
		}
	 } 