package ai;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class wy0 extends ty0 {

    /* renamed from: i  reason: collision with root package name */
    public final Context f11803i;

    /* renamed from: j  reason: collision with root package name */
    public final View f11804j;

    /* renamed from: k  reason: collision with root package name */
    public final rp0 f11805k;

    /* renamed from: l  reason: collision with root package name */
    public final il2 f11806l;

    /* renamed from: m  reason: collision with root package name */
    public final s01 f11807m;

    /* renamed from: n  reason: collision with root package name */
    public final zg1 f11808n;

    /* renamed from: o  reason: collision with root package name */
    public final pc1 f11809o;

    /* renamed from: p  reason: collision with root package name */
    public final kn3<b52> f11810p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f11811q;

    /* renamed from: r  reason: collision with root package name */
    public fs f11812r;

    public wy0(t01 t01Var, Context context, il2 il2Var, View view, rp0 rp0Var, s01 s01Var, zg1 zg1Var, pc1 pc1Var, kn3<b52> kn3Var, Executor executor) {
        super(t01Var);
        this.f11803i = context;
        this.f11804j = view;
        this.f11805k = rp0Var;
        this.f11806l = il2Var;
        this.f11807m = s01Var;
        this.f11808n = zg1Var;
        this.f11809o = pc1Var;
        this.f11810p = kn3Var;
        this.f11811q = executor;
    }

    @Override // ai.u01
    public final void a() {
        this.f11811q.execute(new Runnable(this) { // from class: ai.vy0

            /* renamed from: w  reason: collision with root package name */
            public final wy0 f11409w;

            {
                this.f11409w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11409w.n();
            }
        });
        super.a();
    }

    @Override // ai.ty0
    public final View g() {
        return this.f11804j;
    }

    @Override // ai.ty0
    public final void h(ViewGroup viewGroup, fs fsVar) {
        rp0 rp0Var;
        if (viewGroup == null || (rp0Var = this.f11805k) == null) {
            return;
        }
        rp0Var.v0(ir0.a(fsVar));
        viewGroup.setMinimumHeight(fsVar.f4175y);
        viewGroup.setMinimumWidth(fsVar.B);
        this.f11812r = fsVar;
    }

    @Override // ai.ty0
    public final pv i() {
        try {
            return this.f11807m.zza();
        } catch (zzfaw unused) {
            return null;
        }
    }

    @Override // ai.ty0
    public final il2 j() {
        fs fsVar = this.f11812r;
        if (fsVar != null) {
            return cm2.c(fsVar);
        }
        fl2 fl2Var = this.f10528b;
        if (fl2Var.Y) {
            for (String str : fl2Var.f4080a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new il2(this.f11804j.getWidth(), this.f11804j.getHeight(), false);
        }
        return cm2.a(this.f10528b.f4107r, this.f11806l);
    }

    @Override // ai.ty0
    public final il2 k() {
        return this.f11806l;
    }

    @Override // ai.ty0
    public final int l() {
        if (((Boolean) ft.c().c(ox.B5)).booleanValue() && this.f10528b.f4087d0) {
            if (!((Boolean) ft.c().c(ox.C5)).booleanValue()) {
                return 0;
            }
        }
        return this.f10527a.f9876b.f9497b.f6278c;
    }

    @Override // ai.ty0
    public final void m() {
        this.f11809o.zza();
    }

    public final /* bridge */ /* synthetic */ void n() {
        if (this.f11808n.d() == null) {
            return;
        }
        try {
            this.f11808n.d().O4(this.f11810p.zzb(), yh.b.h1(this.f11803i));
        } catch (RemoteException e10) {
            uj0.d("RemoteException when notifyAdLoad is called", e10);
        }
    }
}
