package com.bot.telegram.commands;

import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import java.util.List;

public interface BotCommands {
    List<BotCommand> LIST_OF_COMMAND = List.of(
            new BotCommand("/Start","Запсук бота"),
            new BotCommand("/info","О проекте..."),
            new BotCommand("/donate","Мне на кофе")
    );
}
