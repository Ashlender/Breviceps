package com.bot.telegram.commands;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import java.util.ArrayList;
import java.util.List;

public class BotButtons {
    public static InlineKeyboardMarkup keyboardMarkup(){

        //todo добавить кнопки и дополнительную клавитатуру


        InlineKeyboardMarkup markupKeyboard = new InlineKeyboardMarkup();
        // список строк
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        //  первая строка с кнопкой
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Кнопка 1");
        button1.setCallbackData("button1");
        row1.add(button1);

        // вторая строка с кнопкой
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Кнопка 2");
        button2.setCallbackData("button2");
        row2.add(button2);

        keyboard.add(row1);
        keyboard.add(row2);

        // созданные строки
        markupKeyboard.setKeyboard(keyboard);
        return markupKeyboard;
    }
}
