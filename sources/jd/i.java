package jd;

import android.content.Context;
import android.net.Uri;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import ep.c0;
import hf.v0;
import java.util.List;
import kf.x;
import pd.r0;
import uo.q0;
import wn.v;

/* loaded from: classes2.dex */
public final class i implements q0 {
    public final /* synthetic */ da.b A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f37617w;

    /* renamed from: x  reason: collision with root package name */
    public final x f37618x;

    /* renamed from: y  reason: collision with root package name */
    public final v0 f37619y;

    /* renamed from: z  reason: collision with root package name */
    public final MRRequest f37620z;

    @co.f(c = "com.dena.mirrativ.user.mypage.profile.ProfileEditActionCreator$onSaveButtonClick$1", f = "ProfileEditActionCreator.kt", l = {85}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ Context A;
        public final /* synthetic */ Uri B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String D;
        public final /* synthetic */ Integer E;
        public final /* synthetic */ Boolean F;

        /* renamed from: w  reason: collision with root package name */
        public int f37621w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f37623y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f37624z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Context context, Uri uri, String str3, String str4, Integer num, Boolean bool, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f37623y = str;
            this.f37624z = str2;
            this.A = context;
            this.B = uri;
            this.C = str3;
            this.D = str4;
            this.E = num;
            this.F = bool;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f37623y, this.f37624z, this.A, this.B, this.C, this.D, this.E, this.F, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37621w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    c0 userProfileEditRequestBody = ApiUtil.INSTANCE.userProfileEditRequestBody(i.this.f37618x.T4(), this.f37623y, this.f37624z, of.f.f45394a.a(this.A, this.B), this.C, 0, null, i.this.f37619y.d(), this.D, false, this.E, this.F);
                    MRRequest mRRequest = i.this.f37620z;
                    this.f37621w = 1;
                    if (mRRequest.postUserProfileEdit(Referer.PROFILE_EDIT, userProfileEditRequestBody, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                i.this.f37617w.a(r0.h.f47221a);
            } catch (Throwable th2) {
                i.this.f37617w.a(new r0.f(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public i(q8.a aVar, x xVar, v0 v0Var, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(xVar, "userPreference");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(mRRequest, "request");
        this.f37617w = aVar;
        this.f37618x = xVar;
        this.f37619y = v0Var;
        this.f37620z = mRRequest;
        this.A = new da.b();
    }

    public final void e(String str) {
        jo.p.h(str, "birthday");
        this.f37617w.a(new r0.a(str));
    }

    public final void f(boolean z10) {
        this.f37617w.a(new r0.b(z10));
    }

    public final void g(String str) {
        jo.p.h(str, MRLog.PAYLOAD_KEY_DESCRIPTION);
        this.f37617w.a(new r0.c(str));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final void h(List<RibbonResponse> list) {
        jo.p.h(list, "ribbons");
        this.f37617w.a(new r0.d(list));
    }

    public final void i(String str) {
        jo.p.h(str, "name");
        this.f37617w.a(new r0.e(str));
    }

    public final void j(String str) {
        jo.p.h(str, "profileImageUrl");
        this.f37617w.a(new r0.i(str));
    }

    public final void k(Context context, Uri uri, String str, String str2, String str3, String str4, Integer num, Boolean bool) {
        jo.p.h(context, "context");
        jo.p.h(str, "name");
        this.f37617w.a(r0.g.f47220a);
        uo.l.d(this, null, null, new a(str, str2, context, uri, str3, str4, num, bool, null), 3, null);
    }

    public final void l(int i10) {
        this.f37617w.a(new r0.j(i10));
    }

    public final void m(String str) {
        jo.p.h(str, "url");
        this.f37617w.a(new r0.k(str));
    }
}
