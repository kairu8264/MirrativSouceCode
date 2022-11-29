package l7;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class p {

    /* renamed from: t  reason: collision with root package name */
    public static final m7.g<o> f39657t = m7.g.f("com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy", o.f39651d);

    /* renamed from: a  reason: collision with root package name */
    public final i f39658a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f39659b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f39660c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bumptech.glide.k f39661d;

    /* renamed from: e  reason: collision with root package name */
    public final p7.e f39662e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f39663f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f39664g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f39665h;

    /* renamed from: i  reason: collision with root package name */
    public com.bumptech.glide.j<Bitmap> f39666i;

    /* renamed from: j  reason: collision with root package name */
    public a f39667j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f39668k;

    /* renamed from: l  reason: collision with root package name */
    public a f39669l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f39670m;

    /* renamed from: n  reason: collision with root package name */
    public m7.l<Bitmap> f39671n;

    /* renamed from: o  reason: collision with root package name */
    public a f39672o;

    /* renamed from: p  reason: collision with root package name */
    public d f39673p;

    /* renamed from: q  reason: collision with root package name */
    public int f39674q;

    /* renamed from: r  reason: collision with root package name */
    public int f39675r;

    /* renamed from: s  reason: collision with root package name */
    public int f39676s;

    /* loaded from: classes.dex */
    public static class a extends f8.c<Bitmap> {
        public final int A;
        public final long B;
        public Bitmap C;

        /* renamed from: z  reason: collision with root package name */
        public final Handler f39677z;

        public a(Handler handler, int i10, long j10) {
            this.f39677z = handler;
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
            this.f39677z.sendMessageAtTime(this.f39677z.obtainMessage(1, this), this.B);
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
                p.this.m((a) message.obj);
                return true;
            } else if (i10 == 2) {
                p.this.f39661d.clear((a) message.obj);
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

    /* loaded from: classes.dex */
    public static class e implements m7.e {

        /* renamed from: b  reason: collision with root package name */
        public final m7.e f39679b;

        /* renamed from: c  reason: collision with root package name */
        public final int f39680c;

        public e(m7.e eVar, int i10) {
            this.f39679b = eVar;
            this.f39680c = i10;
        }

        @Override // m7.e
        public void a(MessageDigest messageDigest) {
            messageDigest.update(ByteBuffer.allocate(12).putInt(this.f39680c).array());
            this.f39679b.a(messageDigest);
        }

        @Override // m7.e
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.f39679b.equals(eVar.f39679b) && this.f39680c == eVar.f39680c;
            }
            return false;
        }

        @Override // m7.e
        public int hashCode() {
            return (this.f39679b.hashCode() * 31) + this.f39680c;
        }
    }

    public p(com.bumptech.glide.c cVar, i iVar, int i10, int i11, m7.l<Bitmap> lVar, Bitmap bitmap) {
        this(cVar.g(), com.bumptech.glide.c.B(cVar.i()), iVar, null, i(com.bumptech.glide.c.B(cVar.i()), i10, i11), lVar, bitmap);
    }

    public static com.bumptech.glide.j<Bitmap> i(com.bumptech.glide.k kVar, int i10, int i11) {
        return kVar.asBitmap().apply((e8.a<?>) e8.h.diskCacheStrategyOf(o7.j.f44186b).useAnimationPool(true).skipMemoryCache(true).override(i10, i11));
    }

    public void a() {
        this.f39660c.clear();
        n();
        q();
        a aVar = this.f39667j;
        if (aVar != null) {
            this.f39661d.clear(aVar);
            this.f39667j = null;
        }
        a aVar2 = this.f39669l;
        if (aVar2 != null) {
            this.f39661d.clear(aVar2);
            this.f39669l = null;
        }
        a aVar3 = this.f39672o;
        if (aVar3 != null) {
            this.f39661d.clear(aVar3);
            this.f39672o = null;
        }
        this.f39658a.clear();
        this.f39668k = true;
    }

    public ByteBuffer b() {
        return this.f39658a.f().asReadOnlyBuffer();
    }

    public Bitmap c() {
        a aVar = this.f39667j;
        return aVar != null ? aVar.a() : this.f39670m;
    }

    public int d() {
        a aVar = this.f39667j;
        if (aVar != null) {
            return aVar.A;
        }
        return -1;
    }

    public Bitmap e() {
        return this.f39670m;
    }

    public int f() {
        return this.f39658a.b();
    }

    public final m7.e g(int i10) {
        return new e(new h8.d(this.f39658a), i10);
    }

    public int h() {
        return this.f39676s;
    }

    public int j() {
        return this.f39658a.h() + this.f39674q;
    }

    public int k() {
        return this.f39675r;
    }

    public final void l() {
        if (!this.f39663f || this.f39664g) {
            return;
        }
        if (this.f39665h) {
            i8.j.a(this.f39672o == null, "Pending target must be null when starting from the first frame");
            this.f39658a.e();
            this.f39665h = false;
        }
        a aVar = this.f39672o;
        if (aVar != null) {
            this.f39672o = null;
            m(aVar);
            return;
        }
        this.f39664g = true;
        int d10 = this.f39658a.d();
        this.f39658a.a();
        int g10 = this.f39658a.g();
        this.f39669l = new a(this.f39659b, g10, SystemClock.uptimeMillis() + d10);
        this.f39666i.apply((e8.a<?>) e8.h.signatureOf(g(g10)).skipMemoryCache(this.f39658a.l().c())).m5load((Object) this.f39658a).into((com.bumptech.glide.j<Bitmap>) this.f39669l);
    }

    public void m(a aVar) {
        d dVar = this.f39673p;
        if (dVar != null) {
            dVar.a();
        }
        this.f39664g = false;
        if (this.f39668k) {
            this.f39659b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f39663f) {
            if (this.f39665h) {
                this.f39659b.obtainMessage(2, aVar).sendToTarget();
            } else {
                this.f39672o = aVar;
            }
        } else {
            if (aVar.a() != null) {
                n();
                a aVar2 = this.f39667j;
                this.f39667j = aVar;
                for (int size = this.f39660c.size() - 1; size >= 0; size--) {
                    this.f39660c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f39659b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        }
    }

    public final void n() {
        Bitmap bitmap = this.f39670m;
        if (bitmap != null) {
            this.f39662e.c(bitmap);
            this.f39670m = null;
        }
    }

    public void o(m7.l<Bitmap> lVar, Bitmap bitmap) {
        this.f39671n = (m7.l) i8.j.d(lVar);
        this.f39670m = (Bitmap) i8.j.d(bitmap);
        this.f39666i = this.f39666i.apply((e8.a<?>) new e8.h().transform(lVar));
        this.f39674q = i8.k.h(bitmap);
        this.f39675r = bitmap.getWidth();
        this.f39676s = bitmap.getHeight();
    }

    public final void p() {
        if (this.f39663f) {
            return;
        }
        this.f39663f = true;
        this.f39668k = false;
        l();
    }

    public final void q() {
        this.f39663f = false;
    }

    public void r(b bVar) {
        if (!this.f39668k) {
            if (!this.f39660c.contains(bVar)) {
                boolean isEmpty = this.f39660c.isEmpty();
                this.f39660c.add(bVar);
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
        this.f39660c.remove(bVar);
        if (this.f39660c.isEmpty()) {
            q();
        }
    }

    public p(p7.e eVar, com.bumptech.glide.k kVar, i iVar, Handler handler, com.bumptech.glide.j<Bitmap> jVar, m7.l<Bitmap> lVar, Bitmap bitmap) {
        this.f39660c = new ArrayList();
        this.f39663f = false;
        this.f39664g = false;
        this.f39665h = false;
        this.f39661d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f39662e = eVar;
        this.f39659b = handler;
        this.f39666i = jVar;
        this.f39658a = iVar;
        o(lVar, bitmap);
    }
}
