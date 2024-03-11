public class JBLSpeaker implements Soundable {

	private String model;

	@Override
	public void makeSound() {
		System.out.println("Играет Король и Шут");
	}

}
