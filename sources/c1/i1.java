package c1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class i1 extends u {

    /* renamed from: c  reason: collision with root package name */
    public final long f18691c;

    public i1(long j10) {
        super(null);
        this.f18691c = j10;
    }

    public /* synthetic */ i1(long j10, jo.h hVar) {
        this(j10);
    }

    @Override // c1.u
    public void a(long j10, s0 s0Var, float f10) {
        long j11;
        jo.p.h(s0Var, TtmlNode.TAG_P);
        s0Var.b(1.0f);
        if (!(f10 == 1.0f)) {
            long j12 = this.f18691c;
            j11 = c0.k(j12, c0.n(j12) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = this.f18691c;
        }
        s0Var.l(j11);
        if (s0Var.s() != null) {
            s0Var.r(null);
        }
    }

    public final long b() {
        return this.f18691c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && c0.m(this.f18691c, ((i1) obj).f18691c);
    }

    public int hashCode() {
        return c0.s(this.f18691c);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) c0.t(this.f18691c)) + ')';
    }
}
