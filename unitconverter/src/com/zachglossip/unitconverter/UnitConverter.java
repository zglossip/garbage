package com.zachglossip.unitconverter;

import com.zachglossip.unitconverter.domain.subtype.AreaUnitSubType;
import com.zachglossip.unitconverter.domain.subtype.LengthUnitSubType;
import com.zachglossip.unitconverter.domain.subtype.UnitSubType;
import com.zachglossip.unitconverter.service.UnitConverterService;

import java.math.BigDecimal;
import java.util.Objects;

public class UnitConverter {

  public static void main(String[] args) {
    //INSERT VALUES TO CONVERT HERE
    UnitSubType original = LengthUnitSubType.FOOT;
    UnitSubType newType = AreaUnitSubType.SQUARE_MILLIMETER;
    BigDecimal value = new BigDecimal("1");

    BigDecimal result = UnitConverterService.convert(original, newType, value);

    if(Objects.isNull(result) ){
      System.out.println("Units must be same type (length, area, volume, or weight).");
      return;
    }

    System.out.println(UnitConverterService.convert(original, newType, value));
  }

}
