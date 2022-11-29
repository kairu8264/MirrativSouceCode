package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ez2 extends ty2 {

    /* renamed from: w  reason: collision with root package name */
    public final Object f3835w;

    /* renamed from: x  reason: collision with root package name */
    public int f3836x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ hz2 f3837y;

    public ez2(hz2 hz2Var, int i10) {
        this.f3837y = hz2Var;
        this.f3835w = hz2.A(hz2Var, i10);
        this.f3836x = i10;
    }

    public final void a() {
        int G;
        int i10 = this.f3836x;
        if (i10 == -1 || i10 >= this.f3837y.size() || !hx2.a(this.f3835w, hz2.A(this.f3837y, this.f3836x))) {
            G = this.f3837y.G(this.f3835w);
            this.f3836x = G;
        }
    }

    @Override // ai.ty2, java.util.Map.Entry
    public final Object getKey() {
        return this.f3835w;
    }

    @Override // ai.ty2, java.util.Map.Entry
    public final Object getValue() {
        Map o10 = this.f3837y.o();
        if (o10 != null) {
            return o10.get(this.f3835w);
        }
        a();
        int i10 = this.f3836x;
        if (i10 == -1) {
            return null;
        }
        return hz2.B(this.f3837y, i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map o10 = this.f3837y.o();
        if (o10 != null) {
            return o10.put(this.f3835w, obj);
        }
        a();
        int i10 = this.f3836x;
        if (i10 == -1) {
            this.f3837y.put(this.f3835w, obj);
            return null;
        }
        Object B = hz2.B(this.f3837y, i10);
        hz2.C(this.f3837y, this.f3836x, obj);
        return B;
    }
}
