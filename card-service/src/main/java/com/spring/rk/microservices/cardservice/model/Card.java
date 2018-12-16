package com.spring.rk.microservices.cardservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@JsonIgnoreProperties(ignoreUnknown=true)
@Getter
@Setter
public class Card {
    private Long id;
    private String cardHolderName;
    private String pan;
    private String validDate;

    public Card(Long id, String cardHolderName, String pan, String validDate) {
        this.id = id;
        this.cardHolderName = cardHolderName;
        this.pan = pan;
        this.validDate = validDate;
    }
    public Card(String cardHolderName, String pan, String validDate) {
        this.cardHolderName = cardHolderName;
        this.pan = pan;
        this.validDate = validDate;
    }
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}