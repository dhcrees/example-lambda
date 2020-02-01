package serverless.lambda.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import serverless.lambda.example.models.Person;
import org.apache.log4j.Logger;

public class ExampleHandler implements RequestHandler<Person, Person> {

    //serverless.lambda.example.ExampleHandler::handleRequest

    private static final Logger LOGGER = Logger.getLogger(ExampleHandler.class);

    public Person handleRequest(Person person, Context context) {

        person.setFirstName(person.getFirstName() + " Inside Lambda Handler");
        person.setLastName(person.getLastName() + " Inside Lambda Handler");

        LOGGER.info("Sending a message to AWS CloudWatch");

        return person;
    }
}
