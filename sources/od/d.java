package od;

import com.dena.mirrorman.net.retrofit.MRRequest;
import nf.e;
import pd.e;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class d implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44759w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44760x;

    /* renamed from: y  reason: collision with root package name */
    public final ao.g f44761y;

    /* loaded from: classes2.dex */
    public enum a {
        MALE(1),
        FEMALE(2),
        OTHER(3);
        
        private final int rawValue;

        a(int i10) {
            this.rawValue = i10;
        }

        public final int c() {
            return this.rawValue;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ChooseMyProfileActionCreator$postDemographic$1", f = "ChooseMyProfileActionCreator.kt", l = {37}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44762w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a f44764y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44765z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, int i10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44764y = aVar;
            this.f44765z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44764y, this.f44765z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44762w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = d.this.f44760x;
                    int c11 = this.f44764y.c();
                    int i11 = this.f44765z;
                    this.f44762w = 1;
                    if (mRRequest.postDemographic(c11, i11, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            d.this.f44759w.a(e.a.f46720a);
            return wn.v.f59242a;
        }
    }

    public d(q8.a aVar, MRRequest mRRequest) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f44759w = aVar;
        this.f44760x = mRRequest;
        uo.k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.f44761y = b11.plus(b10);
    }

    public final void c(a aVar, int i10) {
        jo.p.h(aVar, "genderType");
        uo.l.d(this, null, null, new b(aVar, i10, null), 3, null);
    }

    public final void d(a aVar) {
        this.f44759w.a(new e.b(aVar));
    }

    public final void e(e.b bVar) {
        jo.p.h(bVar, "generation");
        this.f44759w.a(new e.c(bVar));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44761y;
    }
}
