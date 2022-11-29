package com.dena.mirrorman.net.bcsvr.response;

import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class MatchingLiveBcsvrResponse {
    public static final int $stable = 0;
    @c("cm")
    private final String liveComment;
    private final String matchedLiveId;
    private final String speech;

    public MatchingLiveBcsvrResponse(String str, String str2, String str3) {
        p.h(str, "matchedLiveId");
        p.h(str2, "liveComment");
        p.h(str3, "speech");
        this.matchedLiveId = str;
        this.liveComment = str2;
        this.speech = str3;
    }

    public static /* synthetic */ MatchingLiveBcsvrResponse copy$default(MatchingLiveBcsvrResponse matchingLiveBcsvrResponse, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = matchingLiveBcsvrResponse.matchedLiveId;
        }
        if ((i10 & 2) != 0) {
            str2 = matchingLiveBcsvrResponse.liveComment;
        }
        if ((i10 & 4) != 0) {
            str3 = matchingLiveBcsvrResponse.speech;
        }
        return matchingLiveBcsvrResponse.copy(str, str2, str3);
    }

    public final String component1() {
        return this.matchedLiveId;
    }

    public final String component2() {
        return this.liveComment;
    }

    public final String component3() {
        return this.speech;
    }

    public final MatchingLiveBcsvrResponse copy(String str, String str2, String str3) {
        p.h(str, "matchedLiveId");
        p.h(str2, "liveComment");
        p.h(str3, "speech");
        return new MatchingLiveBcsvrResponse(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MatchingLiveBcsvrResponse) {
            MatchingLiveBcsvrResponse matchingLiveBcsvrResponse = (MatchingLiveBcsvrResponse) obj;
            return p.c(this.matchedLiveId, matchingLiveBcsvrResponse.matchedLiveId) && p.c(this.liveComment, matchingLiveBcsvrResponse.liveComment) && p.c(this.speech, matchingLiveBcsvrResponse.speech);
        }
        return false;
    }

    public final String getLiveComment() {
        return this.liveComment;
    }

    public final String getMatchedLiveId() {
        return this.matchedLiveId;
    }

    public final String getSpeech() {
        return this.speech;
    }

    public int hashCode() {
        return (((this.matchedLiveId.hashCode() * 31) + this.liveComment.hashCode()) * 31) + this.speech.hashCode();
    }

    public String toString() {
        return "MatchingLiveBcsvrResponse(matchedLiveId=" + this.matchedLiveId + ", liveComment=" + this.liveComment + ", speech=" + this.speech + ')';
    }
}
