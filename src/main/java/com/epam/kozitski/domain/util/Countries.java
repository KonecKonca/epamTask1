package com.epam.kozitski.domain.util;

import com.epam.kozitski.domain.Country;

public class Countries {
    private static final long DEFAULT_COUNTRY_ID = 1;
    private static final String DEFAULT_COUNTRY_NAME = "Belarus";

    public static Country createDefaultCountry(){
        return new Country(DEFAULT_COUNTRY_ID, DEFAULT_COUNTRY_NAME);
    }

}
