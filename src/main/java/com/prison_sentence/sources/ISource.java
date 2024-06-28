package com.prison_sentence.sources;

import com.prison_sentence.enums.PrisonType;

public interface ISource {

    boolean IsReady();
    int GetAmountAtStartOfPeriod(PrisonType aType, int aTarget);
}
