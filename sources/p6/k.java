package p6;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import q6.d;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static a0 f45977a = null;

    /* renamed from: b  reason: collision with root package name */
    public static y f45978b = null;

    /* renamed from: c  reason: collision with root package name */
    public static x f45979c = null;

    /* renamed from: d  reason: collision with root package name */
    public static z f45980d = null;

    /* renamed from: e  reason: collision with root package name */
    public static c0 f45981e = null;

    /* renamed from: f  reason: collision with root package name */
    public static long f45982f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static long f45983g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static long f45984h = -1;

    /* renamed from: i  reason: collision with root package name */
    public static long f45985i = -1;

    /* renamed from: j  reason: collision with root package name */
    public static t f45986j = null;

    /* renamed from: k  reason: collision with root package name */
    public static t f45987k = null;

    /* renamed from: l  reason: collision with root package name */
    public static t f45988l = null;

    /* renamed from: m  reason: collision with root package name */
    public static long f45989m = -1;

    /* renamed from: n  reason: collision with root package name */
    public static String f45990n = null;

    /* renamed from: o  reason: collision with root package name */
    public static String f45991o = null;

    /* renamed from: p  reason: collision with root package name */
    public static String f45992p = null;

    /* renamed from: q  reason: collision with root package name */
    public static d.c f45993q = null;

    /* renamed from: r  reason: collision with root package name */
    public static d.InterfaceC0735d f45994r = null;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f45995s = true;

    public static x a(g gVar) {
        x xVar = f45979c;
        if (xVar == null) {
            return a.l0(gVar);
        }
        xVar.k(gVar);
        return f45979c;
    }

    public static y b(x xVar, boolean z10, q6.b bVar) {
        y yVar = f45978b;
        if (yVar == null) {
            return new r(xVar, z10, bVar);
        }
        yVar.c(xVar, z10, bVar);
        return f45978b;
    }

    public static String c() {
        return f45990n;
    }

    public static d.c d() {
        d.c cVar = f45993q;
        return cVar == null ? q6.d.b() : cVar;
    }

    public static String e() {
        return f45991o;
    }

    public static d.InterfaceC0735d f() {
        d.InterfaceC0735d interfaceC0735d = f45994r;
        return interfaceC0735d == null ? q6.d.c() : interfaceC0735d;
    }

    public static t g() {
        t tVar = f45988l;
        return tVar == null ? t.SHORT_WAIT : tVar;
    }

    public static z h() {
        if (f45980d == null) {
            f45980d = new h0();
        }
        return f45980d;
    }

    public static long i() {
        long j10 = f45989m;
        if (j10 == -1) {
            return 10000L;
        }
        return j10;
    }

    public static a0 j(x xVar, Context context, boolean z10, q6.b bVar) {
        a0 a0Var = f45977a;
        if (a0Var == null) {
            return new r0(xVar, context, z10, bVar);
        }
        a0Var.c(xVar, context, z10, bVar);
        return f45977a;
    }

    public static t k() {
        t tVar = f45987k;
        return tVar == null ? t.LONG_WAIT : tVar;
    }

    public static t l() {
        t tVar = f45986j;
        return tVar == null ? t.SHORT_WAIT : tVar;
    }

    public static c0 m(x xVar, boolean z10, q6.b bVar) {
        c0 c0Var = f45981e;
        if (c0Var == null) {
            return new w0(xVar, z10, bVar);
        }
        c0Var.c(xVar, z10, bVar);
        return f45981e;
    }

    public static long n() {
        long j10 = f45984h;
        if (j10 == -1) {
            return 1800000L;
        }
        return j10;
    }

    public static String o() {
        return f45992p;
    }

    public static long p() {
        long j10 = f45985i;
        if (j10 == -1) {
            return 1000L;
        }
        return j10;
    }

    public static long q() {
        long j10 = f45982f;
        return j10 == -1 ? DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS : j10;
    }

    public static long r() {
        long j10 = f45983g;
        return j10 == -1 ? DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS : j10;
    }

    public static boolean s() {
        return f45995s;
    }
}
