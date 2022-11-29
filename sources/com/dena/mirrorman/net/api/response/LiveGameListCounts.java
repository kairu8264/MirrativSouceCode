package com.dena.mirrorman.net.api.response;

import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameListCounts {
    public static final int $stable = 0;
    private final String liveGames;

    public LiveGameListCounts(String str) {
        p.h(str, "liveGames");
        this.liveGames = str;
    }

    public static /* synthetic */ LiveGameListCounts copy$default(LiveGameListCounts liveGameListCounts, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveGameListCounts.liveGames;
        }
        return liveGameListCounts.copy(str);
    }

    public final String component1() {
        return this.liveGames;
    }

    public final LiveGameListCounts copy(String str) {
        p.h(str, "liveGames");
        return new LiveGameListCounts(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveGameListCounts) && p.c(this.liveGames, ((LiveGameListCounts) obj).liveGames);
    }

    public final String getLiveGames() {
        return this.liveGames;
    }

    public int hashCode() {
        return this.liveGames.hashCode();
    }

    public String toString() {
        return "LiveGameListCounts(liveGames=" + this.liveGames + ')';
    }
}
