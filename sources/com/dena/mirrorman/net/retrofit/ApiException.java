package com.dena.mirrorman.net.retrofit;

import ep.d0;
import jo.p;

/* loaded from: classes2.dex */
public final class ApiException extends Exception {
    public static final int $stable = 8;
    private String endpoint;
    private d0 response;

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final d0 getResponse() {
        return this.response;
    }

    public final void setEndpoint(String str) {
        this.endpoint = str;
    }

    public final void setResponse(d0 d0Var) {
        this.response = d0Var;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str = "" + super.toString() + ": " + this.endpoint;
        if (this.response == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(": ");
        d0 d0Var = this.response;
        p.e(d0Var);
        sb2.append(d0Var.q());
        String sb3 = sb2.toString();
        d0 d0Var2 = this.response;
        p.e(d0Var2);
        if (d0Var2.v() != null) {
            d0 d0Var3 = this.response;
            p.e(d0Var3);
            d0 v10 = d0Var3.v();
            p.e(v10);
            int h10 = v10.h();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append(" (status code: ");
            sb4.append(h10);
            sb4.append(") :");
            d0 d0Var4 = this.response;
            p.e(d0Var4);
            d0 v11 = d0Var4.v();
            p.e(v11);
            sb4.append(v11.q());
            return sb4.toString();
        }
        return sb3;
    }
}
