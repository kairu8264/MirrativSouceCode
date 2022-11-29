package kp;

import jo.p;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f38918a = new f();

    public static final boolean a(String str) {
        p.h(str, "method");
        return (p.c(str, "GET") || p.c(str, "HEAD")) ? false : true;
    }

    public static final boolean d(String str) {
        p.h(str, "method");
        return p.c(str, "POST") || p.c(str, "PUT") || p.c(str, "PATCH") || p.c(str, "PROPPATCH") || p.c(str, "REPORT");
    }

    public final boolean b(String str) {
        p.h(str, "method");
        return !p.c(str, "PROPFIND");
    }

    public final boolean c(String str) {
        p.h(str, "method");
        return p.c(str, "PROPFIND");
    }
}
