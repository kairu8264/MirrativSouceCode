package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class DiarkisAuthInfoResponse {
    public static final int $stable = 8;
    private final String clientKey;
    private final String encryptionIv;
    private final String encryptionKey;
    private final String encryptionMacKey;
    private final String sid;
    private final Status status;
    private final String tcp;
    private final String udp;
    private final String ws;

    public DiarkisAuthInfoResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Status status) {
        p.h(str, "ws");
        p.h(str2, "tcp");
        p.h(str3, "udp");
        p.h(str4, "sid");
        p.h(str5, "encryptionKey");
        p.h(str6, "encryptionIv");
        p.h(str7, "encryptionMacKey");
        p.h(str8, "clientKey");
        p.h(status, "status");
        this.ws = str;
        this.tcp = str2;
        this.udp = str3;
        this.sid = str4;
        this.encryptionKey = str5;
        this.encryptionIv = str6;
        this.encryptionMacKey = str7;
        this.clientKey = str8;
        this.status = status;
    }

    public final String component1() {
        return this.ws;
    }

    public final String component2() {
        return this.tcp;
    }

    public final String component3() {
        return this.udp;
    }

    public final String component4() {
        return this.sid;
    }

    public final String component5() {
        return this.encryptionKey;
    }

    public final String component6() {
        return this.encryptionIv;
    }

    public final String component7() {
        return this.encryptionMacKey;
    }

    public final String component8() {
        return this.clientKey;
    }

    public final Status component9() {
        return this.status;
    }

    public final DiarkisAuthInfoResponse copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Status status) {
        p.h(str, "ws");
        p.h(str2, "tcp");
        p.h(str3, "udp");
        p.h(str4, "sid");
        p.h(str5, "encryptionKey");
        p.h(str6, "encryptionIv");
        p.h(str7, "encryptionMacKey");
        p.h(str8, "clientKey");
        p.h(status, "status");
        return new DiarkisAuthInfoResponse(str, str2, str3, str4, str5, str6, str7, str8, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiarkisAuthInfoResponse) {
            DiarkisAuthInfoResponse diarkisAuthInfoResponse = (DiarkisAuthInfoResponse) obj;
            return p.c(this.ws, diarkisAuthInfoResponse.ws) && p.c(this.tcp, diarkisAuthInfoResponse.tcp) && p.c(this.udp, diarkisAuthInfoResponse.udp) && p.c(this.sid, diarkisAuthInfoResponse.sid) && p.c(this.encryptionKey, diarkisAuthInfoResponse.encryptionKey) && p.c(this.encryptionIv, diarkisAuthInfoResponse.encryptionIv) && p.c(this.encryptionMacKey, diarkisAuthInfoResponse.encryptionMacKey) && p.c(this.clientKey, diarkisAuthInfoResponse.clientKey) && p.c(this.status, diarkisAuthInfoResponse.status);
        }
        return false;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getEncryptionIv() {
        return this.encryptionIv;
    }

    public final String getEncryptionKey() {
        return this.encryptionKey;
    }

    public final String getEncryptionMacKey() {
        return this.encryptionMacKey;
    }

    public final String getSid() {
        return this.sid;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTcp() {
        return this.tcp;
    }

    public final String getUdp() {
        return this.udp;
    }

    public final String getWs() {
        return this.ws;
    }

    public int hashCode() {
        return (((((((((((((((this.ws.hashCode() * 31) + this.tcp.hashCode()) * 31) + this.udp.hashCode()) * 31) + this.sid.hashCode()) * 31) + this.encryptionKey.hashCode()) * 31) + this.encryptionIv.hashCode()) * 31) + this.encryptionMacKey.hashCode()) * 31) + this.clientKey.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "DiarkisAuthInfoResponse(ws=" + this.ws + ", tcp=" + this.tcp + ", udp=" + this.udp + ", sid=" + this.sid + ", encryptionKey=" + this.encryptionKey + ", encryptionIv=" + this.encryptionIv + ", encryptionMacKey=" + this.encryptionMacKey + ", clientKey=" + this.clientKey + ", status=" + this.status + ')';
    }
}
