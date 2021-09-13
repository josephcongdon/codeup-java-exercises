public class Product {

    private String name;
    private double priceInCents;



    public Product(String name, double priceInCents){
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public static double findAveragePrice(Product[] products){

        double sum = 0;
        for(Product product : products) {
            sum += product.getPriceInCents();
        }

        return sum / products.length;
    }
        public String getName(){
            return name;
        }

        public int getPriceInCents(){
            return (int) priceInCents;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setPriceInCents(int priceInCents){
            this.priceInCents =priceInCents;
        }

    public static void main(String[] args) {
        // create 3 products
//        Product p1 = new Product("ductape", 3.99);
//        Product p2 = new Product("hammer", 4.99);
//        Product p3 = new Product("hacksaw",5.85);

//        Product products = {
//                new Product("ductape", 3.99),
//                new Product("hammer", 4.99),
//                new Product("hacksaw", 5.85)
//            }
//            double average = Product.findAveragePrice();
        }

        // store 3 products in array of products


        // Call findAveragePrice passing in the array of products storing value in double
        //use printf as to print out currency for the double
//        findAveragePrice();
//        System.out.printf(" %.2f",  sum / product.length);



    }

    /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, findAveragePrice, that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */

//
//}
