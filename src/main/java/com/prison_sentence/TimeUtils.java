package com.prison_sentence;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TimeUtils
{
    public static int DaysSince(Instant aInstant)
    {
        try
        {
            return (int)ChronoUnit.DAYS.between(aInstant, Instant.now());
        }
        catch (Exception e)
        {
            return  0;
        }
    }
    public static int WeeksSince(Instant aInstant)
    {
        try
        {
            return (int)ChronoUnit.WEEKS.between(aInstant, Instant.now());
        }
        catch (Exception e)
        {
            return  0;
        }
    }
    public static int MonthsSince(Instant aInstant)
    {
        try
        {
            return (int)ChronoUnit.MONTHS.between(aInstant, Instant.now());
        }
        catch (Exception e)
        {
            return  0;
        }
    }
}
