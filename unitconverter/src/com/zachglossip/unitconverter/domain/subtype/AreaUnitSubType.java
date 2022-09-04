package com.zachglossip.unitconverter.domain.subtype;

import com.zachglossip.unitconverter.domain.UnitType;

import java.math.BigDecimal;

public enum AreaUnitSubType implements UnitSubType{
  SQUARE_INCH(new BigDecimal("0.00694444")),
  SQUARE_FOOT(new BigDecimal("1")),
  SQUARE_YARD(new BigDecimal("9")),
  SQUARE_MILE(new BigDecimal("2.788E+7")),
  SQUARE_MILLIMETER(new BigDecimal("1.07639e-5")),
  SQUARE_CENTIMETER(new BigDecimal("0.00107639")),
  SQUARE_METER(new BigDecimal("10.7639")),
  SQUARE_KILOMETER(new BigDecimal("1.076E+7")),
  ACRE(new BigDecimal("43560")),
  HECTACRE(new BigDecimal("107639"));

  private final BigDecimal conversionRate;

  AreaUnitSubType(BigDecimal conversionRate) {
    this.conversionRate = conversionRate;
  }

  public UnitType getType() {
    return UnitType.AREA;
  }

  public BigDecimal getConversionRate() {
    return conversionRate;
  }
}
