package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class MatchedLiveResponse {
    public static final int $stable = 8;
    private final List<String> appIconUrls;
    private final LiveBasicParams live;
    private final Status status;

    public MatchedLiveResponse(Status status, LiveBasicParams liveBasicParams, List<String> list) {
        p.h(status, "status");
        p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        p.h(list, "appIconUrls");
        this.status = status;
        this.live = liveBasicParams;
        this.appIconUrls = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchedLiveResponse copy$default(MatchedLiveResponse matchedLiveResponse, Status status, LiveBasicParams liveBasicParams, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = matchedLiveResponse.status;
        }
        if ((i10 & 2) != 0) {
            liveBasicParams = matchedLiveResponse.live;
        }
        if ((i10 & 4) != 0) {
            list = matchedLiveResponse.appIconUrls;
        }
        return matchedLiveResponse.copy(status, liveBasicParams, list);
    }

    public final Status component1() {
        return this.status;
    }

    public final LiveBasicParams component2() {
        return this.live;
    }

    public final List<String> component3() {
        return this.appIconUrls;
    }

    public final MatchedLiveResponse copy(Status status, LiveBasicParams liveBasicParams, List<String> list) {
        p.h(status, "status");
        p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        p.h(list, "appIconUrls");
        return new MatchedLiveResponse(status, liveBasicParams, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MatchedLiveResponse) {
            MatchedLiveResponse matchedLiveResponse = (MatchedLiveResponse) obj;
            return p.c(this.status, matchedLiveResponse.status) && p.c(this.live, matchedLiveResponse.live) && p.c(this.appIconUrls, matchedLiveResponse.appIconUrls);
        }
        return false;
    }

    public final List<String> getAppIconUrls() {
        return this.appIconUrls;
    }

    public final LiveBasicParams getLive() {
        return this.live;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.live.hashCode()) * 31) + this.appIconUrls.hashCode();
    }

    public String toString() {
        return "MatchedLiveResponse(status=" + this.status + ", live=" + this.live + ", appIconUrls=" + this.appIconUrls + ')';
    }
}
