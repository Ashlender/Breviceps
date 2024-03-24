package com.bot.telegram.commands;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;


public class BotButtons {
    public static SendMessage hermitageInlineKeyboardAb (long chat_id){

        SendMessage message = new SendMessage();
        message.setChatId(chat_id);
        message.setText("Информация о кнопках");


        return message;
    }
}
