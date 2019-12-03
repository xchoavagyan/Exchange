package com.company.converter;

import com.company.currency.*;

public class RubleConverter implements Converter {
    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currency;
        if (unit instanceof Dram){
            currency = 0.14 * unit.getCurrency();
        }else if (unit instanceof Euro){
            currency = 71 * unit.getCurrency();
        }else if (unit instanceof Dollar){
            currency = 64 * unit.getCurrency();
        }else if (unit instanceof Pound){
            currency = 83 * unit.getCurrency();
        }else{
            currency=unit.getCurrency();
        }
        Ruble ruble = new Ruble(currency);

        return ruble;
    }
}
