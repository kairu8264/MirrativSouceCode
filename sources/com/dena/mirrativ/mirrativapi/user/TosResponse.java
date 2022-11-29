package com.dena.mirrativ.mirrativapi.user;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class TosResponse {
    private final TosPopUp popup;
    private final Status status;

    public TosResponse(TosPopUp tosPopUp, Status status) {
        p.h(status, "status");
        this.popup = tosPopUp;
        this.status = status;
    }

    public static /* synthetic */ TosResponse copy$default(TosResponse tosResponse, TosPopUp tosPopUp, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            tosPopUp = tosResponse.popup;
        }
        if ((i10 & 2) != 0) {
            status = tosResponse.status;
        }
        return tosResponse.copy(tosPopUp, status);
    }

    public final TosPopUp component1() {
        return this.popup;
    }

    public final Status component2() {
        return this.status;
    }

    public final TosResponse copy(TosPopUp tosPopUp, Status status) {
        p.h(status, "status");
        return new TosResponse(tosPopUp, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TosResponse) {
            TosResponse tosResponse = (TosResponse) obj;
            return p.c(this.popup, tosResponse.popup) && p.c(this.status, tosResponse.status);
        }
        return false;
    }

    public final TosPopUp getPopup() {
        return this.popup;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        TosPopUp tosPopUp = this.popup;
        return ((tosPopUp == null ? 0 : tosPopUp.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "TosResponse(popup=" + this.popup + ", status=" + this.status + ')';
    }
}
