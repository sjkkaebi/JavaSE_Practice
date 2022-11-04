package Study01;

import Study01.mypac.HandPhone;

	public class Main01 {
		public static void main(String[] args) {
			HandPhone hp = new HandPhone();
			
			HandPhone hp2 = new HandPhone("갤럭시");
			
			HandPhone hp3 = new HandPhone(2 );
			
			System.out.println("hp model: " +hp.model);
			System.out.println("hp2 model: " +hp2.model);
			System.out.println("hp3 model: " +hp3.model);
		}

	}



