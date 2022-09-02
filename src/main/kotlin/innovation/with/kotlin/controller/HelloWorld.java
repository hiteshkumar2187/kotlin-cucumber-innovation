package innovation.with.kotlin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HelloWorld {

    public ResponseEntity<String> testing() {
        return new ResponseEntity<>("hello from kotlin", HttpStatus.OK);
    }
}
