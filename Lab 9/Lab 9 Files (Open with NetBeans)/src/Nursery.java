import java.util.*;

public class Nursery {
    
    //Create a new Collection of Plant objects, called plants
    private Collection<Plant> plants;
    
    
    //Constructor
    public Nursery(){
        //this.plants = new ArrayList<>();
        //this.plants = new HashSet<>();
        //this.plants = new TreeSet<>();
        this.plants = new ArrayList<>();
    }
    
    
    public String addPlant(String name, String price, String quantity){
        //public Plant(String name, double price, int quantity){
        Plant plant = new Plant(name,
                                Double.parseDouble(price),
                                Integer.parseInt(quantity));
       
        return "Plant " + name + (plants.add(plant) ? " added" : " not added");
    }
    

    public ArrayList<String> getPlant(String plantName){
        Plant p = getPlantObject(plantName);
        if (p == null){
            ArrayList<String> answer = new ArrayList<>();
            answer.add("Plant not found");
            return answer;
        }
    
        return p.getPlantDetails();
   
      
    }
    

    private Plant getPlantObject(String plantName){
        Plant p = new Plant(plantName);
         if(plants.contains(p)){ 
             for(Plant pt: plants){  
                 if(pt.equals(p)) 
                     return pt;
             }
        }
        return null;
    }
    

    public String updatePlant(String name, String price, String quantity){
        Plant p = getPlantObject (name);
        if (p == null) return "Could not update plant details. Plant "+ name +" not found";
        p.setPrice(Double.parseDouble(price));
        p.setQuantity(Integer.parseInt(quantity));
        return name + " Updated Successfully";
    }
    
    public String deletePlant(String name, String price, String quantity){
        Plant p = getPlantObject (name);
        if (p == null) return "Could not delete plant details. Plant "+ name +" doesn't exist";
        return (this.plants.remove(p) ? "deletion successful" : "deletion unsucessful");
    }

  

    
//    public String getPlantsByName(){
//        return (plants.isEmpty()?"No plants in greenhouse at the moment":plants.toString());
//    }
    
    public String getPlantsByName(){
        ArrayList<Plant> plantsDup = new ArrayList<Plant>(plants);
        Collections.sort(plantsDup);//uses the in house comparable
        return (plants.isEmpty()?
                "No plants in the greenhouse at the moment":
                plantsDup.toString());
    }
    

//    public String getPlantsByPrice(){
//        TreeSet<Plant> plantsByPrice = new TreeSet<>(new PriceComparator());
//        plantsByPrice.addAll(plants);
//        return (plants.isEmpty()?
//                "No plants in the greenhouse":
//                plantsByPrice.toString());
//    }

    public String getPlantsByPrice(){
        ArrayList<Plant> plantsByPrice = new ArrayList<>(plants);
        Collections.sort(plantsByPrice, new PriceComparator());
        return (plants.isEmpty()?
                "No plants in the greenhouse":
                plantsByPrice.toString());
    }
    
    public class PriceComparator implements Comparator{
        public int compare(Object obj1, Object obj2){
            if (!(obj1 instanceof Plant && obj2 instanceof Plant)){
                throw new IllegalArgumentException(
                "Must be plant for comparison");
            }
            Plant p1 = (Plant) obj1;
            Plant p2 = (Plant) obj2;
            
            if (p1.getPrice() > p2.getPrice()) return 1;
            if (p1.getPrice() < p2.getPrice()) return -1;
            return 0;
        }
    }
    
}

