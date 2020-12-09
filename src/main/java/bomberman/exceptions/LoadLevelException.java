package main.java.bomberman.exceptions;

//SỬA CMT VS LÀM SẠCH CODE
//SỬA TỪ EXCEPTIONS LÊN
public class LoadLevelException extends BombermanException {
	public LoadLevelException() {
	}
	
	public LoadLevelException(String str) {
		super(str);
	}
	
	public LoadLevelException(String str, Throwable cause) {
		super(str, cause);
	}
	
	public LoadLevelException(Throwable cause) {
		super(cause);
	}
	
}
