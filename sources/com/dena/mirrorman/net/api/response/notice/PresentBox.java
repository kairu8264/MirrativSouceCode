package com.dena.mirrorman.net.api.response.notice;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.List;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class PresentBox {
    public static final int $stable = 8;
    private final List<AttributedText> attributedTexts;
    private final String buttonText;
    private final long createdAt;
    private final String description;
    @b(BooleanTypeAdapter.class)
    private final boolean disabled;
    private final String iconUrl;
    private final String imageUrl;
    private boolean isNew;
    private final String link;
    @b(BooleanTypeAdapter.class)
    private final boolean needUserAction;
    private final int receivedAt;
    private final String type;
    private final int userPresentId;

    public PresentBox(int i10, String str, String str2, String str3, List<AttributedText> list, String str4, int i11, boolean z10, long j10, String str5, boolean z11, String str6, boolean z12) {
        p.h(str, "imageUrl");
        p.h(str3, "type");
        p.h(list, "attributedTexts");
        p.h(str4, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str6, "buttonText");
        this.userPresentId = i10;
        this.imageUrl = str;
        this.iconUrl = str2;
        this.type = str3;
        this.attributedTexts = list;
        this.description = str4;
        this.receivedAt = i11;
        this.needUserAction = z10;
        this.createdAt = j10;
        this.link = str5;
        this.disabled = z11;
        this.buttonText = str6;
        this.isNew = z12;
    }

    public final int component1() {
        return this.userPresentId;
    }

    public final String component10() {
        return this.link;
    }

    public final boolean component11() {
        return this.disabled;
    }

    public final String component12() {
        return this.buttonText;
    }

    public final boolean component13() {
        return this.isNew;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final String component4() {
        return this.type;
    }

    public final List<AttributedText> component5() {
        return this.attributedTexts;
    }

    public final String component6() {
        return this.description;
    }

    public final int component7() {
        return this.receivedAt;
    }

    public final boolean component8() {
        return this.needUserAction;
    }

    public final long component9() {
        return this.createdAt;
    }

    public final PresentBox copy(int i10, String str, String str2, String str3, List<AttributedText> list, String str4, int i11, boolean z10, long j10, String str5, boolean z11, String str6, boolean z12) {
        p.h(str, "imageUrl");
        p.h(str3, "type");
        p.h(list, "attributedTexts");
        p.h(str4, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str6, "buttonText");
        return new PresentBox(i10, str, str2, str3, list, str4, i11, z10, j10, str5, z11, str6, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PresentBox) {
            PresentBox presentBox = (PresentBox) obj;
            return this.userPresentId == presentBox.userPresentId && p.c(this.imageUrl, presentBox.imageUrl) && p.c(this.iconUrl, presentBox.iconUrl) && p.c(this.type, presentBox.type) && p.c(this.attributedTexts, presentBox.attributedTexts) && p.c(this.description, presentBox.description) && this.receivedAt == presentBox.receivedAt && this.needUserAction == presentBox.needUserAction && this.createdAt == presentBox.createdAt && p.c(this.link, presentBox.link) && this.disabled == presentBox.disabled && p.c(this.buttonText, presentBox.buttonText) && this.isNew == presentBox.isNew;
        }
        return false;
    }

    public final List<AttributedText> getAttributedTexts() {
        return this.attributedTexts;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLink() {
        return this.link;
    }

    public final boolean getNeedUserAction() {
        return this.needUserAction;
    }

    public final int getReceivedAt() {
        return this.receivedAt;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUserPresentId() {
        return this.userPresentId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.userPresentId) * 31) + this.imageUrl.hashCode()) * 31;
        String str = this.iconUrl;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + this.attributedTexts.hashCode()) * 31) + this.description.hashCode()) * 31) + Integer.hashCode(this.receivedAt)) * 31;
        boolean z10 = this.needUserAction;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode3 = (((hashCode2 + i10) * 31) + Long.hashCode(this.createdAt)) * 31;
        String str2 = this.link;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z11 = this.disabled;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode5 = (((hashCode4 + i11) * 31) + this.buttonText.hashCode()) * 31;
        boolean z12 = this.isNew;
        return hashCode5 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final void setNew(boolean z10) {
        this.isNew = z10;
    }

    public String toString() {
        return "PresentBox(userPresentId=" + this.userPresentId + ", imageUrl=" + this.imageUrl + ", iconUrl=" + this.iconUrl + ", type=" + this.type + ", attributedTexts=" + this.attributedTexts + ", description=" + this.description + ", receivedAt=" + this.receivedAt + ", needUserAction=" + this.needUserAction + ", createdAt=" + this.createdAt + ", link=" + this.link + ", disabled=" + this.disabled + ", buttonText=" + this.buttonText + ", isNew=" + this.isNew + ')';
    }

    public /* synthetic */ PresentBox(int i10, String str, String str2, String str3, List list, String str4, int i11, boolean z10, long j10, String str5, boolean z11, String str6, boolean z12, int i12, h hVar) {
        this(i10, str, str2, str3, list, str4, i11, z10, j10, str5, z11, str6, (i12 & 4096) != 0 ? false : z12);
    }
}
