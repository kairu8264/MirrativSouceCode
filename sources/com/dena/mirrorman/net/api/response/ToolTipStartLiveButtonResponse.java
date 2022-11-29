package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class ToolTipStartLiveButtonResponse {
    public static final int $stable = 8;
    private final Status status;
    private final ToolTipStartLiveButtonToolTip tooltip;

    public ToolTipStartLiveButtonResponse(Status status, ToolTipStartLiveButtonToolTip toolTipStartLiveButtonToolTip) {
        p.h(status, "status");
        this.status = status;
        this.tooltip = toolTipStartLiveButtonToolTip;
    }

    public static /* synthetic */ ToolTipStartLiveButtonResponse copy$default(ToolTipStartLiveButtonResponse toolTipStartLiveButtonResponse, Status status, ToolTipStartLiveButtonToolTip toolTipStartLiveButtonToolTip, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = toolTipStartLiveButtonResponse.status;
        }
        if ((i10 & 2) != 0) {
            toolTipStartLiveButtonToolTip = toolTipStartLiveButtonResponse.tooltip;
        }
        return toolTipStartLiveButtonResponse.copy(status, toolTipStartLiveButtonToolTip);
    }

    public final Status component1() {
        return this.status;
    }

    public final ToolTipStartLiveButtonToolTip component2() {
        return this.tooltip;
    }

    public final ToolTipStartLiveButtonResponse copy(Status status, ToolTipStartLiveButtonToolTip toolTipStartLiveButtonToolTip) {
        p.h(status, "status");
        return new ToolTipStartLiveButtonResponse(status, toolTipStartLiveButtonToolTip);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ToolTipStartLiveButtonResponse) {
            ToolTipStartLiveButtonResponse toolTipStartLiveButtonResponse = (ToolTipStartLiveButtonResponse) obj;
            return p.c(this.status, toolTipStartLiveButtonResponse.status) && p.c(this.tooltip, toolTipStartLiveButtonResponse.tooltip);
        }
        return false;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final ToolTipStartLiveButtonToolTip getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        ToolTipStartLiveButtonToolTip toolTipStartLiveButtonToolTip = this.tooltip;
        return hashCode + (toolTipStartLiveButtonToolTip == null ? 0 : toolTipStartLiveButtonToolTip.hashCode());
    }

    public String toString() {
        return "ToolTipStartLiveButtonResponse(status=" + this.status + ", tooltip=" + this.tooltip + ')';
    }
}
