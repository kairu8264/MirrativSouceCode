package com.dena.mirrorman.net.api.response.notice;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class YourNotice {
    public static final int $stable = 8;
    private final List<YourNoticeAttributedText> attributedTexts;
    private final long createdAt;
    private final String iconImageUrl;

    /* renamed from: id  reason: collision with root package name */
    private String f26176id;
    private final String imageUrl;
    private boolean isNew;
    private final List<String> smallIconImageUrls;
    private final String text;
    private final String url;

    public YourNotice(String str, List<YourNoticeAttributedText> list, long j10, String str2, String str3, List<String> list2, String str4, String str5, boolean z10) {
        p.h(str, "text");
        p.h(list, "attributedTexts");
        p.h(str2, "iconImageUrl");
        p.h(str3, "imageUrl");
        p.h(list2, "smallIconImageUrls");
        p.h(str4, "url");
        p.h(str5, TtmlNode.ATTR_ID);
        this.text = str;
        this.attributedTexts = list;
        this.createdAt = j10;
        this.iconImageUrl = str2;
        this.imageUrl = str3;
        this.smallIconImageUrls = list2;
        this.url = str4;
        this.f26176id = str5;
        this.isNew = z10;
    }

    public final String component1() {
        return this.text;
    }

    public final List<YourNoticeAttributedText> component2() {
        return this.attributedTexts;
    }

    public final long component3() {
        return this.createdAt;
    }

    public final String component4() {
        return this.iconImageUrl;
    }

    public final String component5() {
        return this.imageUrl;
    }

    public final List<String> component6() {
        return this.smallIconImageUrls;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.f26176id;
    }

    public final boolean component9() {
        return this.isNew;
    }

    public final YourNotice copy(String str, List<YourNoticeAttributedText> list, long j10, String str2, String str3, List<String> list2, String str4, String str5, boolean z10) {
        p.h(str, "text");
        p.h(list, "attributedTexts");
        p.h(str2, "iconImageUrl");
        p.h(str3, "imageUrl");
        p.h(list2, "smallIconImageUrls");
        p.h(str4, "url");
        p.h(str5, TtmlNode.ATTR_ID);
        return new YourNotice(str, list, j10, str2, str3, list2, str4, str5, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YourNotice) {
            YourNotice yourNotice = (YourNotice) obj;
            return p.c(this.text, yourNotice.text) && p.c(this.attributedTexts, yourNotice.attributedTexts) && this.createdAt == yourNotice.createdAt && p.c(this.iconImageUrl, yourNotice.iconImageUrl) && p.c(this.imageUrl, yourNotice.imageUrl) && p.c(this.smallIconImageUrls, yourNotice.smallIconImageUrls) && p.c(this.url, yourNotice.url) && p.c(this.f26176id, yourNotice.f26176id) && this.isNew == yourNotice.isNew;
        }
        return false;
    }

    public final List<YourNoticeAttributedText> getAttributedTexts() {
        return this.attributedTexts;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getIconImageUrl() {
        return this.iconImageUrl;
    }

    public final String getId() {
        return this.f26176id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<String> getSmallIconImageUrls() {
        return this.smallIconImageUrls;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((this.text.hashCode() * 31) + this.attributedTexts.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31) + this.iconImageUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.smallIconImageUrls.hashCode()) * 31) + this.url.hashCode()) * 31) + this.f26176id.hashCode()) * 31;
        boolean z10 = this.isNew;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final void setId(String str) {
        p.h(str, "<set-?>");
        this.f26176id = str;
    }

    public final void setNew(boolean z10) {
        this.isNew = z10;
    }

    public String toString() {
        return "YourNotice(text=" + this.text + ", attributedTexts=" + this.attributedTexts + ", createdAt=" + this.createdAt + ", iconImageUrl=" + this.iconImageUrl + ", imageUrl=" + this.imageUrl + ", smallIconImageUrls=" + this.smallIconImageUrls + ", url=" + this.url + ", id=" + this.f26176id + ", isNew=" + this.isNew + ')';
    }

    public /* synthetic */ YourNotice(String str, List list, long j10, String str2, String str3, List list2, String str4, String str5, boolean z10, int i10, h hVar) {
        this(str, list, j10, str2, str3, list2, str4, (i10 & 128) != 0 ? "" : str5, (i10 & 256) != 0 ? false : z10);
    }
}
