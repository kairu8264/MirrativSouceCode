package z5;

import android.content.Context;
import androidx.compose.ui.platform.z;
import coil.request.NullRequestDataException;
import io.l;
import j6.i;
import jo.q;
import m2.p;
import po.n;
import q1.f;
import wn.v;
import z5.b;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final long f62573a = m2.b.f40509b.c(0, 0);

    /* loaded from: classes.dex */
    public static final class a extends q implements l<b.c, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<b.c.C1077c, v> f62574w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l<b.c.d, v> f62575x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l<b.c.C1076b, v> f62576y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super b.c.C1077c, v> lVar, l<? super b.c.d, v> lVar2, l<? super b.c.C1076b, v> lVar3) {
            super(1);
            this.f62574w = lVar;
            this.f62575x = lVar2;
            this.f62576y = lVar3;
        }

        public final void a(b.c cVar) {
            if (cVar instanceof b.c.C1077c) {
                l<b.c.C1077c, v> lVar = this.f62574w;
                if (lVar == null) {
                    return;
                }
                lVar.invoke(cVar);
            } else if (cVar instanceof b.c.d) {
                l<b.c.d, v> lVar2 = this.f62575x;
                if (lVar2 == null) {
                    return;
                }
                lVar2.invoke(cVar);
            } else if (!(cVar instanceof b.c.C1076b)) {
                boolean z10 = cVar instanceof b.c.a;
            } else {
                l<b.c.C1076b, v> lVar3 = this.f62576y;
                if (lVar3 == null) {
                    return;
                }
                lVar3.invoke(cVar);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(b.c cVar) {
            a(cVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<b.c, b.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f1.d f62577w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ f1.d f62578x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f1.d f62579y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f1.d dVar, f1.d dVar2, f1.d dVar3) {
            super(1);
            this.f62577w = dVar;
            this.f62578x = dVar2;
            this.f62579y = dVar3;
        }

        @Override // io.l
        /* renamed from: a */
        public final b.c invoke(b.c cVar) {
            if (cVar instanceof b.c.C1077c) {
                f1.d dVar = this.f62577w;
                b.c.C1077c c1077c = (b.c.C1077c) cVar;
                return dVar != null ? c1077c.b(dVar) : c1077c;
            } else if (cVar instanceof b.c.C1076b) {
                b.c.C1076b c1076b = (b.c.C1076b) cVar;
                if (c1076b.d().c() instanceof NullRequestDataException) {
                    f1.d dVar2 = this.f62578x;
                    return dVar2 != null ? b.c.C1076b.c(c1076b, dVar2, null, 2, null) : c1076b;
                }
                f1.d dVar3 = this.f62579y;
                return dVar3 != null ? b.c.C1076b.c(c1076b, dVar3, null, 2, null) : c1076b;
            } else {
                return cVar;
            }
        }
    }

    public static final float a(long j10, float f10) {
        return n.l(f10, m2.b.o(j10), m2.b.m(j10));
    }

    public static final float b(long j10, float f10) {
        return n.l(f10, m2.b.p(j10), m2.b.n(j10));
    }

    public static final long c() {
        return f62573a;
    }

    public static final l<b.c, v> d(l<? super b.c.C1077c, v> lVar, l<? super b.c.d, v> lVar2, l<? super b.c.C1076b, v> lVar3) {
        if (lVar == null && lVar2 == null && lVar3 == null) {
            return null;
        }
        return new a(lVar, lVar2, lVar3);
    }

    public static final j6.i e(Object obj, l0.i iVar, int i10) {
        if (obj instanceof j6.i) {
            return (j6.i) obj;
        }
        return new i.a((Context) iVar.G(z.g())).b(obj).a();
    }

    public static final long f(long j10) {
        return p.a(lo.c.c(b1.l.i(j10)), lo.c.c(b1.l.g(j10)));
    }

    public static final k6.g g(q1.f fVar) {
        f.a aVar = q1.f.f48569a;
        return jo.p.c(fVar, aVar.d()) ? true : jo.p.c(fVar, aVar.e()) ? k6.g.FIT : k6.g.FILL;
    }

    public static final l<b.c, b.c> h(f1.d dVar, f1.d dVar2, f1.d dVar3) {
        if (dVar == null && dVar2 == null && dVar3 == null) {
            return z5.b.R.a();
        }
        return new b(dVar, dVar3, dVar2);
    }
}
