class ValidateDetails {
    private ValidatorStrategy validatorStrategy;

    ValidateDetails(ValidatorStrategy validatorStrategy) {
        this.validatorStrategy = validatorStrategy;
    }

    boolean validatePassword(String characters) {
        return validatorStrategy.validate(characters);
    }

    boolean validateUsername(String characters) {
        return validatorStrategy.validate(characters);
    }
}
