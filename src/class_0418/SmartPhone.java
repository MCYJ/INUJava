package class_0418;

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("������������~~");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ �Ծ��.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("���� �����մϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("���� �ߴ��մϴ�.");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("���ڰ��ϴ�.");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("���ڿԾ��.");
	}
	
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}

}
