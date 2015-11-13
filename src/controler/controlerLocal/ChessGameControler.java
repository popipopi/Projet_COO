package controler.controlerLocal;

import model.Coord;
import model.Couleur;
import model.observable.ChessGame;

public class ChessGameControler implements ChessGameControlers {

	private ChessGame m_chessgame;
	
	public ChessGameControler(ChessGame p_chessgame) {
		this.m_chessgame = p_chessgame;
	}
	
	@Override
	public boolean move(Coord initCoord, Coord finalCoord) {
		return m_chessgame.move(initCoord.x, initCoord.y, finalCoord.x, finalCoord.y);
	}

	@Override
	public String getMessage() {
		return m_chessgame.getMessage();
	}

	@Override
	public boolean isEnd() {
		return m_chessgame.isEnd();
	}

	@Override
	public Couleur getColorCurrentPlayer() {
		return m_chessgame.getColorCurrentPlayer();
	}
	
	public String toString(){
		return m_chessgame.toString();
	}

}
