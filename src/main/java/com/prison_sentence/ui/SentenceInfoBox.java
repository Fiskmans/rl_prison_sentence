package com.prison_sentence.ui;

import com.prison_sentence.PrisonSentencePlugin;
import com.prison_sentence.Sentence;
import com.prison_sentence.enums.PrisonType;
import com.prison_sentence.sources.Current;
import com.prison_sentence.sources.ISource;
import net.runelite.client.ui.overlay.infobox.InfoBox;

import java.awt.*;

public class SentenceInfoBox extends InfoBox {

    Sentence mySentence;

    public SentenceInfoBox(Sentence aSentence, PrisonType aPrisonType, PrisonSentencePlugin aPlugin)
    {
        super(aPlugin.itemManager.getImage(Translators.IconFromPrisonType(aPrisonType)), aPlugin);

        mySentence = aSentence;

        setTooltip(mySentence.ToTooltip());
    }

    @Override
    public String getText()
    {
        if (mySentence.GetProgress() >= 0)
        {
            return mySentence.GetProgress() + "/" + mySentence.GetTarget();
        }
        else
        {
            return "0/" + (mySentence.GetTarget() - mySentence.GetProgress());
        }
    }

    @Override
    public Color getTextColor()
    {
        return Color.white;
    }

}
