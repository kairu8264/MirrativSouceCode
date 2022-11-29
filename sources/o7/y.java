package o7;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;
import o7.f;
import s7.n;

/* loaded from: classes.dex */
public class y implements f, f.a {
    public Object A;
    public volatile n.a<?> B;
    public d C;

    /* renamed from: w  reason: collision with root package name */
    public final g<?> f44265w;

    /* renamed from: x  reason: collision with root package name */
    public final f.a f44266x;

    /* renamed from: y  reason: collision with root package name */
    public int f44267y;

    /* renamed from: z  reason: collision with root package name */
    public c f44268z;

    /* loaded from: classes.dex */
    public class a implements d.a<Object> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n.a f44269w;

        public a(n.a aVar) {
            this.f44269w = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (y.this.f(this.f44269w)) {
                y.this.i(this.f44269w, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(Object obj) {
            if (y.this.f(this.f44269w)) {
                y.this.g(this.f44269w, obj);
            }
        }
    }

    public y(g<?> gVar, f.a aVar) {
        this.f44265w = gVar;
        this.f44266x = aVar;
    }

    @Override // o7.f.a
    public void a(m7.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, m7.a aVar, m7.e eVar2) {
        this.f44266x.a(eVar, obj, dVar, this.B.f52266c.d(), eVar);
    }

    @Override // o7.f
    public boolean b() {
        Object obj = this.A;
        if (obj != null) {
            this.A = null;
            d(obj);
        }
        c cVar = this.f44268z;
        if (cVar == null || !cVar.b()) {
            this.f44268z = null;
            this.B = null;
            boolean z10 = false;
            while (!z10 && e()) {
                List<n.a<?>> g10 = this.f44265w.g();
                int i10 = this.f44267y;
                this.f44267y = i10 + 1;
                this.B = g10.get(i10);
                if (this.B != null && (this.f44265w.e().c(this.B.f52266c.d()) || this.f44265w.t(this.B.f52266c.a()))) {
                    j(this.B);
                    z10 = true;
                }
            }
            return z10;
        }
        return true;
    }

    @Override // o7.f.a
    public void c(m7.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, m7.a aVar) {
        this.f44266x.c(eVar, exc, dVar, this.B.f52266c.d());
    }

    @Override // o7.f
    public void cancel() {
        n.a<?> aVar = this.B;
        if (aVar != null) {
            aVar.f52266c.cancel();
        }
    }

    public final void d(Object obj) {
        long b10 = i8.f.b();
        try {
            m7.d<X> p10 = this.f44265w.p(obj);
            e eVar = new e(p10, obj, this.f44265w.k());
            this.C = new d(this.B.f52264a, this.f44265w.o());
            this.f44265w.d().a(this.C, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.C + ", data: " + obj + ", encoder: " + p10 + ", duration: " + i8.f.a(b10));
            }
            this.B.f52266c.b();
            this.f44268z = new c(Collections.singletonList(this.B.f52264a), this.f44265w, this);
        } catch (Throwable th2) {
            this.B.f52266c.b();
            throw th2;
        }
    }

    public final boolean e() {
        return this.f44267y < this.f44265w.g().size();
    }

    public boolean f(n.a<?> aVar) {
        n.a<?> aVar2 = this.B;
        return aVar2 != null && aVar2 == aVar;
    }

    public void g(n.a<?> aVar, Object obj) {
        j e10 = this.f44265w.e();
        if (obj != null && e10.c(aVar.f52266c.d())) {
            this.A = obj;
            this.f44266x.h();
            return;
        }
        f.a aVar2 = this.f44266x;
        m7.e eVar = aVar.f52264a;
        com.bumptech.glide.load.data.d<?> dVar = aVar.f52266c;
        aVar2.a(eVar, obj, dVar, dVar.d(), this.C);
    }

    @Override // o7.f.a
    public void h() {
        throw new UnsupportedOperationException();
    }

    public void i(n.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f44266x;
        d dVar = this.C;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f52266c;
        aVar2.c(dVar, exc, dVar2, dVar2.d());
    }

    public final void j(n.a<?> aVar) {
        this.B.f52266c.f(this.f44265w.l(), new a(aVar));
    }
}
