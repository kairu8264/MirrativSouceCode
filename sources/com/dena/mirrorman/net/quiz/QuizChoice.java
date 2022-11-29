package com.dena.mirrorman.net.quiz;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public class QuizChoice implements Parcelable {
    private String answererNum;
    private String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuizChoice> CREATOR = new Parcelable.Creator<QuizChoice>() { // from class: com.dena.mirrorman.net.quiz.QuizChoice$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuizChoice createFromParcel(Parcel parcel) {
            p.h(parcel, "source");
            return new QuizChoice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuizChoice[] newArray(int i10) {
            return new QuizChoice[i10];
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

    public QuizChoice() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAnswererNum() {
        return this.answererNum;
    }

    public final String getText() {
        return this.text;
    }

    public final void setAnswererNum(String str) {
        this.answererNum = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "dest");
        parcel.writeString(this.text);
        parcel.writeString(this.answererNum);
    }

    public QuizChoice(Parcel parcel) {
        p.h(parcel, "in");
        this.text = parcel.readString();
        this.answererNum = parcel.readString();
    }
}
