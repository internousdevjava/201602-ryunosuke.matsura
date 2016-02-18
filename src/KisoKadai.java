
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class KisoKadai {

	public static void main(String[] args) throws IOException {
		try{

		String x;
		String y;
		System.out.println("九九表を出力します");
		System.out.println("表の横の最大値を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		x = br.readLine();

		System.out.println("表の縦の最大値を入力してください");
		y = br.readLine();



		int xx = Integer.parseInt(x);
		int yy = Integer.parseInt(y);

		for(int i = 1; i < yy + 1; i++){
			for(int j = 1; j < xx + 1; j++){

				System.out.print(i * j + " ");

			}
			System.out.println();
//			System.out.print(i - 1 + " ");
		}
		}catch(Exception e){
			System.out.println("error");
		}
	}
}


