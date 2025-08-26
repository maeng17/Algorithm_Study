import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st;

      String line;

      while ((line=br.readLine()) != null) {
        st = new StringTokenizer(line);
        if(st.hasMoreTokens()){
          int num1 = Integer.parseInt(st.nextToken());
          int num2 = Integer.parseInt(st.nextToken());
          bw.write(String.valueOf(num1 + num2) + "\n");
        } else {
          break;
        }
        
      }

      
      bw.flush(); //출력
      bw.close(); //종료
      br.close();

    }
}