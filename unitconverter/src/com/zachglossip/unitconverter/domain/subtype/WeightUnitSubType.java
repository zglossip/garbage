package com.zachglossip.unitconverter.domain.subtype;

import com.zachglossip.unitconverter.domain.UnitType;

import java.math.BigDecimal;

public enum WeightUnitSubType implements UnitSubType{
  OUNCE(new BigDecimal("1")),
  POUND(new BigDecimal("16")),
  STONE(new BigDecimal("224")),
  TON(new BigDecimal("32000")),
  MICROGRAM(new BigDecimal("3.5274E-8")),
  MILIGRAM(new BigDecimal("3.5274E-5")),
  GRAM(new BigDecimal("0.035274")),
  KILOGRAM(new BigDecimal("35.274")),
  METRIC_TON(new BigDecimal("35274"));

  private final BigDecimal conversionRate;

  WeightUnitSubType(BigDecimal conversionRate) {
    this.conversionRate = conversionRate;
  }

  public UnitType getType() {
    return UnitType.WEIGHT;
  }

  public BigDecimal getConversionRate() {
    return conversionRate;
  }
}
