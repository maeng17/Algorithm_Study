import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T =Integer.parseInt(br.readLine()); //Scanner과 같은 역할. But 시간 단축

        for(int i=1; i<=T; i++){           
          bw.append("*".repeat(i)); // repeat(n): n번 문자열 반복
          bw.append("\n");
        }

        bw.flush(); //출력
        bw.close(); //종료
        br.close();

    }
}