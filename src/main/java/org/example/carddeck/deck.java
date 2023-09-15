package org.example.carddeck;

public interface deck{

    void cut(int index);
    Card deal();
    void newOrder (Deck deck);
    int search(Card card);
    void shuffle();
    int size();
    Card turnOver();


}
