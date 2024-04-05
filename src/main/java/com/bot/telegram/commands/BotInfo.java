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

            //todo сделать кейс для некорректного воода и указания юзеру что нужно ввести для начала
            switch (receivedMessage){
                case "/start":
                    BotSend.sendMessage(chatId, "Привет я шифрую сообщения и расшифровываю их, выбери из списка что я буду делать, если есть еще вопросы напиши команду /help",this);
                    break;

                case "/encrypt":
                    BotSend.sendMessage(chatId, "Вы выбрали функцию шифрования, пожалуйста выбирите алгоритм и отправьте сообщение или файл для шифровки",this);

                    break;

                case "/decrypt":
                    BotSend.sendMessage(chatId, "Вы выбрали функцию расшифровки, пожалуйста выбирите алгоритм и отправьте сообщение или файл для шифровки",this);

                    break;

                case "/donate":
                    BotSend.sendMessage(chatId, "Благодарность разработчику <3",this);

                    break;

                case "/report":
                    BotSend.sendMessage(chatId, "Сообщение об ошибке или предложен",this);

                    break;

                case "/help":
                    BotSend.sendMessage(chatId, """
                         Список доступных команд, в будущем будет расширен:
                        /start - Начать общение с ботом.
                        /encrypt - Зишифровать сообщение или файл.
                        /decrypt - Расшифровать сообещние или файл.
                        /donate - На кофе для разработчика.
                        /report - Сообщение об ошибке.""",this);
                    break;
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
