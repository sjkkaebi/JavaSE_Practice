package Study01.mypac;

	public class HandPhone {
		public int name;
		public String model;
		
		//디폴트 생성자
		public HandPhone() {
			this.model = "디폴트";
			System.out.println("디폴트 생성자가 호출되었습니다.");
		}
		//오버로딩 생성자
		public HandPhone(String model) {
			this.model = model;
		//	this.model = "갤럭시";
		//	model = "갤럭시2";
			
		System.out.println("생성자로 " +model+"이 전달되었습니다.");
		}
		
		public HandPhone(int name) {
		//	this.model = model;
			model = "아이폰";
			
			System.out.println("생성자로 " +name+"가 전달되었습니다.");
		}
			
			
		}

