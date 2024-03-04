package BasicProjects;
public class EncapsulationValues {

	public static void main(String[] args) {
		Encapsulation cap = new Encapsulation();

		cap.setFirst_name("ABC");
		cap.setSecond_name("DEF");
		cap.setLast_name("GHI");
		cap.setMobile_Number(2122232425);


		System.out.println("First name= "+cap.getFirst_name());
		System.out.println("Second name= "+cap.getSecond_name());
		System.out.println("Last name= "+cap.getLast_name());

		System.out.println("Mobile_Number="+cap.getMobile_Number());
		} }

