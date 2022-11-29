package g2;

import android.graphics.Typeface;
import jo.p;
import l0.c2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final c2<Object> f32606a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f32607b;

    public m(c2<? extends Object> c2Var) {
        p.h(c2Var, "resolveResult");
        this.f32606a = c2Var;
        this.f32607b = c2Var.getValue();
    }

    public final Typeface a() {
        return (Typeface) this.f32607b;
    }

    public final boolean b() {
        return this.f32606a.getValue() != this.f32607b;
    }
}
