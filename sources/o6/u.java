package o6;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import i6.d;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class u implements ComponentCallbacks2, d.a {
    public static final a B = new a(null);
    public final AtomicBoolean A;

    /* renamed from: w  reason: collision with root package name */
    public final Context f44117w;

    /* renamed from: x  reason: collision with root package name */
    public final WeakReference<x5.h> f44118x;

    /* renamed from: y  reason: collision with root package name */
    public final i6.d f44119y;

    /* renamed from: z  reason: collision with root package name */
    public volatile boolean f44120z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public u(x5.h hVar, Context context, boolean z10) {
        i6.d cVar;
        this.f44117w = context;
        this.f44118x = new WeakReference<>(hVar);
        if (z10) {
            cVar = i6.e.a(context, this, hVar.i());
        } else {
            cVar = new i6.c();
        }
        this.f44119y = cVar;
        this.f44120z = cVar.a();
        this.A = new AtomicBoolean(false);
        context.registerComponentCallbacks(this);
    }

    @Override // i6.d.a
    public void a(boolean z10) {
        x5.h hVar = b().get();
        wn.v vVar = null;
        if (hVar != null) {
            s i10 = hVar.i();
            if (i10 != null && i10.b() <= 4) {
                i10.a("NetworkObserver", 4, z10 ? "ONLINE" : "OFFLINE", null);
            }
            this.f44120z = z10;
            vVar = wn.v.f59242a;
        }
        if (vVar == null) {
            d();
        }
    }

    public final WeakReference<x5.h> b() {
        return this.f44118x;
    }

    public final boolean c() {
        return this.f44120z;
    }

    public final void d() {
        if (this.A.getAndSet(true)) {
            return;
        }
        this.f44117w.unregisterComponentCallbacks(this);
        this.f44119y.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f44118x.get() == null) {
            d();
            wn.v vVar = wn.v.f59242a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        x5.h hVar = b().get();
        wn.v vVar = null;
        if (hVar != null) {
            s i11 = hVar.i();
            if (i11 != null && i11.b() <= 2) {
                i11.a("NetworkObserver", 2, jo.p.o("trimMemory, level=", Integer.valueOf(i10)), null);
            }
            hVar.m(i10);
            vVar = wn.v.f59242a;
        }
        if (vVar == null) {
            d();
        }
    }
}
