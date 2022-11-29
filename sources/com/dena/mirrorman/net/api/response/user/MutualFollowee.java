package com.dena.mirrorman.net.api.response.user;

import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class MutualFollowee implements Serializable {
    public static final int $stable = 8;
    private final List<String> imageUrls;
    private final String text;

    public MutualFollowee(List<String> list, String str) {
        p.h(list, "imageUrls");
        p.h(str, "text");
        this.imageUrls = list;
        this.text = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutualFollowee copy$default(MutualFollowee mutualFollowee, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = mutualFollowee.imageUrls;
        }
        if ((i10 & 2) != 0) {
            str = mutualFollowee.text;
        }
        return mutualFollowee.copy(list, str);
    }

    public final List<String> component1() {
        return this.imageUrls;
    }

    public final String component2() {
        return this.text;
    }

    public final MutualFollowee copy(List<String> list, String str) {
        p.h(list, "imageUrls");
        p.h(str, "text");
        return new MutualFollowee(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MutualFollowee) {
            MutualFollowee mutualFollowee = (MutualFollowee) obj;
            return p.c(this.imageUrls, mutualFollowee.imageUrls) && p.c(this.text, mutualFollowee.text);
        }
        return false;
    }

    public final List<String> getImageUrls() {
        return this.imageUrls;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.imageUrls.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        return "MutualFollowee(imageUrls=" + this.imageUrls + ", text=" + this.text + ')';
    }
}
