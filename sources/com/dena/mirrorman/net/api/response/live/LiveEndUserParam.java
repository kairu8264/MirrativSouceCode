package com.dena.mirrorman.net.api.response.live;

import java.io.Serializable;
import java.util.List;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveEndUserParam implements Serializable {
    public static final int $stable = 8;
    private final LiveEndLiveParam pastLiveBestRecord;
    private final List<Integer> totalViewerNumHistory;

    public LiveEndUserParam(List<Integer> list) {
        this(list, null, 2, null);
    }

    public LiveEndUserParam(List<Integer> list, LiveEndLiveParam liveEndLiveParam) {
        this.totalViewerNumHistory = list;
        this.pastLiveBestRecord = liveEndLiveParam;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveEndUserParam copy$default(LiveEndUserParam liveEndUserParam, List list, LiveEndLiveParam liveEndLiveParam, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = liveEndUserParam.totalViewerNumHistory;
        }
        if ((i10 & 2) != 0) {
            liveEndLiveParam = liveEndUserParam.pastLiveBestRecord;
        }
        return liveEndUserParam.copy(list, liveEndLiveParam);
    }

    public final List<Integer> component1() {
        return this.totalViewerNumHistory;
    }

    public final LiveEndLiveParam component2() {
        return this.pastLiveBestRecord;
    }

    public final LiveEndUserParam copy(List<Integer> list, LiveEndLiveParam liveEndLiveParam) {
        return new LiveEndUserParam(list, liveEndLiveParam);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveEndUserParam) {
            LiveEndUserParam liveEndUserParam = (LiveEndUserParam) obj;
            return p.c(this.totalViewerNumHistory, liveEndUserParam.totalViewerNumHistory) && p.c(this.pastLiveBestRecord, liveEndUserParam.pastLiveBestRecord);
        }
        return false;
    }

    public final LiveEndLiveParam getPastLiveBestRecord() {
        return this.pastLiveBestRecord;
    }

    public final List<Integer> getTotalViewerNumHistory() {
        return this.totalViewerNumHistory;
    }

    public int hashCode() {
        List<Integer> list = this.totalViewerNumHistory;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        LiveEndLiveParam liveEndLiveParam = this.pastLiveBestRecord;
        return hashCode + (liveEndLiveParam != null ? liveEndLiveParam.hashCode() : 0);
    }

    public String toString() {
        return "LiveEndUserParam(totalViewerNumHistory=" + this.totalViewerNumHistory + ", pastLiveBestRecord=" + this.pastLiveBestRecord + ')';
    }

    public /* synthetic */ LiveEndUserParam(List list, LiveEndLiveParam liveEndLiveParam, int i10, h hVar) {
        this(list, (i10 & 2) != 0 ? null : liveEndLiveParam);
    }
}
