public class InternController {
    private Intern model;
    private InternView view;
 
    public InternController(Intern model, InternView view){
       this.model = model;
       this.view = view;
    }
 
    public String getInternName() {
        return model.getName();	
     }
     
     public void setInternName(String name){
        model.setName(name);		
     }
  
     public String getInternLastname() {
        return model.getLastname();
     }
     
     public void setInternLastname(String lastname) {
        model.setLastname(lastname);	
     }
     
     public void updateView(){				  
       view.printInternDetails(model.getName(), model.getLastname());
    }	
 }