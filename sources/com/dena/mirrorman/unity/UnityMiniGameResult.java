package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public final class UnityMiniGameResult {
    public static final int $stable = 0;
    private final int score;

    public UnityMiniGameResult(int i10) {
        this.score = i10;
    }

    public static /* synthetic */ UnityMiniGameResult copy$default(UnityMiniGameResult unityMiniGameResult, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = unityMiniGameResult.score;
        }
        return unityMiniGameResult.copy(i10);
    }

    public final int component1() {
        return this.score;
    }

    public final UnityMiniGameResult copy(int i10) {
        return new UnityMiniGameResult(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnityMiniGameResult) && this.score == ((UnityMiniGameResult) obj).score;
    }

    public final int getScore() {
        return this.score;
    }

    public int hashCode() {
        return Integer.hashCode(this.score);
    }

    public String toString() {
        return "UnityMiniGameResult(score=" + this.score + ')';
    }
}
