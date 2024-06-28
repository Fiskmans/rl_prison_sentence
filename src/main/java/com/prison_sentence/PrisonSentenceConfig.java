package com.prison_sentence;

import com.prison_sentence.enums.PrisonType;
import com.prison_sentence.enums.TimePeriod;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

import java.time.Instant;

@ConfigGroup("prison_sentence")
public interface PrisonSentenceConfig extends Config
{
	@ConfigItem(
			keyName = "prison_type",
			name = "Prison type",
			description = "The type of prison you are in"
	)
	default PrisonType dayPrisonType()
	{
		return PrisonType.GAUNTLET;
	}

	@ConfigItem(
			keyName = "sentence_amount",
			name = "Amount per period",
			description = "The amount to do per period"
	)
	default int amount() { return 1; }

	@ConfigItem(
			keyName = "sentence_period",
			name = "Period",
			description = "How long a period is"
	)
	default TimePeriod period() { return TimePeriod.DAILY; }

	@ConfigItem(
			keyName = "start_time",
			name = "Start time",
			description = "The time when you started your sentence"
	)
	default String startTime() { return Instant.now().toString(); }

	@ConfigItem(
			keyName = "start_amount",
			name = "start amount",
			description = "The amount you had when your sentence started"
	)
	default int startAmount() { return 0; }
}
