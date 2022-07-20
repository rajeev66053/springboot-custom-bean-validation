# springboot-custom-bean-validation 

* Required `@Validated` annotation in controller to use `@Min(1000)` in getUser method.
* We need to pass `@Valid` annotation in post method to work for validation to work.
* For custom validation in `address` field we have to create custom AddressValidation annotation and its `AddressValidator ` implemntation class.
* TRo show the exact error from custom validation we need to create a custom exception handler `MyExceptionHandler` and `ApiError`.
