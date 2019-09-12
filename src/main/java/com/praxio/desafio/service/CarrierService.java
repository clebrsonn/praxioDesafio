package com.praxio.desafio.service;

import com.praxio.desafio.model.Carrier;
import com.praxio.desafio.repository.CarrierRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarrierService {

    private final CarrierRepository carrierRepository;

    public CarrierService(CarrierRepository carrierRepository) {
        this.carrierRepository = carrierRepository;
    }

    public Carrier save(Carrier carrier){
        return carrierRepository.save(carrier);
    }


    public Carrier update(Long id, Carrier carrier) {
        Optional<Carrier> carrierSaved = carrierRepository.findById(id);

//        savedUser.ifPresent(user1 -> {
//            BeanUtils.copyProperties(user, user1, "id");
//            userRepository.save(user1);
//
//        });

        if (carrierSaved.isPresent()) {

            //BeanUtils vários métodos úteis, copyproperties serve para copiar os atributos de uma classe para outro
            BeanUtils.copyProperties(carrier, carrierSaved.get(), "id");
            return carrierRepository.save(carrierSaved.get());
        } else {
            throw new EmptyResultDataAccessException(1);
        }

    }

}
