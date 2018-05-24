# Test IUT

public class Game {
		private int p = 0;
		public boolean win() { return p==(2<<2); }
		public Game up() { return set(Math.max(p-3,0)); }
		public Game right() { return set(3*(p/3)+Math.min((p%3)+1,2)); }
		public Game left() { return set(3*(p/3)+Math.max((p%3)+1,0)); }
		public Game down() { return set(Math.min(p+3,8)); }
		private Game set(int p) { this.p=p; return this; }
	}

On début du jeu, vous êtes dans la case A.
Vous pouvez vous déplacer en appelant les méthodes up, down, right, left.
Si votre mouvement vous fait sortir du jeu, le mouvement est annulé.
La méthode win, retourne vrai si vous êtes sur la position B.

-------------
| A |   |   |
-------------
|   |   |   |
-------------
|   |   | B |
-------------
