package Factories;

import models.BotDifficultyLevel;
import strategies.botPlayingStrategy.BotPlayingStrategy;
import strategies.botPlayingStrategy.EasyBotWinningStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getStrategy(BotDifficultyLevel difficultyLevel) {

        if (difficultyLevel == BotDifficultyLevel.EASY) {
            return new EasyBotWinningStrategy();
        }
//        if (difficultyLevel == BotDifficultyLevel.MEDIUM) {
//            //
//        }
//        if (difficultyLevel == BotDifficultyLevel.HARD) {
//            //
//        }
        return new EasyBotWinningStrategy();
    }
}
