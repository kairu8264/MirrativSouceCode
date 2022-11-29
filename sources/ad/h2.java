package ad;

import com.dena.mirrativ.mirrativapi.user.UserApi;

/* loaded from: classes2.dex */
public final class h2 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f1125w;

    /* renamed from: x  reason: collision with root package name */
    public final UserApi f1126x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f1127y;

    public h2(q8.a aVar, UserApi userApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(userApi, "userApi");
        this.f1125w = aVar;
        this.f1126x = userApi;
        this.f1127y = uo.r0.b();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f1127y.getCoroutineContext();
    }
}
