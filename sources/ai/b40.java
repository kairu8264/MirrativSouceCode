package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class b40 implements xg.v {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2222a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f2223b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ or f2224c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Map f2225d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f2226e;

    public b40(d40 d40Var, boolean z10, or orVar, Map map, Map map2) {
        this.f2223b = z10;
        this.f2224c = orVar;
        this.f2225d = map;
        this.f2226e = map2;
    }

    @Override // xg.v
    public final void a(int i10) {
    }

    @Override // xg.v
    public final void b(boolean z10) {
        if (this.f2222a) {
            return;
        }
        if (z10 && this.f2223b) {
            ((nc1) this.f2224c).zzb();
        }
        this.f2222a = true;
        this.f2225d.put((String) this.f2226e.get("event_id"), Boolean.valueOf(z10));
        ((z50) this.f2224c).j0("openIntentAsync", this.f2225d);
    }
}
