package ai;

import java.util.List;

/* loaded from: classes3.dex */
public final class im2 {

    /* renamed from: a  reason: collision with root package name */
    public final fl2 f5297a;

    /* renamed from: b  reason: collision with root package name */
    public final kl2 f5298b;

    /* renamed from: c  reason: collision with root package name */
    public final ey1 f5299c;

    /* renamed from: d  reason: collision with root package name */
    public final fr2 f5300d;

    public im2(ey1 ey1Var, fr2 fr2Var, fl2 fl2Var, kl2 kl2Var) {
        this.f5297a = fl2Var;
        this.f5298b = kl2Var;
        this.f5299c = ey1Var;
        this.f5300d = fr2Var;
    }

    public final void a(List<String> list) {
        for (String str : list) {
            c(str, 2);
        }
    }

    public final void b(List<String> list, int i10) {
        for (String str : list) {
            c(str, i10);
        }
    }

    public final void c(String str, int i10) {
        if (!this.f5297a.f4091f0) {
            this.f5300d.b(str);
            return;
        }
        this.f5299c.h(new gy1(wg.t.k().currentTimeMillis(), this.f5298b.f6277b, str, i10));
    }
}
