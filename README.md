# Convertisseur de Chiffres Romains (Kata)

Ce projet est une implémentation simple d'un convertisseur de chiffres romains. Il convertit des nombres de 1 à 3000 en chiffres romains et vice versa, en suivant les principes du développement dirigé par les tests (TDD).

## Structure du Projet

Le projet suit une structure standard de projet Maven :
├── pom.xml
├── src
│ ├── main
│ │ └── java
│ │ └── Converter.java
│ └── test
│ └── java
│ └── ConverterTest.java

Importer le Projet dans votre IDE :

Ouvrez IntelliJ IDEA ou votre IDE préféré.
Sélectionnez Fichier > Ouvrir... et choisissez le fichier pom.xml du dépôt cloné.
Assurez-vous que le JDK du projet est configuré sur Java 17.
Exécuter les Tests :

Naviguez vers src/test/java/ConverterTest.java.
Exécutez les tests en utilisant le bouton de lecture vert à côté de la classe de test ou des méthodes de test individuelles.
Flux de Développement
Ce projet utilise le développement dirigé par les tests (TDD) avec les étapes suivantes :

Rouge : Écrire un test qui échoue.
Vert : Écrire juste assez de code pour que le test passe.
Refactoriser : Refactoriser le code pour améliorer sa structure et sa lisibilité, tout en s'assurant que tous les tests passent toujours.
Exemple de Commits
Chaque étape du cycle TDD est accompagnée d'un commit :

Rouge : Ajouter un test échouant pour convertir 1 en I
Vert : Implémenter la méthode de conversion pour faire passer le test de conversion de 1 en I
Refactoriser : Généraliser la méthode de conversion pour gérer plusieurs valeurs
