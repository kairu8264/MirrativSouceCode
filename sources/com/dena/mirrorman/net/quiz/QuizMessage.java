package com.dena.mirrorman.net.quiz;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public class QuizMessage implements Parcelable {
    private QuestionData question;
    private QuizData quiz;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuizMessage> CREATOR = new Parcelable.Creator<QuizMessage>() { // from class: com.dena.mirrorman.net.quiz.QuizMessage$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuizMessage createFromParcel(Parcel parcel) {
            p.h(parcel, "source");
            return new QuizMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuizMessage[] newArray(int i10) {
            return new QuizMessage[i10];
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

    public QuizMessage() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final QuestionData getQuestion() {
        return this.question;
    }

    public final QuizData getQuiz() {
        return this.quiz;
    }

    public final void setQuestion(QuestionData questionData) {
        this.question = questionData;
    }

    public final void setQuiz(QuizData quizData) {
        this.quiz = quizData;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "dest");
        parcel.writeParcelable(this.question, i10);
        parcel.writeParcelable(this.quiz, i10);
    }

    public QuizMessage(Parcel parcel) {
        p.h(parcel, "in");
        this.question = (QuestionData) parcel.readParcelable(QuestionData.class.getClassLoader());
        this.quiz = (QuizData) parcel.readParcelable(QuizData.class.getClassLoader());
    }
}
