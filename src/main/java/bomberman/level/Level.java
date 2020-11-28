package main.java.bomberman.level;

import main.java.bomberman.Board;
import main.java.bomberman.exceptions.LoadLevelException;

public abstract class Level {

	protected int _width, _height, _level;
	protected String[] _lineTiles;
	protected Board _board;

	//code để chuyển lv
	protected static String[] codes = {
		"lv1",
		"lv2",
		"lv3",
		"lv4",
		"lv5",
		};

	public Level(String path, Board board) throws LoadLevelException {
		loadLevel(path);
		_board = board;
	}

	public abstract void loadLevel(String path) throws LoadLevelException;
	
	public abstract void createEntities();

	//kiểm tra code
	public int validCode(String str) {
		for (int i = 0; i < codes.length; i++) {
			if (codes[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}
	
	public String getActualCode() {
		return codes[_level -1];
	}

	public int getWidth() {
		return _width;
	}

	public int getHeight() {
		return _height;
	}

	public int getLevel() {
		return _level;
	}

}
