package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.o;

/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final w f15589a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f15590b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public a f15591c;

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final w f15592w;

        /* renamed from: x  reason: collision with root package name */
        public final o.b f15593x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f15594y = false;

        public a(w wVar, o.b bVar) {
            this.f15592w = wVar;
            this.f15593x = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15594y) {
                return;
            }
            this.f15592w.h(this.f15593x);
            this.f15594y = true;
        }
    }

    public n0(u uVar) {
        this.f15589a = new w(uVar);
    }

    public o a() {
        return this.f15589a;
    }

    public void b() {
        f(o.b.ON_START);
    }

    public void c() {
        f(o.b.ON_CREATE);
    }

    public void d() {
        f(o.b.ON_STOP);
        f(o.b.ON_DESTROY);
    }

    public void e() {
        f(o.b.ON_START);
    }

    public final void f(o.b bVar) {
        a aVar = this.f15591c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f15589a, bVar);
        this.f15591c = aVar2;
        this.f15590b.postAtFrontOfQueue(aVar2);
    }
}
