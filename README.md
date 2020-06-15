Validations

@Size
- It determines that the size must be equal to the specified value.

@NotNull
- Does not allow a null value, which is what Spring MVC generates if the entry is empty.

@Min
- It determines that the number must be equal or greater than the specified value.

@Max
- It determines that the number must be equal or less than the specified value.

@ValidPassword
- Validates the password has contain a special character and digit, and it has at least 8 characters long and has a uppercase.

@NotEmpty
- Validates that the property is not null or empty; can be applied to String, Collection, Map or Array values.
