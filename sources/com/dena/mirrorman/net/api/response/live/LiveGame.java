package com.dena.mirrorman.net.api.response.live;

import java.io.Serializable;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class LiveGame implements Serializable {
    public static final int $stable = 8;
    private final List<String> tags;
    private final int viewerPlayCount;

    public LiveGame() {
        this(0, null, 3, null);
    }

    public LiveGame(int i10, List<String> list) {
        p.h(list, "tags");
        this.viewerPlayCount = i10;
        this.tags = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveGame copy$default(LiveGame liveGame, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = liveGame.viewerPlayCount;
        }
        if ((i11 & 2) != 0) {
            list = liveGame.tags;
        }
        return liveGame.copy(i10, list);
    }

    public final int component1() {
        return this.viewerPlayCount;
    }

    public final List<String> component2() {
        return this.tags;
    }

    public final LiveGame copy(int i10, List<String> list) {
        p.h(list, "tags");
        return new LiveGame(i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGame) {
            LiveGame liveGame = (LiveGame) obj;
            return this.viewerPlayCount == liveGame.viewerPlayCount && p.c(this.tags, liveGame.tags);
        }
        return false;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final int getViewerPlayCount() {
        return this.viewerPlayCount;
    }

    public int hashCode() {
        return (Integer.hashCode(this.viewerPlayCount) * 31) + this.tags.hashCode();
    }

    public String toString() {
        return "LiveGame(viewerPlayCount=" + this.viewerPlayCount + ", tags=" + this.tags + ')';
    }

    public /* synthetic */ LiveGame(int i10, List list, int i11, h hVar) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? s.k() : list);
    }
}
