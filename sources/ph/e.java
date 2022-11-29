package ph;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes3.dex */
public class e implements Handler.Callback {
    public static final Status N = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status O = new Status(4, "The user must be signed in to make this API call.");
    public static final Object P = new Object();
    public static e Q;
    public rh.t A;
    public rh.v B;
    public final Context C;
    public final nh.d D;
    public final rh.h0 E;
    @NotOnlyInitialized
    public final Handler L;
    public volatile boolean M;

    /* renamed from: w  reason: collision with root package name */
    public long f47478w = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;

    /* renamed from: x  reason: collision with root package name */
    public long f47479x = 120000;

    /* renamed from: y  reason: collision with root package name */
    public long f47480y = 10000;

    /* renamed from: z  reason: collision with root package name */
    public boolean f47481z = false;
    public final AtomicInteger F = new AtomicInteger(1);
    public final AtomicInteger G = new AtomicInteger(0);
    public final Map<b<?>, b0<?>> H = new ConcurrentHashMap(5, 0.75f, 1);
    public s I = null;
    public final Set<b<?>> J = new s.b();
    public final Set<b<?>> K = new s.b();

    public e(Context context, Looper looper, nh.d dVar) {
        this.M = true;
        this.C = context;
        di.f fVar = new di.f(looper, this);
        this.L = fVar;
        this.D = dVar;
        this.E = new rh.h0(dVar);
        if (vh.j.a(context)) {
            this.M = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    public static Status h(b<?> bVar, ConnectionResult connectionResult) {
        String b10 = bVar.b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(b10);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(connectionResult, sb2.toString());
    }

    public static e x(Context context) {
        e eVar;
        synchronized (P) {
            if (Q == null) {
                Q = new e(context.getApplicationContext(), rh.h.c().getLooper(), nh.d.m());
            }
            eVar = Q;
        }
        return eVar;
    }

    public final <O extends a.d> void D(com.google.android.gms.common.api.b<O> bVar, int i10, com.google.android.gms.common.api.internal.a<? extends oh.e, a.b> aVar) {
        y0 y0Var = new y0(i10, aVar);
        Handler handler = this.L;
        handler.sendMessage(handler.obtainMessage(4, new o0(y0Var, this.G.get(), bVar)));
    }

    public final <O extends a.d, ResultT> void E(com.google.android.gms.common.api.b<O> bVar, int i10, n<a.b, ResultT> nVar, vi.h<ResultT> hVar, m mVar) {
        l(hVar, nVar.d(), bVar);
        z0 z0Var = new z0(i10, nVar, hVar, mVar);
        Handler handler = this.L;
        handler.sendMessage(handler.obtainMessage(4, new o0(z0Var, this.G.get(), bVar)));
    }

    public final void F(rh.m mVar, int i10, long j10, int i11) {
        Handler handler = this.L;
        handler.sendMessage(handler.obtainMessage(18, new l0(mVar, i10, j10, i11)));
    }

    public final void G(ConnectionResult connectionResult, int i10) {
        if (g(connectionResult, i10)) {
            return;
        }
        Handler handler = this.L;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
    }

    public final void a() {
        Handler handler = this.L;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(com.google.android.gms.common.api.b<?> bVar) {
        Handler handler = this.L;
        handler.sendMessage(handler.obtainMessage(7, bVar));
    }

    public final void c(s sVar) {
        synchronized (P) {
            if (this.I != sVar) {
                this.I = sVar;
                this.J.clear();
            }
            this.J.addAll(sVar.t());
        }
    }

    public final void d(s sVar) {
        synchronized (P) {
            if (this.I == sVar) {
                this.I = null;
                this.J.clear();
            }
        }
    }

    public final boolean f() {
        if (this.f47481z) {
            return false;
        }
        rh.r a10 = rh.q.b().a();
        if (a10 == null || a10.S()) {
            int a11 = this.E.a(this.C, 203400000);
            return a11 == -1 || a11 == 0;
        }
        return false;
    }

    public final boolean g(ConnectionResult connectionResult, int i10) {
        return this.D.w(this.C, connectionResult, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        b0<?> b0Var;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        int i10 = message.what;
        long j10 = DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f47480y = j10;
                this.L.removeMessages(12);
                for (b<?> bVar5 : this.H.keySet()) {
                    Handler handler = this.L;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar5), this.f47480y);
                }
                break;
            case 2:
                c1 c1Var = (c1) message.obj;
                Iterator<b<?>> it = c1Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b<?> next = it.next();
                        b0<?> b0Var2 = this.H.get(next);
                        if (b0Var2 == null) {
                            c1Var.b(next, new ConnectionResult(13), null);
                            break;
                        } else if (b0Var2.L()) {
                            c1Var.b(next, ConnectionResult.A, b0Var2.s().c());
                        } else {
                            ConnectionResult q10 = b0Var2.q();
                            if (q10 != null) {
                                c1Var.b(next, q10, null);
                            } else {
                                b0Var2.G(c1Var);
                                b0Var2.B();
                            }
                        }
                    }
                }
            case 3:
                for (b0<?> b0Var3 : this.H.values()) {
                    b0Var3.A();
                    b0Var3.B();
                }
                break;
            case 4:
            case 8:
            case 13:
                o0 o0Var = (o0) message.obj;
                b0<?> b0Var4 = this.H.get(o0Var.f47542c.i());
                if (b0Var4 == null) {
                    b0Var4 = i(o0Var.f47542c);
                }
                if (b0Var4.M() && this.G.get() != o0Var.f47541b) {
                    o0Var.f47540a.a(N);
                    b0Var4.I();
                    break;
                } else {
                    b0Var4.C(o0Var.f47540a);
                    break;
                }
                break;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<b0<?>> it2 = this.H.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        b0<?> next2 = it2.next();
                        b0Var = next2.o() == i11 ? next2 : null;
                    }
                }
                if (b0Var != null) {
                    if (connectionResult.p() == 13) {
                        String e10 = this.D.e(connectionResult.p());
                        String P2 = connectionResult.P();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(e10).length() + 69 + String.valueOf(P2).length());
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(e10);
                        sb2.append(": ");
                        sb2.append(P2);
                        b0.v(b0Var, new Status(17, sb2.toString()));
                        break;
                    } else {
                        b0.v(b0Var, h(b0.t(b0Var), connectionResult));
                        break;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i11);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.C.getApplicationContext() instanceof Application) {
                    c.c((Application) this.C.getApplicationContext());
                    c.b().a(new w(this));
                    if (!c.b().e(true)) {
                        this.f47480y = DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS;
                        break;
                    }
                }
                break;
            case 7:
                i((com.google.android.gms.common.api.b) message.obj);
                break;
            case 9:
                if (this.H.containsKey(message.obj)) {
                    this.H.get(message.obj).H();
                    break;
                }
                break;
            case 10:
                for (b<?> bVar6 : this.K) {
                    b0<?> remove = this.H.remove(bVar6);
                    if (remove != null) {
                        remove.I();
                    }
                }
                this.K.clear();
                break;
            case 11:
                if (this.H.containsKey(message.obj)) {
                    this.H.get(message.obj).J();
                    break;
                }
                break;
            case 12:
                if (this.H.containsKey(message.obj)) {
                    this.H.get(message.obj).a();
                    break;
                }
                break;
            case 14:
                t tVar = (t) message.obj;
                b<?> a10 = tVar.a();
                if (!this.H.containsKey(a10)) {
                    tVar.b().c(Boolean.FALSE);
                    break;
                } else {
                    tVar.b().c(Boolean.valueOf(b0.K(this.H.get(a10), false)));
                    break;
                }
            case 15:
                d0 d0Var = (d0) message.obj;
                Map<b<?>, b0<?>> map = this.H;
                bVar = d0Var.f47474a;
                if (map.containsKey(bVar)) {
                    Map<b<?>, b0<?>> map2 = this.H;
                    bVar2 = d0Var.f47474a;
                    b0.y(map2.get(bVar2), d0Var);
                    break;
                }
                break;
            case 16:
                d0 d0Var2 = (d0) message.obj;
                Map<b<?>, b0<?>> map3 = this.H;
                bVar3 = d0Var2.f47474a;
                if (map3.containsKey(bVar3)) {
                    Map<b<?>, b0<?>> map4 = this.H;
                    bVar4 = d0Var2.f47474a;
                    b0.z(map4.get(bVar4), d0Var2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                l0 l0Var = (l0) message.obj;
                if (l0Var.f47518c == 0) {
                    j().b(new rh.t(l0Var.f47517b, Arrays.asList(l0Var.f47516a)));
                    break;
                } else {
                    rh.t tVar2 = this.A;
                    if (tVar2 != null) {
                        List<rh.m> P3 = tVar2.P();
                        if (tVar2.p() == l0Var.f47517b && (P3 == null || P3.size() < l0Var.f47519d)) {
                            this.A.S(l0Var.f47516a);
                        } else {
                            this.L.removeMessages(17);
                            k();
                        }
                    }
                    if (this.A == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(l0Var.f47516a);
                        this.A = new rh.t(l0Var.f47517b, arrayList);
                        Handler handler2 = this.L;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), l0Var.f47518c);
                        break;
                    }
                }
                break;
            case 19:
                this.f47481z = false;
                break;
            default:
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Unknown message id: ");
                sb4.append(i10);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
        return true;
    }

    public final b0<?> i(com.google.android.gms.common.api.b<?> bVar) {
        b<?> i10 = bVar.i();
        b0<?> b0Var = this.H.get(i10);
        if (b0Var == null) {
            b0Var = new b0<>(this, bVar);
            this.H.put(i10, b0Var);
        }
        if (b0Var.M()) {
            this.K.add(i10);
        }
        b0Var.B();
        return b0Var;
    }

    public final rh.v j() {
        if (this.B == null) {
            this.B = rh.u.a(this.C);
        }
        return this.B;
    }

    public final void k() {
        rh.t tVar = this.A;
        if (tVar != null) {
            if (tVar.p() > 0 || f()) {
                j().b(tVar);
            }
            this.A = null;
        }
    }

    public final <T> void l(vi.h<T> hVar, int i10, com.google.android.gms.common.api.b bVar) {
        k0 b10;
        if (i10 == 0 || (b10 = k0.b(this, i10, bVar.i())) == null) {
            return;
        }
        vi.g<T> a10 = hVar.a();
        final Handler handler = this.L;
        handler.getClass();
        a10.b(new Executor() { // from class: ph.v
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, b10);
    }

    public final int m() {
        return this.F.getAndIncrement();
    }

    public final b0 w(b<?> bVar) {
        return this.H.get(bVar);
    }
}
