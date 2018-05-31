# Test IUT

```
import java.util.HashSet;
import java.util.Set;

class Graph {
	private Set<String> links = new HashSet<String>();
	public void link(int left, int right) {
		links.add(left + ":" + right);
	}
	public boolean isLink(int left, int right) {
		return links.stream().filter(l -> Integer.valueOf(l.split(":")[0]) == Math.min(left, right))
		        .map(l -> Integer.valueOf(l.split(":")[1]))
		        .anyMatch(n -> n == Math.max(left, right) || isLink(n, Math.max(left, right)));
	}
}

```

* Classe permettant de définir un graph acyclique.
* Les noeuds sont définis par des chiffres.
* On créé un lien entre deux noeuds (ici 1 et 2) en appelant la méthode: link(1,2)
* La méthode isLink indique s'il existe un lien entre les deux noeuds. 
* La méthode isLink ne lève pas d'exceptions.

Vérifier le bon fonctionnement
