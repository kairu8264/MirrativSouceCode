package z8;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.MissionInfoResponse;
import com.dena.mirrorman.net.api.response.MissionReceiveRewardResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import kotlin.NoWhenBranchMatchedException;
import uo.g1;
import uo.i2;
import uo.k0;
import uo.q0;
import z8.m;

/* loaded from: classes.dex */
public final class l implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f62694w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f62695x;

    /* renamed from: y  reason: collision with root package name */
    public final ao.g f62696y;

    @co.f(c = "com.dena.mirrativ.catalog.mission.MissionTabActionCreator$receiveReward$1", f = "MissionTabActionCreator.kt", l = {38}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ boolean A;

        /* renamed from: w  reason: collision with root package name */
        public int f62697w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j f62699y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f62700z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, int i10, boolean z10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f62699y = jVar;
            this.f62700z = i10;
            this.A = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f62699y, this.f62700z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62697w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = l.this.f62695x;
                    String c11 = this.f62699y.c();
                    int i11 = this.f62700z;
                    this.f62697w = 1;
                    obj = mRRequest.postMissionReceiveReward(Referer.MISSION, c11, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                l.this.f62694w.a(new m.f((MissionReceiveRewardResponse) obj, this.f62700z, this.A));
            } catch (Throwable th2) {
                l.this.f62694w.a(new m.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.mission.MissionTabActionCreator$reload$1", f = "MissionTabActionCreator.kt", l = {24, 25}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62701w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j f62702x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l f62703y;

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f62704a;

            static {
                int[] iArr = new int[j.values().length];
                iArr[j.DAILY.ordinal()] = 1;
                iArr[j.WEEKLY.ordinal()] = 2;
                f62704a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar, l lVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f62702x = jVar;
            this.f62703y = lVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f62702x, this.f62703y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            MissionInfoResponse missionInfoResponse;
            Object c10 = bo.c.c();
            int i10 = this.f62701w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    int i11 = a.f62704a[this.f62702x.ordinal()];
                    if (i11 == 1) {
                        MRRequest mRRequest = this.f62703y.f62695x;
                        this.f62701w = 1;
                        obj = mRRequest.getDailyMissions(Referer.MISSION, this);
                        if (obj == c10) {
                            return c10;
                        }
                        missionInfoResponse = (MissionInfoResponse) obj;
                    } else if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        MRRequest mRRequest2 = this.f62703y.f62695x;
                        this.f62701w = 2;
                        obj = mRRequest2.getWeeklyMissions(Referer.MISSION, this);
                        if (obj == c10) {
                            return c10;
                        }
                        missionInfoResponse = (MissionInfoResponse) obj;
                    }
                } else if (i10 == 1) {
                    wn.m.b(obj);
                    missionInfoResponse = (MissionInfoResponse) obj;
                } else if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    missionInfoResponse = (MissionInfoResponse) obj;
                }
                this.f62703y.f62694w.a(new m.b(missionInfoResponse));
            } catch (Throwable th2) {
                this.f62703y.f62694w.a(new m.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public l(q8.a aVar, MRRequest mRRequest) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f62694w = aVar;
        this.f62695x = mRRequest;
        k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.f62696y = b11.plus(b10);
    }

    public final void c(j jVar, int i10, boolean z10) {
        jo.p.h(jVar, "period");
        this.f62694w.a(m.e.f62710a);
        uo.l.d(this, null, null, new a(jVar, i10, z10, null), 3, null);
    }

    public final void d(j jVar) {
        jo.p.h(jVar, "period");
        this.f62694w.a(m.c.f62708a);
        uo.l.d(this, null, null, new b(jVar, this, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f62696y;
    }
}
