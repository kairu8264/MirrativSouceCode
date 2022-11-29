package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ShooterMatchingResponse {
    public static final int $stable = 8;
    private final boolean isMatchingEnabled;
    private final Status status;
    private final List<String> streamerIconUrls;
    private final String streamerNumText;
    private final List<ShooterMatchingMember> viewers;

    public ShooterMatchingResponse(boolean z10, List<String> list, String str, List<ShooterMatchingMember> list2, Status status) {
        p.h(list, "streamerIconUrls");
        p.h(str, "streamerNumText");
        p.h(list2, "viewers");
        p.h(status, "status");
        this.isMatchingEnabled = z10;
        this.streamerIconUrls = list;
        this.streamerNumText = str;
        this.viewers = list2;
        this.status = status;
    }

    public static /* synthetic */ ShooterMatchingResponse copy$default(ShooterMatchingResponse shooterMatchingResponse, boolean z10, List list, String str, List list2, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = shooterMatchingResponse.isMatchingEnabled;
        }
        List<String> list3 = list;
        if ((i10 & 2) != 0) {
            list3 = shooterMatchingResponse.streamerIconUrls;
        }
        List list4 = list3;
        if ((i10 & 4) != 0) {
            str = shooterMatchingResponse.streamerNumText;
        }
        String str2 = str;
        List<ShooterMatchingMember> list5 = list2;
        if ((i10 & 8) != 0) {
            list5 = shooterMatchingResponse.viewers;
        }
        List list6 = list5;
        if ((i10 & 16) != 0) {
            status = shooterMatchingResponse.status;
        }
        return shooterMatchingResponse.copy(z10, list4, str2, list6, status);
    }

    public final boolean component1() {
        return this.isMatchingEnabled;
    }

    public final List<String> component2() {
        return this.streamerIconUrls;
    }

    public final String component3() {
        return this.streamerNumText;
    }

    public final List<ShooterMatchingMember> component4() {
        return this.viewers;
    }

    public final Status component5() {
        return this.status;
    }

    public final ShooterMatchingResponse copy(boolean z10, List<String> list, String str, List<ShooterMatchingMember> list2, Status status) {
        p.h(list, "streamerIconUrls");
        p.h(str, "streamerNumText");
        p.h(list2, "viewers");
        p.h(status, "status");
        return new ShooterMatchingResponse(z10, list, str, list2, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterMatchingResponse) {
            ShooterMatchingResponse shooterMatchingResponse = (ShooterMatchingResponse) obj;
            return this.isMatchingEnabled == shooterMatchingResponse.isMatchingEnabled && p.c(this.streamerIconUrls, shooterMatchingResponse.streamerIconUrls) && p.c(this.streamerNumText, shooterMatchingResponse.streamerNumText) && p.c(this.viewers, shooterMatchingResponse.viewers) && p.c(this.status, shooterMatchingResponse.status);
        }
        return false;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<String> getStreamerIconUrls() {
        return this.streamerIconUrls;
    }

    public final String getStreamerNumText() {
        return this.streamerNumText;
    }

    public final List<ShooterMatchingMember> getViewers() {
        return this.viewers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z10 = this.isMatchingEnabled;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((((((r02 * 31) + this.streamerIconUrls.hashCode()) * 31) + this.streamerNumText.hashCode()) * 31) + this.viewers.hashCode()) * 31) + this.status.hashCode();
    }

    public final boolean isMatchingEnabled() {
        return this.isMatchingEnabled;
    }

    public String toString() {
        return "ShooterMatchingResponse(isMatchingEnabled=" + this.isMatchingEnabled + ", streamerIconUrls=" + this.streamerIconUrls + ", streamerNumText=" + this.streamerNumText + ", viewers=" + this.viewers + ", status=" + this.status + ')';
    }
}
