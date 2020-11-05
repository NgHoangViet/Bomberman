package main.java.bomberman.level;

import main.java.bomberman.Board;
import main.java.bomberman.exceptions.LoadLevelException;

public abstract class Level implements ILevel {

	protected int _width, _height, _level;
	protected String[] _lineTiles;
	protected Board _board;

	protected static String[] codes = { //TODO: change this code system to actually load the code from each level.txt
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

	@Override
	public abstract void loadLevel(String path) throws LoadLevelException;
	
	public abstract void createEntities();

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