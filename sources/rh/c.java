package rh;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class c<T extends IInterface> {
    public long A;
    public volatile String B;
    public r1 C;
    public final Context D;
    public final Looper E;
    public final h F;
    public final nh.e G;
    public final Handler H;
    public final Object I;
    public final Object J;
    public l K;
    public InterfaceC0781c L;
    public T M;
    public final ArrayList<b1<?>> N;
    public d1 O;
    public int P;
    public final a Q;
    public final b R;
    public final int S;
    public final String T;
    public volatile String U;
    public ConnectionResult V;
    public boolean W;
    public volatile g1 X;
    public AtomicInteger Y;

    /* renamed from: w  reason: collision with root package name */
    public int f51404w;

    /* renamed from: x  reason: collision with root package name */
    public long f51405x;

    /* renamed from: y  reason: collision with root package name */
    public long f51406y;

    /* renamed from: z  reason: collision with root package name */
    public int f51407z;

    /* renamed from: a0  reason: collision with root package name */
    public static final nh.c[] f51403a0 = new nh.c[0];
    public static final String[] Z = {"service_esmobile", "service_googleme"};

    /* loaded from: classes3.dex */
    public interface a {
        void i0(Bundle bundle);

        void s0(int i10);
    }

    /* loaded from: classes3.dex */
    public interface b {
        void z0(ConnectionResult connectionResult);
    }

    /* renamed from: rh.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0781c {
        void a(ConnectionResult connectionResult);
    }

    /* loaded from: classes3.dex */
    public class d implements InterfaceC0781c {
        public d() {
        }

        @Override // rh.c.InterfaceC0781c
        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.k0()) {
                c cVar = c.this;
                cVar.j(null, cVar.A());
            } else if (c.this.R != null) {
                c.this.R.z0(connectionResult);
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r10, android.os.Looper r11, int r12, rh.c.a r13, rh.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            rh.h r3 = rh.h.b(r10)
            nh.e r4 = nh.e.f()
            rh.p.i(r13)
            rh.p.i(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.c.<init>(android.content.Context, android.os.Looper, int, rh.c$a, rh.c$b, java.lang.String):void");
    }

    public static /* bridge */ /* synthetic */ void a0(c cVar, g1 g1Var) {
        cVar.X = g1Var;
        if (cVar.Q()) {
            rh.e eVar = g1Var.f51452z;
            q.b().c(eVar == null ? null : eVar.r0());
        }
    }

    public static /* bridge */ /* synthetic */ void b0(c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.I) {
            i11 = cVar.P;
        }
        if (i11 == 3) {
            cVar.W = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.H;
        handler.sendMessage(handler.obtainMessage(i12, cVar.Y.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean e0(c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.I) {
            if (cVar.P != i10) {
                return false;
            }
            cVar.g0(i11, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "<parameter1>" is null
        	at java.base/java.util.BitSet.or(Unknown Source)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static /* bridge */ /* synthetic */ boolean f0(rh.c r2) {
        /*
            boolean r0 = r2.W
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.C()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.z()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.C()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.c.f0(rh.c):boolean");
    }

    public Set<Scope> A() {
        return Collections.emptySet();
    }

    public final T B() throws DeadObjectException {
        T t10;
        synchronized (this.I) {
            if (this.P != 5) {
                p();
                t10 = this.M;
                p.j(t10, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t10;
    }

    public abstract String C();

    public abstract String D();

    public String E() {
        return "com.google.android.gms";
    }

    public rh.e F() {
        g1 g1Var = this.X;
        if (g1Var == null) {
            return null;
        }
        return g1Var.f51452z;
    }

    public boolean G() {
        return l() >= 211700000;
    }

    public boolean H() {
        return this.X != null;
    }

    public void I(T t10) {
        this.f51406y = System.currentTimeMillis();
    }

    public void J(ConnectionResult connectionResult) {
        this.f51407z = connectionResult.p();
        this.A = System.currentTimeMillis();
    }

    public void K(int i10) {
        this.f51404w = i10;
        this.f51405x = System.currentTimeMillis();
    }

    public void L(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.H;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new e1(this, i10, iBinder, bundle)));
    }

    public boolean M() {
        return false;
    }

    public void N(String str) {
        this.U = str;
    }

    public void O(int i10) {
        Handler handler = this.H;
        handler.sendMessage(handler.obtainMessage(6, this.Y.get(), i10));
    }

    public void P(InterfaceC0781c interfaceC0781c, int i10, PendingIntent pendingIntent) {
        p.j(interfaceC0781c, "Connection progress callbacks cannot be null.");
        this.L = interfaceC0781c;
        Handler handler = this.H;
        handler.sendMessage(handler.obtainMessage(3, this.Y.get(), i10, pendingIntent));
    }

    public boolean Q() {
        return false;
    }

    public final String V() {
        String str = this.T;
        return str == null ? this.D.getClass().getName() : str;
    }

    public void a(String str) {
        this.B = str;
        disconnect();
    }

    public boolean b() {
        boolean z10;
        synchronized (this.I) {
            int i10 = this.P;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public String c() {
        r1 r1Var;
        if (isConnected() && (r1Var = this.C) != null) {
            return r1Var.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public final void c0(int i10, Bundle bundle, int i11) {
        Handler handler = this.H;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new f1(this, i10, null)));
    }

    public void d(e eVar) {
        eVar.a();
    }

    public void disconnect() {
        this.Y.incrementAndGet();
        synchronized (this.N) {
            int size = this.N.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.N.get(i10).d();
            }
            this.N.clear();
        }
        synchronized (this.J) {
            this.K = null;
        }
        g0(1, null);
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        return false;
    }

    public final void g0(int i10, T t10) {
        r1 r1Var;
        r1 r1Var2;
        p.a((i10 == 4) == (t10 != null));
        synchronized (this.I) {
            this.P = i10;
            this.M = t10;
            if (i10 == 1) {
                d1 d1Var = this.O;
                if (d1Var != null) {
                    h hVar = this.F;
                    String c10 = this.C.c();
                    p.i(c10);
                    hVar.e(c10, this.C.b(), this.C.a(), d1Var, V(), this.C.d());
                    this.O = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                d1 d1Var2 = this.O;
                if (d1Var2 != null && (r1Var2 = this.C) != null) {
                    String c11 = r1Var2.c();
                    String b10 = r1Var2.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(c11).length() + 70 + String.valueOf(b10).length());
                    sb2.append("Calling connect() while still connected, missing disconnect() for ");
                    sb2.append(c11);
                    sb2.append(" on ");
                    sb2.append(b10);
                    Log.e("GmsClient", sb2.toString());
                    h hVar2 = this.F;
                    String c12 = this.C.c();
                    p.i(c12);
                    hVar2.e(c12, this.C.b(), this.C.a(), d1Var2, V(), this.C.d());
                    this.Y.incrementAndGet();
                }
                d1 d1Var3 = new d1(this, this.Y.get());
                this.O = d1Var3;
                if (this.P == 3 && z() != null) {
                    r1Var = new r1(w().getPackageName(), z(), true, h.a(), false);
                } else {
                    r1Var = new r1(E(), D(), false, h.a(), G());
                }
                this.C = r1Var;
                if (r1Var.d() && l() < 17895000) {
                    String valueOf = String.valueOf(this.C.c());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                h hVar3 = this.F;
                String c13 = this.C.c();
                p.i(c13);
                if (!hVar3.f(new k1(c13, this.C.b(), this.C.a(), this.C.d()), d1Var3, V(), u())) {
                    String c14 = this.C.c();
                    String b11 = this.C.b();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(c14).length() + 34 + String.valueOf(b11).length());
                    sb3.append("unable to connect to service: ");
                    sb3.append(c14);
                    sb3.append(" on ");
                    sb3.append(b11);
                    Log.w("GmsClient", sb3.toString());
                    c0(16, null, this.Y.get());
                }
            } else if (i10 == 4) {
                p.i(t10);
                I(t10);
            }
        }
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.I) {
            z10 = this.P == 4;
        }
        return z10;
    }

    public void j(i iVar, Set<Scope> set) {
        Bundle y10 = y();
        f fVar = new f(this.S, this.U);
        fVar.f51442z = this.D.getPackageName();
        fVar.C = y10;
        if (set != null) {
            fVar.B = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (f()) {
            Account s10 = s();
            if (s10 == null) {
                s10 = new Account("<<default account>>", "com.google");
            }
            fVar.D = s10;
            if (iVar != null) {
                fVar.A = iVar.asBinder();
            }
        } else if (M()) {
            fVar.D = s();
        }
        fVar.E = f51403a0;
        fVar.F = t();
        if (Q()) {
            fVar.I = true;
        }
        try {
            synchronized (this.J) {
                l lVar = this.K;
                if (lVar != null) {
                    lVar.W1(new c1(this, this.Y.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            O(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            L(8, null, null, this.Y.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            L(8, null, null, this.Y.get());
        }
    }

    public void k(InterfaceC0781c interfaceC0781c) {
        p.j(interfaceC0781c, "Connection progress callbacks cannot be null.");
        this.L = interfaceC0781c;
        g0(2, null);
    }

    public int l() {
        return nh.e.f43540a;
    }

    public final nh.c[] m() {
        g1 g1Var = this.X;
        if (g1Var == null) {
            return null;
        }
        return g1Var.f51450x;
    }

    public String n() {
        return this.B;
    }

    public void o() {
        int h10 = this.G.h(this.D, l());
        if (h10 != 0) {
            g0(1, null);
            P(new d(), h10, null);
            return;
        }
        k(new d());
    }

    public final void p() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public abstract T q(IBinder iBinder);

    public boolean r() {
        return false;
    }

    public Account s() {
        return null;
    }

    public nh.c[] t() {
        return f51403a0;
    }

    public Executor u() {
        return null;
    }

    public Bundle v() {
        return null;
    }

    public final Context w() {
        return this.D;
    }

    public int x() {
        return this.S;
    }

    public Bundle y() {
        return new Bundle();
    }

    public String z() {
        return null;
    }

    public c(Context context, Looper looper, h hVar, nh.e eVar, int i10, a aVar, b bVar, String str) {
        this.B = null;
        this.I = new Object();
        this.J = new Object();
        this.N = new ArrayList<>();
        this.P = 1;
        this.V = null;
        this.W = false;
        this.X = null;
        this.Y = new AtomicInteger(0);
        p.j(context, "Context must not be null");
        this.D = context;
        p.j(looper, "Looper must not be null");
        this.E = looper;
        p.j(hVar, "Supervisor must not be null");
        this.F = hVar;
        p.j(eVar, "API availability must not be null");
        this.G = eVar;
        this.H = new a1(this, looper);
        this.S = i10;
        this.Q = aVar;
        this.R = bVar;
        this.T = str;
    }
}
