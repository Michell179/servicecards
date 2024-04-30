package com.michell.cashcard;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcards/bank")
public class BankController {

    @GetMapping("/{requestedId}")
    private ResponseEntity<Bank> findById(@PathVariable Long requestedId) {
        if (requestedId.equals(26L)){
            Bank bank = new Bank(requestedId, "Hellen's Bank ");
            return ResponseEntity.ok(bank);
        }else if (requestedId.equals(25L)) {
            Bank bank = new Bank(requestedId, "Michell White Bank ");
            return ResponseEntity.ok(bank);
        }else if (requestedId.equals(2601L)){
            Bank bank = new Bank(requestedId, "Common Bank or Password ?");
            return ResponseEntity.ok(bank);
        } else {
            Bank bank = new Bank(requestedId, "default_bank");
            return ResponseEntity.ok(bank);
        }
    }


}
