# Test IUT

String regexpHour = "(([0-1]+\\\\d)|(2[0-3]))(h|\\\\:)\\\\d{2}";

L'expression régulière doit correspondre à une heure ayant un format hh:mm
 - Les heures sont séparées des minutes par ':', 'h' ou 'H'
 - Les heures sont sur 1 ou 2 caractères
 - Une heure sur 2 caractères peut commencer par un 0
 - La valeur des heures est comprise entre 0 et 23 inclus
 - Les minutes sont sur 2 caractères
 - La valeur des minutes est comprise entre 0 et 59 inclus
 
Exemple d'utilisation d'un regexp:

boolean result = myText.matches(myRegExp); 
