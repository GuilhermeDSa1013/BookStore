/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author guilh
 */
import java.util.*;

public class Avaliacao {

		private String comentario;
		private int nota;
		
		public String getComentario() {
			return comentario;
		}
		public void setComentario(String comentario) {
			this.comentario = comentario;
		}
		public int getNota() {
			return nota;
		}
		public void setNota(int nota) {
			this.nota = nota;
		}
		
		public Avaliacao(String comentario, int nota) {
			super();
			this.comentario = comentario;
			this.nota = nota;
		}
		
		public void calcularmedia() {
			
		}
		
	
}
