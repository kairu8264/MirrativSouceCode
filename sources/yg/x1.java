package yg;

import android.content.Context;

/* loaded from: classes3.dex */
public final class x1 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Context f61996w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ d2 f61997x;

    public x1(d2 d2Var, Context context) {
        this.f61997x = d2Var;
        this.f61996w = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        obj = this.f61997x.f61871d;
        synchronized (obj) {
            this.f61997x.f61872e = d2.u(this.f61996w);
            obj2 = this.f61997x.f61871d;
            obj2.notifyAll();
        }
    }
}
