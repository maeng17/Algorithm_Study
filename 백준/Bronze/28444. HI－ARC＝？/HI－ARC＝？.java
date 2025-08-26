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

      int H = Integer.parseInt(st.nextToken());
      int I = Integer.parseInt(st.nextToken());
      int A = Integer.parseInt(st.nextToken());
      int R = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());

      bw.write(String.valueOf((H*I) - (A*R*C)) + "\n");
      bw.close(); //종료
      br.close();

    }
}