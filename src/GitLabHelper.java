import java.util.Arrays;
public class GitLabHelper {

    private String[] persons;
    GitLabHelper(String[] persons) {
    this.persons = persons;
    }

    public void PrintWelcomeMessage() {
        System.out.printf("This is a AWESOME lesson on git made by: %s", Arrays.toString(persons));
    }

}