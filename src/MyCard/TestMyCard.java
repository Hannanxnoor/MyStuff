package MyCard;

public class TestMyCard {

    public static void main(String[] args) {

        //MyCard konge = new MyCard(12,Farve.HJERTER );
       // MyCard knægt = new MyCard(10,Farve.HJERTER );

       // System.out.println(konge.getVærdi() + konge.getFarve().toString());

       DeckOfCards deck = new DeckOfCards();
        //System.out.println(deck.getCards());

        for (MyCard card: deck.getCards()){
            System.out.println(card);
        }










    }




}
