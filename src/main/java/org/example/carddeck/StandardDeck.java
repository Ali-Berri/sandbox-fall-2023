package org.example.carddeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardDeck extends AbstractDeck {

    @Override
    public void shuffle () {
        Collections.shuffle(this.cards);
    }

    @Override
    public void cut(int index) {

        List<Card> top= this.cards.subList(0, index);
        List<Card> bottom = this.cards.subList(index, this.cards.size());

        this.cards.clear();

        this.cards.addAll(bottom);
        this.cards.addAll(top);

    }
    @Override
    public  Card deal() {
        return this.cards.remove(0);

    }

    @Override
    public void newOrder(Deck deck) {
        // fix me down one line
        // Collections.sort(deck);
    }

    public StandardDeck() {
        this.cards = newDeck();
        
    }
}
