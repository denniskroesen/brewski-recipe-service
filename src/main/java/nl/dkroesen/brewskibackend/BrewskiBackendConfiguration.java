package nl.dkroesen.brewskibackend;

import nl.dkroesen.brewskibackend.generated.GeneratedBrewskiBackendConfiguration;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * The spring configuration file
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dkroesen
 */
@SpringBootConfiguration
public class BrewskiBackendConfiguration extends GeneratedBrewskiBackendConfiguration {

    protected final static String URL_PROPERTY = "FLYWAY_URL";
    protected final static String USERNAME_PROPERTY = "FLYWAY_USER";
    protected final static String PASSWORD_PROPERTY = "FLYWAY_PASSWORD";


}