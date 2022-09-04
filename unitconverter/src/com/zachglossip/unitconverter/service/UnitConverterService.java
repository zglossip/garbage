package com.zachglossip.unitconverter.service;

import com.zachglossip.unitconverter.domain.subtype.UnitSubType;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UnitConverterService {

  public static BigDecimal convert(final UnitSubType originalUnit, final UnitSubType newUnit, final BigDecimal value) {
    if(!originalUnit.getType().equals(newUnit.getType())) {
      return null;
    }

    BigDecimal originalBaseValue = originalUnit.getConversionRate().multiply(value);

    return originalBaseValue.divide(newUnit.getConversionRate(), 10, RoundingMode.HALF_UP);
  }

}
