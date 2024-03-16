package com.bot.telegram;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@Component
public class BotInfo extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update){

        if(update.hasMessage() && update.getMessage().hasText()){
            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());
            try {
                execute(message);
            }catch (TelegramApiException e){
                e.printStackTrace();

            }
        }
    }
    @Override
    public String getBotUsername(){
        return "Breviceps_bot";
    }
    @Override
    public String getBotToken(){
        return "6788396275:AAG1mJIKmZFUcypWL2iOtHnBz-4K21RBZjo";
    }
}
