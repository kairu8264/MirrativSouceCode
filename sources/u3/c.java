package u3;

import java.util.ArrayList;
import jo.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f54360a = new ArrayList<>();

    public final void a(b bVar) {
        p.h(bVar, "listener");
        this.f54360a.add(bVar);
    }

    public final void b(b bVar) {
        p.h(bVar, "listener");
        this.f54360a.remove(bVar);
    }
}
