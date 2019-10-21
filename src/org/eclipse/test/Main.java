package org.eclipse.test;

import java.util.Scanner;

import org.eclipse.model.Adresse;
import org.eclipse.model.MaDate;
import org.eclipse.model.Personne;
import org.eclipse.model.Point;

public class Main {

	public static void main(String[] args) {
		// ici on utilise le CONTRUCTEUR (SANS PARAMETRES) par défaut de la classe racine (ou classe mere) Object, 
		Personne personne1 = new Personne();
		personne1.setNum(1);
		personne1.setNom("Wick");
		personne1.setPrenom("John");
		Adresse adresse = new Adresse("21 rue Victor Hugo", "75016", "Paris");
		// Affichage par tostring
//		System.out.println(personne1);		
//		System.out.println("Nombre de personnes " + Personne.getNbrPersonnes());
//		
//		System.out.println("\n");
		
		
		Adresse adresse2 = new Adresse("7 rue George Sand", "75015", "Paris");
		// ici on utilise un CONTRUCTEUR AVEC PARAMETRES, ce qui écrasera le constructeur par défaut,
		// on donc, pour que le code au dessus continuer de fonctionner, il faudra créer un constructeur vide dans
		// dans la classe Personne
		Personne personne2 = new Personne(2, "Alain", "Dupont",adresse2);
		//System.out.println(personne2);
		
		// Affichage par tostring
		//System.out.println("personne1 :" + personne1.getNum() + " " + 
		//personne1.getNom() + " " + personne1.getPrenom()+
		//"  "+ adresse.getRue()+ "  "+adresse.getCodePostal()+ " " +adresse.getVille());
		
		// Affichage par utilisation des getters
		//System.out.println("personne2 :" + personne2.getNum() + " " + 
		//personne2.getNom() + " " + personne2.getPrenom()+
		//"  "+ adresse2.getRue()+ "  "+adresse2.getCodePostal()+ " " +adresse2.getVille());
		//System.out.println("Nombre de personnes " + Personne.getNbrPersonnes());
		
		
		
		/*Enseignant enseignant = new Enseignant(3,"green","jonas",1700); 
		enseignant.setNum(3); enseignant.setNom("green"); 
		enseignant.setPrenom("jonas"); 
		
		enseignant.setSalaire(1700); 
		//System.out.println(enseignant);*/
		
		
		
		//System.out.println(enseignant instanceof Enseignant) ; 
		// affiche true 
		//System.out.println(enseignant instanceof Personne); 
		// affiche true 
		//System.out.println(personne1 instanceof Enseignant); 
		// affiche false 
		
		
		/*Enseignant enseignant1 = new Enseignant(3,"green","jonas",1700);
		Enseignant enseignant2 = new Enseignant(4,"wick","jonas",1800);
		Etudiant etudiant1 = new Etudiant(5,"green","john",2);
		Etudiant etudiant2 = new Etudiant(6,"green","james",3);
		Personne [] personnes= {enseignant1,enseignant2,etudiant1,etudiant2};
//		for(Personne perso : personnes) {
//			System.out.println(perso.afficherDetail());
//			}*/
		
		
		//testPoint();	
		testAjouterUnJour();
	}
	
	public static void testPoint(){
//		Point point = new Point(2.3,3.3);
//		System.out.println("Distance par rapport au point courant" + point.calculerDistance(point));
		
		Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Saisie de la première abscisse");
		double x1 = sc.nextDouble();
		System.out.println("Saisie de la première ordonnée");
		double y1 = sc.nextDouble();	
		
		System.out.println("Saisie de la deuxieme abscisse");
		double x2 = sc.nextDouble();	
		
		System.out.println("Saisie de la ordonnée abscisse");
		double y2 = sc.nextDouble();		
		
		System.out.println("Saisie de la troisieme abscisse");
		double x3 = sc.nextDouble();		
		
		System.out.println("Saisie de la ordonnée abscisse");
		double y3 = sc.nextDouble();	
		
		sc.close();
		
		Point A = new Point(x1,y1);
		Point B = new Point(x2,y2);
		Point C = new Point(x3,y3);
		
		
		System.out.println("Distance entre A et B: " + A.calculerDistance(B));
		System.out.println("Distance entre A et C: " + A.calculerDistance(C));		
		System.out.println("Distance entre B et C: " + B.calculerDistance(C));			
		
		//TroisPoints.testerAlignement();
			
	}
	
	public static void testAjouterUnJour() {
		// MaDate d = new MaDate(31,12,2019);
		// MaDate d = new MaDate(30,9,2019);
		// MaDate d = new MaDate(31,12,2016);		
		// MaDate d = new MaDate(29,2,2020); // Année bissextile
		// MaDate d = new MaDate(28,2,2019);
		 MaDate d = new MaDate(7,12,2019);
		d.ajouterUnJour();
		System.out.println(d);
	}

}
