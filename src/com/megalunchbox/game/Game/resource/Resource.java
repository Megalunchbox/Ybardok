package com.megalunchbox.game.game.resource;

public class Resource {

  @NotNull
  float amount;
  @NotNull
  Resource.Type type;
  

  public enum Type {
    
    ROCK(0, "rock"),
    LUMBER(1, "lumber"),
    IRON(2, "iron"),
    ;
    
    @NotNull
    private String name;
    
    @NotNull
    private int id;
    
    @NotNull
    private Texture texture;
    
    public Type(int id, String name) {
      this.id = id;
      this.name = name;
    }
    
    public void setTexture(Texture texture) {
      this.texture = texture;
    }
    
    public Texture texture() {
      this.texture = texture;
    }
    
    public int id() {
      return id;
    }
    public String name() {
      return name;
    }
    
  }
  
  public static class ResourceIncome {
    @NotNull
    private static HashMap<Resource, ResourceIncome> incomeArrayList = new ArrayList<ResourceIncome>();
    @NotNull
    private int income;
    @NotNull
    private Resource resource;
    
    public ResourceIncome(Resource resource, int income) {
      this.resource = resource;
      this.income = income;
      incomeArrayList.put(resource, this);
    }
    
    public HashMap<Resource, ResourceIncome> getIncomeArray() {
      return incomeArrayList;
    }
    
    public int income() {
      return income;
    }
    
    public void setIncome(int income) {
      this.income = income;
    }
    
    public Resource resource() {
      return resource;
    }
    
  }
}
