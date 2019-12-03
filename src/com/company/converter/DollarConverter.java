package com.company.converter;

import com.company.currency.*;

public class DollarConverter implements Converter {

    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currency;
        if (unit instanceof Dram){
            currency = 0.0021 * unit.getCurrency();
        }else if (unit instanceof Euro){
            currency = 1.11 * unit.getCurrency();
        }else if (unit instanceof Ruble){
            currency = 0.016 * unit.getCurrency();
        }else if (unit instanceof Pound){
            currency = 1.30 * unit.getCurrency();
        }else{
            currency=unit.getCurrency();
        }

        Dollar dollar = new Dollar(currency);

        return dollar;
    }
}
