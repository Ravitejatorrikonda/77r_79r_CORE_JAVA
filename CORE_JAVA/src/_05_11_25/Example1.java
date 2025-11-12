package _05_11_25;

public class Example1 {
	String title;
	int likes = 0; 
	public void like() {
		likes = likes+1;
	}
	public void displayLikes() {
		System.out.println("Moive Title :" + title);
		System.out.println("Likes :" + likes);
	}
	public static void main(String[] args) {
		Example1 movie1 = new Example1();
		movie1.title = "Kanthara";
		movie1.like();
		movie1.like();
		movie1.displayLikes();
		
		
	}

}
