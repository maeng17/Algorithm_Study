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

      st = new StringTokenizer(br.readLine());

      int W = Integer.parseInt(st.nextToken());
      int H = Integer.parseInt(st.nextToken());

      bw.write(String.valueOf(W*H/2.0) + "\n");
      bw.close(); //종료
      br.close();

    }
}