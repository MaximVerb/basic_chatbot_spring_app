package packages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import packages.dto.TextDto;
import packages.services.BotService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/chat", produces = APPLICATION_JSON_VALUE)
public class ChatController {
    private final BotService botService;

    @Autowired
    public ChatController(BotService botService) {
        this.botService = botService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> returnResponseBot(@RequestBody TextDto textDto) {
        return new ResponseEntity<>(botService.talkToBot(textDto), HttpStatus.OK);
    }
}
