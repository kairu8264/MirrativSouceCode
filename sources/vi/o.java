package vi;

import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f57375a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final int f57376b;

    /* renamed from: c  reason: collision with root package name */
    public final i0<Void> f57377c;

    /* renamed from: d  reason: collision with root package name */
    public int f57378d;

    /* renamed from: e  reason: collision with root package name */
    public int f57379e;

    /* renamed from: f  reason: collision with root package name */
    public int f57380f;

    /* renamed from: g  reason: collision with root package name */
    public Exception f57381g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f57382h;

    public o(int i10, i0<Void> i0Var) {
        this.f57376b = i10;
        this.f57377c = i0Var;
    }

    @Override // vi.d
    public final void a(Exception exc) {
        synchronized (this.f57375a) {
            this.f57379e++;
            this.f57381g = exc;
            b();
        }
    }

    public final void b() {
        if (this.f57378d + this.f57379e + this.f57380f == this.f57376b) {
            if (this.f57381g == null) {
                if (this.f57382h) {
                    this.f57377c.x();
                    return;
                } else {
                    this.f57377c.w(null);
                    return;
                }
            }
            i0<Void> i0Var = this.f57377c;
            int i10 = this.f57379e;
            int i11 = this.f57376b;
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append(i10);
            sb2.append(" out of ");
            sb2.append(i11);
            sb2.append(" underlying tasks failed");
            i0Var.v(new ExecutionException(sb2.toString(), this.f57381g));
        }
    }

    @Override // vi.b
    public final void c() {
        synchronized (this.f57375a) {
            this.f57380f++;
            this.f57382h = true;
            b();
        }
    }

    @Override // vi.e
    public final void onSuccess(Object obj) {
        synchronized (this.f57375a) {
            this.f57378d++;
            b();
        }
    }
}
