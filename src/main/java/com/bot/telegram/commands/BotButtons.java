package com.bot.telegram.commands;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import java.util.ArrayList;
import java.util.List;


public class BotButtons {
    public static InlineKeyboardMarkup keyboardMarkup(){
        List<List<InlineKeyboardButton>> keyboardButton = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        //row.add(new InlineKeyboardButton().setText("Button One").setCallbackData("button1"));
       // row.add(new InlineKeyboardButton().setText("Кнопка 2").setCallbackData("button2"));
        keyboardButton.add(row);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setKeyboard(keyboardButton);

        return markup;
    }
}
