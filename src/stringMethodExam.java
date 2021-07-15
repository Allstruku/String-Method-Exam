
// java에서 이미 만들어져있는 클래스가 있다. 대펴적으로는 문자열을 다루는 String 클래스가 있다
class StringMethodExam {
	public static void main(String[] args) {
//		String str1 = new String("Hello");
		String str1 = "Hello";
		// String 클래스는 윗처럼 써도 되지만, 워낙 많이 쓰이기 때문에 간단하게 생성이 가능하다

		
// 많이 쓰이는 String 클래스의 메소드 리스트
		System.out.println(str1.length());
		// 참조변수명.length는 문자열의 길이를 보여준다
		String value = str1.concat("World");
		System.out.println(value);
		// 참조변수명.concat은 두 문자열을 합티는데에 쓰이는 메소드다. 변수명.concat("문자열") 하면 원래 변수의 문자열이랑 새로운 문자열이 합쳐진다
		//하지만 str1을 다시 출력하면 원래의 문자열이 보인다. 메소드를 수행해서 아예 객체를 바꿔버리면 다른 참조변수들에 에러가 생기기 때문이다. - 이를 불변클래스라고 한다
//		str1 = str1.concat("World");
//		System.out.println(str1);
		// 원래의 참조변수를 새로운 객체에 가리키게 하려면 새롭게 담아야한다
		String substring = str1.substring(2);
		System.out.println(substring);
		// 참조변수명.substring 하면 원하는 지접무터 String문자열을 지울 수 있다. 넣는 매개변수 int x는 그 지점 부터 보여달라는 뜻
		// index로 읽히기 때문에 0부터 시작
		String substringinout = str1.substring(0, 3);
		System.out.println(substringinout);
		// 참조변수명.substring 하면 원하는 지접무터 String문자열을 지울 수 있다. 넣는 매개변수 int x는 그 지점 부터 보여주고 int y부터는 제외라는 뜻
		// index로 읽히기 때문에 0부터 시작
	}
}
