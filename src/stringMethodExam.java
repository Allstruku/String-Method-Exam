
// java���� �̹� ��������ִ� Ŭ������ �ִ�. ���������δ� ���ڿ��� �ٷ�� String Ŭ������ �ִ�
class StringMethodExam {
	public static void main(String[] args) {
//		String str1 = new String("Hello");
		String str1 = "Hello";
		// String Ŭ������ ��ó�� �ᵵ ������, ���� ���� ���̱� ������ �����ϰ� ������ �����ϴ�

		
// ���� ���̴� String Ŭ������ �޼ҵ� ����Ʈ
		System.out.println(str1.length());
		// ����������.length�� ���ڿ��� ���̸� �����ش�
		String value = str1.concat("World");
		System.out.println(value);
		// ����������.concat�� �� ���ڿ��� ��Ƽ�µ��� ���̴� �޼ҵ��. ������.concat("���ڿ�") �ϸ� ���� ������ ���ڿ��̶� ���ο� ���ڿ��� ��������
		//������ str1�� �ٽ� ����ϸ� ������ ���ڿ��� ���δ�. �޼ҵ带 �����ؼ� �ƿ� ��ü�� �ٲ������ �ٸ� ���������鿡 ������ ����� �����̴�. - �̸� �Һ�Ŭ������� �Ѵ�
//		str1 = str1.concat("World");
//		System.out.println(str1);
		// ������ ���������� ���ο� ��ü�� ����Ű�� �Ϸ��� ���Ӱ� ��ƾ��Ѵ�
		String substring = str1.substring(2);
		System.out.println(substring);
		// ����������.substring �ϸ� ���ϴ� �������� String���ڿ��� ���� �� �ִ�. �ִ� �Ű����� int x�� �� ���� ���� �����޶�� ��
		// index�� ������ ������ 0���� ����
		String substringinout = str1.substring(0, 3);
		System.out.println(substringinout);
		// ����������.substring �ϸ� ���ϴ� �������� String���ڿ��� ���� �� �ִ�. �ִ� �Ű����� int x�� �� ���� ���� �����ְ� int y���ʹ� ���ܶ�� ��
		// index�� ������ ������ 0���� ����
	}
}
