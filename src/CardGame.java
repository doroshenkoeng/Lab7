import java.util.ArrayList;

public class CardGame {
    private int mCardsNumber;
    private int mCurrentScore1;
    private int mCurrentScore2;
    private int mSuperSkillTimeCame1;
    private int mSuperSkillTimeCame2;
    private ArrayList<Integer> mDeck1;
    private ArrayList<Integer> mDeck2;
    public CardGame(Player player1, Player player2) {
        mCardsNumber = player1.getmCardsNumber();
        mCurrentScore1 = 0;
        mCurrentScore2 = 0;
        mDeck1=new ArrayList<>();
        mDeck2=new ArrayList<>();
        for (int i = 0; i < mCardsNumber; i++)
        {
            mDeck1.add(player1.getmDeck());
            mDeck2.add(player2.getmDeck());
        }
        mSuperSkillTimeCame1 = player1.getmSuperSkillMoveNumber();
        mSuperSkillTimeCame2 = player2.getmSuperSkillMoveNumber();
    }
    public void startGame() {
        for (int i = 0; i < mCardsNumber; i++) {
            int card1 = mDeck1.get(i);
            int card2 = mDeck2.get(i);
            if (mSuperSkillTimeCame1==i) card1 = 5;
            if (mSuperSkillTimeCame2== i) card2 = 5;
            if (card1 > card2) {
                mCurrentScore1++;
            }
            else if (card1 < card2) {
                mCurrentScore2++;
            }
        }
    }
    public int getResult() {
        if (mCurrentScore1>mCurrentScore2) return 1;
        else if (mCurrentScore1<mCurrentScore2) return 2;
        else return 0;
    }


}
