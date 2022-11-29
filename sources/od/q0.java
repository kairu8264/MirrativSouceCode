package od;

import android.graphics.Bitmap;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarPartsResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftPreset;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.io.File;
import pd.f1;
import uo.y0;

/* loaded from: classes2.dex */
public final class q0 implements uo.q0 {
    public static final a B = new a(null);
    public static final int C = 8;
    public final da.c A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45158w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f45159x;

    /* renamed from: y  reason: collision with root package name */
    public final hf.k0 f45160y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f45161z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UniqueEmomoRichGiftCreationActionCreator$fetchInitData$1", f = "UniqueEmomoRichGiftCreationActionCreator.kt", l = {37, 38}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45162w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f45163x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ UniqueEmomoGiftPreset f45165z;

        @co.f(c = "com.dena.mirrorman.actioncreator.UniqueEmomoRichGiftCreationActionCreator$fetchInitData$1$avatarPartsRequest$1", f = "UniqueEmomoRichGiftCreationActionCreator.kt", l = {35}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super ClosetAvatarPartsResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f45166w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q0 f45167x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q0 q0Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f45167x = q0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f45167x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super ClosetAvatarPartsResponse> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f45166w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f45167x.f45159x;
                    this.f45166w = 1;
                    obj = mRRequest.requestClosetParts(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrorman.actioncreator.UniqueEmomoRichGiftCreationActionCreator$fetchInitData$1$currentClosetRequest$1", f = "UniqueEmomoRichGiftCreationActionCreator.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: od.q0$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0680b extends co.l implements io.p<uo.q0, ao.d<? super ClosetAvatarResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f45168w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q0 f45169x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0680b(q0 q0Var, ao.d<? super C0680b> dVar) {
                super(2, dVar);
                this.f45169x = q0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new C0680b(this.f45169x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super ClosetAvatarResponse> dVar) {
                return ((C0680b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f45168w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f45169x.f45159x;
                    this.f45168w = 1;
                    obj = MRRequest.DefaultImpls.requestClosetAvatar$default(mRRequest, null, null, this, 3, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UniqueEmomoGiftPreset uniqueEmomoGiftPreset, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45165z = uniqueEmomoGiftPreset;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f45165z, dVar);
            bVar.f45163x = obj;
            return bVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0 b10;
            y0 b11;
            ClosetAvatarPartsResponse closetAvatarPartsResponse;
            Object c10 = bo.c.c();
            int i10 = this.f45162w;
            try {
            } catch (Throwable th2) {
                q0.this.f45158w.a(new f1.a(MRErrorKt.convertMRException(th2).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                uo.q0 q0Var = (uo.q0) this.f45163x;
                q0.this.f45158w.a(f1.b.f46838a);
                b10 = uo.l.b(q0Var, null, null, new C0680b(q0.this, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new a(q0.this, null), 3, null);
                this.f45163x = b10;
                this.f45162w = 1;
                obj = b11.o(this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closetAvatarPartsResponse = (ClosetAvatarPartsResponse) this.f45163x;
                wn.m.b(obj);
                q0.this.f45158w.a(new f1.c(this.f45165z, jf.c.f37906y.a(((ClosetAvatarResponse) obj).getAvatar()), closetAvatarPartsResponse));
                return wn.v.f59242a;
            } else {
                b10 = (y0) this.f45163x;
                wn.m.b(obj);
            }
            ClosetAvatarPartsResponse closetAvatarPartsResponse2 = (ClosetAvatarPartsResponse) obj;
            this.f45163x = closetAvatarPartsResponse2;
            this.f45162w = 2;
            Object o10 = b10.o(this);
            if (o10 == c10) {
                return c10;
            }
            closetAvatarPartsResponse = closetAvatarPartsResponse2;
            obj = o10;
            q0.this.f45158w.a(new f1.c(this.f45165z, jf.c.f37906y.a(((ClosetAvatarResponse) obj).getAvatar()), closetAvatarPartsResponse));
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UniqueEmomoRichGiftCreationActionCreator$saveTemporaryStampImageFile$1", f = "UniqueEmomoRichGiftCreationActionCreator.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45170w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Bitmap f45172y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bitmap bitmap, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45172y = bitmap;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f45172y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45170w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.k0 k0Var = q0.this.f45160y;
                    Bitmap bitmap = this.f45172y;
                    this.f45170w = 1;
                    obj = k0Var.a("unique_emomo_gift_rich_image", bitmap, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                q0.this.f45158w.a(new f1.i((File) obj));
            } catch (Throwable unused) {
                q0.this.f45158w.a(new f1.h(MRError.Network.INSTANCE));
            }
            return wn.v.f59242a;
        }
    }

    public q0(q8.a aVar, MRRequest mRRequest, hf.k0 k0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(k0Var, "saveImageToLocalStorage");
        this.f45158w = aVar;
        this.f45159x = mRRequest;
        this.f45160y = k0Var;
        this.f45161z = uo.r0.b();
        this.A = new da.c();
    }

    public final void d(UniqueEmomoGiftPreset uniqueEmomoGiftPreset) {
        jo.p.h(uniqueEmomoGiftPreset, "preset");
        uo.l.d(this, this.A, null, new b(uniqueEmomoGiftPreset, null), 2, null);
    }

    public final void e() {
        this.f45158w.a(f1.f.f46845a);
    }

    public final void f() {
        this.f45158w.a(f1.k.f46850a);
    }

    public final void g(Bitmap bitmap) {
        jo.p.h(bitmap, "image");
        uo.l.d(this, null, null, new c(bitmap, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45161z.getCoroutineContext();
    }

    public final void h(int i10, String str) {
        jo.p.h(str, "fontId");
        this.f45158w.a(new f1.d(i10, str));
    }

    public final void i(String str) {
        jo.p.h(str, "motionId");
        this.f45158w.a(new f1.e(str));
    }

    public final void j() {
        this.f45158w.a(f1.g.f46846a);
    }

    public final void k(int i10) {
        this.f45158w.a(new f1.l(i10));
    }

    public final void l(String str) {
        jo.p.h(str, "text");
        this.f45158w.a(new f1.j(str));
    }

    public final void m(String str) {
        jo.p.h(str, "title");
        this.f45158w.a(new f1.m(str));
    }
}
