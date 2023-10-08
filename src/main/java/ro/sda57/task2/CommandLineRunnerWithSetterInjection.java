package ro.sda57.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {


    private DummyLogger dummyLogger;

    @Override
    public void run(final String... args) throws Exception {
        dummyLogger.sayHello("CommandLineRunnerWithFieldInjection");
    }

    @Autowired
    public void setDummyLogger(DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }
}