public class ValidateDetails {
    public ValidatorStrategy validatorStrategy;

    public ValidateDetails(ValidatorStrategy validatorStrategy){
        this.validatorStrategy = validatorStrategy;
    }
    public boolean validatePassword(String characters){
        return validatorStrategy.validate(characters);
    }
    public boolean validateUsername(String characters){
        return validatorStrategy.validate(characters);
    }
}
