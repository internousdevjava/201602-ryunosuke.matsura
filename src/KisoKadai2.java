import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class KisoKadai2 {

	public static void main(String[] args) throws IOException {

			int rand, xx, end;
			String x;
			end = 0;
			System.out.println("1から100までの間で好きな数字を入力してください");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



			rand = (int)(Math.random() * 100 + 1);
			System.out.println(rand);

			while(end == 0){
				try{

				x = br.readLine();
				xx = Integer.parseInt(x);
				if(100 < xx || 0 > xx){
					System.out.println("0から100までの整数だよ");

				}else if(rand == xx){
					System.out.println("正解です");
					end = 1;
				}else if(rand < xx){
					System.out.println("もうちょい小さいよ");
				}else if(rand > xx){
					System.out.println("もうちょい大きいよ");
				}else{
					System.out.println("やり直してください");
				}

				}catch(Exception e){
					System.out.println("問題文をもう一回読んでね");
			}
		}

	}

}

