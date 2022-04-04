import java.util.Scanner;

public class Song {
	// ������ ����
	String title, artist, year, country;
	
	public static void main(String[] args) {
		// scanner ��ü �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		// �������� ���� �ڷ��Է�
		String title = sc.nextLine();
		String artist = sc.nextLine();
		String year = sc.nextLine();
		String country = sc.nextLine();
		
		// scanner�� ���� �Էµ� �ڷḦ Ȱ���Ͽ� �Ű����� �ִ� �����ڸ� Ȱ���Ͽ� �ν��Ͻ� ����
		Song song = new Song(title, artist, year, country);
		song.show();
		
		// �Ű����� ���� �����ڸ� Ȱ���Ͽ� �ν��Ͻ� ����
		Song song2 = new Song();
		song2.show();
		

		// scanner ��ü close
		sc.close();
	}
	
	
	// �Ű����� ���� �������� ���, �������� �����ڿ��� �Է�
	public Song() {
		this.title = "�ƹ� �뷡";
		this.artist = "����";
		this.year = "2020";
		this.country = "���ѹα�";
	}
	
	// �Ű����� �ִ� �������� ���, �������� �Ű������� ���� �Է�
	public Song(String title, String artist, String year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	// ������ ��� �޼ҵ�
	public void show() {
		System.out.println("Song ����: "+this.year+"��, "+country+" ������ "+this.artist+"�� �θ� \""+this.title+"\"");
	}
}
