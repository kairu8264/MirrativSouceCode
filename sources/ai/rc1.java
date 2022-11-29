package ai;

import java.util.List;

/* loaded from: classes3.dex */
public final class rc1 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f9396a;

    /* renamed from: b  reason: collision with root package name */
    public final fr2 f9397b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9398c;

    public rc1(fl2 fl2Var, fr2 fr2Var) {
        this.f9396a = fl2Var.f4105p;
        this.f9397b = fr2Var;
    }

    public final void a() {
        if (this.f9398c) {
            return;
        }
        this.f9397b.a(this.f9396a);
        this.f9398c = true;
    }
}
