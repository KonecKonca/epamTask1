package com.epam.kozitski.controller.rest;

import com.epam.kozitski.domain.Country;
import com.epam.kozitski.domain.util.Countries;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country/")
public class CountryRestController {

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Country> getCountry(@PathVariable("id") Long id){
        Country country = Countries.createDefaultCountry();

        return new ResponseEntity<>(country, HttpStatus.OK);
    }

}
