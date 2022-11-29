package a6;

import a6.g;
import android.graphics.Bitmap;
import android.graphics.Movie;
import uo.z1;
import wn.v;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: d  reason: collision with root package name */
    public static final a f511d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final q f512a;

    /* renamed from: b  reason: collision with root package name */
    public final j6.m f513b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f514c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<e> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final e invoke() {
            rp.e e10;
            Bitmap.Config f10;
            if (!o.this.f514c) {
                e10 = o.this.f512a.e();
            } else {
                e10 = rp.t.c(new m(o.this.f512a.e()));
            }
            try {
                Movie decodeStream = Movie.decodeStream(e10.P1());
                go.a.a(e10, null);
                if (decodeStream != null && decodeStream.width() > 0 && decodeStream.height() > 0) {
                    if (decodeStream.isOpaque() && o.this.f513b.d()) {
                        f10 = Bitmap.Config.RGB_565;
                    } else {
                        f10 = o6.g.g(o.this.f513b.f()) ? Bitmap.Config.ARGB_8888 : o.this.f513b.f();
                    }
                    c6.b bVar = new c6.b(decodeStream, f10, o.this.f513b.n());
                    Integer d10 = j6.f.d(o.this.f513b.l());
                    bVar.e(d10 == null ? -1 : d10.intValue());
                    io.a<v> c10 = j6.f.c(o.this.f513b.l());
                    io.a<v> b10 = j6.f.b(o.this.f513b.l());
                    if (c10 != null || b10 != null) {
                        bVar.c(o6.g.c(c10, b10));
                    }
                    bVar.d(j6.f.a(o.this.f513b.l()));
                    return new e(bVar, false);
                }
                throw new IllegalStateException("Failed to decode GIF.".toString());
            } finally {
            }
        }
    }

    public o(q qVar, j6.m mVar, boolean z10) {
        this.f512a = qVar;
        this.f513b = mVar;
        this.f514c = z10;
    }

    @Override // a6.g
    public Object a(ao.d<? super e> dVar) {
        return z1.c(null, new c(), dVar, 1, null);
    }

    /* loaded from: classes.dex */
    public static final class b implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f515a;

        public b(boolean z10) {
            this.f515a = z10;
        }

        @Override // a6.g.a
        public g a(d6.l lVar, j6.m mVar, x5.e eVar) {
            if (n.c(f.f484a, lVar.b().e())) {
                return new o(lVar.b(), mVar, this.f515a);
            }
            return null;
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return b.class.hashCode();
        }

        public /* synthetic */ b(boolean z10, int i10, jo.h hVar) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }
}
