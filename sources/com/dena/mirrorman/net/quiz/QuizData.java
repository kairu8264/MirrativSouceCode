package com.dena.mirrorman.net.quiz;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public class QuizData implements Parcelable {

    /* renamed from: id  reason: collision with root package name */
    private String f26188id;
    private int remainingUserNum;
    private int totalQuestionNum;
    private int totalUserNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuizData> CREATOR = new Parcelable.Creator<QuizData>() { // from class: com.dena.mirrorman.net.quiz.QuizData$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuizData createFromParcel(Parcel parcel) {
            p.h(parcel, "source");
            return new QuizData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuizData[] newArray(int i10) {
            return new QuizData[i10];
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

    public QuizData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.f26188id;
    }

    public final int getRemainingUserNum() {
        return this.remainingUserNum;
    }

    public final int getTotalQuestionNum() {
        return this.totalQuestionNum;
    }

    public final int getTotalUserNum() {
        return this.totalUserNum;
    }

    public final void setId(String str) {
        this.f26188id = str;
    }

    public final void setRemainingUserNum(int i10) {
        this.remainingUserNum = i10;
    }

    public final void setTotalQuestionNum(int i10) {
        this.totalQuestionNum = i10;
    }

    public final void setTotalUserNum(int i10) {
        this.totalUserNum = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "dest");
        parcel.writeInt(this.remainingUserNum);
        parcel.writeInt(this.totalQuestionNum);
        parcel.writeInt(this.totalUserNum);
        parcel.writeString(this.f26188id);
    }

    public QuizData(Parcel parcel) {
        p.h(parcel, "in");
        this.remainingUserNum = parcel.readInt();
        this.totalQuestionNum = parcel.readInt();
        this.totalUserNum = parcel.readInt();
        this.f26188id = parcel.readString();
    }
}
