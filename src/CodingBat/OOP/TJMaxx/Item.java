package CodingBat.OOP.TJMaxx;



public class Item {

    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * public constructor with:
     */
    public Item() {
        this.name = name;
        this.quantity = quantity;
        this.catalogNumber = catalogNumber;
        this.price = price;
    }



    /**
         * setter for name instance variable
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * setter for private price
         * @param price
         */
        public void setPrice(double price) {
                this.price = price;
        }

        /**
         * getter for price
         * @return
         */
        public double getPrice() {
            return price;
        }

        /**
         * getter for name
         * @return
         */
        public String getName(){
            return name;
        }


        public int getQuantity(){
            //TODO
            return quantity;

        }
        public void setQuantity(int quantity){
            //TODO
            this.quantity = quantity;
        }

        public int getCatalogNumber(){
            //TODO
            return catalogNumber;
        }

        public void setCatalogNumber(int catalogNumber) {
            this.catalogNumber = catalogNumber;
        }

        /**
         * Override toString:
         * @returns Object description in this format:
         * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
         */
        @Override
        public String toString() {
            return "Regular Item{name="+name+", catalogNumber="+catalogNumber+", quantity="+quantity+", price="+price;
        }

    }
