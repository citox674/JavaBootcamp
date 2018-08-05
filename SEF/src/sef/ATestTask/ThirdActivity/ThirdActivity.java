package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        ta.validateUser("Ivan");
        ta.catchExeption();
        ta.catchMe(1,0);
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(arr[i]);
            }
            catch (ArrayIndexOutOfBoundsException arrEx){
                System.out.println("This should get printed even if there is an exception");
            }
        }
    }

    void validateUser(String name) {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        int flag = 0;
        //TODO if name in a list -> set flag=1
        // if at the end flag=0 -> throw the exeption
        try {
            for (int i = 0; i < 4; i++) {
                if (name == validUsers[i]) {
                    flag = 1;
                    break;
                }
                if (flag == 0) throw new InvalidUserException("Invalid User");
            }
        }
        catch (InvalidUserException iuEx) {
            System.out.println("Exception: " + iuEx.getMessage());
        }
    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
        catch (Exception e){
            System.out.println("Ex handled: " + e.getMessage());
        }
        finally {
            //TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");
        }
    }

    public class InvalidUserException extends Exception {
        public InvalidUserException(String message){
            super(message);
        }
    }

}

