package o7;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import o7.f;
import s7.n;

/* loaded from: classes.dex */
public class v implements f, d.a<Object> {
    public m7.e A;
    public List<s7.n<File, ?>> B;
    public int C;
    public volatile n.a<?> D;
    public File E;
    public w F;

    /* renamed from: w  reason: collision with root package name */
    public final f.a f44250w;

    /* renamed from: x  reason: collision with root package name */
    public final g<?> f44251x;

    /* renamed from: y  reason: collision with root package name */
    public int f44252y;

    /* renamed from: z  reason: collision with root package name */
    public int f44253z = -1;

    public v(g<?> gVar, f.a aVar) {
        this.f44251x = gVar;
        this.f44250w = aVar;
    }

    public final boolean a() {
        return this.C < this.B.size();
    }

    @Override // o7.f
    public boolean b() {
        List<m7.e> c10 = this.f44251x.c();
        boolean z10 = false;
        if (c10.isEmpty()) {
            return false;
        }
        List<Class<?>> m10 = this.f44251x.m();
        if (m10.isEmpty()) {
            if (File.class.equals(this.f44251x.q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f44251x.i() + " to " + this.f44251x.q());
        }
        while (true) {
            if (this.B != null && a()) {
                this.D = null;
                while (!z10 && a()) {
                    List<s7.n<File, ?>> list = this.B;
                    int i10 = this.C;
                    this.C = i10 + 1;
                    this.D = list.get(i10).b(this.E, this.f44251x.s(), this.f44251x.f(), this.f44251x.k());
                    if (this.D != null && this.f44251x.t(this.D.f52266c.a())) {
                        this.D.f52266c.f(this.f44251x.l(), this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i11 = this.f44253z + 1;
            this.f44253z = i11;
            if (i11 >= m10.size()) {
                int i12 = this.f44252y + 1;
                this.f44252y = i12;
                if (i12 >= c10.size()) {
                    return false;
                }
                this.f44253z = 0;
            }
            m7.e eVar = c10.get(this.f44252y);
            Class<?> cls = m10.get(this.f44253z);
            this.F = new w(this.f44251x.b(), eVar, this.f44251x.o(), this.f44251x.s(), this.f44251x.f(), this.f44251x.r(cls), cls, this.f44251x.k());
            File b10 = this.f44251x.d().b(this.F);
            this.E = b10;
            if (b10 != null) {
                this.A = eVar;
                this.B = this.f44251x.j(b10);
                this.C = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f44250w.c(this.F, exc, this.D.f52266c, m7.a.RESOURCE_DISK_CACHE);
    }

    @Override // o7.f
    public void cancel() {
        n.a<?> aVar = this.D;
        if (aVar != null) {
            aVar.f52266c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void e(Object obj) {
        this.f44250w.a(this.A, obj, this.D.f52266c, m7.a.RESOURCE_DISK_CACHE, this.F);
    }
}
