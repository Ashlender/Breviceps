package com.bot.telegram.commands;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;


public class BotButtons {
    public static SendMessage botKeyboard(long chat_id){

        SendMessage message = new SendMessage();
        message.setChatId(chat_id);
        message.setText("Информация о кнопках");

        //лист кнопок
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();

        List<InlineKeyboardButton> rowsInFirstLine = new ArrayList<>();
        InlineKeyboardButton button  = new InlineKeyboardButton();
        button.setText("кнопка 1");






        return message;
    }
}
