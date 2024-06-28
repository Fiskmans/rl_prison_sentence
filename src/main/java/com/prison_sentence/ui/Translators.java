package com.prison_sentence.ui;

import com.prison_sentence.enums.PrisonType;
import net.runelite.api.ItemID;

public class Translators {

    public static int IconFromPrisonType(PrisonType aPrisonType)
    {
        switch (aPrisonType)
        {
            case GAUNTLET:          return ItemID.YOUNGLLEF;
            case CORRUPTED_GAUNTLET: return ItemID.CORRUPTED_YOUNGLLEF;
            case CHAMBERS_OF_XERIC:   return ItemID.OLMLET;
            //case THEATRE_OF_BLOOD:    return ItemID.LIL_ZIK;
            //case TOOMBS_OF_AMASCUT:   return ItemID.TUMEKENS_GUARDIAN;

            default:                return ItemID.CABBAGE;
        }
    }

    public static Integer VarpIdFromPrisonType(PrisonType aPrisonType)
    {
        switch (aPrisonType)
        {
            case GAUNTLET:            return 2353;
            case CORRUPTED_GAUNTLET:  return 2354;
            case CHAMBERS_OF_XERIC:   return 1532;
            //case THEATRE_OF_BLOOD:    return -1; // TODO
            //case TOOMBS_OF_AMASCUT:   return -1; // TODO

            default:                return -1;
        }
    }
}
