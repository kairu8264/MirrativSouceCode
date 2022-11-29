package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class UpdatePartTextResponse {
    private final String partText;
    private final Status status;

    public UpdatePartTextResponse(String str, Status status) {
        p.h(str, "partText");
        p.h(status, "status");
        this.partText = str;
        this.status = status;
    }

    public static /* synthetic */ UpdatePartTextResponse copy$default(UpdatePartTextResponse updatePartTextResponse, String str, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updatePartTextResponse.partText;
        }
        if ((i10 & 2) != 0) {
            status = updatePartTextResponse.status;
        }
        return updatePartTextResponse.copy(str, status);
    }

    public final String component1() {
        return this.partText;
    }

    public final Status component2() {
        return this.status;
    }

    public final UpdatePartTextResponse copy(String str, Status status) {
        p.h(str, "partText");
        p.h(status, "status");
        return new UpdatePartTextResponse(str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdatePartTextResponse) {
            UpdatePartTextResponse updatePartTextResponse = (UpdatePartTextResponse) obj;
            return p.c(this.partText, updatePartTextResponse.partText) && p.c(this.status, updatePartTextResponse.status);
        }
        return false;
    }

    public final String getPartText() {
        return this.partText;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.partText.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "UpdatePartTextResponse(partText=" + this.partText + ", status=" + this.status + ')';
    }
}
