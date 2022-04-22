package pro.sky.storehomework;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Неверный ID")
public class WrongIDExeption extends RuntimeException {
    public WrongIDExeption() {
        super();
    }
}
