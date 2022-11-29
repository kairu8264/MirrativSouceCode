package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class wo3 extends q7 {

    /* renamed from: c  reason: collision with root package name */
    public final k5 f11703c;

    public wo3(k5 k5Var) {
        this.f11703c = k5Var;
    }

    @Override // ai.q7
    public final int a() {
        return 1;
    }

    @Override // ai.q7
    public final p7 f(int i10, p7 p7Var, long j10) {
        p7Var.a(p7.f8322o, this.f11703c, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
        p7Var.f8335j = true;
        return p7Var;
    }

    @Override // ai.q7
    public final int g() {
        return 1;
    }

    @Override // ai.q7
    public final n7 h(int i10, n7 n7Var, boolean z10) {
        n7Var.a(z10 ? 0 : null, z10 ? uo3.f10783f : null, 0, C.TIME_UNSET, 0L, q31.f8799c, true);
        return n7Var;
    }

    @Override // ai.q7
    public final int i(Object obj) {
        return obj == uo3.f10783f ? 0 : -1;
    }

    @Override // ai.q7
    public final Object j(int i10) {
        return uo3.f10783f;
    }
}
