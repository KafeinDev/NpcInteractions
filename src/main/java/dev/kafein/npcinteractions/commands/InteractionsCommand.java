package dev.kafein.npcinteractions.commands;

import com.google.common.collect.ImmutableList;
import dev.kafein.npcinteractions.NpcInteractions;
import dev.kafein.npcinteractions.command.AbstractCommand;
import dev.kafein.npcinteractions.command.CommandProperties;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public final class InteractionsCommand extends AbstractCommand {
    private final NpcInteractions plugin;

    public InteractionsCommand(NpcInteractions plugin) {
        super(CommandProperties.newBuilder()
                        .name("interactions")
                        .usage("/interactions")
                        .description("Command for NpcInteractions plugin")
                        .permission("interactions.admin")
                        .build(),
                ImmutableList.of(
                    new ReloadCommand(plugin)
                ));
        this.plugin = plugin;
    }

    @Override
    public void execute(@NotNull CommandSender sender, @NotNull String[] args) {

    }
}
