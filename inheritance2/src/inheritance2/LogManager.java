package inheritance2;

public class LogManager {
	
		
		public void log(int logType) {
			if(logType==1)
				System.out.println("veritabanýna loglandý");
			else if(logType==2)
				System.out.println("Dosyaya loglandý");
			else
				System.out.println("email gönderildi");
		}
	
	

}
