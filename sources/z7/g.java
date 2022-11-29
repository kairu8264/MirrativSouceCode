package z7;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m7.l;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final i7.a f62613a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f62614b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f62615c;

    /* renamed from: d  reason: collision with root package name */
    public final k f62616d;

    /* renamed from: e  reason: collision with root package name */
    public final p7.e f62617e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f62618f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f62619g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f62620h;

    /* renamed from: i  reason: collision with root package name */
    public com.bumptech.glide.j<Bitmap> f62621i;

    /* renamed from: j  reason: collision with root package name */
    public a f62622j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f62623k;

    /* renamed from: l  reason: collision with root package name */
    public a f62624l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f62625m;

    /* renamed from: n  reason: collision with root package name */
    public l<Bitmap> f62626n;

    /* renamed from: o  reason: collision with root package name */
    public a f62627o;

    /* renamed from: p  reason: collision with root package name */
    public d f62628p;

    /* renamed from: q  reason: collision with root package name */
    public int f62629q;

    /* renamed from: r  reason: collision with root package name */
    public int f62630r;

    /* renamed from: s  reason: collision with root package name */
    public int f62631s;

    /* loaded from: classes.dex */
    public static class a extends f8.c<Bitmap> {
        public final int A;
        public final long B;
        public Bitmap C;

        /* renamed from: z  reason: collision with root package name */
        public final Handler f62632z;

        public a(Handler handler, int i10, long j10) {
            this.f62632z = handler;
            this.A = i10;
            this.B = j10;
        }

        public Bitmap a() {
            return this.C;
        }

        @Override // f8.j
        /* renamed from: c */
        public void e(Bitmap bitmap, g8.b<? super Bitmap> bVar) {
            this.C = bitmap;
            this.f62632z.sendMessageAtTime(this.f62632z.obtainMessage(1, this), this.B);
        }

        @Override // f8.j
        public void g(Drawable drawable) {
            this.C = null;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            } else if (i10 == 2) {
                g.this.f62616d.clear((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    public g(com.bumptech.glide.c cVar, i7.a aVar, int i10, int i11, l<Bitmap> lVar, Bitmap bitmap) {
        this(cVar.g(), com.bumptech.glide.c.B(cVar.i()), aVar, null, i(com.bumptech.glide.c.B(cVar.i()), i10, i11), lVar, bitmap);
    }

    public static m7.e g() {
        return new h8.d(Double.valueOf(Math.random()));
    }

    public static com.bumptech.glide.j<Bitmap> i(k kVar, int i10, int i11) {
        return kVar.asBitmap().apply((e8.a<?>) e8.h.diskCacheStrategyOf(o7.j.f44186b).useAnimationPool(true).skipMemoryCache(true).override(i10, i11));
    }

    public void a() {
        this.f62615c.clear();
        n();
        q();
        a aVar = this.f62622j;
        if (aVar != null) {
            this.f62616d.clear(aVar);
            this.f62622j = null;
        }
        a aVar2 = this.f62624l;
        if (aVar2 != null) {
            this.f62616d.clear(aVar2);
            this.f62624l = null;
        }
        a aVar3 = this.f62627o;
        if (aVar3 != null) {
            this.f62616d.clear(aVar3);
            this.f62627o = null;
        }
        this.f62613a.clear();
        this.f62623k = true;
    }

    public ByteBuffer b() {
        return this.f62613a.f().asReadOnlyBuffer();
    }

    public Bitmap c() {
        a aVar = this.f62622j;
        return aVar != null ? aVar.a() : this.f62625m;
    }

    public int d() {
        a aVar = this.f62622j;
        if (aVar != null) {
            return aVar.A;
        }
        return -1;
    }

    public Bitmap e() {
        return this.f62625m;
    }

    public int f() {
        return this.f62613a.b();
    }

    public int h() {
        return this.f62631s;
    }

    public int j() {
        return this.f62613a.h() + this.f62629q;
    }

    public int k() {
        return this.f62630r;
    }

    public final void l() {
        if (!this.f62618f || this.f62619g) {
            return;
        }
        if (this.f62620h) {
            i8.j.a(this.f62627o == null, "Pending target must be null when starting from the first frame");
            this.f62613a.e();
            this.f62620h = false;
        }
        a aVar = this.f62627o;
        if (aVar != null) {
            this.f62627o = null;
            m(aVar);
            return;
        }
        this.f62619g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f62613a.d();
        this.f62613a.a();
        this.f62624l = new a(this.f62614b, this.f62613a.g(), uptimeMillis);
        this.f62621i.apply((e8.a<?>) e8.h.signatureOf(g())).m5load((Object) this.f62613a).into((com.bumptech.glide.j<Bitmap>) this.f62624l);
    }

    public void m(a aVar) {
        d dVar = this.f62628p;
        if (dVar != null) {
            dVar.a();
        }
        this.f62619g = false;
        if (this.f62623k) {
            this.f62614b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f62618f) {
            if (this.f62620h) {
                this.f62614b.obtainMessage(2, aVar).sendToTarget();
            } else {
                this.f62627o = aVar;
            }
        } else {
            if (aVar.a() != null) {
                n();
                a aVar2 = this.f62622j;
                this.f62622j = aVar;
                for (int size = this.f62615c.size() - 1; size >= 0; size--) {
                    this.f62615c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f62614b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        }
    }

    public final void n() {
        Bitmap bitmap = this.f62625m;
        if (bitmap != null) {
            this.f62617e.c(bitmap);
            this.f62625m = null;
        }
    }

    public void o(l<Bitmap> lVar, Bitmap bitmap) {
        this.f62626n = (l) i8.j.d(lVar);
        this.f62625m = (Bitmap) i8.j.d(bitmap);
        this.f62621i = this.f62621i.apply((e8.a<?>) new e8.h().transform(lVar));
        this.f62629q = i8.k.h(bitmap);
        this.f62630r = bitmap.getWidth();
        this.f62631s = bitmap.getHeight();
    }

    public final void p() {
        if (this.f62618f) {
            return;
        }
        this.f62618f = true;
        this.f62623k = false;
        l();
    }

    public final void q() {
        this.f62618f = false;
    }

    public void r(b bVar) {
        if (!this.f62623k) {
            if (!this.f62615c.contains(bVar)) {
                boolean isEmpty = this.f62615c.isEmpty();
                this.f62615c.add(bVar);
                if (isEmpty) {
                    p();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    public void s(b bVar) {
        this.f62615c.remove(bVar);
        if (this.f62615c.isEmpty()) {
            q();
        }
    }

    public g(p7.e eVar, k kVar, i7.a aVar, Handler handler, com.bumptech.glide.j<Bitmap> jVar, l<Bitmap> lVar, Bitmap bitmap) {
        this.f62615c = new ArrayList();
        this.f62616d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f62617e = eVar;
        this.f62614b = handler;
        this.f62621i = jVar;
        this.f62613a = aVar;
        o(lVar, bitmap);
    }
}
