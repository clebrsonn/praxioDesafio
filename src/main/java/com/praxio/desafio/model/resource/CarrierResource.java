package com.praxio.desafio.model.resource;

import com.praxio.desafio.model.Carrier;
import com.praxio.desafio.service.CarrierService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/carrier")
public class CarrierResource {

    private final CarrierService carrierService;

    private final ApplicationEventPublisher publisher;

    public CarrierResource(CarrierService carrierService, ApplicationEventPublisher publisher) {
        this.carrierService = carrierService;
        this.publisher = publisher;
    }


    @PostMapping
    public ResponseEntity<Carrier> saveCarrier(@Valid @RequestBody Carrier carrier, HttpServletResponse response) {
        Carrier CarrierSaved = carrierService.save(carrier);
        //publisher.publishEvent(new EventListenerCreated(this, response, CarrierSaved.getId()));
        return ResponseEntity.status(HttpStatus.CREATED).body(CarrierSaved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carrier> update(@PathVariable Long id, @Valid @RequestBody Carrier carrier) {
        Carrier carrierSaved = carrierService.update(id, carrier);
        return ResponseEntity.ok(carrierSaved);
    }
}
