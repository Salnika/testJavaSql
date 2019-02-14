--Faire une requete qui affiche le titre (dans la colonne "le titre") et le resume (dans la colonne "resum") des films qui ont le chiffre 28 dans leur titre.
SELECT titre AS "le titre", resum FROM film WHERE titre LIKE "%28%";
--Faire une requete qui affiche le  nom des salles qui possedent plus de 100 sieges (dans une colonne "nom_salle").
SELECT nom_salle FROM salle WHERE nbr_siege > 100;

--Faire une requete qui affiche le titre (dans une colonne "titre") des films qui ont un des id suivants :"1, 34, 45, 2, 123, 42642, LOLARD, 4525, 2, 46, 48574, 37, 90, 05,5436, 0005, ABC, 3, 0x34, 875783, 224, 1964".
SELECT titre FROM film WHERE id_film IN(1, 34, 45, 2, 123, 42642, "LOLARD", 4525,2, 46, 48574, 37, 90, 05, 5436, 0005, "ABC", 3, 0x34, 875786, 224, 1964);

--Faire une requete qui affiche l'id du membre (dans une colonne "id_membre") et la date de visionnage (dans une colonne "histo date") pour les membres qui sont alles voir les films numeros 2989 ou numeros 2762, ordonnee par date decroissante.
SELECT id_membre, date AS "histo date" FROM historique_membre WHERE id_film IN(2989, 2762) ORDER BY date DESC;

-- Faire une requete qui affiche le titre (dans une colonne "titre"), la date_debut_affiche(dans une colonne "date_debut"), l'id_distrib (dans une colonne "id_distrib") et le nom dudistributeur (dans une colonne "nom_distrib") de tous les films dont le nom contient 'death'independement de la casse (c.-a-d. que le titre peut contenir dEaTh DeatH et tous ses derives).Si le film n'a pas de distributeur, il faut quand meme l'afficher.
SELECT titre, date_debut_affiche AS "date_debut", film.id_distrib AS "id_distrib", nom AS "nom_distrib" FROM film LEFT JOIN distrib ON distrib.id_distrib = film.id_distrib WHERE titre LIKE "%death%";
