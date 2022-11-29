package ai;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class x5 implements t5 {

    /* renamed from: a  reason: collision with root package name */
    public final xo3 f11866a;

    /* renamed from: d  reason: collision with root package name */
    public int f11869d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11870e;

    /* renamed from: c  reason: collision with root package name */
    public final List<bp3> f11868c = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Object f11867b = new Object();

    public x5(dp3 dp3Var, boolean z10) {
        this.f11866a = new xo3(dp3Var, z10);
    }

    public final void a(int i10) {
        this.f11869d = i10;
        this.f11870e = false;
        this.f11868c.clear();
    }

    @Override // ai.t5
    public final q7 b() {
        return this.f11866a.F();
    }

    @Override // ai.t5
    public final Object zzb() {
        return this.f11867b;
    }
}
