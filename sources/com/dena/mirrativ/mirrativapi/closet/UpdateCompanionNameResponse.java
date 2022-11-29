package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class UpdateCompanionNameResponse {
    private final String name;
    private final Status status;

    public UpdateCompanionNameResponse(String str, Status status) {
        p.h(str, "name");
        p.h(status, "status");
        this.name = str;
        this.status = status;
    }

    public static /* synthetic */ UpdateCompanionNameResponse copy$default(UpdateCompanionNameResponse updateCompanionNameResponse, String str, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updateCompanionNameResponse.name;
        }
        if ((i10 & 2) != 0) {
            status = updateCompanionNameResponse.status;
        }
        return updateCompanionNameResponse.copy(str, status);
    }

    public final String component1() {
        return this.name;
    }

    public final Status component2() {
        return this.status;
    }

    public final UpdateCompanionNameResponse copy(String str, Status status) {
        p.h(str, "name");
        p.h(status, "status");
        return new UpdateCompanionNameResponse(str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateCompanionNameResponse) {
            UpdateCompanionNameResponse updateCompanionNameResponse = (UpdateCompanionNameResponse) obj;
            return p.c(this.name, updateCompanionNameResponse.name) && p.c(this.status, updateCompanionNameResponse.status);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "UpdateCompanionNameResponse(name=" + this.name + ", status=" + this.status + ')';
    }
}
