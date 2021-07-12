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

/**
 * main class, manages POJOs
 * @author elfindel69
 *
 */
public class MainGarageManagment {
	/**
	 * manager of VehicleOptions
	 */
	private static VehicleOptionService optionService = new VehicleOptionServiceImpl();
	
	/**
	 * manager of Garages
	 */
	private static GarageService garageService = new GarageServiceImpl();
	
	/**
	 * manager of Vehicles
	 */
	private static VehicleService vehicleService = new VehicleServiceImpl();
	
	/**
	 * manager of Engines
	 */
	private static EngineService engineService = new EngineServiceImpl();
	
	/**
	 * scanner, reads keyboard entries
	 */
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * console menu for POJOs
	 */
	public static void garageMenu() {
		char doContinue = 'y';
		
		do {
			//shows menu options
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
			System.out.println("11. Supprimer un Garage");
			System.out.println("12. Supprimer un Vehicule");
			System.out.println("13. Supprimer un Moteur");
			System.out.println("14. Supprimer une Option");
			//gets menu option
			int menu = 0;
			try {
				System.out.println("saisir un menu: ");
				menu = Integer.parseInt(sc.nextLine());
			}catch (Exception e) {
				System.out.println("erreur de saisie: "+e.getMessage());
			}
			
			//menu choices
			switch(menu) {
			case 1:
				//shows garages with vehicles
				showGaragesFull();
				break;
			case 2:
				//shows all the vehicles
				showVehicles();
				break;	
			case 3:
				//shows all the engines
				showEngines();
				break;	
			case 4:
				//shows all the options
				showOptions();
				break;	
			case 5:
				//creates a garage
				createGarage();
				break;
			case 6:
				//creates a car
				try {
					createCar();
				}catch (Exception e) {
					System.out.println("erreur de saisie: "+e.getMessage());
				}
				break;
			case 7:
				//creates a motorcycle
				try {
					createMotorcycle();
				}catch (Exception e) {
					System.out.println("erreur de saisie: "+e.getMessage());
				}
				break;
			case 8:
				//creates a truck
				try {
					createTruck();
				}catch (Exception e) {
					System.out.println("erreur de saisie: "+e.getMessage());
				}
				break;
			case 9:
				//creates an option
				try {
					createOption();
				}catch (Exception e) {
					System.out.println("erreur de saisie: "+e.getMessage());
				}
				break;
			case 10:
				//sorts vehicles by price
				sortVehicles();
				break;
			case 11:
				//deletes a garage
				deleteGarage();
				break;
			case 12:
				//deletes a vehicle
				deleteVehicle();
				break;
			case 13:
				//deletes an engine
				deleteEngine();
				break;
			case 14:
			//deletes an option
			deleteOption();
			break;
		}
			
			//gets if the user wants to continue
			System.out.println("Continuer? (y/n)");
			doContinue = sc.nextLine().charAt(0);
			
		}while(doContinue != 'n');
	}

	/**
	 * deletes an option
	 */
	private static void deleteOption() {
		//shows the list of garages
		showOptions();
		
		//gets the option to remove
		int id = Integer.parseInt(sc.nextLine());
		
		//remove the option
		boolean res = optionService.removeOption(id);
		if(res) {
			System.out.println("option supprimée");
		}else {
			System.out.println("l'option avec l'id "+id+" n'existe pas");
		}
		
	}

	/**
	 * deletes an engine
	 */
	private static void deleteEngine() {
		//shows the list of garages
		showEngines();
		
		//gets the engine to remove
		System.out.println("entrer un id:");
		int id = Integer.parseInt(sc.nextLine());
		
		//remove the engine
		boolean res = engineService.removeEngine(id);
		if(res) {
			System.out.println("moteur supprimé");
		}else {
			System.out.println("le moteur avec l'id "+id+" n'existe pas");
		}
		
	}

	/**
	 * deletes a garage
	 */
	private static void deleteGarage() {
		//shows the list of garages
		showGarageNames();
		
		//gets the garage to remove
		System.out.println("entrer un id:");
		int id = Integer.parseInt(sc.nextLine());
		
		//remove the garage
		boolean res = garageService.removeGarage(id);
		if(res) {
			System.out.println("garage supprimé");
		}else {
			System.out.println("le garage avec l'id "+id+" n'existe pas");
		}
		
	}

	/**
	 * deletes a vehicle
	 */
	private static void deleteVehicle() {
		//gets a garage
		Garage garage = getGarage();
		
		//gets the vehicles
		garage.showVehicles();
		//get the vehicle to remove
		System.out.println("entrer un id:");
		int id = Integer.parseInt(sc.nextLine());
		
		//remove the vehicle
		boolean res = garage.removeVehicle(id);
		boolean res2 = vehicleService.removeVehicle(id);
		if(res&&res2) {
			System.out.println("véhicule supprimé");
		}else {
			System.out.println("le véhicule avec l'id "+id+" n'existe pas");
		}
	}

	/**
	 * option creation method
	 */
	private static void createOption() {
		System.out.println("Création d'Option: ");
		//creates the option
		VehicleOption option = new VehicleOption();
		//gets the name
		System.out.println("Saisir un nom:");
		String name = sc.nextLine();
		option.setName(name);
		
		//gets the price
		System.out.println("Saisir un prix:");
		double price = Double.parseDouble(sc.nextLine());
		option.setPrice(price);
		
		//adds the option to the manager
		optionService.addVehicleOption(option);
	}

	/**
	 * show options method
	 */
	private static void showOptions() {
		System.out.println("Liste des Options");
		for(VehicleOption vehicleOption : optionService.getVehicleOptions()) {
			vehicleOption.showOption();
		}
		
	}
	
	/**
	 * show engines method
	 */
	private static void showEngines() {
		System.out.println("Liste des Moteurs");
		for(Engine engine : engineService.getEngines()) {
			engine.showEngine();
		}
	}

	/**
	 * show vehicles method
	 */
	private static void showVehicles() {
		System.out.println("Liste des Véhicules");
		for(Vehicle vehicle : vehicleService.getVehicles()) {
			vehicle.showVehicle();
		}
	}

	/**
	 * show garages with vehicles method
	 */
	private static void showGaragesFull() {
		for(Garage garage : garageService.getGarages()) {
			garage.showGarage();
			garage.showVehicles();
		}
	}

	/**
	 * method to sort vehicles by price
	 */
	private static void sortVehicles() {
		//shows garages list
		showGarageNames();
		//gets a garage
		System.out.println("saisir un id:");
		int id = Integer.parseInt(sc.nextLine());
		Garage garage = garageService.getGarage(id);
		
		//sorts the vehicles by price
		garage.sortVehicles();
		System.out.println("liste triée par prix");
	}

	/**
	 * shows garage names
	 */
	private static void showGarageNames() {
		System.out.println("liste des garages");
		for(Garage garage : garageService.getGarages()) {
			garage.showGarage();
		}
	}

	/**
	 * truck creation method
	 */
	private static void createTruck() {
		System.out.println("Création de camion: ");
		//truck object
		Truck truck = new Truck();
		
		//gets a garage
		Garage garage = getGarage();
		
		//gets a name
		System.out.println("Saisir un nom: ");
		String name = sc.nextLine();
		truck.setName(name);
		
		//gets a price
		System.out.println("Saisir un prix: ");
		double price = Double.parseDouble(sc.nextLine());
		truck.setPrice(price);
		
		//gets the engine
		Engine engine = getEngine();
		
		//sets the engine
		engineService.addEngine(engine);
		truck.setEngine(engine);

		//gets a registration date
		System.out.println("Saisir une date d'immatriculation:");
		LocalDate registrationDate = LocalDate.parse(sc.nextLine());
		truck.setRegistrationDate(registrationDate);
		
		//gets an axles number
		System.out.println("Saisir un nombre d'essieux:");
		int nbAxles = Integer.parseInt(sc.nextLine());
		truck.setNbAxles(nbAxles);
		
		//gets a cargo volume
		System.out.println("Saisir un volume de chargement:");
		int cargoVolume = Integer.parseInt(sc.nextLine());
		truck.setCargoVolume(cargoVolume);
		
		//gets a cargo weight
		System.out.println("Saisir un poids de chargement:");
		int cargoWeight = Integer.parseInt(sc.nextLine());
		truck.setCargoWeight(cargoWeight);
		
		//stes the options
		addOptions(truck);
		
		//sets the truck
		garage.addVehicle(truck);
		vehicleService.addVehicle(truck);
		
	}

	/**
	 * motorcycle creation method
	 */
	private static void createMotorcycle() {
		System.out.println("Création de moto: ");
		//motorcycle object
		Motorcycle motorcycle = new Motorcycle();
		
		//gets a garage 
		Garage garage = getGarage();
		
		//gets a name
		System.out.println("Saisir un nom: ");
		String name = sc.nextLine();
		motorcycle.setName(name);
		
		//gets a price
		System.out.println("Saisir un prix: ");
		double price = Double.parseDouble(sc.nextLine());
		motorcycle.setPrice(price);
		
		//gets the engine
		Engine engine = getEngine();
		
		//sets the engine
		engineService.addEngine(engine);
		motorcycle.setEngine(engine);
		
		//gets a registration date
		System.out.println("Saisir une date d'immatriculation:");
		LocalDate registrationDate = LocalDate.parse(sc.nextLine());
		motorcycle.setRegistrationDate(registrationDate);
		
		//gets the cylinders
		System.out.println("Saisir une cylindrée:");
		int cylinders = Integer.parseInt(sc.nextLine());
		motorcycle.setCylinders(cylinders);
		
		//gets the options
		addOptions(motorcycle);
		
		//sets the motorcycle
		garage.addVehicle(motorcycle);
		vehicleService.addVehicle(motorcycle);
		
	}

	/**
	 * engine selection method
	 * @return selected engine
	 */
	private static Engine getEngine() {
		//shows the engine types list
		System.out.println("liste de types de moteur:");
		for (EngineType engineType : EngineType.values()) {
			System.out.println(engineType);
		}
		//gets an engine type
		System.out.println("Saisir un type de moteur:");
		String engineTypeString = sc.nextLine();
		//gets an engine power
		System.out.println("Saisir une puissance de moteur:");
		int enginePower = Integer.parseInt(sc.nextLine());
		
		//sets the engine
		Engine engine = new Engine(EngineType.valueOf(engineTypeString), enginePower);
		return engine;
	}

	/**
	 * garage selection method
	 * @return selected garage
	 */
	private static Garage getGarage() {
		showGarageNames();
		//gets a garage
		System.out.println("saisir un id:");
		int id = Integer.parseInt(sc.nextLine());
		Garage garage = garageService.getGarage(id);
		return garage;
	}

	/**
	 * car creation method
	 */
	private static void createCar() {
		System.out.println("Création de voiture: ");
		//car object
		Car car = new Car();
		
		//garage selection
		Garage garage = getGarage();
		
		//gets a name
		System.out.println("Saisir un nom: ");
		String name = sc.nextLine();
		car.setName(name);
		
		//gets a price
		System.out.println("Saisir un prix: ");
		double price = Double.parseDouble(sc.nextLine());
		car.setPrice(price);
		
		//gets an engine
		Engine engine = getEngine();
		
		//sets the engine
		engineService.addEngine(engine);
		car.setEngine(engine);
		
		
		//gets a registration date
		System.out.println("Saisir une date d'immatriculation:");
		LocalDate registrationDate = LocalDate.parse(sc.nextLine());
		car.setRegistrationDate(registrationDate);
		
		//gets a fiscal power
		System.out.println("Saisir une puissance en chevaux fiscaux:");
		int fiscalPower = Integer.parseInt(sc.nextLine());
		car.setFiscalPower(fiscalPower);
		
		//gets the number of doors
		System.out.println("Saisir un nombre de portes:");
		int nbDoors = Integer.parseInt(sc.nextLine());
		car.setNbDoors(nbDoors);
		
		//gets the number of seats
		System.out.println("Saisir un nombre de sièges:");
		int nbSeats = Integer.parseInt(sc.nextLine());
		car.setNbSeats(nbSeats);
		
		//gets the booth size (L)
		System.out.println("Saisir une taille de coffre (L):");
		int boothSize = Integer.parseInt(sc.nextLine());
		car.setBoothSize(boothSize);
		
		//gets the options
		addOptions(car);
		
		//sets the car
		garage.addVehicle(car);
		vehicleService.addVehicle(car);
	}

	/**
	 * options selection method
	 * @param vehicle Vehicle to set
	 */
	private static void addOptions(Vehicle vehicle) {
		System.out.println("ajouter des Options:");
		//add options loop
		char doContinue = 'y';
		while(doContinue != 'n'){
			//continue?
			System.out.println("ajouter une option? (y/n)");
			doContinue = sc.nextLine().charAt(0);
			//if we continue
			if(doContinue != 'n') {
				System.out.println("Choisir une option: ");
				//gets the options list
				showOptions();
				//sets an option
				int optionId = Integer.parseInt(sc.nextLine());
				VehicleOption option = optionService.getVehicleOption(optionId);
				vehicle.addOption(option);
			}
		}
	}

	/**
	 * garage creation method
	 */
	private static void createGarage() {
		System.out.println("Création de garage:");
		//garage object
		Garage garage = new Garage();
		//gets the name
		System.out.println("saisir un nom:");
		String name = sc.nextLine();
		garage.setName(name);
		
		//sets the object
		garageService.addGarage(garage);
	}

	/**
	 * main method
	 * @param args program arguments
	 */
	public static void main(String[] args) {
		//garage creation
		Garage garage = new Garage("Garage Isidore");
		garageService.addGarage(garage);
		//car creation 
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
		
		//truck creation
		Engine engine2 = new Engine(EngineType.Gas, 1000);
		engineService.addEngine(engine2);
		Truck truck1 = new Truck("MAN", 15000, Brand.MAN,engine2 , LocalDate.parse("2021-07-09"), 3,50, 100);
		truck1.addOption(op1);
		truck1.addOption(op2);
		garage.addVehicle(truck1);
		vehicleService.addVehicle(truck1);
		System.out.println(truck1);
		System.out.println("Taxes: "+truck1.calcTaxes());
		
		//motorcycle creation
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
		
		//console menu
		garageMenu();
		
	}

}
