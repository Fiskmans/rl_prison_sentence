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

        setTooltip("Time to get back to prison");
    }

    @Override
    public String getText()
    {
        return CompactNum(mySentence.GetProgress()) + "/" + CompactNum(mySentence.GetTarget());
    }

    @Override
    public Color getTextColor()
    {
        return Color.white;
    }

    String CompactNum(int aNumber)
    {
        return Integer.toString(aNumber);
    }

}
