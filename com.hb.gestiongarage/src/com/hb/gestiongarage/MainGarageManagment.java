package com.hb.gestiongarage;

import java.time.LocalDate;
import java.util.Scanner;

import com.hb.gestiongarage.pojos.Brand;
import com.hb.gestiongarage.pojos.Car;
import com.hb.gestiongarage.pojos.Engine;
import com.hb.gestiongarage.pojos.EngineType;
import com.hb.gestiongarage.pojos.Garage;
import com.hb.gestiongarage.pojos.Motorcycle;
import com.hb.gestiongarage.pojos.Truck;
import com.hb.gestiongarage.pojos.Vehicle;
import com.hb.gestiongarage.pojos.VehicleOption;
import com.hb.gestiongarage.service.EngineService;
import com.hb.gestiongarage.service.GarageService;
import com.hb.gestiongarage.service.VehicleOptionService;
import com.hb.gestiongarage.service.VehicleService;
import com.hb.gestiongarage.service.impl.EngineServiceImpl;
import com.hb.gestiongarage.service.impl.GarageServiceImpl;
import com.hb.gestiongarage.service.impl.VehicleOptionServiceImpl;
import com.hb.gestiongarage.service.impl.VehicleServiceImpl;

public class MainGarageManagment {
	
	private static VehicleOptionService optionService = new VehicleOptionServiceImpl();
	private static GarageService garageService = new GarageServiceImpl();
	private static VehicleService vehicleService = new VehicleServiceImpl();
	private static EngineService engineService = new EngineServiceImpl();
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void garageMenu() {
		char doContinue = 'y';
		
		do {
			System.out.println("1. Afficher les Garages");
			System.out.println("2. Afficher les Vehicules");
			System.out.println("3. Afficher les Moteurs");
			System.out.println("4. Afficher les Options");
			System.out.println("5. Ajouter un Garage");
			System.out.println("6. Ajouter une Voiture");
			System.out.println("7. Ajouter une Moto");
			System.out.println("8. Ajouter un Camion");
			System.out.println("9. Ajouter une Option");
			System.out.println("10. Trier les Véhicules");
			int menu = 0;
			try {
				System.out.println("saisir un menu: ");
				menu = Integer.parseInt(sc.nextLine());
			}catch (Exception e) {
				System.out.println("erreur de saisie: "+e.getMessage());
			}
			switch(menu) {
			case 1:
				showGaragesFull();
				break;
			case 2:
				showVehicles();
				break;	
			case 3:
				showEngines();
				break;	
			case 4:
				showOptions();
				break;	
			case 5:
				createGarage();
				break;
			case 6:
				try {
					createCar();
				}catch (Exception e) {
					System.out.println("erreur de saisie: "+e.getMessage());
				}
				break;
			case 7:
				try {
					createMotorcycle();
				}catch (Exception e) {
					System.out.println("erreur de saisie: "+e.getMessage());
				}
				break;
			case 8:
				try {
					createTruck();
				}catch (Exception e) {
					System.out.println("erreur de saisie: "+e.getMessage());
				}
				break;
			case 9:
				try {
					createOption();
				}catch (Exception e) {
					System.out.println("erreur de saisie: "+e.getMessage());
				}
				break;
			case 10:
				sortVehicles();
				break;
			}
			System.out.println("Continuer? (y/n)");
			doContinue = sc.nextLine().charAt(0);
			
		}while(doContinue != 'n');
	}

	private static void createOption() {
		System.out.println("Création d'Option: ");
		VehicleOption option = new VehicleOption();
		System.out.println("Saisir un nom:");
		String name = sc.nextLine();
		option.setName(name);
		
		System.out.println("Saisir un prix:");
		double price = Double.parseDouble(sc.nextLine());
		option.setPrice(price);
		
		optionService.addVehicleOption(option);
	}

	private static void showOptions() {
		System.out.println("Liste des Options");
		for(VehicleOption vehicleOption : optionService.getVehicleOptions()) {
			vehicleOption.showOption();
		}
		
	}

	private static void showEngines() {
		System.out.println("Liste des Moteurs");
		for(Engine engine : engineService.getEngines()) {
			engine.showEngine();
		}
	}

	private static void showVehicles() {
		System.out.println("Liste des Véhicules");
		for(Vehicle vehicle : vehicleService.getVehicles()) {
			vehicle.showVehicle();
		}
	}

	private static void showGaragesFull() {
		for(Garage garage : garageService.getGarages()) {
			garage.showGarage();
			garage.showVehicles();
		}
	}

	private static void sortVehicles() {
		System.out.println("liste des garages");
		for(Garage garage : garageService.getGarages()) {
			garage.showGarage();
		}
		System.out.println("saisir un id:");
		int id = Integer.parseInt(sc.nextLine());
		Garage garage = garageService.getGarage(id);
		garage.sortVehicles();
		System.out.println("liste triée par prix");
	}

	private static void createTruck() {
		System.out.println("Création de camion: ");
		Truck truck = new Truck();
		System.out.println("liste des garages");
		for(Garage garage : garageService.getGarages()) {
			garage.showGarage();
		}
		System.out.println("saisir un id:");
		int id = Integer.parseInt(sc.nextLine());
		Garage garage = garageService.getGarage(id);
		
		System.out.println("Saisir un nom: ");
		String name = sc.nextLine();
		truck.setName(name);
		
		System.out.println("Saisir un prix: ");
		double price = Double.parseDouble(sc.nextLine());
		truck.setPrice(price);
		
		System.out.println("liste de moteurs:");
		for (EngineType engineType : EngineType.values()) {
			System.out.println(engineType);
		}
		System.out.println("Saisir un type de moteur:");
		String engineTypeString = sc.nextLine();
		
		System.out.println("Saisir une puissance de moteur:");
		int enginePower = Integer.parseInt(sc.nextLine());
		
		Engine engine = new Engine(EngineType.valueOf(engineTypeString), enginePower);
		engineService.addEngine(engine);
		truck.setEngine(engine);
		
		System.out.println("Saisir une date d'immatriculation:");
		LocalDate immDate = LocalDate.parse(sc.nextLine());
		truck.setImmatriculationDate(immDate);
		
		System.out.println("Saisir un nombre d'essieux:");
		int nbAxles = Integer.parseInt(sc.nextLine());
		truck.setNbAxles(nbAxles);
		
		System.out.println("Saisir un volume de chargement:");
		int cargoVolume = Integer.parseInt(sc.nextLine());
		truck.setCargoVolume(cargoVolume);
		
		System.out.println("Saisir un poids de chargement:");
		int cargoWeight = Integer.parseInt(sc.nextLine());
		truck.setCargoWeight(cargoWeight);
		
		addOptions(truck);
		
		garage.addVehicle(truck);
		vehicleService.addVehicle(truck);
		
	}

	private static void createMotorcycle() {
		System.out.println("Création de moto: ");
		Motorcycle motorcycle = new Motorcycle();
		System.out.println("liste des garages");
		for(Garage garage : garageService.getGarages()) {
			garage.showGarage();
		}
		System.out.println("saisir un id:");
		int id = Integer.parseInt(sc.nextLine());
		Garage garage = garageService.getGarage(id);
		
		System.out.println("Saisir un nom: ");
		String name = sc.nextLine();
		motorcycle.setName(name);
		
		System.out.println("Saisir un prix: ");
		double price = Double.parseDouble(sc.nextLine());
		motorcycle.setPrice(price);
		
		System.out.println("liste de moteurs:");
		for (EngineType engineType : EngineType.values()) {
			System.out.println(engineType);
		}
		System.out.println("Saisir un type de moteur:");
		String engineTypeString = sc.nextLine();
		
		System.out.println("Saisir une puissance de moteur:");
		int enginePower = Integer.parseInt(sc.nextLine());
		
		Engine engine = new Engine(EngineType.valueOf(engineTypeString), enginePower);
		engineService.addEngine(engine);
		motorcycle.setEngine(engine);
		
		System.out.println("Saisir une date d'immatriculation:");
		LocalDate immDate = LocalDate.parse(sc.nextLine());
		motorcycle.setImmatriculationDate(immDate);
		
		System.out.println("Saisir une cylindrée:");
		int cylinders = Integer.parseInt(sc.nextLine());
		motorcycle.setCylinders(cylinders);
		
		addOptions(motorcycle);
		
		garage.addVehicle(motorcycle);
		vehicleService.addVehicle(motorcycle);
		
	}

	private static void createCar() {
		System.out.println("Création de voiture: ");
		Car car = new Car();
		System.out.println("liste des garages");
		for(Garage garage : garageService.getGarages()) {
			garage.showGarage();
		}
		System.out.println("saisir un id:");
		int id = Integer.parseInt(sc.nextLine());
		Garage garage = garageService.getGarage(id);
		
		System.out.println("Saisir un nom: ");
		String name = sc.nextLine();
		car.setName(name);
		
		System.out.println("Saisir un prix: ");
		double price = Double.parseDouble(sc.nextLine());
		car.setPrice(price);
		
		System.out.println("liste de moteurs:");
		for (EngineType engineType : EngineType.values()) {
			System.out.println(engineType);
		}
		System.out.println("Saisir un type de moteur:");
		String engineTypeString = sc.nextLine();
		
		System.out.println("Saisir une puissance de moteur:");
		int enginePower = Integer.parseInt(sc.nextLine());
		
		Engine engine = new Engine(EngineType.valueOf(engineTypeString), enginePower);
		engineService.addEngine(engine);
		car.setEngine(engine);
		
		System.out.println("Saisir une date d'immatriculation:");
		LocalDate immDate = LocalDate.parse(sc.nextLine());
		car.setImmatriculationDate(immDate);
		
		System.out.println("Saisir une puissance en chevaux fiscaux:");
		int horsePower = Integer.parseInt(sc.nextLine());
		car.setHorsePower(horsePower);
		
		System.out.println("Saisir un nombre de portes:");
		int nbDoors = Integer.parseInt(sc.nextLine());
		car.setNbDoors(nbDoors);
		
		System.out.println("Saisir un nombre de sièges:");
		int nbSeats = Integer.parseInt(sc.nextLine());
		car.setNbSeats(nbSeats);
		
		System.out.println("Saisir une taille de coffre:");
		int boothSize = Integer.parseInt(sc.nextLine());
		car.setBoothSize(boothSize);
		
		addOptions(car);
		
		garage.addVehicle(car);
		vehicleService.addVehicle(car);
	}

	private static void addOptions(Vehicle vehicle) {
		System.out.println("ajouter des Options:");
		char doContinue = 'y';
		while(doContinue != 'n'){
			System.out.println("ajouter une option? (y/n)");
			doContinue = sc.nextLine().charAt(0);
			if(doContinue != 'n') {
				System.out.println("Choisir une option: ");
				System.out.println("liste des options");
				for(VehicleOption option : optionService.getVehicleOptions()) {
					option.showOption();
				}
				int optionId = Integer.parseInt(sc.nextLine());
				VehicleOption option = optionService.getVehicleOption(optionId);
				vehicle.addOption(option);
			}
		}
	}

	private static void createGarage() {
		System.out.println("Création de garage:");
		Garage garage = new Garage();
		System.out.println("saisir un nom:");
		String name = sc.nextLine();
		garage.setName(name);
		
		garageService.addGarage(garage);
	}

	public static void main(String[] args) {
		Garage garage = new Garage("Garage Isidore");
		garageService.addGarage(garage);
		Engine engine1 = new Engine(EngineType.Oil, 100);
		Car car1 = new Car("Clio 3", 3000.0, Brand.Renault, engine1, LocalDate.parse("2021-07-09"), 200, 5, 5, 20);
		engineService.addEngine(engine1);
		vehicleService.addVehicle(car1);
		garage.addVehicle(car1);
		VehicleOption op1 = new VehicleOption("AC", 300);
		car1.addOption(op1);
		optionService.addVehicleOption(op1);
		VehicleOption op2 = new VehicleOption("Auto Radio", 150);
		optionService.addVehicleOption(op2);
		car1.addOption(op2);
		System.out.println(car1);
		System.out.println("Taxes: "+car1.calcTaxes());
		
		Engine engine2 = new Engine(EngineType.Gas, 1000);
		engineService.addEngine(engine2);
		Truck truck1 = new Truck("MAN", 15000, Brand.MAN,engine2 , LocalDate.parse("2021-07-09"), 3,50, 100);
		truck1.addOption(op1);
		truck1.addOption(op2);
		garage.addVehicle(truck1);
		vehicleService.addVehicle(truck1);
		System.out.println(truck1);
		System.out.println("Taxes: "+truck1.calcTaxes());
		
		Engine engine3 = new Engine(EngineType.Gas, 500);
		engineService.addEngine(engine3);
		Motorcycle m1 = new Motorcycle("Suzuki 3", 5000.0, Brand.Suzuki,engine3 , LocalDate.parse("2021-07-09"), 500);
		VehicleOption op3 = new VehicleOption("heated seat",500);
		optionService.addVehicleOption(op3);
		m1.addOption(op3);
		garage.addVehicle(m1);
		vehicleService.addVehicle(m1);
		System.out.println(m1);
		System.out.println("Taxes: "+m1.calcTaxes());
		
		garageMenu();
		
	}

}
