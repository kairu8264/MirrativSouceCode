package com.dena.mirrorman.net.api.response.live;

import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveTag implements Serializable {
    public static final int $stable = 0;
    private final String tagIconUrl;
    private final String tagText;

    public LiveTag(String str, String str2) {
        p.h(str, "tagIconUrl");
        p.h(str2, "tagText");
        this.tagIconUrl = str;
        this.tagText = str2;
    }

    public static /* synthetic */ LiveTag copy$default(LiveTag liveTag, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveTag.tagIconUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = liveTag.tagText;
        }
        return liveTag.copy(str, str2);
    }

    public final String component1() {
        return this.tagIconUrl;
    }

    public final String component2() {
        return this.tagText;
    }

    public final LiveTag copy(String str, String str2) {
        p.h(str, "tagIconUrl");
        p.h(str2, "tagText");
        return new LiveTag(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveTag) {
            LiveTag liveTag = (LiveTag) obj;
            return p.c(this.tagIconUrl, liveTag.tagIconUrl) && p.c(this.tagText, liveTag.tagText);
        }
        return false;
    }

    public final String getTagIconUrl() {
        return this.tagIconUrl;
    }

    public final String getTagText() {
        return this.tagText;
    }

    public int hashCode() {
        return (this.tagIconUrl.hashCode() * 31) + this.tagText.hashCode();
    }

    public String toString() {
        return "LiveTag(tagIconUrl=" + this.tagIconUrl + ", tagText=" + this.tagText + ')';
    }
}
