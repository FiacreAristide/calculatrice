# Calculatrice avec le Design Pattern Observer utilisant JavaFX et le MVC
Ce projet implémente une calculatrice en utilisant le design pattern Observer en conjonction avec le pattern MVC (Model-View-Controller) en utilisant JavaFX. La calculatrice est capable d'effectuer des opérations mathématiques de base telles que l'addition, la soustraction, la multiplication et la division.

# Architecture MVC
Le modèle MVC est un modèle architectural qui divise une application en trois composants principaux : le modèle (Model), la vue (View) et le contrôleur (Controller). Dans ce projet, nous avons utilisé le modèle MVC pour organiser et structurer notre calculatrice.

## Modèle (Model) :
Le modèle représente les données et la logique métier de la calculatrice. Il effectue les calculs et fournit les résultats aux vues et aux contrôleurs. Dans notre cas, le modèle est responsable de stocker les opérandes et l'opération en cours.

## Vue (View) :
La vue est responsable de l'interface utilisateur de la calculatrice. Elle affiche les boutons et les résultats à l'écran. Dans notre implémentation, la vue observe le modèle pour mettre à jour l'interface utilisateur chaque fois qu'un changement survient.

## Contrôleur (Controller) :
Le contrôleur gère les interactions entre la vue et le modèle. Il reçoit les entrées de l'utilisateur à partir de la vue, les traite et met à jour le modèle en conséquence. Dans notre cas, le contrôleur est également responsable de la gestion des événements et de la communication avec les vues et le modèle.

## Design Pattern Observer
Le design pattern Observer est utilisé pour établir une relation de dépendance un-à-plusieurs entre les objets. Dans notre projet, nous avons appliqué le pattern Observer pour permettre à la vue d'être notifiée de tout changement survenu dans le modèle. Ainsi, chaque fois que le modèle est mis à jour, la vue est automatiquement mise à jour pour refléter les nouvelles données.

## Fonctionnalités de la calculatrice
La calculatrice implémentée possède les fonctionnalités suivantes :

Addition, soustraction, multiplication et division de deux opérandes.
Affichage du résultat à l'écran.
## Prérequis
Avant de lancer le projet, assurez-vous d'avoir les éléments suivants :
Java JDK (version 8 ou supérieure) installé sur votre système.
JavaFX installé et configuré correctement.
## Liens Youtube:
P01:https://youtu.be/ODeWKnbiY8A
P02:https://youtu.be/iI15jyy84bE
P03:https://youtu.be/L4DrUdLINu8
P04:https://youtu.be/7cch6fCohGA
P05:https://youtu.be/YWRfDL9MNbE
P06:https://youtu.be/U4Urktfmu8w
P07:https://youtu.be/v-U-HjnCDv4
P08:https://youtu.be/5V7qrmX3F_Q
P09:https://youtu.be/TMxL-m-9qZA
P10:https://youtu.be/gnZFixA0I3I

## Lien Google Docs:
https://docs.google.com/document/d/1QIsuJkcrF_HlK9Z9D7gz5PhDYB8citU10EVJNdCAh8I/edit?usp=share_link
