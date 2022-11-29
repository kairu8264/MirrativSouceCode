package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class SanitizeTextResponse {
    public static final int $stable = 8;
    private final String sanitizedText;
    private final Status status;

    public SanitizeTextResponse(String str, Status status) {
        p.h(str, "sanitizedText");
        p.h(status, "status");
        this.sanitizedText = str;
        this.status = status;
    }

    public static /* synthetic */ SanitizeTextResponse copy$default(SanitizeTextResponse sanitizeTextResponse, String str, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sanitizeTextResponse.sanitizedText;
        }
        if ((i10 & 2) != 0) {
            status = sanitizeTextResponse.status;
        }
        return sanitizeTextResponse.copy(str, status);
    }

    public final String component1() {
        return this.sanitizedText;
    }

    public final Status component2() {
        return this.status;
    }

    public final SanitizeTextResponse copy(String str, Status status) {
        p.h(str, "sanitizedText");
        p.h(status, "status");
        return new SanitizeTextResponse(str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SanitizeTextResponse) {
            SanitizeTextResponse sanitizeTextResponse = (SanitizeTextResponse) obj;
            return p.c(this.sanitizedText, sanitizeTextResponse.sanitizedText) && p.c(this.status, sanitizeTextResponse.status);
        }
        return false;
    }

    public final String getSanitizedText() {
        return this.sanitizedText;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.sanitizedText.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "SanitizeTextResponse(sanitizedText=" + this.sanitizedText + ", status=" + this.status + ')';
    }
}
