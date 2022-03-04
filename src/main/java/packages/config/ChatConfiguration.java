package packages.config;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class ChatConfiguration {

    @Bean
    public Bot bot() {
        File currd = new File(".");
        String path = currd.getAbsolutePath();
        String resourcepath = path + File.separator + "src" + File.separator + "main" + File.separator + "resources";
        return new Bot("super", resourcepath);
    }

    @Bean
    public Chat chat(Bot bot) {
        return new Chat(bot);
    }
}
