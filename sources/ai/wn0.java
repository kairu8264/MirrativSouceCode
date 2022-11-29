package ai;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class wn0 extends yg.b0 {

    /* renamed from: c  reason: collision with root package name */
    public final em0 f11692c;

    /* renamed from: d  reason: collision with root package name */
    public final fo0 f11693d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11694e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f11695f;

    public wn0(em0 em0Var, fo0 fo0Var, String str, String[] strArr) {
        this.f11692c = em0Var;
        this.f11693d = fo0Var;
        this.f11694e = str;
        this.f11695f = strArr;
        wg.t.z().g(this);
    }

    @Override // yg.b0
    public final void a() {
        try {
            this.f11693d.g(this.f11694e, this.f11695f);
        } finally {
            yg.d2.f61866i.post(new vn0(this));
        }
    }

    @Override // yg.b0
    public final s43<?> c() {
        if (((Boolean) ft.c().c(ox.f8054o1)).booleanValue() && (this.f11693d instanceof oo0)) {
            return hk0.f4882e.h(new Callable(this) { // from class: ai.un0

                /* renamed from: a  reason: collision with root package name */
                public final wn0 f10760a;

                {
                    this.f10760a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f10760a.e();
                }
            });
        }
        return super.c();
    }

    public final String d() {
        return this.f11694e;
    }

    public final /* synthetic */ Boolean e() throws Exception {
        return Boolean.valueOf(this.f11693d.h(this.f11694e, this.f11695f, this));
    }
}
