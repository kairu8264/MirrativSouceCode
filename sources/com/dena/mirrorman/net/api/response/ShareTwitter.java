package com.dena.mirrorman.net.api.response;

import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class ShareTwitter implements Serializable {
    public static final int $stable = 8;
    private ShareTwitterCard card;
    private int maxlength;
    private String placeholder;
    private String text;

    public ShareTwitter() {
        this(null, null, 0, null, 15, null);
    }

    public ShareTwitter(String str, String str2, int i10, ShareTwitterCard shareTwitterCard) {
        p.h(str, "text");
        p.h(str2, "placeholder");
        p.h(shareTwitterCard, "card");
        this.text = str;
        this.placeholder = str2;
        this.maxlength = i10;
        this.card = shareTwitterCard;
    }

    public static /* synthetic */ ShareTwitter copy$default(ShareTwitter shareTwitter, String str, String str2, int i10, ShareTwitterCard shareTwitterCard, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shareTwitter.text;
        }
        if ((i11 & 2) != 0) {
            str2 = shareTwitter.placeholder;
        }
        if ((i11 & 4) != 0) {
            i10 = shareTwitter.maxlength;
        }
        if ((i11 & 8) != 0) {
            shareTwitterCard = shareTwitter.card;
        }
        return shareTwitter.copy(str, str2, i10, shareTwitterCard);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.placeholder;
    }

    public final int component3() {
        return this.maxlength;
    }

    public final ShareTwitterCard component4() {
        return this.card;
    }

    public final ShareTwitter copy(String str, String str2, int i10, ShareTwitterCard shareTwitterCard) {
        p.h(str, "text");
        p.h(str2, "placeholder");
        p.h(shareTwitterCard, "card");
        return new ShareTwitter(str, str2, i10, shareTwitterCard);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShareTwitter) {
            ShareTwitter shareTwitter = (ShareTwitter) obj;
            return p.c(this.text, shareTwitter.text) && p.c(this.placeholder, shareTwitter.placeholder) && this.maxlength == shareTwitter.maxlength && p.c(this.card, shareTwitter.card);
        }
        return false;
    }

    public final ShareTwitterCard getCard() {
        return this.card;
    }

    public final int getMaxlength() {
        return this.maxlength;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.placeholder.hashCode()) * 31) + Integer.hashCode(this.maxlength)) * 31) + this.card.hashCode();
    }

    public final void setCard(ShareTwitterCard shareTwitterCard) {
        p.h(shareTwitterCard, "<set-?>");
        this.card = shareTwitterCard;
    }

    public final void setMaxlength(int i10) {
        this.maxlength = i10;
    }

    public final void setPlaceholder(String str) {
        p.h(str, "<set-?>");
        this.placeholder = str;
    }

    public final void setText(String str) {
        p.h(str, "<set-?>");
        this.text = str;
    }

    public String toString() {
        return "ShareTwitter(text=" + this.text + ", placeholder=" + this.placeholder + ", maxlength=" + this.maxlength + ", card=" + this.card + ')';
    }

    public /* synthetic */ ShareTwitter(String str, String str2, int i10, ShareTwitterCard shareTwitterCard, int i11, h hVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new ShareTwitterCard(null, null, null, null, 15, null) : shareTwitterCard);
    }
}
