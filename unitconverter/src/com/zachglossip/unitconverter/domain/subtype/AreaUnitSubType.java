package com.zachglossip.unitconverter.domain.subtype;

import com.zachglossip.unitconverter.domain.UnitType;

import java.math.BigDecimal;

public enum AreaUnitSubType implements UnitSubType{
  SQUARE_INCH(getSquaredLength(LengthUnitSubType.INCH)),
  SQUARE_FOOT(getSquaredLength(LengthUnitSubType.FOOT)),
  SQUARE_YARD(getSquaredLength(LengthUnitSubType.YARD)),
  SQUARE_MILE(getSquaredLength(LengthUnitSubType.MILE)),
  SQUARE_MILLIMETER(getSquaredLength(LengthUnitSubType.MILLIMETER)),
  SQUARE_CENTIMETER(getSquaredLength(LengthUnitSubType.CENTIMETER)),
  SQUARE_METER(getSquaredLength(LengthUnitSubType.METER)),
  SQUARE_KILOMETER(getSquaredLength(LengthUnitSubType.KILOMETER)),
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

  private static BigDecimal getSquaredLength(LengthUnitSubType lengthUnitSubType) {
    BigDecimal unitConversionRate = LengthUnitSubType.FOOT.getConversionRate();
    return lengthUnitSubType.getConversionRate().multiply(unitConversionRate).pow(2);
  }
}
