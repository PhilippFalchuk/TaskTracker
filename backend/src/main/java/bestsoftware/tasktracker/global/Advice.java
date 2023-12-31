package bestsoftware.tasktracker.global;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;

@ControllerAdvice
public class Advice {
    @ResponseBody
    @ExceptionHandler(DataNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    Map<String, String> handler(DataNotFoundException ex) {
        return Map.of("message", ex.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(IllegalActionException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    Map<String, String> handler(IllegalActionException ex) {
        return Map.of("message", ex.getMessage());
    }
}
