package com.bignerdranch.android.geoquiz;

/**
 * Place description here.
 *
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mCheated;

    public Question(int textResId, boolean answerTrue, boolean cheated) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mCheated = cheated;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean ismCheated() {
        return mCheated;
    }

    public void setmCheated(boolean mCheated) {
        this.mCheated = mCheated;
    }
}
