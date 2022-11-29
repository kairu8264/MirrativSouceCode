package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import ph.b0;
import ph.e;
import ph.g0;
import ph.i;
import ph.m;
import ph.s;
import ph.t0;
import rh.d;
import rh.p;
import vh.n;
import vi.g;
import vi.h;

/* loaded from: classes3.dex */
public abstract class b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f27184a;

    /* renamed from: b  reason: collision with root package name */
    public final String f27185b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.gms.common.api.a<O> f27186c;

    /* renamed from: d  reason: collision with root package name */
    public final O f27187d;

    /* renamed from: e  reason: collision with root package name */
    public final ph.b<O> f27188e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f27189f;

    /* renamed from: g  reason: collision with root package name */
    public final int f27190g;
    @NotOnlyInitialized

    /* renamed from: h  reason: collision with root package name */
    public final c f27191h;

    /* renamed from: i  reason: collision with root package name */
    public final m f27192i;

    /* renamed from: j  reason: collision with root package name */
    public final e f27193j;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f27194c = new C0238a().a();

        /* renamed from: a  reason: collision with root package name */
        public final m f27195a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f27196b;

        /* renamed from: com.google.android.gms.common.api.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0238a {

            /* renamed from: a  reason: collision with root package name */
            public m f27197a;

            /* renamed from: b  reason: collision with root package name */
            public Looper f27198b;

            public a a() {
                if (this.f27197a == null) {
                    this.f27197a = new ph.a();
                }
                if (this.f27198b == null) {
                    this.f27198b = Looper.getMainLooper();
                }
                return new a(this.f27197a, this.f27198b);
            }

            public C0238a b(m mVar) {
                p.j(mVar, "StatusExceptionMapper must not be null.");
                this.f27197a = mVar;
                return this;
            }
        }

        public a(m mVar, Account account, Looper looper) {
            this.f27195a = mVar;
            this.f27196b = looper;
        }
    }

    public b(Context context, Activity activity, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        p.j(context, "Null context is not permitted.");
        p.j(aVar, "Api must not be null.");
        p.j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f27184a = context.getApplicationContext();
        String str = null;
        if (n.n()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f27185b = str;
        this.f27186c = aVar;
        this.f27187d = o10;
        this.f27189f = aVar2.f27196b;
        ph.b<O> a10 = ph.b.a(aVar, o10, str);
        this.f27188e = a10;
        this.f27191h = new g0(this);
        e x10 = e.x(this.f27184a);
        this.f27193j = x10;
        this.f27190g = x10.m();
        this.f27192i = aVar2.f27195a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            s.u(activity, x10, a10);
        }
        x10.b(this);
    }

    public c c() {
        return this.f27191h;
    }

    public d.a d() {
        Account b10;
        Set<Scope> emptySet;
        GoogleSignInAccount a10;
        d.a aVar = new d.a();
        O o10 = this.f27187d;
        if ((o10 instanceof a.d.b) && (a10 = ((a.d.b) o10).a()) != null) {
            b10 = a10.p();
        } else {
            O o11 = this.f27187d;
            b10 = o11 instanceof a.d.InterfaceC0237a ? ((a.d.InterfaceC0237a) o11).b() : null;
        }
        aVar.d(b10);
        O o12 = this.f27187d;
        if (o12 instanceof a.d.b) {
            GoogleSignInAccount a11 = ((a.d.b) o12).a();
            if (a11 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = a11.A0();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        aVar.c(emptySet);
        aVar.e(this.f27184a.getClass().getName());
        aVar.b(this.f27184a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> g<TResult> e(ph.n<A, TResult> nVar) {
        return p(2, nVar);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends oh.e, A>> T f(T t10) {
        o(0, t10);
        return t10;
    }

    public <TResult, A extends a.b> g<TResult> g(ph.n<A, TResult> nVar) {
        return p(0, nVar);
    }

    public <TResult, A extends a.b> g<TResult> h(ph.n<A, TResult> nVar) {
        return p(1, nVar);
    }

    public final ph.b<O> i() {
        return this.f27188e;
    }

    public String j() {
        return this.f27185b;
    }

    public Looper k() {
        return this.f27189f;
    }

    public final int l() {
        return this.f27190g;
    }

    public final a.f m(Looper looper, b0<O> b0Var) {
        a.f a10 = ((a.AbstractC0236a) p.i(this.f27186c.a())).a(this.f27184a, looper, d().a(), this.f27187d, b0Var, b0Var);
        String j10 = j();
        if (j10 != null && (a10 instanceof rh.c)) {
            ((rh.c) a10).N(j10);
        }
        if (j10 != null && (a10 instanceof i)) {
            ((i) a10).p(j10);
        }
        return a10;
    }

    public final t0 n(Context context, Handler handler) {
        return new t0(context, handler, d().a());
    }

    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends oh.e, A>> T o(int i10, T t10) {
        t10.j();
        this.f27193j.D(this, i10, t10);
        return t10;
    }

    public final <TResult, A extends a.b> g<TResult> p(int i10, ph.n<A, TResult> nVar) {
        h hVar = new h();
        this.f27193j.E(this, i10, nVar, hVar, this.f27192i);
        return hVar.a();
    }

    public b(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(context, null, aVar, o10, aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, ph.m r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.b$a$a r0 = new com.google.android.gms.common.api.b$a$a
            r0.<init>()
            r0.b(r5)
            com.google.android.gms.common.api.b$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.b.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, ph.m):void");
    }
}
