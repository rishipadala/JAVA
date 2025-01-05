package com.company;
class NegativeRadiusException extends Exception{
    @Override
    public String toString() { // toString Method use to print in sout exception e
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() { // it will display exception message;
        return "Radius must be positive!";
    }
}
public class throw_throwsException {
    public static double area(int r) throws NegativeRadiusException{ // throws :- This gives an information to the programmer that there might be an exception so its better to be prepared with a try catch block!
            if (r<0){
                throw new NegativeRadiusException(); // throw keyword used for built in or custom made exceptions
            }
            double result = Math.PI * r * r;
            return result;
        }

        public static int divide(int a, int b) throws ArithmeticException{
             //Made By Harry

            int result = a/b;
            return result;

        }
        public static void main(String[] args) {
            // Shivam - uses divide function created by Harry
            try{
//                int c = divide(6, 2);
//                System.out.println(c);
                double ar = area(-2);
                System.out.println(ar);
            }
            catch(Exception e){
                System.out.println("Exception");
                //System.out.println(e.toString());
                //System.out.println(e);
                //System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Program is done");
        }
    }


