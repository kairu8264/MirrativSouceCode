package com.dena.mirrorman.net.bcsvr.response;

/* loaded from: classes2.dex */
public final class LiveViewerNum {
    public static final int $stable = 0;
    private final int onlineViewerNum;
    private final int totalViewerNum;

    public LiveViewerNum(int i10, int i11) {
        this.onlineViewerNum = i10;
        this.totalViewerNum = i11;
    }

    public static /* synthetic */ LiveViewerNum copy$default(LiveViewerNum liveViewerNum, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = liveViewerNum.onlineViewerNum;
        }
        if ((i12 & 2) != 0) {
            i11 = liveViewerNum.totalViewerNum;
        }
        return liveViewerNum.copy(i10, i11);
    }

    public final int component1() {
        return this.onlineViewerNum;
    }

    public final int component2() {
        return this.totalViewerNum;
    }

    public final LiveViewerNum copy(int i10, int i11) {
        return new LiveViewerNum(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveViewerNum) {
            LiveViewerNum liveViewerNum = (LiveViewerNum) obj;
            return this.onlineViewerNum == liveViewerNum.onlineViewerNum && this.totalViewerNum == liveViewerNum.totalViewerNum;
        }
        return false;
    }

    public final int getOnlineViewerNum() {
        return this.onlineViewerNum;
    }

    public final int getTotalViewerNum() {
        return this.totalViewerNum;
    }

    public int hashCode() {
        return (Integer.hashCode(this.onlineViewerNum) * 31) + Integer.hashCode(this.totalViewerNum);
    }

    public String toString() {
        return "LiveViewerNum(onlineViewerNum=" + this.onlineViewerNum + ", totalViewerNum=" + this.totalViewerNum + ')';
    }
}
