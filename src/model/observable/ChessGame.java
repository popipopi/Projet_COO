package model.observable;

import java.util.Observable;

import model.Couleur;
import model.Echiquier;


public class ChessGame extends Observable{
	
	private Echiquier m_echiquier;
	
	public ChessGame(){
		m_echiquier = new Echiquier();
	}
	
	public String toString(){
		String st = m_echiquier.toString();
		return st;
	}
	
	public boolean move (int xInit, int yInit, int xFinal, int yFinal)
	{
		boolean result = false;

		if(m_echiquier.isMoveOk(xInit, yInit, xFinal, yFinal) && m_echiquier.move(xInit, yInit, xFinal, yFinal))//vérifie si le déplacement est possible et l'effectue
			{
				m_echiquier.switchJoueur(); // si le deplacement est possible, on change de joueur
				result =true;
			}
		//this.notifyObservers();
		return result;

	}
	public boolean isEnd(){
		return m_echiquier.isEnd();
	}
	
	public String getMessage(){
		return m_echiquier.getMessage();
	}
	
	public Couleur getColorCurrentPlayer(){
		return m_echiquier.getColorCurrentPlayer();
	}
}
