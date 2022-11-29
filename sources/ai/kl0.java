package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
/* loaded from: classes3.dex */
public abstract class kl0 extends TextureView implements hm0 {

    /* renamed from: w  reason: collision with root package name */
    public final xl0 f6274w;

    /* renamed from: x  reason: collision with root package name */
    public final im0 f6275x;

    public kl0(Context context) {
        super(context);
        this.f6274w = new xl0();
        this.f6275x = new im0(context, this);
    }

    public void A(int i10) {
    }

    public void B(int i10) {
    }

    public void C(int i10) {
    }

    public void f(int i10) {
    }

    public void g(int i10) {
    }

    public abstract String h();

    public abstract void i(jl0 jl0Var);

    public abstract void j(String str);

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract int o();

    public abstract int p();

    public abstract void q(int i10);

    public abstract void r(float f10, float f11);

    public abstract int s();

    public abstract int t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract int y();

    public void z(String str, String[] strArr) {
        j(str);
    }
}
