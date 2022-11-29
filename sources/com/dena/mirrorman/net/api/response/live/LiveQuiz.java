package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import java.io.Serializable;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class LiveQuiz implements Serializable {
    public static final int $stable = 8;
    @b(BooleanTypeAdapter.class)
    private boolean hasEverFollowed;
    private int questionNth;
    private int remainingLives;
    private String shareText;

    public LiveQuiz() {
        this(0, 0, null, false, 15, null);
    }

    public LiveQuiz(int i10, int i11, String str, boolean z10) {
        p.h(str, "shareText");
        this.questionNth = i10;
        this.remainingLives = i11;
        this.shareText = str;
        this.hasEverFollowed = z10;
    }

    public static /* synthetic */ LiveQuiz copy$default(LiveQuiz liveQuiz, int i10, int i11, String str, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = liveQuiz.questionNth;
        }
        if ((i12 & 2) != 0) {
            i11 = liveQuiz.remainingLives;
        }
        if ((i12 & 4) != 0) {
            str = liveQuiz.shareText;
        }
        if ((i12 & 8) != 0) {
            z10 = liveQuiz.hasEverFollowed;
        }
        return liveQuiz.copy(i10, i11, str, z10);
    }

    public final int component1() {
        return this.questionNth;
    }

    public final int component2() {
        return this.remainingLives;
    }

    public final String component3() {
        return this.shareText;
    }

    public final boolean component4() {
        return this.hasEverFollowed;
    }

    public final LiveQuiz copy(int i10, int i11, String str, boolean z10) {
        p.h(str, "shareText");
        return new LiveQuiz(i10, i11, str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveQuiz) {
            LiveQuiz liveQuiz = (LiveQuiz) obj;
            return this.questionNth == liveQuiz.questionNth && this.remainingLives == liveQuiz.remainingLives && p.c(this.shareText, liveQuiz.shareText) && this.hasEverFollowed == liveQuiz.hasEverFollowed;
        }
        return false;
    }

    public final boolean getHasEverFollowed() {
        return this.hasEverFollowed;
    }

    public final int getQuestionNth() {
        return this.questionNth;
    }

    public final int getRemainingLives() {
        return this.remainingLives;
    }

    public final String getShareText() {
        return this.shareText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.questionNth) * 31) + Integer.hashCode(this.remainingLives)) * 31) + this.shareText.hashCode()) * 31;
        boolean z10 = this.hasEverFollowed;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final void setHasEverFollowed(boolean z10) {
        this.hasEverFollowed = z10;
    }

    public final void setQuestionNth(int i10) {
        this.questionNth = i10;
    }

    public final void setRemainingLives(int i10) {
        this.remainingLives = i10;
    }

    public final void setShareText(String str) {
        p.h(str, "<set-?>");
        this.shareText = str;
    }

    public String toString() {
        return "LiveQuiz(questionNth=" + this.questionNth + ", remainingLives=" + this.remainingLives + ", shareText=" + this.shareText + ", hasEverFollowed=" + this.hasEverFollowed + ')';
    }

    public /* synthetic */ LiveQuiz(int i10, int i11, String str, boolean z10, int i12, h hVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? false : z10);
    }
}
