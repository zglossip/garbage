package com.zachglossip.unitconverter.domain.subtype;

import com.zachglossip.unitconverter.domain.UnitType;

import java.math.BigDecimal;

public interface UnitSubType {

  public UnitType getType();

  public BigDecimal getConversionRate();

}
