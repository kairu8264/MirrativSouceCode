package gf;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.retrofit.MRRequest;
import nd.f1;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class c0 extends androidx.fragment.app.e {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public final wn.f N0;
    public final wn.f O0;
    public final uo.b0 P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c0 a(String str, String str2) {
            jo.p.h(str, "referer");
            jo.p.h(str2, "twitterAccountName");
            c0 c0Var = new c0();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TWITTER_ACCESS_TOKEN", str);
            bundle.putString("EXTRA_TWITTER_ACCOUNT_NAME", str2);
            c0Var.V2(bundle);
            return c0Var;
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.FollowOfficialTwitterAccountDialog$onCreateDialog$1$1", f = "FollowOfficialTwitterAccountDialog.kt", l = {48}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33306w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33306w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    c0.this.J3("yes");
                    MRRequest G3 = c0.this.G3();
                    String string = c0.this.M2().getString("EXTRA_TWITTER_ACCESS_TOKEN");
                    jo.p.e(string);
                    this.f33306w = 1;
                    if (G3.postFollowOfficialTwitter(string, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(c0.this.q0(), error);
                } else {
                    of.n nVar = of.n.f45411a;
                    Context q02 = c0.this.q0();
                    String message = error.getMessage();
                    if (message == null) {
                        message = c0.this.U0(f1.f41966c);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(q02, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33308w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33309x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33310y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33308w = componentCallbacks;
            this.f33309x = aVar;
            this.f33310y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f33308w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRRequest.class), this.f33309x, this.f33310y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33311w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33312x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33313y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33311w = componentCallbacks;
            this.f33312x = aVar;
            this.f33313y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f33311w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f33312x, this.f33313y);
        }
    }

    public c0() {
        uo.b0 b10;
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.N0 = wn.g.b(iVar, new c(this, null, null));
        this.O0 = wn.g.b(iVar, new d(this, null, null));
        b10 = i2.b(null, 1, null);
        this.P0 = b10;
    }

    public static final void H3(c0 c0Var, DialogInterface dialogInterface, int i10) {
        jo.p.h(c0Var, "this$0");
        uo.l.d(uo.r0.a(g1.c().plus(c0Var.P0)), null, null, new b(null), 3, null);
    }

    public static final void I3(c0 c0Var, DialogInterface dialogInterface, int i10) {
        jo.p.h(c0Var, "this$0");
        c0Var.J3("no");
    }

    public final MRLogger F3() {
        return (MRLogger) this.O0.getValue();
    }

    public final MRRequest G3() {
        return (MRRequest) this.N0.getValue();
    }

    public final void J3(String str) {
        MRLogger F3 = F3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TWITTER_FOLLOW_POPUP);
        builder.setTargetId(str);
        String string = M2().getString("EXTRA_TWITTER_ACCESS_TOKEN");
        jo.p.e(string);
        String string2 = M2().getString("EXTRA_TWITTER_ACCOUNT_NAME");
        jo.p.e(string2);
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_WHERE, string), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, string2)));
        F3.sendLog(builder.build());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        J3(MRLog.TARGET_ID_IMP);
        androidx.appcompat.app.a create = new a.C0045a(N2()).j(f1.text_follow_official_account_dialog_title).f(f1.text_follow_official_account_dialog_message).setPositiveButton(f1.text_follows, new DialogInterface.OnClickListener() { // from class: gf.a0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                c0.H3(c0.this, dialogInterface, i10);
            }
        }).setNegativeButton(f1.f41995w0, new DialogInterface.OnClickListener() { // from class: gf.b0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                c0.I3(c0.this, dialogInterface, i10);
            }
        }).create();
        jo.p.g(create, "Builder(requireContext()…  }\n            .create()");
        return create;
    }
}
