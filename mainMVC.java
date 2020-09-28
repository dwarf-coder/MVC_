public class MainMVC{
    public static void main(String[] args) {
      Intern model = retriveInternFromDatabase();
       InternView view = new InternView();
       InternController controller = new InternController(model, view);
       controller.updateView();
       controller.setInternName("John");
       controller.updateView();
    }
 
    public static Intern retriveInternFromDatabase(){
       Intern intern = new Intern();
       intern.setName("Jane");
       intern.setLastname("Doe");
       return intern;
    }    
 }