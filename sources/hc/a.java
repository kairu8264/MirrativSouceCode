package hc;

import android.graphics.Bitmap;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import ep.y;
import hc.b;
import hf.a0;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements uo.q0 {
    public final /* synthetic */ uo.q0 A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f35046w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f35047x;

    /* renamed from: y  reason: collision with root package name */
    public final hf.k0 f35048y;

    /* renamed from: z  reason: collision with root package name */
    public final hf.a0 f35049z;

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotActionCreator$fetchUserMe$1", f = "GroupShotActionCreator.kt", l = {27}, m = "invokeSuspend")
    /* renamed from: hc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0443a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35050w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f35052y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0443a(String str, ao.d<? super C0443a> dVar) {
            super(2, dVar);
            this.f35052y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0443a(this.f35052y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0443a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35050w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.a0 a0Var = a.this.f35049z;
                    String str = this.f35052y;
                    this.f35050w = 1;
                    obj = a0.a.a(a0Var, str, false, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f35046w.a(new b.c((UserMe) obj));
            } catch (Throwable th2) {
                a.this.f35046w.a(new b.C0444b(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotActionCreator$postGroupShot$1", f = "GroupShotActionCreator.kt", l = {54, 64}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ List<String> B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ String D;

        /* renamed from: w  reason: collision with root package name */
        public int f35053w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Bitmap f35055y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f35056z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Bitmap bitmap, String str, boolean z10, List<String> list, boolean z11, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f35055y = bitmap;
            this.f35056z = str;
            this.A = z10;
            this.B = list;
            this.C = z11;
            this.D = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f35055y, this.f35056z, this.A, this.B, this.C, this.D, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object a10;
            Object c10 = bo.c.c();
            int i10 = this.f35053w;
            try {
            } catch (Throwable th2) {
                a.this.f35046w.a(new b.d(MRErrorKt.convertMRException(th2).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                hf.k0 k0Var = a.this.f35048y;
                Bitmap bitmap = this.f35055y;
                this.f35053w = 1;
                a10 = k0Var.a("FILE_NAME_GROUP_SHOT_GALLERY_KEY", bitmap, this);
                if (a10 == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    wn.m.b(obj);
                    a.this.f35046w.a(b.f.f35066a);
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
                a10 = obj;
            }
            y.a b10 = new y.a(null, 1, null).f(ep.y.f31045k).a("comment", this.f35056z).b("image", "image", ep.c0.f30798a.c((File) a10, ep.x.f31036g.b("image/png")));
            boolean z10 = this.A;
            String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            y.a a11 = b10.a("is_original", z10 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0").a("user_ids", xn.a0.g0(this.B, ",", null, null, 0, null, null, 62, null));
            if (!this.C) {
                str = "0";
            }
            ep.y e10 = a11.a("tweet", str).e();
            MRRequest mRRequest = a.this.f35047x;
            String str2 = this.D;
            this.f35053w = 2;
            if (mRRequest.postGroupShot(str2, e10, this) == c10) {
                return c10;
            }
            a.this.f35046w.a(b.f.f35066a);
            return wn.v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest, hf.k0 k0Var, hf.a0 a0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(k0Var, "saveImageToLocalStorage");
        jo.p.h(a0Var, "getUserMeRepository");
        this.f35046w = aVar;
        this.f35047x = mRRequest;
        this.f35048y = k0Var;
        this.f35049z = a0Var;
        this.A = uo.r0.b();
    }

    public final void e() {
        this.f35046w.a(b.g.f35067a);
    }

    public final void f(String str) {
        jo.p.h(str, "comment");
        this.f35046w.a(new b.a(str));
    }

    public final void g(String str) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new C0443a(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final void h(String str, String str2, Bitmap bitmap, boolean z10, List<String> list, boolean z11) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "comment");
        jo.p.h(bitmap, "bitmap");
        jo.p.h(list, "userIds");
        this.f35046w.a(b.e.f35065a);
        uo.l.d(this, null, null, new b(bitmap, str2, z10, list, z11, str, null), 3, null);
    }
}
