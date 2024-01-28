package task4b;

class Voter {
    private String voterId;
    private String name;
    private int age;

    public Voter(String voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Add getter and setter methods if needed

    public void displayVoterInfo() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

