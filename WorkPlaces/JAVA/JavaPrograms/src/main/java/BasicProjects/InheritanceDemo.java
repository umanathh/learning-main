package BasicProjects;

	class Animal {
		   String Animal = "Birds";
		   String AnimalName = "Parrot";
		   void does(){
			System.out.println(" ");
		   }
		}

		public class InheritanceDemo extends Animal{
		   String Color = "Green";
		   public static void main(String args[]){
			InheritanceDemo obj = new InheritanceDemo();
			System.out.println("Animal name is " + obj.AnimalName);
			System.out.println("They are of type " + obj.Animal);
			System.out.println("Color is " + obj.Color);
			obj.does();
		   }
		}
		
