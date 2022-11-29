package com.dena.mirrorman.unity;

import java.util.List;
import jo.p;

/* loaded from: classes3.dex */
public final class UnityMiniGameInputSetHttpRequestConfig {
    public static final int $stable = 8;
    private final List<UnityMiniGameInputHeader> headers;
    private final String urlBase;

    public UnityMiniGameInputSetHttpRequestConfig(String str, List<UnityMiniGameInputHeader> list) {
        p.h(str, "urlBase");
        p.h(list, "headers");
        this.urlBase = str;
        this.headers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnityMiniGameInputSetHttpRequestConfig copy$default(UnityMiniGameInputSetHttpRequestConfig unityMiniGameInputSetHttpRequestConfig, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unityMiniGameInputSetHttpRequestConfig.urlBase;
        }
        if ((i10 & 2) != 0) {
            list = unityMiniGameInputSetHttpRequestConfig.headers;
        }
        return unityMiniGameInputSetHttpRequestConfig.copy(str, list);
    }

    public final String component1() {
        return this.urlBase;
    }

    public final List<UnityMiniGameInputHeader> component2() {
        return this.headers;
    }

    public final UnityMiniGameInputSetHttpRequestConfig copy(String str, List<UnityMiniGameInputHeader> list) {
        p.h(str, "urlBase");
        p.h(list, "headers");
        return new UnityMiniGameInputSetHttpRequestConfig(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnityMiniGameInputSetHttpRequestConfig) {
            UnityMiniGameInputSetHttpRequestConfig unityMiniGameInputSetHttpRequestConfig = (UnityMiniGameInputSetHttpRequestConfig) obj;
            return p.c(this.urlBase, unityMiniGameInputSetHttpRequestConfig.urlBase) && p.c(this.headers, unityMiniGameInputSetHttpRequestConfig.headers);
        }
        return false;
    }

    public final List<UnityMiniGameInputHeader> getHeaders() {
        return this.headers;
    }

    public final String getUrlBase() {
        return this.urlBase;
    }

    public int hashCode() {
        return (this.urlBase.hashCode() * 31) + this.headers.hashCode();
    }

    public String toString() {
        return "UnityMiniGameInputSetHttpRequestConfig(urlBase=" + this.urlBase + ", headers=" + this.headers + ')';
    }
}
