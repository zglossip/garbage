package com.zachglossip.unitconverter.domain.subtype;

import com.zachglossip.unitconverter.domain.UnitType;

import java.math.BigDecimal;

public enum VolumeUnitSubType implements UnitSubType{
  CUBIC_INCH(new BigDecimal("0.000578704")),
  CUBIC_FOOT(new BigDecimal("1")),
  CUBIC_YARD(new BigDecimal("")),
  CUBIC_MILE(new BigDecimal("")),
  CUBIC_MILLIMETER(new BigDecimal("")),
  CUBIC_CENTIMETER(new BigDecimal("")),
  CUBIC_METER(new BigDecimal("35.3147")),
  CUBIC_KILOMETER(new BigDecimal("")),
  GALLON(new BigDecimal("0.133680624")),
  QUART(new BigDecimal("0.033420156")),
  PINT(new BigDecimal("0.016710078")),
  CUP(new BigDecimal("0.0084755243526235")),
  FLUID_OUNCE(new BigDecimal("0.00104438")),
  TABLESPOON(new BigDecimal("0.00052219")),
  TEASPOON(new BigDecimal("0.000174063")),
  LITER(new BigDecimal("0.0353147")),
  MILLILITER(new BigDecimal("3.5315E-5"));

  private final BigDecimal conversionRate;

  VolumeUnitSubType(BigDecimal conversionRate) {
    this.conversionRate = conversionRate;
  }

  public UnitType getType() {
    return UnitType.VOLUME;
  }

  public BigDecimal getConversionRate() {
    return this.conversionRate;
  }
}
