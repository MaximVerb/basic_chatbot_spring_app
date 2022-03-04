package packages.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextDto {
    @JsonProperty("text_for_chat")
    String textForChat;

    public TextDto() {}

    public TextDto(String textForChat) {
        this.textForChat = textForChat;
    }

    public String getTextForChat() {
        return textForChat;
    }
}
