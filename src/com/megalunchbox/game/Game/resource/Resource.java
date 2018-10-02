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
    
    private String name;
    private int id;
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
    private static ArrayList<ResourceIncome> incomeArrayList = new ArrayList<ResourceIncome>();
    private int income;
    private Resource resource;
    
    public ResourceIncome(Resource resource, int income) {
      this.resource = resource;
      this.income = income;
      incomeArrayList.add(this);
    }
    
    public ArrayList<ResourceIncome> getIncomeArray() {
      return incomeArrayList;
    }
    
    public int income() {
      return income;
    }
    
  }
}
