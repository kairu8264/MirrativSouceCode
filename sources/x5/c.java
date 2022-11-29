package x5;

import android.graphics.Bitmap;
import j6.i;
import j6.m;
import j6.p;

/* loaded from: classes.dex */
public interface c extends i.b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f59705a = b.f59707a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f59706b = new a();

    /* loaded from: classes.dex */
    public static final class a implements c {
        @Override // x5.c, j6.i.b
        public void a(i iVar) {
            C0990c.k(this, iVar);
        }

        @Override // x5.c, j6.i.b
        public void b(i iVar, p pVar) {
            C0990c.l(this, iVar, pVar);
        }

        @Override // x5.c, j6.i.b
        public void c(i iVar) {
            C0990c.i(this, iVar);
        }

        @Override // x5.c, j6.i.b
        public void d(i iVar, j6.e eVar) {
            C0990c.j(this, iVar, eVar);
        }

        @Override // x5.c
        public void e(i iVar, n6.c cVar) {
            C0990c.r(this, iVar, cVar);
        }

        @Override // x5.c
        public void f(i iVar, d6.h hVar, m mVar, d6.g gVar) {
            C0990c.c(this, iVar, hVar, mVar, gVar);
        }

        @Override // x5.c
        public void g(i iVar, n6.c cVar) {
            C0990c.q(this, iVar, cVar);
        }

        @Override // x5.c
        public void h(i iVar, k6.h hVar) {
            C0990c.m(this, iVar, hVar);
        }

        @Override // x5.c
        public void i(i iVar, Object obj) {
            C0990c.h(this, iVar, obj);
        }

        @Override // x5.c
        public void j(i iVar) {
            C0990c.n(this, iVar);
        }

        @Override // x5.c
        public void k(i iVar, Bitmap bitmap) {
            C0990c.p(this, iVar, bitmap);
        }

        @Override // x5.c
        public void l(i iVar, Object obj) {
            C0990c.f(this, iVar, obj);
        }

        @Override // x5.c
        public void m(i iVar, Object obj) {
            C0990c.g(this, iVar, obj);
        }

        @Override // x5.c
        public void n(i iVar, d6.h hVar, m mVar) {
            C0990c.d(this, iVar, hVar, mVar);
        }

        @Override // x5.c
        public void o(i iVar, String str) {
            C0990c.e(this, iVar, str);
        }

        @Override // x5.c
        public void p(i iVar, a6.g gVar, m mVar) {
            C0990c.b(this, iVar, gVar, mVar);
        }

        @Override // x5.c
        public void q(i iVar, Bitmap bitmap) {
            C0990c.o(this, iVar, bitmap);
        }

        @Override // x5.c
        public void r(i iVar, a6.g gVar, m mVar, a6.e eVar) {
            C0990c.a(this, iVar, gVar, mVar, eVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f59707a = new b();
    }

    /* renamed from: x5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0990c {
        public static void a(c cVar, i iVar, a6.g gVar, m mVar, a6.e eVar) {
        }

        public static void b(c cVar, i iVar, a6.g gVar, m mVar) {
        }

        public static void c(c cVar, i iVar, d6.h hVar, m mVar, d6.g gVar) {
        }

        public static void d(c cVar, i iVar, d6.h hVar, m mVar) {
        }

        public static void e(c cVar, i iVar, String str) {
        }

        public static void f(c cVar, i iVar, Object obj) {
        }

        public static void g(c cVar, i iVar, Object obj) {
        }

        public static void h(c cVar, i iVar, Object obj) {
        }

        public static void i(c cVar, i iVar) {
        }

        public static void j(c cVar, i iVar, j6.e eVar) {
        }

        public static void k(c cVar, i iVar) {
        }

        public static void l(c cVar, i iVar, p pVar) {
        }

        public static void m(c cVar, i iVar, k6.h hVar) {
        }

        public static void n(c cVar, i iVar) {
        }

        public static void o(c cVar, i iVar, Bitmap bitmap) {
        }

        public static void p(c cVar, i iVar, Bitmap bitmap) {
        }

        public static void q(c cVar, i iVar, n6.c cVar2) {
        }

        public static void r(c cVar, i iVar, n6.c cVar2) {
        }
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f59708a = a.f59710a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f59709b = x5.d.f59711c;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ a f59710a = new a();
        }

        /* loaded from: classes.dex */
        public static final class b {
            public static c a(i iVar) {
                return c.f59706b;
            }
        }

        c a(i iVar);
    }

    @Override // j6.i.b
    void a(i iVar);

    @Override // j6.i.b
    void b(i iVar, p pVar);

    @Override // j6.i.b
    void c(i iVar);

    @Override // j6.i.b
    void d(i iVar, j6.e eVar);

    void e(i iVar, n6.c cVar);

    void f(i iVar, d6.h hVar, m mVar, d6.g gVar);

    void g(i iVar, n6.c cVar);

    void h(i iVar, k6.h hVar);

    void i(i iVar, Object obj);

    void j(i iVar);

    void k(i iVar, Bitmap bitmap);

    void l(i iVar, Object obj);

    void m(i iVar, Object obj);

    void n(i iVar, d6.h hVar, m mVar);

    void o(i iVar, String str);

    void p(i iVar, a6.g gVar, m mVar);

    void q(i iVar, Bitmap bitmap);

    void r(i iVar, a6.g gVar, m mVar, a6.e eVar);
}
