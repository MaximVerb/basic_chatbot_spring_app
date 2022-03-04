package packages.services;

import org.alicebot.ab.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import packages.dto.TextDto;

@Service
public class BotService {
    private final Chat chatSession;

    @Autowired
    public BotService(Chat chatSession) {
        this.chatSession = chatSession;
    }

    public String talkToBot(TextDto textDto) {
        String response= chatSession.multisentenceRespond(textDto.getTextForChat());
        return response;
    }
}
