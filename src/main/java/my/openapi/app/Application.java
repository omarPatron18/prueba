package my.openapi.app;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
        info = @Info(
                title = "API Saludo",
                version = "1.0",
                description = "My Primer API Micronaut",
                license = @License(name = "Apache 2.0", url = "http://pquinonezb.github.io"),
                contact = @Contact(url = "http://pquinonezb.github.io", name = "Pedro Quinonez", email = "pedro.quinonez@gmail.com")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}