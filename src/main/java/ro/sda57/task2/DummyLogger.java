package ro.sda57.task2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLogger implements CommandLineRunner {
  public void sayHello(String className) {
    log.info("hello from DummyLogger:" + className );
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("DummyLogger bean was created");
  }
}