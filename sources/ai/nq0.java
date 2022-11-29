package ai;

import android.os.RemoteException;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class nq0 extends ov {
    public int A;
    public sv B;
    public boolean C;
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public r10 J;

    /* renamed from: w  reason: collision with root package name */
    public final em0 f7436w;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f7438y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f7439z;

    /* renamed from: x  reason: collision with root package name */
    public final Object f7437x = new Object();
    public boolean D = true;

    public nq0(em0 em0Var, float f10, boolean z10, boolean z11) {
        this.f7436w = em0Var;
        this.E = f10;
        this.f7438y = z10;
        this.f7439z = z11;
    }

    public final void S5(uw uwVar) {
        boolean z10 = uwVar.f10855w;
        boolean z11 = uwVar.f10856x;
        boolean z12 = uwVar.f10857y;
        synchronized (this.f7437x) {
            this.H = z11;
            this.I = z12;
        }
        Y5("initialState", vh.g.d("muteStart", true != z10 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "customControlsRequested", true != z11 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "clickToExpandRequested", true != z12 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
    }

    public final void T5(float f10) {
        synchronized (this.f7437x) {
            this.F = f10;
        }
    }

    public final void U5(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.f7437x) {
            z11 = true;
            if (f11 == this.E && f12 == this.G) {
                z11 = false;
            }
            this.E = f11;
            this.F = f10;
            z12 = this.D;
            this.D = z10;
            i11 = this.A;
            this.A = i10;
            float f13 = this.G;
            this.G = f12;
            if (Math.abs(f12 - f13) > 1.0E-4f) {
                this.f7436w.G().invalidate();
            }
        }
        if (z11) {
            try {
                r10 r10Var = this.J;
                if (r10Var != null) {
                    r10Var.c();
                }
            } catch (RemoteException e10) {
                uj0.i("#007 Could not call remote method.", e10);
            }
        }
        Z5(i11, i10, z12, z10);
    }

    public final /* synthetic */ void V5(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        sv svVar;
        sv svVar2;
        sv svVar3;
        synchronized (this.f7437x) {
            boolean z14 = this.C;
            boolean z15 = false;
            if (z14 || i11 != 1) {
                i12 = i11;
                z12 = false;
            } else {
                i12 = 1;
                z12 = true;
            }
            if (i10 == i11 || i12 != 1) {
                z13 = false;
            } else {
                i12 = 1;
                z13 = true;
            }
            boolean z16 = i10 != i11 && i12 == 2;
            boolean z17 = i10 != i11 && i12 == 3;
            if (z14 || z12) {
                z15 = true;
            }
            this.C = z15;
            if (z12) {
                try {
                    sv svVar4 = this.B;
                    if (svVar4 != null) {
                        svVar4.c();
                    }
                } catch (RemoteException e10) {
                    uj0.i("#007 Could not call remote method.", e10);
                }
            }
            if (z13 && (svVar3 = this.B) != null) {
                svVar3.a();
            }
            if (z16 && (svVar2 = this.B) != null) {
                svVar2.f();
            }
            if (z17) {
                sv svVar5 = this.B;
                if (svVar5 != null) {
                    svVar5.e();
                }
                this.f7436w.y();
            }
            if (z10 != z11 && (svVar = this.B) != null) {
                svVar.k2(z11);
            }
        }
    }

    public final /* synthetic */ void W5(Map map) {
        this.f7436w.j0("pubVideoCmd", map);
    }

    public final void X5(r10 r10Var) {
        synchronized (this.f7437x) {
            this.J = r10Var;
        }
    }

    public final void Y5(String str, Map<String, String> map) {
        final HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put(ActionLogBase.ACTION, str);
        hk0.f4882e.execute(new Runnable(this, hashMap) { // from class: ai.lq0

            /* renamed from: w  reason: collision with root package name */
            public final nq0 f6642w;

            /* renamed from: x  reason: collision with root package name */
            public final Map f6643x;

            {
                this.f6642w = this;
                this.f6643x = hashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6642w.W5(this.f6643x);
            }
        });
    }

    public final void Z5(final int i10, final int i11, final boolean z10, final boolean z11) {
        hk0.f4882e.execute(new Runnable(this, i10, i11, z10, z11) { // from class: ai.mq0
            public final boolean A;

            /* renamed from: w  reason: collision with root package name */
            public final nq0 f6999w;

            /* renamed from: x  reason: collision with root package name */
            public final int f7000x;

            /* renamed from: y  reason: collision with root package name */
            public final int f7001y;

            /* renamed from: z  reason: collision with root package name */
            public final boolean f7002z;

            {
                this.f6999w = this;
                this.f7000x = i10;
                this.f7001y = i11;
                this.f7002z = z10;
                this.A = z11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6999w.V5(this.f7000x, this.f7001y, this.f7002z, this.A);
            }
        });
    }

    @Override // ai.pv
    public final void a() {
        Y5("pause", null);
    }

    @Override // ai.pv
    public final void b0(boolean z10) {
        Y5(true != z10 ? "unmute" : "mute", null);
    }

    @Override // ai.pv
    public final void c() {
        Y5("play", null);
    }

    @Override // ai.pv
    public final boolean e() {
        boolean z10;
        synchronized (this.f7437x) {
            z10 = this.D;
        }
        return z10;
    }

    @Override // ai.pv
    public final float g() {
        float f10;
        synchronized (this.f7437x) {
            f10 = this.E;
        }
        return f10;
    }

    @Override // ai.pv
    public final int h() {
        int i10;
        synchronized (this.f7437x) {
            i10 = this.A;
        }
        return i10;
    }

    @Override // ai.pv
    public final float i() {
        float f10;
        synchronized (this.f7437x) {
            f10 = this.F;
        }
        return f10;
    }

    @Override // ai.pv
    public final float k() {
        float f10;
        synchronized (this.f7437x) {
            f10 = this.G;
        }
        return f10;
    }

    @Override // ai.pv
    public final void l() {
        Y5("stop", null);
    }

    @Override // ai.pv
    public final boolean n() {
        boolean z10;
        synchronized (this.f7437x) {
            z10 = false;
            if (this.f7438y && this.H) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // ai.pv
    public final void n5(sv svVar) {
        synchronized (this.f7437x) {
            this.B = svVar;
        }
    }

    @Override // ai.pv
    public final sv o() throws RemoteException {
        sv svVar;
        synchronized (this.f7437x) {
            svVar = this.B;
        }
        return svVar;
    }

    @Override // ai.pv
    public final boolean p() {
        boolean z10;
        boolean n10 = n();
        synchronized (this.f7437x) {
            z10 = false;
            if (!n10) {
                try {
                    if (this.I && this.f7439z) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    public final void w() {
        boolean z10;
        int i10;
        synchronized (this.f7437x) {
            z10 = this.D;
            i10 = this.A;
            this.A = 3;
        }
        Z5(i10, 3, z10, z10);
    }
}
