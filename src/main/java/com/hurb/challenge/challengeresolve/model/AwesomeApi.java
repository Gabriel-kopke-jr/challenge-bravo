package com.hurb.challenge.challengeresolve.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AwesomeApi {
    private String code;
    private String codein;
    private BigDecimal high;
    private BigDecimal low;

    public String generateKey() {
        return getCode() + "-" + getCodein();
    }

    public String generateInvertedKey() {
        return getCodein() + "-" + getCode();
    }

    public BigDecimal generateValueKey() {
        return getHigh().add(getLow()).multiply(BigDecimal.valueOf(0.5));
    }

    public BigDecimal generateValueInvertedKey() {
        return generateValueKey().pow(-1);
    }
}
