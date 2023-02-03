import java.util.Arrays;
public class GitLabHelper {
private String[] persons;
GitLabHelper(String[] persons) {
this.persons = persons;
}
public void PrintWelcomeMessage() {
System.out.print("This is a lesson on git made by: " +
Arrays.toString(persons));
}
}