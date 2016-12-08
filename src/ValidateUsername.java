
class ValidateUsername implements ValidatorStrategy {
    @Override
    public Boolean validate(String characters) {
        System.out.println("Validating Username");
        String userNameRegex = "^[A-Za-z]{6,20}$";
        Boolean b = characters.matches(userNameRegex);
        if (!b) {
            System.out.println("Not a valid username only upper and lowercase characters are aloud and between 6-20 character long");
        }
        return b;
    }
}
