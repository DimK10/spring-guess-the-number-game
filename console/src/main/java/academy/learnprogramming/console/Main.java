package academy.learnprogramming.console;

import academy.learnprogramming.config.GameConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static final String CONFIG_LOCATION = "beans.xml.old";

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // create the context (container)
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

//        // get number generator bean from context (container)
//        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);
//
//        // call method next() to get a random number
//        int number = numberGenerator.next();
//
//        // log generated number
//        log.info("number = {}", number);
//
//        // get message generator bean from context (container)
//        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
//
//        log.info("getMainMessage= {}", messageGenerator.gatMainMessage());
//        log.info("getResultMessage= {}", messageGenerator.getResultMessage());

        // close context (container)
        context.close();

    }
}
