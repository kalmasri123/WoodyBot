package Command.SlashCommands;

import Command.ISlashCommand;
import net.dv8tion.jda.api.events.interaction.ButtonClickEvent;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EightBall implements ISlashCommand {
    @Override
    public void run(SlashCommandEvent event) throws Exception {
        Random rng = new Random();
        int roll = rng.nextInt(15);
        String[] answers = new String[]{"It is certain", "Without a doubt", "You may rely on it", "Yes definitely", "It is decidedly so",
                "As I see it, yes","Most likely", "Yes", "Outlook good", "Signs point to yes", "Reply hazy try again", "Better not tell you now",
                "Ask again later", "Cannot predict now", "Concentrate and ask again", "Don’t count on it", "Outlook not so good",
                "My sources say no", "Very doubtful", "My reply is no"};

        event.reply("\uD83D\uDE4B: " + event.getOption("question").getAsString() +"\n\uD83C\uDFB1: " + answers[roll]).queue();
    }

    @Override
    public void run(ButtonClickEvent event) throws Exception {}

    @Override
    public List<String> buttons() {
        return Collections.emptyList();
    }

    @Override
    public String commandName() {
        return "eightball";
    }
}