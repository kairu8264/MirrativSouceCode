package com.dena.mirrorman.net.api.response.live;

import java.io.Serializable;
import jo.h;

/* loaded from: classes2.dex */
public final class LiveEndLiveParam implements Serializable {
    public static final int $stable = 8;
    private final int currentLiveContinuousRecord;
    private int maxOnlineViewerNum;
    private int totalViewerNum;

    public LiveEndLiveParam() {
        this(0, 0, 0, 7, null);
    }

    public LiveEndLiveParam(int i10) {
        this(i10, 0, 0, 6, null);
    }

    public LiveEndLiveParam(int i10, int i11) {
        this(i10, i11, 0, 4, null);
    }

    public LiveEndLiveParam(int i10, int i11, int i12) {
        this.totalViewerNum = i10;
        this.maxOnlineViewerNum = i11;
        this.currentLiveContinuousRecord = i12;
    }

    public static /* synthetic */ LiveEndLiveParam copy$default(LiveEndLiveParam liveEndLiveParam, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = liveEndLiveParam.totalViewerNum;
        }
        if ((i13 & 2) != 0) {
            i11 = liveEndLiveParam.maxOnlineViewerNum;
        }
        if ((i13 & 4) != 0) {
            i12 = liveEndLiveParam.currentLiveContinuousRecord;
        }
        return liveEndLiveParam.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.totalViewerNum;
    }

    public final int component2() {
        return this.maxOnlineViewerNum;
    }

    public final int component3() {
        return this.currentLiveContinuousRecord;
    }

    public final LiveEndLiveParam copy(int i10, int i11, int i12) {
        return new LiveEndLiveParam(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveEndLiveParam) {
            LiveEndLiveParam liveEndLiveParam = (LiveEndLiveParam) obj;
            return this.totalViewerNum == liveEndLiveParam.totalViewerNum && this.maxOnlineViewerNum == liveEndLiveParam.maxOnlineViewerNum && this.currentLiveContinuousRecord == liveEndLiveParam.currentLiveContinuousRecord;
        }
        return false;
    }

    public final int getCurrentLiveContinuousRecord() {
        return this.currentLiveContinuousRecord;
    }

    public final int getMaxOnlineViewerNum() {
        return this.maxOnlineViewerNum;
    }

    public final int getTotalViewerNum() {
        return this.totalViewerNum;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.totalViewerNum) * 31) + Integer.hashCode(this.maxOnlineViewerNum)) * 31) + Integer.hashCode(this.currentLiveContinuousRecord);
    }

    public final void setMaxOnlineViewerNum(int i10) {
        this.maxOnlineViewerNum = i10;
    }

    public final void setTotalViewerNum(int i10) {
        this.totalViewerNum = i10;
    }

    public String toString() {
        return "LiveEndLiveParam(totalViewerNum=" + this.totalViewerNum + ", maxOnlineViewerNum=" + this.maxOnlineViewerNum + ", currentLiveContinuousRecord=" + this.currentLiveContinuousRecord + ')';
    }

    public /* synthetic */ LiveEndLiveParam(int i10, int i11, int i12, int i13, h hVar) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
    }
}
