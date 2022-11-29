package z8;

import com.dena.mirrorman.net.api.response.MissionStatusResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import uo.g1;
import uo.i2;
import uo.k0;
import uo.q0;
import z8.b;

/* loaded from: classes.dex */
public final class a implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f62640w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f62641x;

    /* renamed from: y  reason: collision with root package name */
    public final ao.g f62642y;

    @co.f(c = "com.dena.mirrativ.catalog.mission.MissionActionCreator$loadMissionStatus$1", f = "MissionActionCreator.kt", l = {20}, m = "invokeSuspend")
    /* renamed from: z8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1083a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62643w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f62645y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1083a(String str, ao.d<? super C1083a> dVar) {
            super(2, dVar);
            this.f62645y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C1083a(this.f62645y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C1083a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62643w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f62641x;
                    String str = this.f62645y;
                    this.f62643w = 1;
                    obj = mRRequest.getMissionStatus(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f62640w.a(new b.C1084b((MissionStatusResponse) obj));
            } catch (Throwable unused) {
                a.this.f62640w.a(b.a.f62657a);
            }
            return wn.v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f62640w = aVar;
        this.f62641x = mRRequest;
        k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.f62642y = b11.plus(b10);
    }

    public final void c(String str) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new C1083a(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f62642y;
    }
}
