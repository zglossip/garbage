package com.zachglossip.unitconverter.domain.subtype;

import com.zachglossip.unitconverter.domain.UnitType;

import java.math.BigDecimal;

public enum VolumeUnitSubType implements UnitSubType{
  CUBIC_INCH(getCubedLength(LengthUnitSubType.INCH)),
  CUBIC_FOOT(getCubedLength(LengthUnitSubType.FOOT)),
  CUBIC_YARD(getCubedLength(LengthUnitSubType.YARD)),
  CUBIC_MILE(getCubedLength(LengthUnitSubType.MILE)),
  CUBIC_MILLIMETER(getCubedLength(LengthUnitSubType.MILLIMETER)),
  CUBIC_CENTIMETER(getCubedLength(LengthUnitSubType.CENTIMETER)),
  CUBIC_METER(getCubedLength(LengthUnitSubType.METER)),
  CUBIC_KILOMETER(getCubedLength(LengthUnitSubType.KILOMETER)),
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

  private static BigDecimal getCubedLength(LengthUnitSubType lengthUnitSubType) {
    BigDecimal unitConversionRate = LengthUnitSubType.FOOT.getConversionRate();
    return lengthUnitSubType.getConversionRate().multiply(unitConversionRate).pow(3);
  }
}
