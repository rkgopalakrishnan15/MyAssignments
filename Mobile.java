package week1.day1;
public class Mobile {

    // Method to make a call
    public void makeCall() {
        String mobileModel = "MyMobileModel";
        float mobileWeight = 150.5f;
        System.out.println("Making a call from " + mobileModel + ", weighing " + mobileWeight + " grams.");
    }

    // Method to send a message
    public void sendMsg() {
        boolean isFullCharged = true;
        int mobileCost = 500;
        System.out.println("Sending a message. Full charged: " + isFullCharged + ", Mobile cost: $" + mobileCost);
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the Mobile class
        Mobile myMobile = new Mobile();

        // Call the methods and print statements
        myMobile.makeCall();
        myMobile.sendMsg();

        // Print the additional statement
        System.out.println("This is my mobile");
    }

		
		
	}
	
