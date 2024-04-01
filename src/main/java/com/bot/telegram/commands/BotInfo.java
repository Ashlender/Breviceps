package com.bot.telegram.commands;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class BotInfo extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            long chatId = update.getMessage().getChatId();
            String receivedMessage = update.getMessage().getText();

            // Обработка команды /start
            if (receivedMessage.equals("/start")) {
                BotSend.sendMessage(chatId, "тестовое сообещние из start",this);
            }
            // Обработка команды /help
            else if (receivedMessage.equals("/help")) {
                BotSend.sendMessage(chatId, """
                         список доступных команд:
                        /start - начать взаимодействие с ботом
                        /help - получить помощь""",this);
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
