package rnd.statemachine;

public interface ProcessEvent {
    public abstract Class<? extends Processor> nextStepProcessor(ProcessEvent event) throws InterruptedException;
    public abstract ProcessState nextState(ProcessEvent event);
}
