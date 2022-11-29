package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.api.response.CollabType;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class e0 extends androidx.fragment.app.e implements uo.q0 {
    public static final a V0 = new a(null);
    public static final int W0 = 8;
    public final /* synthetic */ da.j N0;
    public f0 O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e0 a(String str, String str2, String str3, CollabType collabType) {
            jo.p.h(str, "userName");
            jo.p.h(str2, "myProfileImageUrl");
            jo.p.h(str3, "liveUserImageUrl");
            jo.p.h(collabType, "collabType");
            e0 e0Var = new e0();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_USER_NAME", str);
            bundle.putString("EXTRA_MY_PROFILE_IMAGE_URL", str2);
            bundle.putString("EXTRA_LIVE_USER_IMAGE_URL", str3);
            bundle.putSerializable("EXTRA_COLLAB_TYPE", collabType);
            e0Var.V2(bundle);
            return e0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<CollabType> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final CollabType invoke() {
            Serializable serializable = e0.this.M2().getSerializable("EXTRA_COLLAB_TYPE");
            jo.p.e(serializable);
            return (CollabType) serializable;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = e0.this.M2().getString("EXTRA_LIVE_USER_IMAGE_URL");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<String> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = e0.this.M2().getString("EXTRA_MY_PROFILE_IMAGE_URL");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            dq.c.c().l(new ce.n());
            e0.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            f0 f0Var = e0.this.O0;
            if (f0Var != null) {
                f0Var.X0();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.CollabRequestDialog$onViewCreated$3", f = "CollabRequestDialog.kt", l = {125}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public int A;
        public final /* synthetic */ ae.v1 C;

        /* renamed from: w  reason: collision with root package name */
        public Object f17802w;

        /* renamed from: x  reason: collision with root package name */
        public Object f17803x;

        /* renamed from: y  reason: collision with root package name */
        public Object f17804y;

        /* renamed from: z  reason: collision with root package name */
        public Object f17805z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ae.v1 v1Var, ao.d<? super g> dVar) {
            super(2, dVar);
            this.C = v1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:17:0x0061, B:19:0x0069, B:21:0x0075, B:23:0x0080, B:25:0x0086, B:33:0x0096), top: B:44:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0096 A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #0 {all -> 0x00e4, blocks: (B:17:0x0061, B:19:0x0069, B:21:0x0075, B:23:0x0080, B:25:0x0086, B:33:0x0096), top: B:44:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0058 -> B:16:0x0060). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: be.e0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<nd.i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17806w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17807x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17808y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17806w = componentCallbacks;
            this.f17807x = aVar;
            this.f17808y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f17806w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.i1.class), this.f17807x, this.f17808y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<nf.h> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17809w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17810x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17811y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17809w = componentCallbacks;
            this.f17810x = aVar;
            this.f17811y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.h, java.lang.Object] */
        @Override // io.a
        public final nf.h invoke() {
            ComponentCallbacks componentCallbacks = this.f17809w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.h.class), this.f17810x, this.f17811y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<String> {
        public j() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = e0.this.M2().getString("EXTRA_USER_NAME");
            jo.p.e(string);
            return string;
        }
    }

    public e0() {
        super(nd.b1.dialog_fragment_collab_request);
        this.N0 = new da.j();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new h(this, null, null));
        this.Q0 = wn.g.b(iVar, new i(this, null, null));
        this.R0 = wn.g.a(new j());
        this.S0 = wn.g.a(new d());
        this.T0 = wn.g.a(new c());
        this.U0 = wn.g.a(new b());
    }

    public final nf.h E3() {
        return (nf.h) this.Q0.getValue();
    }

    public final CollabType F3() {
        return (CollabType) this.U0.getValue();
    }

    public final String G3() {
        return (String) this.T0.getValue();
    }

    public final String H3() {
        return (String) this.S0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    public final nd.i1 I3() {
        return (nd.i1) this.P0.getValue();
    }

    public final String J3() {
        return (String) this.R0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        String V02;
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ae.v1 T = ae.v1.T(view);
        AppCompatTextView appCompatTextView = T.H;
        if (I3().a().d()) {
            V02 = V0(nd.f1.text_streaming_collab_waiting_message_during_cast, J3());
        } else if (F3() == CollabType.LIVE) {
            V02 = V0(nd.f1.text_collab_waiting_title_streaming_collab, J3());
        } else {
            V02 = V0(nd.f1.text_collab_waiting_title, J3());
        }
        appCompatTextView.setText(V02);
        AppCompatImageView appCompatImageView = T.G;
        jo.p.g(appCompatImageView, "binding.myProfileImageView");
        td.a.i(appCompatImageView, H3());
        AppCompatImageView appCompatImageView2 = T.E;
        jo.p.g(appCompatImageView2, "binding.liveUserProfileImageView");
        td.a.i(appCompatImageView2, G3());
        RoundedButtonView roundedButtonView = T.B;
        jo.p.g(roundedButtonView, "binding.cancelButtonView");
        yd.g1.a(roundedButtonView, new e());
        RoundedButtonView roundedButtonView2 = T.D;
        jo.p.g(roundedButtonView2, "binding.liveStartButtonView");
        yd.g1.a(roundedButtonView2, new f());
        uo.l.d(this, null, null, new g(T, null), 3, null);
        w3(false);
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(de.e.b(this, 300), -2);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.O0 = context instanceof f0 ? (f0) context : null;
    }
}
