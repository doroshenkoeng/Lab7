import java.util.ArrayList;
import java.util.Random;
/**This class describes a card game player.*/
public class Player {
    /**An ArrayList that keeps player's deck.*/
    private ArrayList<Integer> mDeck;
    /**A field that keeps cards number of player's deck.*/
    private int mCardsNumber;
    /**A field that keeps player's current score in the card game.*/
    private int mCurrentScore;
    /**A Field that keeps player's move number on which the player uses super skill.*/
    private int mSuperSkillMoveNumber;

    /**
     * A constructor initialized a player.
     */
    public Player() {
        mCardsNumber=36;
        mCurrentScore=0;
        mDeck=new ArrayList<>();
        Random random=new Random();
        mSuperSkillMoveNumber=random.nextInt(mCardsNumber);
        int partOfCardsNumber=(int)Math.ceil(0.9*mCardsNumber);
        for (int i = 0; i < partOfCardsNumber; i++) {
            mDeck.add(random.nextInt(5)+1);
        }
        for (int i = 0; i < mCardsNumber-partOfCardsNumber; i++) {
            mDeck.add(random.nextInt(6)+1);
        }
    }

    /**
     * This method incremented <b>mCurrentScore</b>.
     */
    public void increment() { mCurrentScore++; }

    /**
     * A mCardsNumber getter.
     * @return mCardsNumber
     */
    public int getmCardsNumber() {
        return mCardsNumber;
    }

    /**
     * A mSuperSkillMoveNumber getter.
     * @return mSuperSkillMoveNumber.
     */
    public int getmSuperSkillMoveNumber() {
        return mSuperSkillMoveNumber;
    }

    /**
     * A mCurrentScore getter.
     * @return mCurrentScore.
     */
    public int getmCurrentScore() {
        return mCurrentScore;
    }

    /**
     * The first value mDeck getter.
     * @return the top mDeck card.
     */
    public int getmDeck() {
        int card=mDeck.get(0);
        mDeck.remove(0);
        return card;
    }
}
