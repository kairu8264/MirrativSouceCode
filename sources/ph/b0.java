package ph;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes3.dex */
public final class b0<O extends a.d> implements c.a, c.b {
    public final int C;
    public final t0 D;
    public boolean E;
    public final /* synthetic */ e I;
    @NotOnlyInitialized

    /* renamed from: x */
    public final a.f f47461x;

    /* renamed from: y */
    public final b<O> f47462y;

    /* renamed from: z */
    public final r f47463z;

    /* renamed from: w */
    public final Queue<b1> f47460w = new LinkedList();
    public final Set<c1> A = new HashSet();
    public final Map<h<?>, p0> B = new HashMap();
    public final List<d0> F = new ArrayList();
    public ConnectionResult G = null;
    public int H = 0;

    public b0(e eVar, com.google.android.gms.common.api.b<O> bVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.I = eVar;
        handler = eVar.L;
        a.f m10 = bVar.m(handler.getLooper(), this);
        this.f47461x = m10;
        this.f47462y = bVar.i();
        this.f47463z = new r();
        this.C = bVar.l();
        if (!m10.f()) {
            this.D = null;
            return;
        }
        context = eVar.C;
        handler2 = eVar.L;
        this.D = bVar.n(context, handler2);
    }

    public static /* bridge */ /* synthetic */ boolean K(b0 b0Var, boolean z10) {
        return b0Var.n(false);
    }

    public static /* bridge */ /* synthetic */ b t(b0 b0Var) {
        return b0Var.f47462y;
    }

    public static /* bridge */ /* synthetic */ void v(b0 b0Var, Status status) {
        b0Var.d(status);
    }

    public static /* bridge */ /* synthetic */ void y(b0 b0Var, d0 d0Var) {
        if (b0Var.F.contains(d0Var) && !b0Var.E) {
            if (b0Var.f47461x.isConnected()) {
                b0Var.f();
            } else {
                b0Var.B();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void z(b0 b0Var, d0 d0Var) {
        Handler handler;
        Handler handler2;
        nh.c cVar;
        nh.c[] g10;
        if (b0Var.F.remove(d0Var)) {
            handler = b0Var.I.L;
            handler.removeMessages(15, d0Var);
            handler2 = b0Var.I.L;
            handler2.removeMessages(16, d0Var);
            cVar = d0Var.f47475b;
            ArrayList arrayList = new ArrayList(b0Var.f47460w.size());
            for (b1 b1Var : b0Var.f47460w) {
                if ((b1Var instanceof j0) && (g10 = ((j0) b1Var).g(b0Var)) != null && vh.b.c(g10, cVar)) {
                    arrayList.add(b1Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b1 b1Var2 = (b1) arrayList.get(i10);
                b0Var.f47460w.remove(b1Var2);
                b1Var2.b(new UnsupportedApiCallException(cVar));
            }
        }
    }

    public final void A() {
        Handler handler;
        handler = this.I.L;
        rh.p.c(handler);
        this.G = null;
    }

    public final void B() {
        Handler handler;
        rh.h0 h0Var;
        Context context;
        handler = this.I.L;
        rh.p.c(handler);
        if (this.f47461x.isConnected() || this.f47461x.b()) {
            return;
        }
        try {
            e eVar = this.I;
            h0Var = eVar.E;
            context = eVar.C;
            int b10 = h0Var.b(context, this.f47461x);
            if (b10 != 0) {
                ConnectionResult connectionResult = new ConnectionResult(b10, null);
                String name = this.f47461x.getClass().getName();
                String obj = connectionResult.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + obj.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(obj);
                Log.w("GoogleApiManager", sb2.toString());
                E(connectionResult, null);
                return;
            }
            e eVar2 = this.I;
            a.f fVar = this.f47461x;
            f0 f0Var = new f0(eVar2, fVar, this.f47462y);
            if (fVar.f()) {
                ((t0) rh.p.i(this.D)).B4(f0Var);
            }
            try {
                this.f47461x.k(f0Var);
            } catch (SecurityException e10) {
                E(new ConnectionResult(10), e10);
            }
        } catch (IllegalStateException e11) {
            E(new ConnectionResult(10), e11);
        }
    }

    public final void C(b1 b1Var) {
        Handler handler;
        handler = this.I.L;
        rh.p.c(handler);
        if (this.f47461x.isConnected()) {
            if (l(b1Var)) {
                i();
                return;
            } else {
                this.f47460w.add(b1Var);
                return;
            }
        }
        this.f47460w.add(b1Var);
        ConnectionResult connectionResult = this.G;
        if (connectionResult != null && connectionResult.U()) {
            E(this.G, null);
        } else {
            B();
        }
    }

    public final void D() {
        this.H++;
    }

    public final void E(ConnectionResult connectionResult, Exception exc) {
        Handler handler;
        rh.h0 h0Var;
        boolean z10;
        Status h10;
        Status h11;
        Status h12;
        Handler handler2;
        Handler handler3;
        long j10;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.I.L;
        rh.p.c(handler);
        t0 t0Var = this.D;
        if (t0Var != null) {
            t0Var.k5();
        }
        A();
        h0Var = this.I.E;
        h0Var.c();
        c(connectionResult);
        if ((this.f47461x instanceof th.e) && connectionResult.p() != 24) {
            this.I.f47481z = true;
            e eVar = this.I;
            handler5 = eVar.L;
            handler6 = eVar.L;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS);
        }
        if (connectionResult.p() == 4) {
            status = e.O;
            d(status);
        } else if (this.f47460w.isEmpty()) {
            this.G = connectionResult;
        } else if (exc != null) {
            handler4 = this.I.L;
            rh.p.c(handler4);
            e(null, exc, false);
        } else {
            z10 = this.I.M;
            if (z10) {
                h11 = e.h(this.f47462y, connectionResult);
                e(h11, null, true);
                if (this.f47460w.isEmpty() || m(connectionResult) || this.I.g(connectionResult, this.C)) {
                    return;
                }
                if (connectionResult.p() == 18) {
                    this.E = true;
                }
                if (this.E) {
                    e eVar2 = this.I;
                    handler2 = eVar2.L;
                    handler3 = eVar2.L;
                    Message obtain = Message.obtain(handler3, 9, this.f47462y);
                    j10 = this.I.f47478w;
                    handler2.sendMessageDelayed(obtain, j10);
                    return;
                }
                h12 = e.h(this.f47462y, connectionResult);
                d(h12);
                return;
            }
            h10 = e.h(this.f47462y, connectionResult);
            d(h10);
        }
    }

    public final void F(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.I.L;
        rh.p.c(handler);
        a.f fVar = this.f47461x;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        fVar.a(sb2.toString());
        E(connectionResult, null);
    }

    public final void G(c1 c1Var) {
        Handler handler;
        handler = this.I.L;
        rh.p.c(handler);
        this.A.add(c1Var);
    }

    public final void H() {
        Handler handler;
        handler = this.I.L;
        rh.p.c(handler);
        if (this.E) {
            B();
        }
    }

    public final void I() {
        Handler handler;
        handler = this.I.L;
        rh.p.c(handler);
        d(e.N);
        this.f47463z.f();
        for (h hVar : (h[]) this.B.keySet().toArray(new h[0])) {
            C(new a1(hVar, new vi.h()));
        }
        c(new ConnectionResult(4));
        if (this.f47461x.isConnected()) {
            this.f47461x.d(new a0(this));
        }
    }

    public final void J() {
        Handler handler;
        nh.d dVar;
        Context context;
        Status status;
        handler = this.I.L;
        rh.p.c(handler);
        if (this.E) {
            k();
            e eVar = this.I;
            dVar = eVar.D;
            context = eVar.C;
            if (dVar.g(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            d(status);
            this.f47461x.a("Timing out connection while resuming.");
        }
    }

    public final boolean L() {
        return this.f47461x.isConnected();
    }

    public final boolean M() {
        return this.f47461x.f();
    }

    public final boolean a() {
        return n(true);
    }

    public final nh.c b(nh.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            nh.c[] m10 = this.f47461x.m();
            if (m10 == null) {
                m10 = new nh.c[0];
            }
            s.a aVar = new s.a(m10.length);
            for (nh.c cVar : m10) {
                aVar.put(cVar.p(), Long.valueOf(cVar.P()));
            }
            for (nh.c cVar2 : cVarArr) {
                Long l10 = (Long) aVar.get(cVar2.p());
                if (l10 == null || l10.longValue() < cVar2.P()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final void c(ConnectionResult connectionResult) {
        for (c1 c1Var : this.A) {
            c1Var.b(this.f47462y, connectionResult, rh.n.a(connectionResult, ConnectionResult.A) ? this.f47461x.c() : null);
        }
        this.A.clear();
    }

    public final void d(Status status) {
        Handler handler;
        handler = this.I.L;
        rh.p.c(handler);
        e(status, null, false);
    }

    public final void e(Status status, Exception exc, boolean z10) {
        Handler handler;
        handler = this.I.L;
        rh.p.c(handler);
        if ((status == null) != (exc == null)) {
            Iterator<b1> it = this.f47460w.iterator();
            while (it.hasNext()) {
                b1 next = it.next();
                if (!z10 || next.f47464a == 2) {
                    if (status != null) {
                        next.a(status);
                    } else {
                        next.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.f47460w);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b1 b1Var = (b1) arrayList.get(i10);
            if (!this.f47461x.isConnected()) {
                return;
            }
            if (l(b1Var)) {
                this.f47460w.remove(b1Var);
            }
        }
    }

    public final void g() {
        A();
        c(ConnectionResult.A);
        k();
        Iterator<p0> it = this.B.values().iterator();
        if (!it.hasNext()) {
            f();
            i();
            return;
        }
        k<a.b, ?> kVar = it.next().f47545a;
        throw null;
    }

    public final void h(int i10) {
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        rh.h0 h0Var;
        A();
        this.E = true;
        this.f47463z.e(i10, this.f47461x.n());
        e eVar = this.I;
        handler = eVar.L;
        handler2 = eVar.L;
        Message obtain = Message.obtain(handler2, 9, this.f47462y);
        j10 = this.I.f47478w;
        handler.sendMessageDelayed(obtain, j10);
        e eVar2 = this.I;
        handler3 = eVar2.L;
        handler4 = eVar2.L;
        Message obtain2 = Message.obtain(handler4, 11, this.f47462y);
        j11 = this.I.f47479x;
        handler3.sendMessageDelayed(obtain2, j11);
        h0Var = this.I.E;
        h0Var.c();
        for (p0 p0Var : this.B.values()) {
            p0Var.f47546b.run();
        }
    }

    public final void i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j10;
        handler = this.I.L;
        handler.removeMessages(12, this.f47462y);
        e eVar = this.I;
        handler2 = eVar.L;
        handler3 = eVar.L;
        Message obtainMessage = handler3.obtainMessage(12, this.f47462y);
        j10 = this.I.f47480y;
        handler2.sendMessageDelayed(obtainMessage, j10);
    }

    @Override // ph.d
    public final void i0(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.I.L;
        if (myLooper == handler.getLooper()) {
            g();
            return;
        }
        handler2 = this.I.L;
        handler2.post(new x(this));
    }

    public final void j(b1 b1Var) {
        b1Var.d(this.f47463z, M());
        try {
            b1Var.c(this);
        } catch (DeadObjectException unused) {
            s0(1);
            this.f47461x.a("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void k() {
        Handler handler;
        Handler handler2;
        if (this.E) {
            handler = this.I.L;
            handler.removeMessages(11, this.f47462y);
            handler2 = this.I.L;
            handler2.removeMessages(9, this.f47462y);
            this.E = false;
        }
    }

    public final boolean l(b1 b1Var) {
        boolean z10;
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j12;
        if (!(b1Var instanceof j0)) {
            j(b1Var);
            return true;
        }
        j0 j0Var = (j0) b1Var;
        nh.c b10 = b(j0Var.g(this));
        if (b10 == null) {
            j(b1Var);
            return true;
        }
        String name = this.f47461x.getClass().getName();
        String p10 = b10.p();
        long P = b10.P();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(p10).length());
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(p10);
        sb2.append(", ");
        sb2.append(P);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        z10 = this.I.M;
        if (z10 && j0Var.f(this)) {
            d0 d0Var = new d0(this.f47462y, b10, null);
            int indexOf = this.F.indexOf(d0Var);
            if (indexOf >= 0) {
                d0 d0Var2 = this.F.get(indexOf);
                handler5 = this.I.L;
                handler5.removeMessages(15, d0Var2);
                e eVar = this.I;
                handler6 = eVar.L;
                handler7 = eVar.L;
                Message obtain = Message.obtain(handler7, 15, d0Var2);
                j12 = this.I.f47478w;
                handler6.sendMessageDelayed(obtain, j12);
                return false;
            }
            this.F.add(d0Var);
            e eVar2 = this.I;
            handler = eVar2.L;
            handler2 = eVar2.L;
            Message obtain2 = Message.obtain(handler2, 15, d0Var);
            j10 = this.I.f47478w;
            handler.sendMessageDelayed(obtain2, j10);
            e eVar3 = this.I;
            handler3 = eVar3.L;
            handler4 = eVar3.L;
            Message obtain3 = Message.obtain(handler4, 16, d0Var);
            j11 = this.I.f47479x;
            handler3.sendMessageDelayed(obtain3, j11);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (m(connectionResult)) {
                return false;
            }
            this.I.g(connectionResult, this.C);
            return false;
        }
        j0Var.b(new UnsupportedApiCallException(b10));
        return true;
    }

    public final boolean m(ConnectionResult connectionResult) {
        Object obj;
        s sVar;
        Set set;
        s sVar2;
        obj = e.P;
        synchronized (obj) {
            e eVar = this.I;
            sVar = eVar.I;
            if (sVar != null) {
                set = eVar.J;
                if (set.contains(this.f47462y)) {
                    sVar2 = this.I.I;
                    sVar2.s(connectionResult, this.C);
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean n(boolean z10) {
        Handler handler;
        handler = this.I.L;
        rh.p.c(handler);
        if (this.f47461x.isConnected() && this.B.size() == 0) {
            if (!this.f47463z.g()) {
                this.f47461x.a("Timing out service connection.");
                return true;
            }
            if (z10) {
                i();
            }
            return false;
        }
        return false;
    }

    public final int o() {
        return this.C;
    }

    public final int p() {
        return this.H;
    }

    public final ConnectionResult q() {
        Handler handler;
        handler = this.I.L;
        rh.p.c(handler);
        return this.G;
    }

    public final a.f s() {
        return this.f47461x;
    }

    @Override // ph.d
    public final void s0(int i10) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.I.L;
        if (myLooper == handler.getLooper()) {
            h(i10);
            return;
        }
        handler2 = this.I.L;
        handler2.post(new y(this, i10));
    }

    public final Map<h<?>, p0> u() {
        return this.B;
    }

    @Override // ph.j
    public final void z0(ConnectionResult connectionResult) {
        E(connectionResult, null);
    }
}
