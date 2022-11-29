package lp;

import ep.u;
import jo.h;
import jo.p;
import rp.e;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0584a f40415c = new C0584a(null);

    /* renamed from: a  reason: collision with root package name */
    public long f40416a;

    /* renamed from: b  reason: collision with root package name */
    public final e f40417b;

    /* renamed from: lp.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0584a {
        public C0584a() {
        }

        public /* synthetic */ C0584a(h hVar) {
            this();
        }
    }

    public a(e eVar) {
        p.h(eVar, "source");
        this.f40417b = eVar;
        this.f40416a = 262144;
    }

    public final u a() {
        u.a aVar = new u.a();
        while (true) {
            String b10 = b();
            if (b10.length() == 0) {
                return aVar.g();
            }
            aVar.d(b10);
        }
    }

    public final String b() {
        String R = this.f40417b.R(this.f40416a);
        this.f40416a -= R.length();
        return R;
    }
}
