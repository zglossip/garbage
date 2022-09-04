package com.zachglossip.unitconverter;

import static com.zachglossip.unitconverter.domain.subtype.AreaUnitSubType.*;
import static com.zachglossip.unitconverter.domain.subtype.LengthUnitSubType.*;
import com.zachglossip.unitconverter.domain.subtype.UnitSubType;
import static com.zachglossip.unitconverter.domain.subtype.VolumeUnitSubType.*;
import com.zachglossip.unitconverter.service.UnitConverterService;

import java.math.BigDecimal;
import java.util.Objects;

public class UnitConverter {

  public static void main(String[] args) {
    //INSERT VALUES TO CONVERT HERE
    UnitSubType original = CUBIC_YARD;
    UnitSubType newType = CUBIC_FOOT;
    BigDecimal value = new BigDecimal("1");

    BigDecimal result = UnitConverterService.convert(original, newType, value);

    if(Objects.isNull(result) ){
      System.out.println("Units must be same type (length, area, volume, or weight).");
      return;
    }

    System.out.println(result);
  }

}
