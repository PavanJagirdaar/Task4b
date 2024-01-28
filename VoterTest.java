package task4b;

public class VoterTest {

	public static void main(String[] args) {
		try {
            // Example usage
            Voter voter1 = new Voter("V123", "Alice", 15);
            voter1.displayVoterInfo();

            // Uncomment the following lines to test the exception
            /*
            Voter voter2 = new Voter("V456", "Bob", 17);
            */
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

	}

}
