package gf;

import ae.s6;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.d5;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.detail.GiftboxGachaTargetDetail;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.GiftboxGachaExecuteResponse;
import com.dena.mirrorman.net.api.response.GiftboxGachaResult;
import com.dena.mirrorman.net.api.response.GiftboxGachaResultSpecialGachaItem;
import com.dena.mirrorman.net.api.response.ShareTwitter;
import com.dena.mirrorman.net.api.response.Social;
import com.google.android.exoplayer2.C;
import gf.c0;
import hf.o0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import kq.a;
import nd.f1;
import ud.v4;
import yd.g1;

/* loaded from: classes2.dex */
public final class k0 extends Fragment implements uo.q0 {
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final AutoClearedValue E0;
    public qd.a F0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f33375x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f33376y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f33377z0;
    public static final /* synthetic */ qo.h<Object>[] H0 = {jo.f0.d(new jo.s(k0.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/FragmentGiftboxGachaResultBinding;", 0))};
    public static final a G0 = new a(null);
    public static final int I0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k0 a() {
            return new k0();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            String shareText;
            jo.p.h(view, "it");
            k0.this.z3(MRLog.ACTION_TYPE_GIFT_BOX_GACHA_CLICK_LINE);
            if (!k0.this.r3().c("jp.naver.line.android")) {
                k0.this.B3();
                return;
            }
            GiftboxGachaExecuteResponse o10 = k0.this.u3().o();
            if (o10 == null || (shareText = o10.getShareText()) == null) {
                return;
            }
            try {
                String encode = URLEncoder.encode(shareText, C.UTF8_NAME);
                k0 k0Var = k0.this;
                k0Var.f3(new Intent("android.intent.action.VIEW", Uri.parse("line://msg/text/" + encode)));
            } catch (UnsupportedEncodingException unused) {
                of.n.A(k0.this.N2(), f1.f41975i, false);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        @co.f(c = "com.dena.mirrorman.fragment.GiftboxGachaResultFragment$onViewCreated$4$1", f = "GiftboxGachaResultFragment.kt", l = {137}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f33380w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ k0 f33381x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k0 k0Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f33381x = k0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f33381x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                String U0;
                Status status;
                MRError mirrativError;
                Object c10 = bo.c.c();
                int i10 = this.f33380w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.o0 v32 = this.f33381x.v3();
                    androidx.fragment.app.h L2 = this.f33381x.L2();
                    jo.p.g(L2, "requireActivity()");
                    FragmentManager O2 = this.f33381x.O2();
                    jo.p.g(O2, "requireFragmentManager()");
                    this.f33380w = 1;
                    obj = v32.j(L2, O2, Referer.DEEPLINK, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                wn.p pVar = (wn.p) obj;
                o0.b bVar = (o0.b) pVar.a();
                Social.SocialAccount socialAccount = (Social.SocialAccount) pVar.b();
                in.x xVar = (in.x) pVar.c();
                if (bVar == o0.b.Failed) {
                    of.n nVar = of.n.f45411a;
                    androidx.fragment.app.h L22 = this.f33381x.L2();
                    if (socialAccount == null || (status = socialAccount.getStatus()) == null || (mirrativError = status.getMirrativError()) == null || (U0 = mirrativError.getMessage()) == null) {
                        U0 = this.f33381x.U0(f1.f41982o3);
                        jo.p.g(U0, "getString(R.string.text_network_error)");
                    }
                    nVar.B(L22, U0, false);
                } else if (bVar == o0.b.Success) {
                    jo.p.e(socialAccount);
                    Integer isFollowOfficialTwitter = socialAccount.isFollowOfficialTwitter();
                    if (isFollowOfficialTwitter != null && isFollowOfficialTwitter.intValue() == 0) {
                        c0.a aVar = c0.Q0;
                        jo.p.e(xVar);
                        String c11 = xVar.c();
                        jo.p.g(c11, "twitterSession!!.userName");
                        aVar.a(Referer.DEEPLINK, c11).z3(this.f33381x.O2(), "FollowOfficialTwitterAccountDialog");
                    }
                }
                return wn.v.f59242a;
            }
        }

        public c() {
            super(1);
        }

        public final void a(View view) {
            ShareTwitter shareTwitter;
            jo.p.h(view, "it");
            k0.this.z3(MRLog.ACTION_TYPE_GIFT_BOX_GACHA_CLICK_TWEET);
            if (!k0.this.r3().c("com.twitter.android")) {
                k0.this.B3();
            } else if (k0.this.x3().p()) {
                GiftboxGachaExecuteResponse o10 = k0.this.u3().o();
                if (o10 == null || (shareTwitter = o10.getShareTwitter()) == null) {
                    return;
                }
                k0 k0Var = k0.this;
                k0Var.w3().f(shareTwitter);
                d5.S0.a(shareTwitter.getMaxlength(), shareTwitter.getCard().getSite()).z3(k0Var.O2(), "TwitterShareDialog");
            } else {
                k0 k0Var2 = k0.this;
                uo.l.d(k0Var2, null, null, new a(k0Var2, null), 3, null);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k0.this.B3();
            k0.this.z3(MRLog.ACTION_TYPE_GIFT_BOX_GACHA_CLICK_OTHER);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.GiftboxGachaResultFragment$onViewCreated$6", f = "GiftboxGachaResultFragment.kt", l = {213}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f33383w;

        /* renamed from: x  reason: collision with root package name */
        public Object f33384x;

        /* renamed from: y  reason: collision with root package name */
        public Object f33385y;

        /* renamed from: z  reason: collision with root package name */
        public int f33386z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068, B:23:0x0070, B:25:0x0076, B:27:0x007c, B:29:0x0082), top: B:40:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f33386z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f33385y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f33384x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f33383w
                gf.k0 r4 = (gf.k0) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L98
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                gf.k0 r9 = gf.k0.this
                nf.n r9 = gf.k0.l3(r9)
                wo.x r3 = r9.s()
                gf.k0 r9 = gf.k0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L98
                r4 = r9
                r9 = r8
            L3d:
                r9.f33383w = r4     // Catch: java.lang.Throwable -> L98
                r9.f33384x = r3     // Catch: java.lang.Throwable -> L98
                r9.f33385y = r1     // Catch: java.lang.Throwable -> L98
                r9.f33386z = r2     // Catch: java.lang.Throwable -> L98
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L98
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L95
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L95
                if (r9 == 0) goto L8f
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L95
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L95
                androidx.fragment.app.FragmentManager r9 = r5.A0()     // Catch: java.lang.Throwable -> L95
                if (r9 == 0) goto L89
                java.lang.String r6 = "TwitterShareDialog"
                androidx.fragment.app.Fragment r9 = r9.e0(r6)     // Catch: java.lang.Throwable -> L95
                if (r9 == 0) goto L89
                androidx.fragment.app.FragmentManager r6 = r5.A0()     // Catch: java.lang.Throwable -> L95
                if (r6 == 0) goto L89
                androidx.fragment.app.z r6 = r6.k()     // Catch: java.lang.Throwable -> L95
                if (r6 == 0) goto L89
                androidx.fragment.app.z r9 = r6.q(r9)     // Catch: java.lang.Throwable -> L95
                if (r9 == 0) goto L89
                int r9 = r9.j()     // Catch: java.lang.Throwable -> L95
                co.b.d(r9)     // Catch: java.lang.Throwable -> L95
            L89:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L8f:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L95:
                r9 = move-exception
                r3 = r4
                goto L99
            L98:
                r9 = move-exception
            L99:
                throw r9     // Catch: java.lang.Throwable -> L9a
            L9a:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.k0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.GiftboxGachaResultFragment$onViewCreated$7", f = "GiftboxGachaResultFragment.kt", l = {213}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f33387w;

        /* renamed from: x  reason: collision with root package name */
        public Object f33388x;

        /* renamed from: y  reason: collision with root package name */
        public Object f33389y;

        /* renamed from: z  reason: collision with root package name */
        public int f33390z;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x007a, B:33:0x008a, B:34:0x0099, B:36:0x009d, B:31:0x0086, B:28:0x0080, B:22:0x0068), top: B:47:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f33390z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f33389y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f33388x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f33387w
                gf.k0 r4 = (gf.k0) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb3
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                gf.k0 r11 = gf.k0.this
                nf.n r11 = gf.k0.l3(r11)
                wo.x r3 = r11.n()
                gf.k0 r11 = gf.k0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb3
                r4 = r11
                r11 = r10
            L3d:
                r11.f33387w = r4     // Catch: java.lang.Throwable -> Lb3
                r11.f33388x = r3     // Catch: java.lang.Throwable -> Lb3
                r11.f33389y = r1     // Catch: java.lang.Throwable -> Lb3
                r11.f33390z = r2     // Catch: java.lang.Throwable -> Lb3
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> Lb3
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lb0
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lb0
                if (r11 == 0) goto Laa
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> Lb0
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> Lb0
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> Lb0
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> Lb0
                boolean r6 = jo.p.c(r11, r6)     // Catch: java.lang.Throwable -> Lb0
            L6e:
                if (r6 == 0) goto L7a
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                r6.l(r7, r11)     // Catch: java.lang.Throwable -> Lb0
                goto La4
            L7a:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> Lb0
                if (r6 == 0) goto L80
                r6 = r2
                goto L82
            L80:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> Lb0
            L82:
                if (r6 == 0) goto L86
                r6 = r2
                goto L88
            L86:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> Lb0
            L88:
                if (r6 == 0) goto L99
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> Lb0
                r8 = 0
                r6.B(r7, r11, r8)     // Catch: java.lang.Throwable -> Lb0
                goto La4
            L99:
                boolean r11 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> Lb0
                if (r11 == 0) goto La4
                android.content.Context r11 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                of.n.z(r11)     // Catch: java.lang.Throwable -> Lb0
            La4:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Laa:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            Lb0:
                r11 = move-exception
                r3 = r4
                goto Lb4
            Lb3:
                r11 = move-exception
            Lb4:
                throw r11     // Catch: java.lang.Throwable -> Lb5
            Lb5:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.k0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<hf.o0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33391w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33392x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33393y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33391w = componentCallbacks;
            this.f33392x = aVar;
            this.f33393y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.o0, java.lang.Object] */
        @Override // io.a
        public final hf.o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f33391w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.o0.class), this.f33392x, this.f33393y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<hf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33394w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33395x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33396y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33394w = componentCallbacks;
            this.f33395x = aVar;
            this.f33396y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.c, java.lang.Object] */
        @Override // io.a
        public final hf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f33394w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.c.class), this.f33395x, this.f33396y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33397w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33398x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33399y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33397w = componentCallbacks;
            this.f33398x = aVar;
            this.f33399y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f33397w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.v0.class), this.f33398x, this.f33399y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33400w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33401x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33402y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33400w = componentCallbacks;
            this.f33401x = aVar;
            this.f33402y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f33400w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f33401x, this.f33402y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f33403w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f33403w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f33403w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f33403w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33404w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f33404w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f33404w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33405w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33406x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33407y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f33408z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f33405w = aVar;
            this.f33406x = aVar2;
            this.f33407y = aVar3;
            this.f33408z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f33405w;
            vq.a aVar2 = this.f33406x;
            io.a aVar3 = this.f33407y;
            xq.a aVar4 = this.f33408z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.n.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33409w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar) {
            super(0);
            this.f33409w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f33409w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f33410w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Fragment fragment) {
            super(0);
            this.f33410w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f33410w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f33410w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33411w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar) {
            super(0);
            this.f33411w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f33411w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33412w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33413x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33414y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f33415z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f33412w = aVar;
            this.f33413x = aVar2;
            this.f33414y = aVar3;
            this.f33415z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f33412w;
            vq.a aVar2 = this.f33413x;
            io.a aVar3 = this.f33414y;
            xq.a aVar4 = this.f33415z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(v4.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33416w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(io.a aVar) {
            super(0);
            this.f33416w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f33416w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public k0() {
        k kVar = new k(this);
        xq.a a10 = gq.a.a(this);
        l lVar = new l(kVar);
        this.f33376y0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.n.class), new n(lVar), new m(kVar, null, null, a10));
        o oVar = new o(this);
        xq.a a11 = gq.a.a(this);
        p pVar = new p(oVar);
        this.f33377z0 = androidx.fragment.app.e0.a(this, jo.f0.b(v4.class), new r(pVar), new q(oVar, null, null, a11));
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.A0 = wn.g.b(iVar, new g(this, null, null));
        this.B0 = wn.g.b(iVar, new h(this, null, null));
        this.C0 = wn.g.b(iVar, new i(this, null, null));
        this.D0 = wn.g.b(iVar, new j(this, null, null));
        this.E0 = nd.a.a(this);
    }

    public static final void y3(k0 k0Var, View view) {
        jo.p.h(k0Var, "this$0");
        qd.a aVar = k0Var.F0;
        if (aVar != null) {
            aVar.finish();
        }
    }

    public final void A3(s6 s6Var) {
        this.E0.a(this, H0[0], s6Var);
    }

    public final void B3() {
        String shareText;
        GiftboxGachaExecuteResponse o10 = u3().o();
        if (o10 == null || (shareText = o10.getShareText()) == null) {
            return;
        }
        f3(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", shareText), U0(f1.f41999y1)).addFlags(268435456));
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        s6 T = s6.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(inflater, container, false)");
        A3(T);
        View u10 = s3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        this.F0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        List<GiftboxGachaResultSpecialGachaItem> k10;
        GiftboxGachaResult result;
        GiftboxGachaResult result2;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        AppCompatImageView appCompatImageView = s3().M;
        jo.p.g(appCompatImageView, "binding.presentImageView");
        GiftboxGachaExecuteResponse o10 = u3().o();
        td.a.f(appCompatImageView, (o10 == null || (result2 = o10.getResult()) == null) ? null : result2.getGiftboxGachaItemUrl());
        AppCompatTextView appCompatTextView = s3().N;
        GiftboxGachaExecuteResponse o11 = u3().o();
        appCompatTextView.setText((o11 == null || (result = o11.getResult()) == null) ? null : result.getGiftboxGachaItemName());
        s3().C.setOnClickListener(new View.OnClickListener() { // from class: gf.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k0.y3(k0.this, view2);
            }
        });
        s3().E.setAnimation(AnimationUtils.loadAnimation(N2(), nd.v0.giftbox_gacha_result_rotate_animation));
        GiftboxGachaExecuteResponse o12 = u3().o();
        int i10 = o12 != null && o12.getAppealShare() == 1 ? 0 : 8;
        s3().B.setVisibility(i10);
        s3().D.setVisibility(i10);
        s3().O.setVisibility(i10);
        s3().J.setVisibility(i10);
        GiftboxGachaExecuteResponse o13 = u3().o();
        if (o13 == null || (k10 = o13.getSpecialGachaItems()) == null) {
            k10 = xn.s.k();
        }
        if (true ^ k10.isEmpty()) {
            s3().G.setVisibility(8);
            s3().T.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
            s3().T.g(new p001if.c(de.e.b(this, 4), 0, 0, 0, 0, 0));
            RecyclerView recyclerView = s3().T;
            rd.e0 e0Var = new rd.e0();
            e0Var.d(k10);
            recyclerView.setAdapter(e0Var);
            AppCompatImageView appCompatImageView2 = s3().W;
            jo.p.g(appCompatImageView2, "binding.specialPromoteTextImageView");
            GiftboxGachaExecuteResponse o14 = u3().o();
            td.a.f(appCompatImageView2, (o14 == null || (r15 = o14.getInvitePromoImageUrl()) == null) ? "" : "");
        } else {
            s3().S.setVisibility(8);
        }
        AppCompatImageView appCompatImageView3 = s3().P;
        jo.p.g(appCompatImageView3, "binding.shareLineImageView");
        g1.a(appCompatImageView3, new b());
        AppCompatImageView appCompatImageView4 = s3().R;
        jo.p.g(appCompatImageView4, "binding.shareTwitterImageView");
        g1.a(appCompatImageView4, new c());
        AppCompatImageView appCompatImageView5 = s3().Q;
        jo.p.g(appCompatImageView5, "binding.shareOthersImageView");
        g1.a(appCompatImageView5, new d());
        z3(MRLog.ACTION_TYPE_GIFT_BOX_GACHA_PRESENT_IMP);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f33375x0.getCoroutineContext();
    }

    public final hf.c r3() {
        return (hf.c) this.B0.getValue();
    }

    public final s6 s3() {
        return (s6) this.E0.b(this, H0[0]);
    }

    public final MRLogger t3() {
        return (MRLogger) this.D0.getValue();
    }

    public final nf.n u3() {
        return (nf.n) this.f33376y0.getValue();
    }

    public final hf.o0 v3() {
        return (hf.o0) this.A0.getValue();
    }

    public final v4 w3() {
        return (v4) this.f33377z0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.F0 = context instanceof qd.a ? (qd.a) context : null;
    }

    public final hf.v0 x3() {
        return (hf.v0) this.C0.getValue();
    }

    public final void z3(String str) {
        GiftboxGachaResult result;
        GiftboxGachaExecuteResponse o10 = u3().o();
        if (o10 == null || (result = o10.getResult()) == null) {
            return;
        }
        MRLogger t32 = t3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(str);
        builder.setTargetId(u3().t());
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new GiftboxGachaTargetDetail(result.getGiftboxItemId(), result.getGiftboxGachaItemName()).toJson())));
        t32.sendLog(builder.build());
    }
}
