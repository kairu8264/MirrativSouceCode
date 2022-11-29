package o7;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import o7.f;
import s7.n;

/* loaded from: classes.dex */
public class c implements f, d.a<Object> {
    public m7.e A;
    public List<s7.n<File, ?>> B;
    public int C;
    public volatile n.a<?> D;
    public File E;

    /* renamed from: w  reason: collision with root package name */
    public final List<m7.e> f44136w;

    /* renamed from: x  reason: collision with root package name */
    public final g<?> f44137x;

    /* renamed from: y  reason: collision with root package name */
    public final f.a f44138y;

    /* renamed from: z  reason: collision with root package name */
    public int f44139z;

    public c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    public final boolean a() {
        return this.C < this.B.size();
    }

    @Override // o7.f
    public boolean b() {
        while (true) {
            boolean z10 = false;
            if (this.B != null && a()) {
                this.D = null;
                while (!z10 && a()) {
                    List<s7.n<File, ?>> list = this.B;
                    int i10 = this.C;
                    this.C = i10 + 1;
                    this.D = list.get(i10).b(this.E, this.f44137x.s(), this.f44137x.f(), this.f44137x.k());
                    if (this.D != null && this.f44137x.t(this.D.f52266c.a())) {
                        this.D.f52266c.f(this.f44137x.l(), this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i11 = this.f44139z + 1;
            this.f44139z = i11;
            if (i11 >= this.f44136w.size()) {
                return false;
            }
            m7.e eVar = this.f44136w.get(this.f44139z);
            File b10 = this.f44137x.d().b(new d(eVar, this.f44137x.o()));
            this.E = b10;
            if (b10 != null) {
                this.A = eVar;
                this.B = this.f44137x.j(b10);
                this.C = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f44138y.c(this.A, exc, this.D.f52266c, m7.a.DATA_DISK_CACHE);
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
        this.f44138y.a(this.A, obj, this.D.f52266c, m7.a.DATA_DISK_CACHE, this.A);
    }

    public c(List<m7.e> list, g<?> gVar, f.a aVar) {
        this.f44139z = -1;
        this.f44136w = list;
        this.f44137x = gVar;
        this.f44138y = aVar;
    }
}
