package javaplus.designPattern.behavioral.commandP;

public interface Command {
    public void execute();
}
class ActionTurnOnCommand implements Command {
    private CTV tv;
    public ActionTurnOnCommand(CTV tv){
        this.tv = tv;
    }
    public void execute(){
        this.tv.turnOn();
    }
}
class ActionTurnOffCommand implements Command {
    private CTV tv;
    public ActionTurnOffCommand(CTV tv){
        this.tv = tv;
    }
    public void execute(){
        this.tv.turnOff();
    }
}
class ActionVolumeUpCommand implements Command {
    private CTV tv;
    public ActionVolumeUpCommand(CTV tv){
        this.tv = tv;
    }
    public void execute(){
        this.tv.volumeUp();
    }
}
class ActionVolumeDownCommand implements Command {
    private CTV tv;
    public ActionVolumeDownCommand(CTV tv){
        this.tv = tv;
    }
    public void execute(){
        this.tv.volumeDown();
    }
}
class ActionCommand{
    public ActionCommand(){}
    public void commandExecute(Command cmd){
        cmd.execute();
    }
}