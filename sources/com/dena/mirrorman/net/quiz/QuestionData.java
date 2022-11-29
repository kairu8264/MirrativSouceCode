package com.dena.mirrorman.net.quiz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public class QuestionData implements Parcelable {
    private List<? extends QuizChoice> answers;
    private String body;
    private int correctAnswerNth;
    private int dismissPopupAfter;
    private int nth;
    private int remainingTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuestionData> CREATOR = new Parcelable.Creator<QuestionData>() { // from class: com.dena.mirrorman.net.quiz.QuestionData$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuestionData createFromParcel(Parcel parcel) {
            p.h(parcel, "source");
            return new QuestionData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuestionData[] newArray(int i10) {
            return new QuestionData[i10];
        }
    };

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public QuestionData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<QuizChoice> getAnswers() {
        return this.answers;
    }

    public final String getBody() {
        return this.body;
    }

    public final int getCorrectAnswerNth() {
        return this.correctAnswerNth;
    }

    public final int getDismissPopupAfter() {
        return this.dismissPopupAfter;
    }

    public final int getNth() {
        return this.nth;
    }

    public final int getRemainingTime() {
        return this.remainingTime;
    }

    public final void setAnswers(List<? extends QuizChoice> list) {
        this.answers = list;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setCorrectAnswerNth(int i10) {
        this.correctAnswerNth = i10;
    }

    public final void setDismissPopupAfter(int i10) {
        this.dismissPopupAfter = i10;
    }

    public final void setNth(int i10) {
        this.nth = i10;
    }

    public final void setRemainingTime(int i10) {
        this.remainingTime = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "dest");
        parcel.writeString(this.body);
        parcel.writeInt(this.remainingTime);
        parcel.writeTypedList(this.answers);
        parcel.writeInt(this.dismissPopupAfter);
        parcel.writeInt(this.correctAnswerNth);
        parcel.writeInt(this.nth);
    }

    public QuestionData(Parcel parcel) {
        p.h(parcel, "in");
        this.body = parcel.readString();
        this.remainingTime = parcel.readInt();
        this.answers = parcel.createTypedArrayList(QuizChoice.CREATOR);
        this.dismissPopupAfter = parcel.readInt();
        this.correctAnswerNth = parcel.readInt();
        this.nth = parcel.readInt();
    }
}
