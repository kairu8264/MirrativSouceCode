package com.mirrativ.llstream.publish;

import com.mirrativ.llstream.decoder.a;
import jo.h;
import jo.p;

/* loaded from: classes4.dex */
public final class LLPublishStreamParams {
    private final boolean useCurrentTimestampAsPacketTime;
    private final String userAgent;

    public LLPublishStreamParams() {
        this(null, false, 3, null);
    }

    public LLPublishStreamParams(String str, boolean z10) {
        p.h(str, "userAgent");
        this.userAgent = str;
        this.useCurrentTimestampAsPacketTime = z10;
    }

    public static /* synthetic */ LLPublishStreamParams copy$default(LLPublishStreamParams lLPublishStreamParams, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lLPublishStreamParams.userAgent;
        }
        if ((i10 & 2) != 0) {
            z10 = lLPublishStreamParams.useCurrentTimestampAsPacketTime;
        }
        return lLPublishStreamParams.copy(str, z10);
    }

    public final String component1() {
        return this.userAgent;
    }

    public final boolean component2() {
        return this.useCurrentTimestampAsPacketTime;
    }

    public final LLPublishStreamParams copy(String str, boolean z10) {
        p.h(str, "userAgent");
        return new LLPublishStreamParams(str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LLPublishStreamParams) {
            LLPublishStreamParams lLPublishStreamParams = (LLPublishStreamParams) obj;
            return p.c(this.userAgent, lLPublishStreamParams.userAgent) && this.useCurrentTimestampAsPacketTime == lLPublishStreamParams.useCurrentTimestampAsPacketTime;
        }
        return false;
    }

    public final boolean getUseCurrentTimestampAsPacketTime() {
        return this.useCurrentTimestampAsPacketTime;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.userAgent.hashCode() * 31;
        boolean z10 = this.useCurrentTimestampAsPacketTime;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        StringBuilder a10 = a.a("LLPublishStreamParams(userAgent=");
        a10.append(this.userAgent);
        a10.append(", useCurrentTimestampAsPacketTime=");
        a10.append(this.useCurrentTimestampAsPacketTime);
        a10.append(')');
        return a10.toString();
    }

    public /* synthetic */ LLPublishStreamParams(String str, boolean z10, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? true : z10);
    }
}
