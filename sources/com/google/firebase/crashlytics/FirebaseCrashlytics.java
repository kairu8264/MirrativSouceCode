package com.google.firebase.crashlytics;

import al.l;
import al.r;
import al.t;
import al.v;
import android.content.Context;
import android.content.pm.PackageManager;
import hl.d;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import pk.c;
import vi.g;
import vi.j;
import xk.e;
import xk.f;

/* loaded from: classes.dex */
public class FirebaseCrashlytics {

    /* renamed from: a  reason: collision with root package name */
    public final l f27945a;

    /* loaded from: classes.dex */
    public class a implements vi.a<Void, Object> {
        @Override // vi.a
        public Object a(g<Void> gVar) throws Exception {
            if (gVar.s()) {
                return null;
            }
            f.f().e("Error fetching settings.", gVar.n());
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f27946a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l f27947b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f27948c;

        public b(boolean z10, l lVar, d dVar) {
            this.f27946a = z10;
            this.f27947b = lVar;
            this.f27948c = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            if (this.f27946a) {
                this.f27947b.j(this.f27948c);
                return null;
            }
            return null;
        }
    }

    public FirebaseCrashlytics(l lVar) {
        this.f27945a = lVar;
    }

    public static FirebaseCrashlytics a(c cVar, yl.f fVar, xl.a<xk.a> aVar, xl.a<tk.a> aVar2) {
        Context h10 = cVar.h();
        String packageName = h10.getPackageName();
        f f10 = f.f();
        f10.g("Initializing Firebase Crashlytics " + l.l() + " for " + packageName);
        fl.f fVar2 = new fl.f(h10);
        r rVar = new r(cVar);
        v vVar = new v(h10, packageName, fVar, rVar);
        xk.d dVar = new xk.d(aVar);
        wk.d dVar2 = new wk.d(aVar2);
        l lVar = new l(cVar, vVar, dVar, rVar, dVar2.e(), dVar2.d(), fVar2, t.c("Crashlytics Exception Handler"));
        String c10 = cVar.k().c();
        String n10 = al.g.n(h10);
        f f11 = f.f();
        f11.b("Mapping file ID is: " + n10);
        try {
            al.a a10 = al.a.a(h10, vVar, c10, n10, new e(h10));
            f f12 = f.f();
            f12.i("Installer package name is: " + a10.f13741c);
            ExecutorService c11 = t.c("com.google.firebase.crashlytics.startup");
            d l10 = d.l(h10, c10, vVar, new el.b(), a10.f13743e, a10.f13744f, fVar2, rVar);
            l10.p(c11).j(c11, new a());
            j.c(c11, new b(lVar.r(a10, l10), lVar, l10));
            return new FirebaseCrashlytics(lVar);
        } catch (PackageManager.NameNotFoundException e10) {
            f.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) c.i().g(FirebaseCrashlytics.class);
        Objects.requireNonNull(firebaseCrashlytics, "FirebaseCrashlytics component is not present.");
        return firebaseCrashlytics;
    }

    public g<Boolean> checkForUnsentReports() {
        return this.f27945a.e();
    }

    public void deleteUnsentReports() {
        this.f27945a.f();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f27945a.g();
    }

    public void log(String str) {
        this.f27945a.n(str);
    }

    public void recordException(Throwable th2) {
        if (th2 == null) {
            f.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f27945a.o(th2);
        }
    }

    public void sendUnsentReports() {
        this.f27945a.s();
    }

    public void setCrashlyticsCollectionEnabled(boolean z10) {
        this.f27945a.t(Boolean.valueOf(z10));
    }

    public void setCustomKey(String str, boolean z10) {
        this.f27945a.u(str, Boolean.toString(z10));
    }

    public void setCustomKeys(wk.g gVar) {
        throw null;
    }

    public void setUserId(String str) {
        this.f27945a.v(str);
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f27945a.t(bool);
    }

    public void setCustomKey(String str, double d10) {
        this.f27945a.u(str, Double.toString(d10));
    }

    public void setCustomKey(String str, float f10) {
        this.f27945a.u(str, Float.toString(f10));
    }

    public void setCustomKey(String str, int i10) {
        this.f27945a.u(str, Integer.toString(i10));
    }

    public void setCustomKey(String str, long j10) {
        this.f27945a.u(str, Long.toString(j10));
    }

    public void setCustomKey(String str, String str2) {
        this.f27945a.u(str, str2);
    }
}
