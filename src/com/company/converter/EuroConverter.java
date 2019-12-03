package com.company.converter;

import com.company.currency.*;

public class EuroConverter implements Converter {
    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currency;
        if (unit instanceof Dram){
            currency = 0.0019 * unit.getCurrency();
        }else if (unit instanceof Dollar){
            currency = 0.9 * unit.getCurrency();
        }else if (unit instanceof Ruble){
            currency = 0.014 * unit.getCurrency();
        }else if (unit instanceof Pound){
            currency = 1.17 * unit.getCurrency();
        }else{
            currency=unit.getCurrency();
        }
        Euro euro = new Euro(currency);

        return euro;
    }
}
