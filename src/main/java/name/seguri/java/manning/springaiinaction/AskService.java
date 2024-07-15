package name.seguri.java.manning.springaiinaction;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AskService {
  private final ChatClient chatClient;

  public AskService(ChatClient.Builder builder) {
    this.chatClient = builder.build();
  }

  public Answer ask(Question question) {
    String answerText = chatClient.prompt().user(question.question()).call().content();
    return new Answer(answerText);
  }
}
