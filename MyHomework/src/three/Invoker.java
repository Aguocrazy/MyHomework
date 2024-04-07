package three;

interface Command {
    void execute();
}
class Receiver {
    public void action() {
        System.out.println("Receiver action");
    }
}
class ConcreteCommand implements Command {
    private Receiver receiver;
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
class Invoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute();
    }
}
