package com.dena.mirrorman.net.api.response;

import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ToolTipStartLiveButtonToolTip {
    public static final int $stable = 8;
    private final List<ToolTipStartLiveButtonAttributedText> attributedTexts;
    private final List<String> smallIconImageUrls;
    @b(ToolTipStartLiveButtonTypeAdapter.class)
    private final ToolTipStartLiveButtonType type;

    public ToolTipStartLiveButtonToolTip(ToolTipStartLiveButtonType toolTipStartLiveButtonType, List<ToolTipStartLiveButtonAttributedText> list, List<String> list2) {
        p.h(toolTipStartLiveButtonType, "type");
        p.h(list, "attributedTexts");
        this.type = toolTipStartLiveButtonType;
        this.attributedTexts = list;
        this.smallIconImageUrls = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolTipStartLiveButtonToolTip copy$default(ToolTipStartLiveButtonToolTip toolTipStartLiveButtonToolTip, ToolTipStartLiveButtonType toolTipStartLiveButtonType, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            toolTipStartLiveButtonType = toolTipStartLiveButtonToolTip.type;
        }
        if ((i10 & 2) != 0) {
            list = toolTipStartLiveButtonToolTip.attributedTexts;
        }
        if ((i10 & 4) != 0) {
            list2 = toolTipStartLiveButtonToolTip.smallIconImageUrls;
        }
        return toolTipStartLiveButtonToolTip.copy(toolTipStartLiveButtonType, list, list2);
    }

    public final ToolTipStartLiveButtonType component1() {
        return this.type;
    }

    public final List<ToolTipStartLiveButtonAttributedText> component2() {
        return this.attributedTexts;
    }

    public final List<String> component3() {
        return this.smallIconImageUrls;
    }

    public final ToolTipStartLiveButtonToolTip copy(ToolTipStartLiveButtonType toolTipStartLiveButtonType, List<ToolTipStartLiveButtonAttributedText> list, List<String> list2) {
        p.h(toolTipStartLiveButtonType, "type");
        p.h(list, "attributedTexts");
        return new ToolTipStartLiveButtonToolTip(toolTipStartLiveButtonType, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ToolTipStartLiveButtonToolTip) {
            ToolTipStartLiveButtonToolTip toolTipStartLiveButtonToolTip = (ToolTipStartLiveButtonToolTip) obj;
            return this.type == toolTipStartLiveButtonToolTip.type && p.c(this.attributedTexts, toolTipStartLiveButtonToolTip.attributedTexts) && p.c(this.smallIconImageUrls, toolTipStartLiveButtonToolTip.smallIconImageUrls);
        }
        return false;
    }

    public final List<ToolTipStartLiveButtonAttributedText> getAttributedTexts() {
        return this.attributedTexts;
    }

    public final List<String> getSmallIconImageUrls() {
        return this.smallIconImageUrls;
    }

    public final ToolTipStartLiveButtonType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((this.type.hashCode() * 31) + this.attributedTexts.hashCode()) * 31;
        List<String> list = this.smallIconImageUrls;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "ToolTipStartLiveButtonToolTip(type=" + this.type + ", attributedTexts=" + this.attributedTexts + ", smallIconImageUrls=" + this.smallIconImageUrls + ')';
    }
}
