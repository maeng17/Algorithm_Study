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

        int T =Integer.parseInt(br.readLine()); //Scanner과 같은 역할. But 시간 단축

        for(int i=0; i<T; i++){            st = new StringTokenizer(br.readLine()); //더 할 숫자 입력 -> 공백을 기준으로 잘라서 저장
            bw.append("Case #" + (i+1) + ": "); // 순서대로 하면 Case01 로 문자열로써 합쳐지게 되므로, 숫자먼저 계산하기
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            bw.write( String.valueOf(num1 + num2) + "\n"); //.write는 String만 가능하기 뗴문에 변환
        }

        bw.flush(); //출력
        bw.close(); //종료
        br.close();

    }
}