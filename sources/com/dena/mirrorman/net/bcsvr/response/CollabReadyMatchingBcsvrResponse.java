package com.dena.mirrorman.net.bcsvr.response;

import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class CollabReadyMatchingBcsvrResponse {
    public static final int $stable = 0;
    @c("cm")
    private final String liveComment;
    private final String speech;

    public CollabReadyMatchingBcsvrResponse(String str, String str2) {
        p.h(str, "liveComment");
        p.h(str2, "speech");
        this.liveComment = str;
        this.speech = str2;
    }

    public static /* synthetic */ CollabReadyMatchingBcsvrResponse copy$default(CollabReadyMatchingBcsvrResponse collabReadyMatchingBcsvrResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = collabReadyMatchingBcsvrResponse.liveComment;
        }
        if ((i10 & 2) != 0) {
            str2 = collabReadyMatchingBcsvrResponse.speech;
        }
        return collabReadyMatchingBcsvrResponse.copy(str, str2);
    }

    public final String component1() {
        return this.liveComment;
    }

    public final String component2() {
        return this.speech;
    }

    public final CollabReadyMatchingBcsvrResponse copy(String str, String str2) {
        p.h(str, "liveComment");
        p.h(str2, "speech");
        return new CollabReadyMatchingBcsvrResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabReadyMatchingBcsvrResponse) {
            CollabReadyMatchingBcsvrResponse collabReadyMatchingBcsvrResponse = (CollabReadyMatchingBcsvrResponse) obj;
            return p.c(this.liveComment, collabReadyMatchingBcsvrResponse.liveComment) && p.c(this.speech, collabReadyMatchingBcsvrResponse.speech);
        }
        return false;
    }

    public final String getLiveComment() {
        return this.liveComment;
    }

    public final String getSpeech() {
        return this.speech;
    }

    public int hashCode() {
        return (this.liveComment.hashCode() * 31) + this.speech.hashCode();
    }

    public String toString() {
        return "CollabReadyMatchingBcsvrResponse(liveComment=" + this.liveComment + ", speech=" + this.speech + ')';
    }
}
