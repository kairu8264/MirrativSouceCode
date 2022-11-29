package xk;

import cl.c0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import xl.a;

/* loaded from: classes.dex */
public final class d implements xk.a {

    /* renamed from: c  reason: collision with root package name */
    public static final g f60358c = new b();

    /* renamed from: a  reason: collision with root package name */
    public final xl.a<xk.a> f60359a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<xk.a> f60360b = new AtomicReference<>(null);

    /* loaded from: classes.dex */
    public static final class b implements g {
        public b() {
        }

        @Override // xk.g
        public File a() {
            return null;
        }

        @Override // xk.g
        public File b() {
            return null;
        }

        @Override // xk.g
        public File c() {
            return null;
        }

        @Override // xk.g
        public File d() {
            return null;
        }

        @Override // xk.g
        public File e() {
            return null;
        }

        @Override // xk.g
        public File f() {
            return null;
        }
    }

    public d(xl.a<xk.a> aVar) {
        this.f60359a = aVar;
        aVar.a(new a.InterfaceC1009a() { // from class: xk.c
            @Override // xl.a.InterfaceC1009a
            public final void a(xl.b bVar) {
                d.this.g(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(xl.b bVar) {
        f.f().b("Crashlytics native component now available.");
        this.f60360b.set((xk.a) bVar.get());
    }

    public static /* synthetic */ void h(String str, String str2, long j10, c0 c0Var, xl.b bVar) {
        ((xk.a) bVar.get()).c(str, str2, j10, c0Var);
    }

    @Override // xk.a
    public g a(String str) {
        xk.a aVar = this.f60360b.get();
        if (aVar == null) {
            return f60358c;
        }
        return aVar.a(str);
    }

    @Override // xk.a
    public boolean b() {
        xk.a aVar = this.f60360b.get();
        return aVar != null && aVar.b();
    }

    @Override // xk.a
    public void c(final String str, final String str2, final long j10, final c0 c0Var) {
        f f10 = f.f();
        f10.i("Deferring native open session: " + str);
        this.f60359a.a(new a.InterfaceC1009a() { // from class: xk.b
            @Override // xl.a.InterfaceC1009a
            public final void a(xl.b bVar) {
                d.h(str, str2, j10, c0Var, bVar);
            }
        });
    }

    @Override // xk.a
    public boolean d(String str) {
        xk.a aVar = this.f60360b.get();
        return aVar != null && aVar.d(str);
    }
}
