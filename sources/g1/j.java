package g1;

import wn.v;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public io.a<v> f32476a;

    public j() {
    }

    public /* synthetic */ j(jo.h hVar) {
        this();
    }

    public abstract void a(e1.e eVar);

    public io.a<v> b() {
        return this.f32476a;
    }

    public final void c() {
        io.a<v> b10 = b();
        if (b10 != null) {
            b10.invoke();
        }
    }

    public void d(io.a<v> aVar) {
        this.f32476a = aVar;
    }
}
