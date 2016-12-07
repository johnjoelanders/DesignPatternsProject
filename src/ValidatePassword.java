

public class ValidatePassword implements ValidatorStrategy{
    public Boolean validate(String characters){
        System.out.println("Validating password");
        String passwordRegex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20})";
        Boolean b = characters.matches(passwordRegex);
        if(!b){
            System.out.println("Not a valid password 1 or more numbers,Uppercase characters,Lowercase characters and between 6-20 characters long");
        }
        return b;
    }
}
