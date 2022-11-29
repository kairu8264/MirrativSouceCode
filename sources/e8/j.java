package e8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.List;
import java.util.concurrent.Executor;
import o7.k;
import o7.u;

/* loaded from: classes.dex */
public final class j<R> implements d, f8.i, i {
    public static final boolean D = Log.isLoggable("Request", 2);
    public int A;
    public boolean B;
    public RuntimeException C;

    /* renamed from: a  reason: collision with root package name */
    public final String f30319a;

    /* renamed from: b  reason: collision with root package name */
    public final j8.c f30320b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f30321c;

    /* renamed from: d  reason: collision with root package name */
    public final g<R> f30322d;

    /* renamed from: e  reason: collision with root package name */
    public final e f30323e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f30324f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bumptech.glide.e f30325g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f30326h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<R> f30327i;

    /* renamed from: j  reason: collision with root package name */
    public final e8.a<?> f30328j;

    /* renamed from: k  reason: collision with root package name */
    public final int f30329k;

    /* renamed from: l  reason: collision with root package name */
    public final int f30330l;

    /* renamed from: m  reason: collision with root package name */
    public final com.bumptech.glide.h f30331m;

    /* renamed from: n  reason: collision with root package name */
    public final f8.j<R> f30332n;

    /* renamed from: o  reason: collision with root package name */
    public final List<g<R>> f30333o;

    /* renamed from: p  reason: collision with root package name */
    public final g8.c<? super R> f30334p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f30335q;

    /* renamed from: r  reason: collision with root package name */
    public u<R> f30336r;

    /* renamed from: s  reason: collision with root package name */
    public k.d f30337s;

    /* renamed from: t  reason: collision with root package name */
    public long f30338t;

    /* renamed from: u  reason: collision with root package name */
    public volatile o7.k f30339u;

    /* renamed from: v  reason: collision with root package name */
    public a f30340v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f30341w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f30342x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f30343y;

    /* renamed from: z  reason: collision with root package name */
    public int f30344z;

    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public j(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class<R> cls, e8.a<?> aVar, int i10, int i11, com.bumptech.glide.h hVar, f8.j<R> jVar, g<R> gVar, List<g<R>> list, e eVar2, o7.k kVar, g8.c<? super R> cVar, Executor executor) {
        this.f30319a = D ? String.valueOf(super.hashCode()) : null;
        this.f30320b = j8.c.a();
        this.f30321c = obj;
        this.f30324f = context;
        this.f30325g = eVar;
        this.f30326h = obj2;
        this.f30327i = cls;
        this.f30328j = aVar;
        this.f30329k = i10;
        this.f30330l = i11;
        this.f30331m = hVar;
        this.f30332n = jVar;
        this.f30322d = gVar;
        this.f30333o = list;
        this.f30323e = eVar2;
        this.f30339u = kVar;
        this.f30334p = cVar;
        this.f30335q = executor;
        this.f30340v = a.PENDING;
        if (this.C == null && eVar.g().a(d.c.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    public static int u(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    public static <R> j<R> x(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class<R> cls, e8.a<?> aVar, int i10, int i11, com.bumptech.glide.h hVar, f8.j<R> jVar, g<R> gVar, List<g<R>> list, e eVar2, o7.k kVar, g8.c<? super R> cVar, Executor executor) {
        return new j<>(context, eVar, obj, obj2, cls, aVar, i10, i11, hVar, jVar, gVar, list, eVar2, kVar, cVar, executor);
    }

    public final void A() {
        if (l()) {
            Drawable p10 = this.f30326h == null ? p() : null;
            if (p10 == null) {
                p10 = o();
            }
            if (p10 == null) {
                p10 = q();
            }
            this.f30332n.k(p10);
        }
    }

    @Override // e8.d
    public boolean a() {
        boolean z10;
        synchronized (this.f30321c) {
            z10 = this.f30340v == a.COMPLETE;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e8.i
    public void b(u<?> uVar, m7.a aVar, boolean z10) {
        this.f30320b.c();
        u<?> uVar2 = null;
        try {
            synchronized (this.f30321c) {
                try {
                    this.f30337s = null;
                    if (uVar == null) {
                        c(new GlideException("Expected to receive a Resource<R> with an object of " + this.f30327i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = uVar.get();
                    try {
                        if (obj != null && this.f30327i.isAssignableFrom(obj.getClass())) {
                            if (!m()) {
                                this.f30336r = null;
                                this.f30340v = a.COMPLETE;
                                this.f30339u.k(uVar);
                                return;
                            }
                            z(uVar, obj, aVar, z10);
                            return;
                        }
                        this.f30336r = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f30327i);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(uVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        c(new GlideException(sb2.toString()));
                        this.f30339u.k(uVar);
                    } catch (Throwable th2) {
                        uVar2 = uVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (uVar2 != null) {
                this.f30339u.k(uVar2);
            }
            throw th4;
        }
    }

    @Override // e8.i
    public void c(GlideException glideException) {
        y(glideException, 5);
    }

    @Override // e8.d
    public void clear() {
        synchronized (this.f30321c) {
            j();
            this.f30320b.c();
            a aVar = this.f30340v;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            n();
            u<R> uVar = this.f30336r;
            if (uVar != null) {
                this.f30336r = null;
            } else {
                uVar = null;
            }
            if (k()) {
                this.f30332n.g(q());
            }
            this.f30340v = aVar2;
            if (uVar != null) {
                this.f30339u.k(uVar);
            }
        }
    }

    @Override // f8.i
    public void d(int i10, int i11) {
        Object obj;
        this.f30320b.c();
        Object obj2 = this.f30321c;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = D;
                    if (z10) {
                        t("Got onSizeReady in " + i8.f.a(this.f30338t));
                    }
                    if (this.f30340v == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f30340v = aVar;
                        float sizeMultiplier = this.f30328j.getSizeMultiplier();
                        this.f30344z = u(i10, sizeMultiplier);
                        this.A = u(i11, sizeMultiplier);
                        if (z10) {
                            t("finished setup for calling load in " + i8.f.a(this.f30338t));
                        }
                        obj = obj2;
                        try {
                            this.f30337s = this.f30339u.f(this.f30325g, this.f30326h, this.f30328j.getSignature(), this.f30344z, this.A, this.f30328j.getResourceClass(), this.f30327i, this.f30331m, this.f30328j.getDiskCacheStrategy(), this.f30328j.getTransformations(), this.f30328j.isTransformationRequired(), this.f30328j.isScaleOnlyOrNoTransform(), this.f30328j.getOptions(), this.f30328j.isMemoryCacheable(), this.f30328j.getUseUnlimitedSourceGeneratorsPool(), this.f30328j.getUseAnimationPool(), this.f30328j.getOnlyRetrieveFromCache(), this, this.f30335q);
                            if (this.f30340v != aVar) {
                                this.f30337s = null;
                            }
                            if (z10) {
                                t("finished onSizeReady in " + i8.f.a(this.f30338t));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // e8.d
    public boolean e() {
        boolean z10;
        synchronized (this.f30321c) {
            z10 = this.f30340v == a.CLEARED;
        }
        return z10;
    }

    @Override // e8.i
    public Object f() {
        this.f30320b.c();
        return this.f30321c;
    }

    @Override // e8.d
    public boolean g() {
        boolean z10;
        synchronized (this.f30321c) {
            z10 = this.f30340v == a.COMPLETE;
        }
        return z10;
    }

    @Override // e8.d
    public boolean h(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        e8.a<?> aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        e8.a<?> aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (dVar instanceof j) {
            synchronized (this.f30321c) {
                i10 = this.f30329k;
                i11 = this.f30330l;
                obj = this.f30326h;
                cls = this.f30327i;
                aVar = this.f30328j;
                hVar = this.f30331m;
                List<g<R>> list = this.f30333o;
                size = list != null ? list.size() : 0;
            }
            j jVar = (j) dVar;
            synchronized (jVar.f30321c) {
                i12 = jVar.f30329k;
                i13 = jVar.f30330l;
                obj2 = jVar.f30326h;
                cls2 = jVar.f30327i;
                aVar2 = jVar.f30328j;
                hVar2 = jVar.f30331m;
                List<g<R>> list2 = jVar.f30333o;
                size2 = list2 != null ? list2.size() : 0;
            }
            return i10 == i12 && i11 == i13 && i8.k.c(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && hVar == hVar2 && size == size2;
        }
        return false;
    }

    @Override // e8.d
    public void i() {
        synchronized (this.f30321c) {
            j();
            this.f30320b.c();
            this.f30338t = i8.f.b();
            if (this.f30326h == null) {
                if (i8.k.u(this.f30329k, this.f30330l)) {
                    this.f30344z = this.f30329k;
                    this.A = this.f30330l;
                }
                y(new GlideException("Received null model"), p() == null ? 5 : 3);
                return;
            }
            a aVar = this.f30340v;
            a aVar2 = a.RUNNING;
            if (aVar != aVar2) {
                if (aVar == a.COMPLETE) {
                    b(this.f30336r, m7.a.MEMORY_CACHE, false);
                    return;
                }
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f30340v = aVar3;
                if (i8.k.u(this.f30329k, this.f30330l)) {
                    d(this.f30329k, this.f30330l);
                } else {
                    this.f30332n.l(this);
                }
                a aVar4 = this.f30340v;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                    this.f30332n.f(q());
                }
                if (D) {
                    t("finished run method in " + i8.f.a(this.f30338t));
                }
                return;
            }
            throw new IllegalArgumentException("Cannot restart a running request");
        }
    }

    @Override // e8.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f30321c) {
            a aVar = this.f30340v;
            z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z10;
    }

    public final void j() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public final boolean k() {
        e eVar = this.f30323e;
        return eVar == null || eVar.j(this);
    }

    public final boolean l() {
        e eVar = this.f30323e;
        return eVar == null || eVar.b(this);
    }

    public final boolean m() {
        e eVar = this.f30323e;
        return eVar == null || eVar.c(this);
    }

    public final void n() {
        j();
        this.f30320b.c();
        this.f30332n.d(this);
        k.d dVar = this.f30337s;
        if (dVar != null) {
            dVar.a();
            this.f30337s = null;
        }
    }

    public final Drawable o() {
        if (this.f30341w == null) {
            Drawable errorPlaceholder = this.f30328j.getErrorPlaceholder();
            this.f30341w = errorPlaceholder;
            if (errorPlaceholder == null && this.f30328j.getErrorId() > 0) {
                this.f30341w = s(this.f30328j.getErrorId());
            }
        }
        return this.f30341w;
    }

    public final Drawable p() {
        if (this.f30343y == null) {
            Drawable fallbackDrawable = this.f30328j.getFallbackDrawable();
            this.f30343y = fallbackDrawable;
            if (fallbackDrawable == null && this.f30328j.getFallbackId() > 0) {
                this.f30343y = s(this.f30328j.getFallbackId());
            }
        }
        return this.f30343y;
    }

    @Override // e8.d
    public void pause() {
        synchronized (this.f30321c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final Drawable q() {
        if (this.f30342x == null) {
            Drawable placeholderDrawable = this.f30328j.getPlaceholderDrawable();
            this.f30342x = placeholderDrawable;
            if (placeholderDrawable == null && this.f30328j.getPlaceholderId() > 0) {
                this.f30342x = s(this.f30328j.getPlaceholderId());
            }
        }
        return this.f30342x;
    }

    public final boolean r() {
        e eVar = this.f30323e;
        return eVar == null || !eVar.getRoot().a();
    }

    public final Drawable s(int i10) {
        return x7.a.a(this.f30325g, i10, this.f30328j.getTheme() != null ? this.f30328j.getTheme() : this.f30324f.getTheme());
    }

    public final void t(String str) {
        Log.v("Request", str + " this: " + this.f30319a);
    }

    public final void v() {
        e eVar = this.f30323e;
        if (eVar != null) {
            eVar.d(this);
        }
    }

    public final void w() {
        e eVar = this.f30323e;
        if (eVar != null) {
            eVar.f(this);
        }
    }

    public final void y(GlideException glideException, int i10) {
        boolean z10;
        this.f30320b.c();
        synchronized (this.f30321c) {
            glideException.k(this.C);
            int h10 = this.f30325g.h();
            if (h10 <= i10) {
                Log.w("Glide", "Load failed for " + this.f30326h + " with size [" + this.f30344z + "x" + this.A + "]", glideException);
                if (h10 <= 4) {
                    glideException.g("Glide");
                }
            }
            this.f30337s = null;
            this.f30340v = a.FAILED;
            boolean z11 = true;
            this.B = true;
            List<g<R>> list = this.f30333o;
            if (list != null) {
                z10 = false;
                for (g<R> gVar : list) {
                    z10 |= gVar.a(glideException, this.f30326h, this.f30332n, r());
                }
            } else {
                z10 = false;
            }
            g<R> gVar2 = this.f30322d;
            if (gVar2 == null || !gVar2.a(glideException, this.f30326h, this.f30332n, r())) {
                z11 = false;
            }
            if (!(z10 | z11)) {
                A();
            }
            this.B = false;
            v();
        }
    }

    public final void z(u<R> uVar, R r10, m7.a aVar, boolean z10) {
        boolean z11;
        boolean r11 = r();
        this.f30340v = a.COMPLETE;
        this.f30336r = uVar;
        if (this.f30325g.h() <= 3) {
            Log.d("Glide", "Finished loading " + r10.getClass().getSimpleName() + " from " + aVar + " for " + this.f30326h + " with size [" + this.f30344z + "x" + this.A + "] in " + i8.f.a(this.f30338t) + " ms");
        }
        boolean z12 = true;
        this.B = true;
        try {
            List<g<R>> list = this.f30333o;
            if (list != null) {
                z11 = false;
                for (g<R> gVar : list) {
                    z11 |= gVar.h(r10, this.f30326h, this.f30332n, aVar, r11);
                }
            } else {
                z11 = false;
            }
            g<R> gVar2 = this.f30322d;
            if (gVar2 == null || !gVar2.h(r10, this.f30326h, this.f30332n, aVar, r11)) {
                z12 = false;
            }
            if (!(z12 | z11)) {
                this.f30332n.e(r10, this.f30334p.a(aVar, r11));
            }
            this.B = false;
            w();
        } catch (Throwable th2) {
            this.B = false;
            throw th2;
        }
    }
}
