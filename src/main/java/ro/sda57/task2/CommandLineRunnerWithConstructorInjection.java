package ro.sda57.task2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {

    private DummyLogger dummyLogger;

    public CommandLineRunnerWithConstructorInjection(DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(final String... args) throws Exception {
        dummyLogger.sayHello("CommandLineRunnerWithConstructorInjection");
    }
}