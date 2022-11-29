package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrorman.net.api.response.App;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class LiveChangedResponse {
    public static final int $stable = 8;
    private final App.AppParams app;
    @b(BooleanTypeAdapter.class)
    private final boolean collabEnabled;
    @b(BooleanTypeAdapter.class)
    private final boolean collabHasVacancy;
    private final String orientationV2;

    /* renamed from: t  reason: collision with root package name */
    private final int f26186t;

    public LiveChangedResponse(int i10, App.AppParams appParams, boolean z10, boolean z11, String str) {
        this.f26186t = i10;
        this.app = appParams;
        this.collabEnabled = z10;
        this.collabHasVacancy = z11;
        this.orientationV2 = str;
    }

    public static /* synthetic */ LiveChangedResponse copy$default(LiveChangedResponse liveChangedResponse, int i10, App.AppParams appParams, boolean z10, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = liveChangedResponse.f26186t;
        }
        if ((i11 & 2) != 0) {
            appParams = liveChangedResponse.app;
        }
        App.AppParams appParams2 = appParams;
        if ((i11 & 4) != 0) {
            z10 = liveChangedResponse.collabEnabled;
        }
        boolean z12 = z10;
        if ((i11 & 8) != 0) {
            z11 = liveChangedResponse.collabHasVacancy;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            str = liveChangedResponse.orientationV2;
        }
        return liveChangedResponse.copy(i10, appParams2, z12, z13, str);
    }

    public final int component1() {
        return this.f26186t;
    }

    public final App.AppParams component2() {
        return this.app;
    }

    public final boolean component3() {
        return this.collabEnabled;
    }

    public final boolean component4() {
        return this.collabHasVacancy;
    }

    public final String component5() {
        return this.orientationV2;
    }

    public final LiveChangedResponse copy(int i10, App.AppParams appParams, boolean z10, boolean z11, String str) {
        return new LiveChangedResponse(i10, appParams, z10, z11, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveChangedResponse) {
            LiveChangedResponse liveChangedResponse = (LiveChangedResponse) obj;
            return this.f26186t == liveChangedResponse.f26186t && p.c(this.app, liveChangedResponse.app) && this.collabEnabled == liveChangedResponse.collabEnabled && this.collabHasVacancy == liveChangedResponse.collabHasVacancy && p.c(this.orientationV2, liveChangedResponse.orientationV2);
        }
        return false;
    }

    public final App.AppParams getApp() {
        return this.app;
    }

    public final boolean getCollabEnabled() {
        return this.collabEnabled;
    }

    public final boolean getCollabHasVacancy() {
        return this.collabHasVacancy;
    }

    public final String getOrientationV2() {
        return this.orientationV2;
    }

    public final int getT() {
        return this.f26186t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f26186t) * 31;
        App.AppParams appParams = this.app;
        int hashCode2 = (hashCode + (appParams == null ? 0 : appParams.hashCode())) * 31;
        boolean z10 = this.collabEnabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z11 = this.collabHasVacancy;
        int i12 = (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str = this.orientationV2;
        return i12 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LiveChangedResponse(t=" + this.f26186t + ", app=" + this.app + ", collabEnabled=" + this.collabEnabled + ", collabHasVacancy=" + this.collabHasVacancy + ", orientationV2=" + this.orientationV2 + ')';
    }

    public /* synthetic */ LiveChangedResponse(int i10, App.AppParams appParams, boolean z10, boolean z11, String str, int i11, h hVar) {
        this((i11 & 1) != 0 ? 0 : i10, appParams, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : str);
    }
}
