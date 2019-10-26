package string;

class IndexOf {
	public static void main(String args[]) {
		//            0123456 78
		String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		
		// 710914-1095748
		
		int count = 0;
		int idx = 0;
		while(idx > -1) {
			idx = str.indexOf("Lorem", idx);
			if(idx != -1) {
				count++;
				System.out.println("Lorem À§Ä¡ : " + idx);
			}
			if(idx == -1) {
				break;
			}
			
			idx++;
		}
		System.out.println(count);
		
	}
}



