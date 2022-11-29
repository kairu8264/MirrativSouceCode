package ad;

import com.dena.mirrativ.mirrativapi.user.UserApi;

/* loaded from: classes2.dex */
public final class p1 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final UserApi f1268w;

    /* renamed from: x  reason: collision with root package name */
    public final q8.a f1269x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f1270y;

    public p1(UserApi userApi, q8.a aVar) {
        jo.p.h(userApi, "userApi");
        jo.p.h(aVar, "dispatcher");
        this.f1268w = userApi;
        this.f1269x = aVar;
        this.f1270y = uo.r0.b();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f1270y.getCoroutineContext();
    }
}
