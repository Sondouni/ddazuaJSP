package javaplus.designPattern.behavioral.commandP;

public class CommandMain {
    public static void main(String[] args) {
        CTV tv = new CTV();
        Command TvTrunOn = new ActionTurnOnCommand(tv);
        Command TvTrunOff = new ActionTurnOffCommand(tv);
        Command TvVU = new ActionVolumeUpCommand(tv);
        Command TvVD = new ActionVolumeDownCommand(tv);

        ActionCommand ac = new ActionCommand();
        ac.commandExecute(TvTrunOn);
        ac.commandExecute(TvTrunOff);
        ac.commandExecute(TvVU);
        ac.commandExecute(TvVD);
    }
}
