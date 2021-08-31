package OOP_8;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Item {
    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * public constructor with:
     *
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price         assigns to values to instance variables
     */
    public Item(String name, int quantity, int catalogNumber, double price) {
        this.name = name;
        this.quantity = quantity;
        this.catalogNumber = catalogNumber;
        this.price = price;

    }

    /**
     * setter for name instance variable
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setter for private price
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * getter for price
     *
     * @return
     */
    public double getPrice() {

        return price;
    }

    /**
     * getter for name
     *
     * @return
     */
    public String getName() {


        return name;
    }


    public int getQuantity() {
        //TODO
        return quantity;

    }

    public void setQuantity(int quantity) {
        //TODO
        this.quantity = quantity;
    }

    public int getCatalogNumber() {
        //TODO
        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    /**
     * Override toString:
     *
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */
    @Override
    public String toString() {
        return "Regular Item{" + "Item name=" + name + ", catalog Number=" +
                catalogNumber + ", quantity=" + quantity + ",  price=" + price + "}";
    }




    /*
    ===============================================================================================
     */


    /**
     * SubClass of Item
     */
    public class OnSaleItem extends Item {
        /**
         * private instance variable, used for discount percentage
         */
        private double discount;

        /**
         * public constructor for OnSaleItem
         *
         * @param name
         * @param quantity
         * @param catalogNumber
         * @param price
         * @param discount      - Calls Super class constructor by passing name,quantity,catalogNumber,price
         *                      - it will assign the price after deducting(minus) discount from the price
         *                      - assigns discount
         */
        public OnSaleItem(String name, int quantity, int catalogNumber, double price, double discount) {
            super(name, quantity, catalogNumber, price - discount);
            this.discount = discount;
        }

        /**
         * getter for discount
         *
         * @return
         */
        public double getDiscount() {
            //TODO
            return discount;
        }

        /**
         * setter for discount
         *
         * @param discount
         */
        public void setDiscount(double discount) {
            this.discount = discount;

        }

        /**
         * overrides toString from Item:
         *
         * @returns Object description in this format:
         * * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
         */
        @Override
        public String toString() {
            return "OnSaleItem{discount=" + getDiscount() + "%" + ", name=" + getName();
        }
    }





/*
=====================================================================================
 */


    /**
     * represents TJMaxx store class.
     * https://tjmaxx.com/
     */
    public class TJMaxx {

        /**
         * Private ArrayList to hold regular Item objects
         * and OnSaleItem objects that represent items that sell in TJMaxx
         */
        private ArrayList<Item> regularItems;
        private ArrayList<OnSaleItem> onSaleItems;

        /**
         * Public no-args constructor - Instantiates regularItems and onSaleItems lists
         * as new ArrayList
         */
        public TJMaxx() {
            //TODO
            regularItems = new ArrayList<Item>();

            onSaleItems = new ArrayList<OnSaleItem>();
        }

        /**
         * adds an item object to regularItems list
         *
         * @param item
         */
        public void addRegularItem(Item item) {
            regularItems.add(item);

        }

        /**
         * adds OnSaleItem object to onSaleItems list
         *
         * @param item
         */
        public void addOnSaleItem(OnSaleItem item) {
            onSaleItems.add(item);


        }

        /**
         * getter for regularItems
         *
         * @return
         */
        public ArrayList<Item> getRegularItems() {
            //TODO change from null
            return regularItems;
        }

        /**
         * getter for onSaleItems
         *
         * @return
         */
        public ArrayList<OnSaleItem> getOnSaleItems() {
            //TODO change from null
            return onSaleItems;
        }

        /**
         * return count of regularItem object
         *
         * @return
         */
        public int regularItemsCount() {
            //TODO change from -1
            return regularItems.size();
        }

        /**
         * returns count of onSaleItems in TJ Maxx
         *
         * @return
         */
        public int onSaleItemsCount() {
            //TODO change from -1
            return onSaleItems.size();
        }

        /**
         * returns the name of each item in TJ Maxx starting
         * from regular item then onSaleItems
         *
         * @return
         */
        public ArrayList<String> getAllItemNames() {
            // first, make an array lst for strings.
            // then, go through reg items with a forloop.
            // for each reg item use .getName to return the name and add that name to the arraylist of strings.
            // repat for onSaleItems.

            ArrayList<String> allItemNames = new ArrayList<>();
            for (Item each : regularItems) {
                allItemNames.add(each.getName());
            }
            for (Item each : onSaleItems) {
                allItemNames.add(each.getName());
            }

            return allItemNames;
        }

        /**
         * gets catalog number and returns price for the item
         * it will search for the item both regularItems and onsaleonSaleItems
         *
         * @param catalogNumber
         * @returns 0.0 if product cannot be found with that catalognumber
         */
        public double getItemPrice(int catalogNumber) {
            //look thorugh all items
            //compare the items catalogNumber
            for (Item each : regularItems) {
                if (catalogNumber == each.getCatalogNumber()) {
                    return each.getPrice();
                }
            }

            for (Item each : onSaleItems) {
                if (catalogNumber == each.getCatalogNumber()) {
                    return each.getPrice();
                }
            }

            return 0.0;

            //when we find the correct item
            //return the items price
            //no find return 0

        }

        /**
         * accepts a name then searches
         * amoung onSaleItems. Once it finds, the method will return
         * that OnSaleItem object
         *
         * @param name
         * @return
         */
        public OnSaleItem getOnSaleItem(String name) {
            for (OnSaleItem each : onSaleItems) {
                if (each.getName().equals(name)) {
                    return each;
                }
            }

            return null;
        }

        /**
         * removes the item with matching catalogNumber
         * from both regularItems and onSaleItems.
         * Does nothing if not found
         *
         * @param catalogNumber
         */
        public void removeItem(int catalogNumber) {

            for (Item each : onSaleItems) {
                if (each.getCatalogNumber() == catalogNumber) {
                    onSaleItems.remove(each);
                }
            }

            for (Item each : regularItems) {
                if (each.getCatalogNumber() == catalogNumber) {
                    regularItems.remove(each);
                }
            }
        }

        /**
         * - it accepts a catalog number and finds that item
         * among regularItems and onSaleItems
         * - if it finds the item:
         * - decrease the count of the Item by 1
         * - if count reaches 0 after decrementing then remove the product(call removeItem method)
         *
         * @param catalogNumber
         */
        public void buyItem(int catalogNumber) {

            for (Item each : onSaleItems) {

                if (each.getCatalogNumber() == catalogNumber) {
                    each.setQuantity(each.getQuantity() - 1);
                    if (each.getQuantity() < 1) {
                        removeItem(each.getCatalogNumber());
                    }
                }
            }

            for (Item each : regularItems) {
                if (each.getCatalogNumber() == catalogNumber) {
                    each.setQuantity(each.getQuantity() - 1);
                    if (each.getQuantity() < 1) {
                        removeItem(each.getCatalogNumber());
                    }
                }
            }


        }
    }
}