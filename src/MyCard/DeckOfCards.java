package MyCard;

import java.util.ArrayList;

public class DeckOfCards {

    private ArrayList<MyCard> cards = new ArrayList<>();

    // første statement laves variable, næste er condition som loopet tjekker, hvis den er rigtigt kører loppet hvis forkert går den ud..
    // sidste fortæller at den køre 4 gange


    public ArrayList < MyCard> getCards(){
        return cards;
    }


    // loopet kører
    public DeckOfCards (){
        for (int i = 1; i<5; i++){

            for ( int j = 1; j<14; j++){

                Farve selected = Farve.HJERTER;
                //standard værdi
              switch (i){

                  case 1:
                      selected = Farve.HJERTER;
                      break;

                      case 2:

                          selected = Farve.RUDER;
                          break;

                  case 3:
                      selected = Farve.KLØR;
                      break;

                  case 4:
                      selected = Farve.SPAR;
                      break;

              }

              MyCard newcard = new MyCard(j, selected);
              cards.add(newcard);





            }


        }




    }








}
