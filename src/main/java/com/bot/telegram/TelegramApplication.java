package com.bot.telegram;

import com.bot.telegram.commands.BotCommands;
import com.bot.telegram.commands.BotInfo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class TelegramApplication {

    public static void main(String[] args){
        try {
            BotInfo bot = new BotInfo();
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new BotInfo());
            //bot.init();

        }catch(TelegramApiException e){
        e.printStackTrace();


        }
        System.out.println("keep working... ");
    }
}
