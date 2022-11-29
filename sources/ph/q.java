package ph;

import java.util.Map;

/* loaded from: classes3.dex */
public final class q implements vi.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ vi.h f47547a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f47548b;

    public q(r rVar, vi.h hVar) {
        this.f47548b = rVar;
        this.f47547a = hVar;
    }

    @Override // vi.c
    public final void a(vi.g gVar) {
        Map map;
        map = this.f47548b.f47551b;
        map.remove(this.f47547a);
    }
}
