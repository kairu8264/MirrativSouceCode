package ai;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class pk3 implements dp3 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<cp3> f8453a = new ArrayList<>(1);

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<cp3> f8454b = new HashSet<>(1);

    /* renamed from: c  reason: collision with root package name */
    public final kp3 f8455c = new kp3();

    /* renamed from: d  reason: collision with root package name */
    public final hl2 f8456d = new hl2();

    /* renamed from: e  reason: collision with root package name */
    public Looper f8457e;

    /* renamed from: f  reason: collision with root package name */
    public q7 f8458f;

    @Override // ai.dp3
    public final void a(cp3 cp3Var, pm pmVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f8457e;
        boolean z10 = true;
        if (looper != null && looper != myLooper) {
            z10 = false;
        }
        u9.a(z10);
        q7 q7Var = this.f8458f;
        this.f8453a.add(cp3Var);
        if (this.f8457e == null) {
            this.f8457e = myLooper;
            this.f8454b.add(cp3Var);
            n(pmVar);
        } else if (q7Var != null) {
            h(cp3Var);
            cp3Var.a(this, q7Var);
        }
    }

    @Override // ai.dp3
    public final void b(Handler handler, lp3 lp3Var) {
        Objects.requireNonNull(lp3Var);
        this.f8455c.b(handler, lp3Var);
    }

    @Override // ai.dp3
    public final void d(lp3 lp3Var) {
        this.f8455c.c(lp3Var);
    }

    @Override // ai.dp3
    public final void e(Handler handler, gm2 gm2Var) {
        Objects.requireNonNull(gm2Var);
        this.f8456d.b(handler, gm2Var);
    }

    @Override // ai.dp3
    public final void h(cp3 cp3Var) {
        Objects.requireNonNull(this.f8457e);
        boolean isEmpty = this.f8454b.isEmpty();
        this.f8454b.add(cp3Var);
        if (isEmpty) {
            l();
        }
    }

    @Override // ai.dp3
    public final void i(cp3 cp3Var) {
        boolean isEmpty = this.f8454b.isEmpty();
        this.f8454b.remove(cp3Var);
        if ((!isEmpty) && this.f8454b.isEmpty()) {
            o();
        }
    }

    @Override // ai.dp3
    public final void j(cp3 cp3Var) {
        this.f8453a.remove(cp3Var);
        if (this.f8453a.isEmpty()) {
            this.f8457e = null;
            this.f8458f = null;
            this.f8454b.clear();
            p();
            return;
        }
        i(cp3Var);
    }

    @Override // ai.dp3
    public final void k(gm2 gm2Var) {
        this.f8456d.c(gm2Var);
    }

    public void l() {
    }

    @Override // ai.dp3
    public final boolean m() {
        return true;
    }

    public abstract void n(pm pmVar);

    public void o() {
    }

    public abstract void p();

    @Override // ai.dp3
    public final q7 q() {
        return null;
    }

    public final void s(q7 q7Var) {
        this.f8458f = q7Var;
        ArrayList<cp3> arrayList = this.f8453a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this, q7Var);
        }
    }

    public final kp3 t(bp3 bp3Var) {
        return this.f8455c.a(0, bp3Var, 0L);
    }

    public final kp3 v(int i10, bp3 bp3Var, long j10) {
        return this.f8455c.a(i10, bp3Var, 0L);
    }

    public final hl2 w(bp3 bp3Var) {
        return this.f8456d.a(0, bp3Var);
    }

    public final hl2 x(int i10, bp3 bp3Var) {
        return this.f8456d.a(i10, bp3Var);
    }

    public final boolean y() {
        return !this.f8454b.isEmpty();
    }
}
