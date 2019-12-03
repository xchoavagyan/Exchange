package com.company.converter;

import com.company.currency.AbstractCurrencyUnit;

public interface Converter {
    AbstractCurrencyUnit convert(AbstractCurrencyUnit unit);
}
