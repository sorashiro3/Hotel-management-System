package Hotel;

import java.io.Serializable;

public class holder implements Serializable {

    int cnt = 10, cnt2 = 20, cnt3 = 10, cnt4 = 20 ;

    Doubleroom luxury_doublerrom[]=new Doubleroom[10]; //Luxury
    Doubleroom deluxe_doublerrom[]=new Doubleroom[20]; //Deluxe
    Singleroom luxury_singleerrom[]=new Singleroom[10]; //Luxury
    Singleroom deluxe_singleerrom[]=new Singleroom[20]; //Deluxe

    int getLuxury_double_room_count()
    {   return cnt-- ; }

    int getDeluxe_double_room_count()
    {   return  cnt2-- ;}

    int getLuxury_single_room_count()
    {   return cnt3-- ; }

    int getDeluxe_single_room_count()
    {   return  cnt4-- ; }

}
