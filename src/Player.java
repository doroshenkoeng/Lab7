import java.util.ArrayList;
import java.util.Random;

public class Player {
    private ArrayList<Integer> mDeck;
    private int mCardsNumber;
    private int mCurrentScore;
    private int mSuperSkillMoveNumber;
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
    public void increment() { mCurrentScore++; }

    public int getmCardsNumber() {
        return mCardsNumber;
    }

    public int getmSuperSkillMoveNumber() {
        return mSuperSkillMoveNumber;
    }

    public int getmCurrentScore() {
        return mCurrentScore;
    }

    public int getmDeck() {
        int card=mDeck.get(0);
        mDeck.remove(0);
        return card;
    }
}
