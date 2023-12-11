package program;

import program.controller.PetController;
import program.model.Pet;
import program.services.IRepository;
import program.services.PetRepository;
import program.userInterface.ConsoleMenu;

public class Main {
    public static void main(String[] args) throws Exception {

        IRepository<Pet> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu(controller).start();
    }
}