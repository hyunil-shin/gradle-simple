import com.offbytwo.jenkins.JenkinsServer;
import java.net.URI;


public class Hello {
  
  public static String GREETING = "Hello world!";
  
  public static void main(String []args) throws Exception {


	JenkinsServer j = new JenkinsServer(new URI("http://133.186.221.15:8080/"), "admin", "11d477c26344c0674c9ce91fb332953ee0");

  }  
}

