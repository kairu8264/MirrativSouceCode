package l5;

import androidx.lifecycle.e0;
import k5.m;

/* loaded from: classes.dex */
public class c implements m {

    /* renamed from: c  reason: collision with root package name */
    public final e0<m.b> f39552c = new e0<>();

    /* renamed from: d  reason: collision with root package name */
    public final v5.c<m.b.c> f39553d = v5.c.u();

    public c() {
        a(m.f38419b);
    }

    public void a(m.b bVar) {
        this.f39552c.m(bVar);
        if (bVar instanceof m.b.c) {
            this.f39553d.q((m.b.c) bVar);
        } else if (bVar instanceof m.b.a) {
            this.f39553d.r(((m.b.a) bVar).a());
        }
    }
}
