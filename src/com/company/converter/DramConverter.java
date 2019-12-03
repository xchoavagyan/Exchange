package com.company.converter;

import com.company.currency.*;

public class DramConverter implements Converter {
    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currency;
        if (unit instanceof Dollar){
            currency = 475 * unit.getCurrency();
        }else if (unit instanceof Euro){
            currency = 526 * unit.getCurrency();
        }else if (unit instanceof Ruble){
            currency = 7.4 * unit.getCurrency();
        }else if (unit instanceof Pound){
            currency = 617 * unit.getCurrency();
        }else{
            currency=unit.getCurrency();
        }
        Dram dram = new Dram(currency);

        return dram;
    }
}
