package com.company.converter;

import com.company.currency.*;

public class PoundConverter implements Converter {
    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currency;
        if (unit instanceof Dram){
            currency = 0.0016 * unit.getCurrency();
        }else if (unit instanceof Euro){
            currency = 0.85 * unit.getCurrency();
        }else if (unit instanceof Ruble){
            currency = 0.012 * unit.getCurrency();
        }else if (unit instanceof Dollar){
            currency = 0.77 * unit.getCurrency();
        }else{
            currency=unit.getCurrency();
        }
        Pound pound = new Pound(currency);

        return pound;
    }
}
