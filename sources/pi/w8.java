package pi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class w8 extends f4 {

    /* renamed from: c  reason: collision with root package name */
    public final v8 f48321c;

    /* renamed from: d  reason: collision with root package name */
    public g3 f48322d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Boolean f48323e;

    /* renamed from: f  reason: collision with root package name */
    public final n f48324f;

    /* renamed from: g  reason: collision with root package name */
    public final n9 f48325g;

    /* renamed from: h  reason: collision with root package name */
    public final List<Runnable> f48326h;

    /* renamed from: i  reason: collision with root package name */
    public final n f48327i;

    public w8(b5 b5Var) {
        super(b5Var);
        this.f48326h = new ArrayList();
        this.f48325g = new n9(b5Var.c());
        this.f48321c = new v8(this);
        this.f48324f = new f8(this, b5Var);
        this.f48327i = new i8(this, b5Var);
    }

    public static /* bridge */ /* synthetic */ void M(w8 w8Var, ComponentName componentName) {
        w8Var.f();
        if (w8Var.f48322d != null) {
            w8Var.f48322d = null;
            w8Var.f48285a.r().u().b("Disconnected from device MeasurementService", componentName);
            w8Var.f();
            w8Var.P();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.w8.A():boolean");
    }

    public final na B(boolean z10) {
        Pair<String, Long> a10;
        this.f48285a.b();
        h3 A = this.f48285a.A();
        String str = null;
        if (z10) {
            q3 r10 = this.f48285a.r();
            if (r10.f48285a.E().f47824d != null && (a10 = r10.f48285a.E().f47824d.a()) != null && a10 != g4.f47822x) {
                String valueOf = String.valueOf(a10.second);
                String str2 = (String) a10.first;
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb2.append(valueOf);
                sb2.append(":");
                sb2.append(str2);
                str = sb2.toString();
            }
        }
        return A.o(str);
    }

    public final void C() {
        f();
        this.f48285a.r().u().b("Processing queued up service tasks", Integer.valueOf(this.f48326h.size()));
        for (Runnable runnable : this.f48326h) {
            try {
                runnable.run();
            } catch (RuntimeException e10) {
                this.f48285a.r().p().b("Task exception while flushing queue", e10);
            }
        }
        this.f48326h.clear();
        this.f48327i.b();
    }

    public final void D() {
        f();
        this.f48325g.b();
        n nVar = this.f48324f;
        this.f48285a.y();
        nVar.d(c3.K.a(null).longValue());
    }

    public final void E(Runnable runnable) throws IllegalStateException {
        f();
        if (y()) {
            runnable.run();
            return;
        }
        int size = this.f48326h.size();
        this.f48285a.y();
        if (size >= 1000) {
            this.f48285a.r().p().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f48326h.add(runnable);
        this.f48327i.d(DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
        P();
    }

    public final boolean G() {
        this.f48285a.b();
        return true;
    }

    public final Boolean J() {
        return this.f48323e;
    }

    public final void O() {
        f();
        g();
        na B = B(true);
        this.f48285a.B().p();
        E(new c8(this, B));
    }

    public final void P() {
        f();
        g();
        if (y()) {
            return;
        }
        if (!A()) {
            if (this.f48285a.y().G()) {
                return;
            }
            this.f48285a.b();
            List<ResolveInfo> queryIntentServices = this.f48285a.F().getPackageManager().queryIntentServices(new Intent().setClassName(this.f48285a.F(), "com.google.android.gms.measurement.AppMeasurementService"), C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context F = this.f48285a.F();
                this.f48285a.b();
                intent.setComponent(new ComponentName(F, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f48321c.b(intent);
                return;
            }
            this.f48285a.r().p().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        this.f48321c.c();
    }

    public final void Q() {
        f();
        g();
        this.f48321c.d();
        try {
            uh.a.b().c(this.f48285a.F(), this.f48321c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f48322d = null;
    }

    public final void R(hi.i1 i1Var) {
        f();
        g();
        E(new b8(this, B(false), i1Var));
    }

    public final void S(AtomicReference<String> atomicReference) {
        f();
        g();
        E(new a8(this, atomicReference, B(false)));
    }

    public final void T(hi.i1 i1Var, String str, String str2) {
        f();
        g();
        E(new o8(this, str, str2, B(false), i1Var));
    }

    public final void U(AtomicReference<List<c>> atomicReference, String str, String str2, String str3) {
        f();
        g();
        E(new n8(this, atomicReference, null, str2, str3, B(false)));
    }

    public final void V(hi.i1 i1Var, String str, String str2, boolean z10) {
        f();
        g();
        E(new x7(this, str, str2, B(false), z10, i1Var));
    }

    public final void W(AtomicReference<List<ea>> atomicReference, String str, String str2, String str3, boolean z10) {
        f();
        g();
        E(new p8(this, atomicReference, null, str2, str3, B(false), z10));
    }

    @Override // pi.f4
    public final boolean l() {
        return false;
    }

    public final void m(u uVar, String str) {
        rh.p.i(uVar);
        f();
        g();
        G();
        E(new l8(this, true, B(true), this.f48285a.B().u(uVar), uVar, str));
    }

    public final void n(hi.i1 i1Var, u uVar, String str) {
        f();
        g();
        if (this.f48285a.N().p0(nh.g.f43544a) != 0) {
            this.f48285a.r().v().a("Not bundling data. Service unavailable or out of date");
            this.f48285a.N().E(i1Var, new byte[0]);
            return;
        }
        E(new g8(this, uVar, str, i1Var));
    }

    public final void o() {
        f();
        g();
        na B = B(false);
        G();
        this.f48285a.B().o();
        E(new z7(this, B));
    }

    public final void p(g3 g3Var, sh.a aVar, na naVar) {
        int i10;
        f();
        g();
        G();
        this.f48285a.y();
        int i11 = 0;
        int i12 = 100;
        while (i11 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List<sh.a> n10 = this.f48285a.B().n(100);
            if (n10 != null) {
                arrayList.addAll(n10);
                i10 = n10.size();
            } else {
                i10 = 0;
            }
            if (aVar != null && i10 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                sh.a aVar2 = (sh.a) arrayList.get(i13);
                if (aVar2 instanceof u) {
                    try {
                        g3Var.r1((u) aVar2, naVar);
                    } catch (RemoteException e10) {
                        this.f48285a.r().p().b("Failed to send event to the service", e10);
                    }
                } else if (aVar2 instanceof ea) {
                    try {
                        g3Var.R4((ea) aVar2, naVar);
                    } catch (RemoteException e11) {
                        this.f48285a.r().p().b("Failed to send user property to the service", e11);
                    }
                } else if (aVar2 instanceof c) {
                    try {
                        g3Var.T2((c) aVar2, naVar);
                    } catch (RemoteException e12) {
                        this.f48285a.r().p().b("Failed to send conditional user property to the service", e12);
                    }
                } else {
                    this.f48285a.r().p().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i12 = i10;
        }
    }

    public final void q(c cVar) {
        rh.p.i(cVar);
        f();
        g();
        this.f48285a.b();
        E(new m8(this, true, B(true), this.f48285a.B().t(cVar), new c(cVar), cVar));
    }

    public final void s(boolean z10) {
        f();
        g();
        if (z10) {
            G();
            this.f48285a.B().o();
        }
        if (z()) {
            E(new k8(this, B(false)));
        }
    }

    public final void t(p7 p7Var) {
        f();
        g();
        E(new d8(this, p7Var));
    }

    public final void u(Bundle bundle) {
        f();
        g();
        E(new e8(this, B(false), bundle));
    }

    public final void v() {
        f();
        g();
        E(new j8(this, B(true)));
    }

    public final void w(g3 g3Var) {
        f();
        rh.p.i(g3Var);
        this.f48322d = g3Var;
        D();
        C();
    }

    public final void x(ea eaVar) {
        f();
        g();
        G();
        E(new y7(this, B(true), this.f48285a.B().v(eaVar), eaVar));
    }

    public final boolean y() {
        f();
        g();
        return this.f48322d != null;
    }

    public final boolean z() {
        f();
        g();
        return !A() || this.f48285a.N().o0() >= c3.f47719p0.a(null).intValue();
    }
}
