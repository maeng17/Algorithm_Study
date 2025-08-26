import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st;

      int N = Integer.parseInt(br.readLine());
      List<Integer> list = new ArrayList<>();
      st = new StringTokenizer(br.readLine());

      for(int i=0; i<N; i++){
        list.add(Integer.parseInt(st.nextToken()));
      }

      int v = Integer.parseInt(br.readLine());
      int count = 0;
      for(int i : list){
        if(i == v) {
          count++;
        }
      }

      
      bw.write(String.valueOf(count) + "\n");
      bw.close(); //종료
      br.close();

    }
}