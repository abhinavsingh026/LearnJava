class Product {
    private String itemno;
    private String itemname;
    private float itemprice;
    private int itemquantity;

    public Product(String no) {
        itemno = no;
    }
    public Product(String no,String na) {
        itemno = no;
        itemname = na;
    }
    public Product(String no,String na,float ip,int iq) {
        itemno = no;
        itemname = na;
        itemprice = ip;
        itemquantity = iq;
    }

    public String getItemNo() {
        return itemno;
    }
    public String getItemName() {
        return itemname;
    }
    public float getItemPrice() {
        return itemprice;
    }
    public void setItemPrice(float p) {
        itemprice = p;
    }
    public int getItemQuantity() {
        return itemquantity;
    }
    public void setItemQuantity(int q) {
        itemquantity = q;
    }
    
    public static void main(String []args) { 
    Product p1 = new Product("B23-54");
    Product p2 = new Product("A25-76","TeethBrush");
    Product p3 = new Product("C45-84","Pencil",9.25f,20);
    System.out.println("p1 ItemNo: "+p1.getItemNo());
    System.out.println("p1 Item Name: "+p1.getItemName());
    System.out.println();
//Price & Quantity can be set for p1 & p2 later by using setter method//
    System.out.println("p2 ItemNo: "+p2.getItemNo());
    System.out.println("p2 Item Name: "+p2.getItemName());
    System.out.println("p2 Item Price: "+"$"+p2.getItemPrice());
    System.out.println();

    System.out.println("p3 ItemNo: "+p3.getItemNo());
    System.out.println("p3 Item Name: "+p3.getItemName());
    System.out.println("p3 Item Price: "+"$"+p3.getItemPrice());
    System.out.println("p3 Item Quantity: "+p3.getItemQuantity());
    }
}