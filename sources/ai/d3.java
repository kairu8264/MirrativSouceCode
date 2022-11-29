package ai;

import com.google.android.gms.internal.ads.zzaeg;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d3 implements qa {
    public boolean A = true;
    public boolean B;

    /* renamed from: w  reason: collision with root package name */
    public final jb f3110w;

    /* renamed from: x  reason: collision with root package name */
    public final c3 f3111x;

    /* renamed from: y  reason: collision with root package name */
    public u6 f3112y;

    /* renamed from: z  reason: collision with root package name */
    public qa f3113z;

    public d3(c3 c3Var, v9 v9Var) {
        this.f3111x = c3Var;
        this.f3110w = new jb(v9Var);
    }

    @Override // ai.qa
    public final void A(e6 e6Var) {
        qa qaVar = this.f3113z;
        if (qaVar != null) {
            qaVar.A(e6Var);
            e6Var = this.f3113z.y();
        }
        this.f3110w.A(e6Var);
    }

    public final void a() {
        this.B = true;
        this.f3110w.a();
    }

    public final void b() {
        this.B = false;
        this.f3110w.b();
    }

    public final void c(long j10) {
        this.f3110w.c(j10);
    }

    public final void d(u6 u6Var) throws zzaeg {
        qa qaVar;
        qa h10 = u6Var.h();
        if (h10 == null || h10 == (qaVar = this.f3113z)) {
            return;
        }
        if (qaVar == null) {
            this.f3113z = h10;
            this.f3112y = u6Var;
            h10.A(this.f3110w.y());
            return;
        }
        throw zzaeg.c(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
    }

    public final void e(u6 u6Var) {
        if (u6Var == this.f3112y) {
            this.f3113z = null;
            this.f3112y = null;
            this.A = true;
        }
    }

    public final long f(boolean z10) {
        u6 u6Var = this.f3112y;
        if (u6Var != null && !u6Var.J() && (this.f3112y.N() || (!z10 && !this.f3112y.P()))) {
            qa qaVar = this.f3113z;
            Objects.requireNonNull(qaVar);
            long z11 = qaVar.z();
            if (this.A) {
                if (z11 < this.f3110w.z()) {
                    this.f3110w.b();
                } else {
                    this.A = false;
                    if (this.B) {
                        this.f3110w.a();
                    }
                }
            }
            this.f3110w.c(z11);
            e6 y10 = qaVar.y();
            if (!y10.equals(this.f3110w.y())) {
                this.f3110w.A(y10);
                this.f3111x.b(y10);
            }
        } else {
            this.A = true;
            if (this.B) {
                this.f3110w.a();
            }
        }
        if (this.A) {
            return this.f3110w.z();
        }
        qa qaVar2 = this.f3113z;
        Objects.requireNonNull(qaVar2);
        return qaVar2.z();
    }

    @Override // ai.qa
    public final e6 y() {
        qa qaVar = this.f3113z;
        return qaVar != null ? qaVar.y() : this.f3110w.y();
    }

    @Override // ai.qa
    public final long z() {
        throw null;
    }
}
