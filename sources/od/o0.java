package od;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.request.UpdateUniqueEmomoRichGiftRequest;
import com.dena.mirrorman.net.api.request.UpdateUniqueEmomoStampGiftRequest;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftSlotsResponse;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.List;
import pd.d1;
import uo.g1;

/* loaded from: classes2.dex */
public final class o0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45099w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f45100x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f45101y;

    @co.f(c = "com.dena.mirrorman.actioncreator.UniqueEmomoGiftSlotsActionCreator$fetchUniqueEmomoGiftSlots$1", f = "UniqueEmomoGiftSlotsActionCreator.kt", l = {37}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45102w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45104y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f45104y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45104y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45102w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = o0.this.f45100x;
                    String str = this.f45104y;
                    this.f45102w = 1;
                    obj = mRRequest.getUniqueEmomoGiftSlots(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                o0.this.f45099w.a(new d1.c(((UniqueEmomoGiftSlotsResponse) obj).getSlots()));
            } catch (Throwable th2) {
                o0.this.f45099w.a(new d1.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UniqueEmomoGiftSlotsActionCreator$loadActualImage$1", f = "UniqueEmomoGiftSlotsActionCreator.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45105w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45107y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45107y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45107y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f45105w == 0) {
                wn.m.b(obj);
                q8.a aVar = o0.this.f45099w;
                Bitmap decodeFile = BitmapFactory.decodeFile(this.f45107y);
                jo.p.g(decodeFile, "decodeFile(\n            …ath\n                    )");
                aVar.a(new d1.d(decodeFile));
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UniqueEmomoGiftSlotsActionCreator$saveRichGift$1", f = "UniqueEmomoGiftSlotsActionCreator.kt", l = {86}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ List<UniqueEmomoGiftUnityTextConfig> C;
        public final /* synthetic */ String D;

        /* renamed from: w  reason: collision with root package name */
        public int f45108w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f45110y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45111z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, String str, String str2, String str3, List<UniqueEmomoGiftUnityTextConfig> list, String str4, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45110y = i10;
            this.f45111z = str;
            this.A = str2;
            this.B = str3;
            this.C = list;
            this.D = str4;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f45110y, this.f45111z, this.A, this.B, this.C, this.D, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45108w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = o0.this.f45100x;
                    ep.c0 build = new UpdateUniqueEmomoRichGiftRequest(this.f45110y, this.f45111z, this.A, this.B, this.C, this.D).build();
                    this.f45108w = 1;
                    if (mRRequest.updateUniqueEmomoRichGiftSlot(build, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                o0.this.f45099w.a(d1.g.f46716a);
            } catch (Throwable th2) {
                o0.this.f45099w.a(new d1.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UniqueEmomoGiftSlotsActionCreator$saveStampGift$1", f = "UniqueEmomoGiftSlotsActionCreator.kt", l = {61}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f45112w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f45114y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45115z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, String str, String str2, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f45114y = i10;
            this.f45115z = str;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f45114y, this.f45115z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45112w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = o0.this.f45100x;
                    ep.c0 build = new UpdateUniqueEmomoStampGiftRequest(this.f45114y, this.f45115z, this.A).build();
                    this.f45112w = 1;
                    if (mRRequest.updateUniqueEmomoStampGiftSlot(build, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                o0.this.f45099w.a(d1.j.f46719a);
            } catch (Throwable th2) {
                o0.this.f45099w.a(new d1.h(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public o0(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f45099w = aVar;
        this.f45100x = mRRequest;
        this.f45101y = uo.r0.b();
    }

    public final void c(String str) {
        jo.p.h(str, "referer");
        this.f45099w.a(d1.b.f46711a);
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    public final void d(String str) {
        jo.p.h(str, "fileAbsolutePath");
        uo.l.d(uo.r0.a(g1.b().plus(new da.c())), null, null, new b(str, null), 3, null);
    }

    public final void e(int i10, String str, String str2, String str3, List<UniqueEmomoGiftUnityTextConfig> list, String str4) {
        jo.p.h(str, "motionId");
        jo.p.h(str2, "presetId");
        jo.p.h(str3, "giftTitle");
        jo.p.h(list, "textConfigs");
        jo.p.h(str4, "fileAbsolutePath");
        this.f45099w.a(d1.f.f46715a);
        uo.l.d(this, null, null, new c(i10, str, str2, str3, list, str4, null), 3, null);
    }

    public final void f(int i10, String str, String str2) {
        jo.p.h(str, "fileAbsolutePath");
        jo.p.h(str2, "giftText");
        this.f45099w.a(d1.i.f46718a);
        uo.l.d(this, null, null, new d(i10, str, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45101y.getCoroutineContext();
    }
}
