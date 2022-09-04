package com.zachglossip.unitconverter.domain.subtype;

import com.zachglossip.unitconverter.domain.UnitType;

import java.math.BigDecimal;

public enum LengthUnitSubType implements UnitSubType {
  INCH(new BigDecimal(1)),
  FOOT(new BigDecimal(12)),
  YARD(new BigDecimal(36)),
  MILE(new BigDecimal(63360)),
  MILLIMETER(new BigDecimal("0.0393701")),
  CENTIMETER(new BigDecimal("0.393701")),
  METER(new BigDecimal("39.3701")),
  KILOMETER(new BigDecimal("39370.1"));

  private final BigDecimal conversionRate;

  LengthUnitSubType(BigDecimal conversionRate) {
    this.conversionRate = conversionRate;
  }

  public UnitType getType() {
    return UnitType.LENGTH;
  }

  public BigDecimal getConversionRate() {
    return conversionRate;
  }
}
