package com.dena.mirrorman.net.api.response.live;

import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveShareOthers implements Serializable {
    public static final int $stable = 8;
    private String text;

    public LiveShareOthers() {
        this(null, 1, null);
    }

    public LiveShareOthers(String str) {
        p.h(str, "text");
        this.text = str;
    }

    public static /* synthetic */ LiveShareOthers copy$default(LiveShareOthers liveShareOthers, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveShareOthers.text;
        }
        return liveShareOthers.copy(str);
    }

    public final String component1() {
        return this.text;
    }

    public final LiveShareOthers copy(String str) {
        p.h(str, "text");
        return new LiveShareOthers(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveShareOthers) && p.c(this.text, ((LiveShareOthers) obj).text);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public final void setText(String str) {
        p.h(str, "<set-?>");
        this.text = str;
    }

    public String toString() {
        return "LiveShareOthers(text=" + this.text + ')';
    }

    public /* synthetic */ LiveShareOthers(String str, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
