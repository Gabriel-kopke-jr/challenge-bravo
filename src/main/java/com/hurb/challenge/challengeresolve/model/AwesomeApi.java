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
}
