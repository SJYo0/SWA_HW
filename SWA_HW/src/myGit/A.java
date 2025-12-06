package myGit;

public class A {

	public static void main(String[] args) {
		System.out.println("난 저녁으로 무엇을 먹을까?");
		
		B selectMenuB = new B();
		
		System.out.println("메뉴 선택 : "+selectMenuB.getMenu());
	}

}
