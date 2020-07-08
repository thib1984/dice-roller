package com.itga9510.diceroller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DiceRollerController {

    @GetMapping("/{nombresdes:[\\d]+}/{facesdes:[\\d]+}")
    public ResponseEntity<Object> index(@PathVariable int nombresdes, @PathVariable int facesdes) {
        log.info("appel : /" + nombresdes + "/" + facesdes);
        if (nombresdes <= 0 || nombresdes > 1000 || facesdes <= 0 || facesdes > 1000) {
            ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, "nb de des ou de faces incorrect (1 a 1000 des, 1 a 1000 faces)", "");
            return new ResponseEntity<Object>(apiError, new HttpHeaders(), apiError.getStatus());
        }
        return new ResponseEntity<Object>(DiceRollerService.diceRoller(nombresdes, facesdes), new HttpHeaders(), HttpStatus.OK);
    }

}