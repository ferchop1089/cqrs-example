package example.domain.bus.command;

public interface CommandBus {

	public void dispatch(Command command);
	
}
