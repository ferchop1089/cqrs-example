package example.infrastructure.bus;

import java.util.HashMap;
import java.util.Map;

import example.domain.bus.command.Command;
import example.domain.bus.command.CommandBus;
import example.domain.bus.command.CommandHandler;

public final class SyncCommandBus implements CommandBus {

	private final Map<String, CommandHandler> commands;

	public SyncCommandBus() {
		this.commands = new HashMap<>();
	}

	public final void register(String nameCommand, CommandHandler handler) {
		this.commands.put(nameCommand, handler);
	}

	@Override
	public void dispatch(Command command) {
		CommandHandler commandHandler = commands.get(command.getClass().getName());

		commandHandler.handler(command);
	}

}
