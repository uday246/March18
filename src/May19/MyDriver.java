package May19;

import java.io.File;

public class MyDriver {
	public static void main(String[] args) {
		ListFiles(new File("C:\\java"));
	}

	public static void ListFiles(File file) {

		System.out.println(file.getAbsolutePath());

		File f[] = file.listFiles();
		if (f == null || f.length == 0) {
			return;
		}
		for (int i = 0; i < f.length; i++) {
			if (f[i].isDirectory())
				ListFiles(f[i]);
			else{
				System.out.println(f[i].getAbsolutePath());
			}
		}
	}
}
