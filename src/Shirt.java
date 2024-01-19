public class Shirt {
    public int shirtID = 71;
    public String description = "super shirt";
    public char colorCode = 'G';
    public double price = 1000.7;
    public int quantityInStock = 1;
    
    public String getColorString(char colorCode) {
      switch (colorCode) {
          case 'R':
              return "red";
          case 'B':
              return "blue";
          case 'G':
              return "green";
          default:
              return "unset";
      }
    }

    public String colorString = getColorString(colorCode);

    public void displayShirtInformation() {
      System.out.println("Shirt ID: " + shirtID);
      System.out.println("Shirt description: " + description);
      System.out.println("Color Name: " + colorString);
      System.out.println("Shirt price: $" + price);
      System.out.println("Quantity in stock: " + quantityInStock);
    }
  }
