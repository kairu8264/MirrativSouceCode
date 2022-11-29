package ai;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class ia0 extends n90 {

    /* renamed from: w  reason: collision with root package name */
    public final ah.v f5147w;

    public ia0(ah.v vVar) {
        this.f5147w = vVar;
    }

    @Override // ai.o90
    public final void C() {
        this.f5147w.s();
    }

    @Override // ai.o90
    public final float O() {
        return this.f5147w.e();
    }

    @Override // ai.o90
    public final List a() {
        List<tg.d> j10 = this.f5147w.j();
        ArrayList arrayList = new ArrayList();
        if (j10 != null) {
            for (tg.d dVar : j10) {
                arrayList.add(new wz(dVar.a(), dVar.c(), dVar.b(), dVar.d(), dVar.e()));
            }
        }
        return arrayList;
    }

    @Override // ai.o90
    public final String c() {
        return this.f5147w.h();
    }

    @Override // ai.o90
    public final m00 e() {
        tg.d i10 = this.f5147w.i();
        if (i10 != null) {
            return new wz(i10.a(), i10.c(), i10.b(), i10.d(), i10.e());
        }
        return null;
    }

    @Override // ai.o90
    public final String f() {
        return this.f5147w.c();
    }

    @Override // ai.o90
    public final String g() {
        return this.f5147w.b();
    }

    @Override // ai.o90
    public final String h() {
        return this.f5147w.d();
    }

    @Override // ai.o90
    public final double i() {
        if (this.f5147w.o() != null) {
            return this.f5147w.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // ai.o90
    public final String j() {
        return this.f5147w.p();
    }

    @Override // ai.o90
    public final String k() {
        return this.f5147w.n();
    }

    @Override // ai.o90
    public final yh.a l() {
        View J = this.f5147w.J();
        if (J == null) {
            return null;
        }
        return yh.b.h1(J);
    }

    @Override // ai.o90
    public final void l3(yh.a aVar) {
        this.f5147w.F((View) yh.b.z0(aVar));
    }

    @Override // ai.o90
    public final void l4(yh.a aVar, yh.a aVar2, yh.a aVar3) {
        this.f5147w.E((View) yh.b.z0(aVar), (HashMap) yh.b.z0(aVar2), (HashMap) yh.b.z0(aVar3));
    }

    @Override // ai.o90
    public final boolean m() {
        return this.f5147w.m();
    }

    @Override // ai.o90
    public final pv n() {
        if (this.f5147w.I() != null) {
            return this.f5147w.I().c();
        }
        return null;
    }

    @Override // ai.o90
    public final e00 o() {
        return null;
    }

    @Override // ai.o90
    public final yh.a p() {
        View a10 = this.f5147w.a();
        if (a10 == null) {
            return null;
        }
        return yh.b.h1(a10);
    }

    @Override // ai.o90
    public final Bundle q() {
        return this.f5147w.g();
    }

    @Override // ai.o90
    public final boolean r() {
        return this.f5147w.l();
    }

    @Override // ai.o90
    public final void t0(yh.a aVar) {
        this.f5147w.q((View) yh.b.z0(aVar));
    }

    @Override // ai.o90
    public final float u() {
        return this.f5147w.k();
    }

    @Override // ai.o90
    public final yh.a w() {
        Object K = this.f5147w.K();
        if (K == null) {
            return null;
        }
        return yh.b.h1(K);
    }

    @Override // ai.o90
    public final float y() {
        return this.f5147w.f();
    }
}
