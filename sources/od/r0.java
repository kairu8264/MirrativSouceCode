package od;

import android.graphics.Bitmap;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.SanitizeTextResponse;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftColorConfig;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.io.File;
import java.util.List;
import pd.g1;
import ud.a4;
import ud.z3;

/* loaded from: classes2.dex */
public final class r0 implements uo.q0 {
    public static final a A = new a(null);
    public static final int B = 8;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45203w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f45204x;

    /* renamed from: y  reason: collision with root package name */
    public final hf.k0 f45205y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f45206z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UniqueEmomoStampGiftCreationActionCreator$checkText$1", f = "UniqueEmomoStampGiftCreationActionCreator.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45207w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45209y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45210z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45209y = str;
            this.f45210z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45209y, this.f45210z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45207w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = r0.this.f45204x;
                    String str = this.f45209y;
                    String str2 = this.f45210z;
                    this.f45207w = 1;
                    obj = mRRequest.postLiveSanitizeText(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.f45203w.a(new g1.e(((SanitizeTextResponse) obj).getSanitizedText()));
            } catch (Throwable th2) {
                r0.this.f45203w.a(new g1.c(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.UniqueEmomoStampGiftCreationActionCreator$saveTemporaryStampImageFile$1", f = "UniqueEmomoStampGiftCreationActionCreator.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45211w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Bitmap f45213y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bitmap bitmap, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45213y = bitmap;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f45213y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45211w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.k0 k0Var = r0.this.f45205y;
                    Bitmap bitmap = this.f45213y;
                    this.f45211w = 1;
                    obj = k0Var.a("unique_emomo_gift_stamp_image", bitmap, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                r0.this.f45203w.a(new g1.g((File) obj));
            } catch (Throwable unused) {
                r0.this.f45203w.a(new g1.f(MRError.Network.INSTANCE));
            }
            return wn.v.f59242a;
        }
    }

    public r0(q8.a aVar, MRRequest mRRequest, hf.k0 k0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(k0Var, "saveImageToLocalStorage");
        this.f45203w = aVar;
        this.f45204x = mRRequest;
        this.f45205y = k0Var;
        this.f45206z = uo.r0.b();
    }

    public final void d(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "inputText");
        this.f45203w.a(g1.d.f46890a);
        uo.l.d(this, null, null, new b(str, str2, null), 3, null);
    }

    public final void e(Bitmap bitmap) {
        jo.p.h(bitmap, "image");
        uo.l.d(this, null, null, new c(bitmap, null), 3, null);
    }

    public final void f(List<UniqueEmomoGiftColorConfig> list) {
        jo.p.h(list, "colorConfigs");
        this.f45203w.a(new g1.h(list));
    }

    public final void g(z3 z3Var) {
        jo.p.h(z3Var, "bindModel");
        this.f45203w.a(new g1.a(z3Var));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45206z.getCoroutineContext();
    }

    public final void h(a4 a4Var) {
        jo.p.h(a4Var, "bindModel");
        this.f45203w.a(new g1.b(a4Var));
    }
}
