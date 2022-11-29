package com.dena.mirrorman.unity;

import jo.h;
import jo.p;

/* loaded from: classes3.dex */
public final class ShooterAnalysisLogPayload {
    public static final int $stable = 0;
    private final String payload;

    public ShooterAnalysisLogPayload() {
        this(null, 1, null);
    }

    public ShooterAnalysisLogPayload(String str) {
        p.h(str, "payload");
        this.payload = str;
    }

    public static /* synthetic */ ShooterAnalysisLogPayload copy$default(ShooterAnalysisLogPayload shooterAnalysisLogPayload, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shooterAnalysisLogPayload.payload;
        }
        return shooterAnalysisLogPayload.copy(str);
    }

    public final String component1() {
        return this.payload;
    }

    public final ShooterAnalysisLogPayload copy(String str) {
        p.h(str, "payload");
        return new ShooterAnalysisLogPayload(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShooterAnalysisLogPayload) && p.c(this.payload, ((ShooterAnalysisLogPayload) obj).payload);
    }

    public final String getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    public String toString() {
        return "ShooterAnalysisLogPayload(payload=" + this.payload + ')';
    }

    public /* synthetic */ ShooterAnalysisLogPayload(String str, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
