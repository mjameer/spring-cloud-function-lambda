### Spring Cloud Function using AWS Adapter example

Implementation done via Java 8 and Spring boot 2.x

## Exposed Function as API Endpoint using AWS API Gateway
`SpringBootAwsLambdaApplication` is exposed as function to the AWS Request Handler using `EmployeeHandler`.
`APIGatewayProxyRequestEvent` is the input object and `List<Employee>` is the response object.

### Command used:

```
curl -X POST -H 'Content-Type: text/plain' <API_GATEWAY_URL>
```

