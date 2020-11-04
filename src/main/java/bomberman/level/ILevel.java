package main.java.bomberman.level;

import main.java.bomberman.exceptions.LoadLevelException;

public interface ILevel {

	public void loadLevel(String path) throws LoadLevelException;
}
