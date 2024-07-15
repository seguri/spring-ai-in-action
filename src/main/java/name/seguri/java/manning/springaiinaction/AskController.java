package name.seguri.java.manning.springaiinaction;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AskController {
  private final AskService askService;

  public AskController(AskService askService) {
    this.askService = askService;
  }

  @PostMapping(path = "/ask", produces = "application/json")
  public Answer ask(@RequestBody Question question) {
    return askService.ask(question);
  }
}
