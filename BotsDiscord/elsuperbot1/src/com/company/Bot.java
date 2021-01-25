package com.company;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class Bot extends ListenerAdapter
{

    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event)
    {
        if(!event.getAuthor().isBot())
        {
            if (event.getMessage().getContentRaw().contains(":v"))
            {
                event.getChannel().sendMessage(":V").queue();
            }
            if (event.getMessage().getContentRaw().equals("!mencion"))
            {
                User autor = event.getMessage().getAuthor();
                event.getChannel().sendMessage("<@"+autor.getId()+">  te vigílo ¬¬" ).queue();
            }
            if(event.getMessage().getContentRaw().contains("pizza"))
            {
                event.getMessage().addReaction("U+1F355").queue();
            }
        }


    }

}
