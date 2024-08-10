package Hotel;
import java.io.Serializable;
public class Food implements Serializable {
    int item_no;
    int quantity;
    float price;

    Food(int item_no, int quantity) {
        this.item_no = item_no;
        this.quantity = quantity;
        switch (item_no) {
            case 1:
                price = quantity * 50;
                break;
            case 2:
                price = quantity * 60;
                break;
            case 3:
                price = quantity * 70;
                break;
            case 4:
                price = quantity * 30;
                break;
        }
    }


        public int getItem_no(){
            return item_no;
        }

        // Getter method for quantity
        public int getQuantity(){
            return quantity;
        }

        public float getPrice(){
            return price;
        }


}