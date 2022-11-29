package x5;

import android.content.Context;
import ep.e;
import ep.z;
import h6.c;
import j6.i;
import jo.q;
import n6.a;
import n6.c;
import o6.j;
import o6.p;
import o6.s;
import o6.t;
import x5.c;

/* loaded from: classes.dex */
public interface e {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f59712a;

        /* renamed from: b  reason: collision with root package name */
        public j6.b f59713b = j.b();

        /* renamed from: c  reason: collision with root package name */
        public wn.f<? extends h6.c> f59714c = null;

        /* renamed from: d  reason: collision with root package name */
        public wn.f<? extends b6.a> f59715d = null;

        /* renamed from: e  reason: collision with root package name */
        public wn.f<? extends e.a> f59716e = null;

        /* renamed from: f  reason: collision with root package name */
        public c.d f59717f = null;

        /* renamed from: g  reason: collision with root package name */
        public x5.b f59718g = null;

        /* renamed from: h  reason: collision with root package name */
        public p f59719h = new p(false, false, false, 0, 15, null);

        /* renamed from: i  reason: collision with root package name */
        public s f59720i = null;

        /* renamed from: x5.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0991a extends q implements io.a<h6.c> {
            public C0991a() {
                super(0);
            }

            @Override // io.a
            /* renamed from: a */
            public final h6.c invoke() {
                return new c.a(a.this.f59712a).a();
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends q implements io.a<b6.a> {
            public b() {
                super(0);
            }

            @Override // io.a
            /* renamed from: a */
            public final b6.a invoke() {
                return t.f44115a.a(a.this.f59712a);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends q implements io.a<z> {

            /* renamed from: w  reason: collision with root package name */
            public static final c f59723w = new c();

            public c() {
                super(0);
            }

            @Override // io.a
            /* renamed from: a */
            public final z invoke() {
                return new z();
            }
        }

        public a(Context context) {
            this.f59712a = context.getApplicationContext();
        }

        public final e b() {
            Context context = this.f59712a;
            j6.b bVar = this.f59713b;
            wn.f<? extends h6.c> fVar = this.f59714c;
            if (fVar == null) {
                fVar = wn.g.a(new C0991a());
            }
            wn.f<? extends h6.c> fVar2 = fVar;
            wn.f<? extends b6.a> fVar3 = this.f59715d;
            if (fVar3 == null) {
                fVar3 = wn.g.a(new b());
            }
            wn.f<? extends b6.a> fVar4 = fVar3;
            wn.f<? extends e.a> fVar5 = this.f59716e;
            if (fVar5 == null) {
                fVar5 = wn.g.a(c.f59723w);
            }
            wn.f<? extends e.a> fVar6 = fVar5;
            c.d dVar = this.f59717f;
            if (dVar == null) {
                dVar = c.d.f59709b;
            }
            c.d dVar2 = dVar;
            x5.b bVar2 = this.f59718g;
            if (bVar2 == null) {
                bVar2 = new x5.b();
            }
            return new h(context, bVar, fVar2, fVar4, fVar6, dVar2, bVar2, this.f59719h, this.f59720i);
        }

        public final a c(e.a aVar) {
            this.f59716e = wn.h.c(aVar);
            return this;
        }

        public final a d(x5.b bVar) {
            this.f59718g = bVar;
            return this;
        }

        public final a e(int i10) {
            c.a aVar;
            if (i10 > 0) {
                aVar = new a.C0616a(i10, false, 2, null);
            } else {
                aVar = c.a.f41592b;
            }
            h(aVar);
            return this;
        }

        public final a f(boolean z10) {
            return e(z10 ? 100 : 0);
        }

        public final a g(z zVar) {
            return c(zVar);
        }

        public final a h(c.a aVar) {
            this.f59713b = j6.b.b(this.f59713b, null, null, null, null, aVar, null, null, false, false, null, null, null, null, null, null, 32751, null);
            return this;
        }
    }

    j6.b a();

    Object b(i iVar, ao.d<? super j6.j> dVar);

    j6.d c(i iVar);

    h6.c d();

    b getComponents();
}
