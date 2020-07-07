package com.itga9510.diceroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DiceRollerController {

    @GetMapping("/{nombresdes}/{facesdes}")
    public Dices index(@PathVariable int nombresdes, @PathVariable int facesdes) {
        log.info("appel : /" + nombresdes + "/" + facesdes);
        return DiceRollerService.diceRoller(nombresdes, facesdes);
    }

}