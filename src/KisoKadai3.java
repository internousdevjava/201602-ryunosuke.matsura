import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class KisoKadai3{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw1 ;
		String str1, str2, str3, str4, str5;
		File file1, file2, file3;
		int int1;

			System.out.println("シャッツキステへようこそ");

			while(true){
				try{

				System.out.println("どのメイドを指名しますか？番号で指名してください。\n1:新規作成 2:上書き 3:追記 4:読み込み 5:終了");
				str1 = br.readLine();
				int1 = Integer.parseInt(str1);

				if(int1 == 1){
					file3 = akirahage(akirahagehage(br), br);
					System.out.println("なんて書き込みますか？");
					fw1 = new FileWriter(file3);
					fw1.write(br.readLine());
					fw1.close();
					System.out.println("書き込めたよ");
					takaya();

				}else if(int1 == 2){
					file3 = akira(akirahagehage(br), br);
					System.out.println("なんて書き込みますか？");
					fw1 = new FileWriter(file3);
					fw1.write(br.readLine());
					fw1.close();
					System.out.println("書き込めたよ");
					takaya();

				}else if(int1 == 3){
					file3 = akira(akirahagehage(br), br);
					System.out.println("なんて書き込みますか？");
					fw1 = new FileWriter(file3, true);
					fw1.write(br.readLine());
					fw1.close();
					System.out.println("書き込めたよ");
					takaya();

				}else if(int1 == 4){
					file3 = akira(akirahagehage(br), br);
					FileReader fr = new FileReader(file3);
					int ch;
					while((ch = fr.read()) != -1){
						System.out.print((char)ch);
					}
					System.out.println("");
					takaya();

				}else if(int1 == 5){
					System.out.println("ばいばい");
					System.exit(0);
				}

				}catch(Exception e){
					System.out.println("error");
					continue;
			}

		}
	}

	private static File akira(String str, BufferedReader br) throws IOException {
		String str2 = str;
		String str3;
		String str4;
		File file2;

		while(true){
			System.out.println("ファイル名を指定してください");
			str3 = br.readLine();
			str4 = str2 + "\\" + str3;
			file2 = new File(str4);
				if(file2.exists()){
					System.out.println("かしこまり");
					break;
				}else{
					file2.createNewFile();
					System.out.println("ないのであたらしく作りますね");
					break;
				}
		}
		return file2;
	}

	private static File akirahage(String str, BufferedReader br) throws IOException {
		String str2 = str;
		String str3;
		String str4;
		File file2;

		while(true){
			System.out.println("ファイル名を指定してください");
			str3 = br.readLine();
			str4 = str2 + "\\" + str3;
			file2 = new File(str4);
				if(file2.exists()){
					System.out.println("もうそのファイルはありますよ");
				}else{
					file2.createNewFile();
					System.out.println("あたらしく作りますね");
					break;
				}
		}
		return file2;
	}

	private static String akirahagehage(BufferedReader br) throws IOException {
		String str1;
		String str2 = null;
		File file1;

		System.out.println("フォルダ名を入力してね？");


		int o = 0;
		while(o < 1){
			str2 = br.readLine();
			file1 = new File(str2);
			if(!file1.exists()){
				while(true){
					System.out.println("フォルダがありません。作成しますか？yes or no");
					str1 = br.readLine();
					String y = "yes", n = "no";
					if(str1.equals(y)){
						System.out.println("つくれたよ");
						file1.mkdirs();
						o++;
						break;
					}else if(str1.equals(n)){
						System.out.println("フォルダ名を入力しなおしてね");
						break;

					}else{
						System.out.println("yes か no で入力しなおしてね");
					}
				}
			}else{
				break;
			}
		}
		return str2;
	}
	private static void takaya() throws IOException{
		System.out.println("まだ何か御用はありますか？ yes or no");
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));

		String y = "yes", n = "no";
		while(true){
			String taka = br.readLine();
			if(taka.equals(y)){
				System.out.println("かしこまりやした");
				break;
			}else if(taka.equals(n)){
				System.out.println("さよなら");
				System.exit(0);
			}else{
				System.out.println("yes か no で入力しなおしてね");
			}
		}
	}
}

