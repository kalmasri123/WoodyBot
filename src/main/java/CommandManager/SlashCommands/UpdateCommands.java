package CommandManager.SlashCommands;

import java.util.Collections;
import java.util.List;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.SubcommandGroupData;
import net.dv8tion.jda.api.interactions.commands.build.SubcommandData;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent;
import CommandManager.ISlashCommand;

public class UpdateCommands implements ISlashCommand
{
    @Override
    public void run(final SelectMenuInteractionEvent event) throws Exception {
    }
    
    @Override
    public void run(final SlashCommandInteractionEvent event) throws Exception {
        if (event.getMember().getId().equals("225772174336720896")) {
            event.getJDA().updateCommands().queue();
            event.getJDA().getGuildById("931663140687585290").updateCommands().addCommands(Commands.slash("rphroles", "rphroles")).queue();
            event.getJDA().getGuildById("433825343485247499").updateCommands().addCommands(Commands.slash("update", "update stuff ;)")).queue();
            event.getJDA().updateCommands().addCommands(
                    Commands.slash("updatecommands", "update the commands list"),
                    Commands.slash("ping", "Ping the bot"),
                    Commands.slash("stats", "Get Woody's status"),
                    Commands.slash("avatar", "Get user avatar")
                            .addOption(OptionType.USER, "user", "user to get avatar from", false),
                    Commands.slash("whois", "Get information about user")
                            .addOption(OptionType.USER, "user", "user to get information about", false),
                    Commands.slash("purge", "bulk delete")
                            .addOption(OptionType.INTEGER, "num_messages", "number of messages to delete 1-100", true),
                    Commands.slash("menus", "Role Menus")
                            .addSubcommands(
                                    new SubcommandData("yearroles", "create a year role menu"),
                                    new SubcommandData("pronounroles", "create a pronoun role menu"),
                                    new SubcommandData("collegeroles", "create a college role menu"),
                                    new SubcommandData("concentration", "create a concentration role menu"),
                                    new SubcommandData("platforms", "create a gaming platform role menu"),
                                    new SubcommandData("living", "create a living situation role menu")
                            ),
                    Commands.slash("define", "Get definition of word")
                            .addOption(
                                    OptionType.STRING, "word_to_define", "A word to define", true
                            ),
                    Commands.slash("eightball", "Shake the 8-ball")
                            .addOption(
                                    OptionType.STRING, "question", "Ask the 8-ball a question.", true
                            ),
                    Commands.slash("shutdown", "shutdown the bot"),
                    Commands.slash("restart", "restart the bot"),
                    Commands.slash("topconcentrations", "Get concentrations leaderboard"),
                    Commands.slash("topstars", "Get starfroot leaderboard"),
                    Commands.slash("starcheck", "Check the number of stars a user has")
                            .addOption(
                                    OptionType.USER, "user", "The user to check", false
                            ),
                    Commands.slash("settings", "Server Settings")
                            .addSubcommandGroups(
                                    new SubcommandGroupData("set", "Set command")
                                            .addSubcommands(
                                                    new SubcommandData("star", "Set the star emote"),
                                                    new SubcommandData("antistar", "Set the anti-star emote"),
                                                    new SubcommandData("joinlogchannel", "Set the join log channel"),
                                                    new SubcommandData("welcomechannel", "Set the welcome channel")
                                            ),
                                    new SubcommandGroupData("toggle", "Toggle command")
                                            .addSubcommands(
                                                    new SubcommandData("joinleavelogs", "Toggle join leave logging"),
                                                    new SubcommandData("welcomechannel", "Toggle welcome channel"),
                                                    new SubcommandData("starboard", "Toggle starboard"))
                            ),
                    Commands.slash("uncc", "Role Menus")
                            .addSubcommands(new SubcommandData("sovi", "Get the occupancy of sovi"),
                                    new SubcommandData("crown", "Get the occupancy of crown"),
                                    new SubcommandData("parking", "Get the occupancy of parking")
                            )
            ).queue();

            event.reply("Updating Commands...").queue();
        }
        else {
            event.reply("This is an owner only command!").queue();
        }
    }
    
    @Override
    public void run(final ButtonInteractionEvent event) throws Exception {
    }
    
    @Override
    public List<String> buttons() {
        return Collections.emptyList();
    }
    
    @Override
    public String commandName() {
        return "updatecommands";
    }
    
    @Override
    public Boolean enabled() {
        return true;
    }
    
    @Override
    public String description() {
        return null;
    }
}
