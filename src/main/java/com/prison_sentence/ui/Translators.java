package com.prison_sentence.ui;

import com.prison_sentence.enums.PrisonType;
import com.prison_sentence.enums.TimePeriod;
import net.runelite.api.gameval.ItemID;
import net.runelite.api.gameval.VarPlayerID;

public class Translators {

    public static int IconFromPrisonType(PrisonType aPrisonType)
    {
        switch (aPrisonType)
        {
            case GAUNTLET:          return ItemID.GAUNTLETPET;
            case CORRUPTED_GAUNTLET: return ItemID.GAUNTLETPET_CORRUPT;
            case CHAMBERS_OF_XERIC:   return ItemID.OLMPET;
            //case THEATRE_OF_BLOOD:    return ItemID.LIL_ZIK;
            //case TOOMBS_OF_AMASCUT:   return ItemID.TUMEKENS_GUARDIAN;
            case MAGGOT_KING:       return ItemID.MAGGOTKINGPET;
            case ROYAL_TITANS:      return ItemID.RTBRANDAPET;
            case VETION:
            case CALVARION:         return ItemID.VETION_PET;
            case VENENATIS:
            case SPINDEL:           return ItemID.VENENATIS_PET;
            case CALLISTO:
            case ARTIO:             return ItemID.CALLISTO_PET;
            case ZULRAH:            return ItemID.SNAKEPET;
            case MAD_ANGEL:         return ItemID.MADANGELPET;

            default:                return ItemID.CABBAGE;
        }
    }

    public static Integer VarpIdFromPrisonType(PrisonType aPrisonType)
    {
        switch (aPrisonType)
        {
            case GAUNTLET:            return VarPlayerID.TOTAL_COMPLETED_GAUNTLET;
            case CORRUPTED_GAUNTLET:  return VarPlayerID.TOTAL_COMPLETED_GAUNTLET_HM;
            case CHAMBERS_OF_XERIC:   return VarPlayerID.TOTAL_COMPLETED_XERICCHAMBERS;
            //case THEATRE_OF_BLOOD:    return -1; // TODO
            //case TOOMBS_OF_AMASCUT:   return -1; // TODO
            case MAGGOT_KING:       return VarPlayerID.TOTAL_MAGGOT_KING_KILLS;
            case ROYAL_TITANS:      return VarPlayerID.TOTAL_ROYAL_TITAN_KILLS;
            case VETION:            return VarPlayerID.TOTAL_VETION_KILLS;
            case CALVARION:         return VarPlayerID.TOTAL_CALVARION_KILLS;
            case VENENATIS:         return VarPlayerID.TOTAL_VENENATIS_KILLS;
            case SPINDEL:           return VarPlayerID.TOTAL_SPINDEL_KILLS;
            case CALLISTO:          return VarPlayerID.TOTAL_CALLISTO_KILLS;
            case ARTIO:             return VarPlayerID.TOTAL_ARTIO_KILLS;
            case ZULRAH:            return VarPlayerID.TOTAL_SNAKEBOSS_KILLS;
            case MAD_ANGEL:         return VarPlayerID.TOTAL_MAD_ANGEL_KILLS;

            default:                return -1;
        }
    }

    public static String FriendlyName(PrisonType aPrisonType)
    {
        switch (aPrisonType)
        {
            case GAUNTLET:              return "Gauntlet";
            case CORRUPTED_GAUNTLET:    return "Corrupted Guantlet";
            case CHAMBERS_OF_XERIC:     return "Chambers of Xeric";
            //case THEATRE_OF_BLOOD:    return -1; // TODO
            //case TOOMBS_OF_AMASCUT:   return -1; // TODO
            case MAGGOT_KING:       return "Maggot King";
            case ROYAL_TITANS:      return "Royal Titans";
            case VETION:            return "Vet'ion";
            case CALVARION:         return "Calvar'ion";
            case VENENATIS:         return "Venenatis";
            case SPINDEL:           return "Spindel";
            case CALLISTO:          return "Callisto";
            case ARTIO:             return "Artio";
            case ZULRAH:            return "Zulrah";
            case MAD_ANGEL:         return "Mad Angel";

            default:                    return "Unkown";
        }
    }

    public static int ChaseItem(PrisonType aPrisonType)
    {
        switch (aPrisonType)
        {
            case GAUNTLET:              return ItemID.PRIF_WEAPON_SEED_ENHANCED;
            case CORRUPTED_GAUNTLET:    return ItemID.PRIF_WEAPON_SEED_ENHANCED;
            case CHAMBERS_OF_XERIC:     return -1;
            //case THEATRE_OF_BLOOD:    return -1; // TODO
            //case TOOMBS_OF_AMASCUT:   return -1; // TODO

            default:                    return -1;
        }
    }

    public static String FriendlyName(TimePeriod aTimePeriod)
    {
        switch (aTimePeriod)
        {
            case DAILY:     return "daily";
            case WEEKLY:    return "weekly";
            case MONTHLY:   return "monthly";

            default:        return "Unkown";
        }
    }
}
