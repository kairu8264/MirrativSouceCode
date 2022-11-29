package bc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import bc.q;
import ce.t;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.streaming.emokara.EmokaraSongChoiceFragment;
import com.dena.mirrorman.clientlog.logs.KaraokeActionType;
import com.dena.mirrorman.clientlog.logs.KaraokeLog;
import com.dena.mirrorman.fragment.StreamEmomoCommentFragment;
import com.dena.mirrorman.net.api.response.KaraokeDetail;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingTopUser;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.unity.UnityAnimation;
import com.dena.mirrorman.unity.UnityManager;
import com.dena.mirrorman.widget.KaraokeView;
import ia.a;
import java.util.List;
import lf.a;
import uo.d2;

/* loaded from: classes2.dex */
public final class q extends androidx.fragment.app.e {

    /* renamed from: d1  reason: collision with root package name */
    public static final a f17438d1 = new a(null);

    /* renamed from: e1  reason: collision with root package name */
    public static final int f17439e1 = 8;
    public ac.c0 N0;
    public s O0;
    public je.a P0;
    public final wn.f Q0;
    public final uo.b0 R0;
    public KaraokeDetail S0;
    public jf.v T0;
    public String U0;
    public int V0;
    public lf.a W0;
    public boolean X0;
    public final wn.f Y0;
    public final wn.f Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final wn.f f17440a1;

    /* renamed from: b1  reason: collision with root package name */
    public final wn.f f17441b1;

    /* renamed from: c1  reason: collision with root package name */
    public final b f17442c1;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q a() {
            return new q();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements KaraokeView.b {
        public b() {
        }

        public static final void d(q qVar, int i10) {
            jo.p.h(qVar, "this$0");
            KaraokeDetail karaokeDetail = qVar.S0;
            if (karaokeDetail != null) {
                qVar.V0 = i10 / 1000;
                ac.c0 c0Var = qVar.N0;
                if (c0Var == null) {
                    jo.p.v("binding");
                    c0Var = null;
                }
                c0Var.V.setText(karaokeDetail.getDisplayTimeString(qVar.V0));
            }
        }

        @Override // com.dena.mirrorman.widget.KaraokeView.b
        public void a(final int i10) {
            androidx.fragment.app.h j02 = q.this.j0();
            if (j02 != null) {
                final q qVar = q.this;
                j02.runOnUiThread(new Runnable() { // from class: bc.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.b.d(q.this, i10);
                    }
                });
            }
        }

        @Override // com.dena.mirrorman.widget.KaraokeView.b
        public void b() {
            q.this.U0 = "STATUS_FADE_OUT_KARAOKE";
            q.this.l4();
            q.this.t4(KaraokeLog.SING_END);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            s sVar = q.this.O0;
            if (sVar != null) {
                sVar.x2();
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
            ac.c0 c0Var = q.this.N0;
            ac.c0 c0Var2 = null;
            if (c0Var == null) {
                jo.p.v("binding");
                c0Var = null;
            }
            c0Var.E.setVisibility(0);
            q.this.B4(4);
            q.this.X3();
            ac.c0 c0Var3 = q.this.N0;
            if (c0Var3 == null) {
                jo.p.v("binding");
                c0Var3 = null;
            }
            c0Var3.C.requestFocus();
            of.j jVar = of.j.f45405a;
            Context q02 = q.this.q0();
            ac.c0 c0Var4 = q.this.N0;
            if (c0Var4 == null) {
                jo.p.v("binding");
            } else {
                c0Var2 = c0Var4;
            }
            of.j.e(jVar, q02, c0Var2.C, 0, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            s sVar = q.this.O0;
            if (sVar != null) {
                KaraokeDetail karaokeDetail = q.this.S0;
                jo.p.e(karaokeDetail);
                sVar.r0(karaokeDetail.toKaraoke(), false);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            q.this.X3();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraDialog$postComment$1", f = "EmokaraDialog.kt", l = {364}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17448w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17450y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f17450y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f17450y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r15 = r19
                java.lang.Object r0 = bo.c.c()
                int r1 = r15.f17448w
                r14 = 1
                if (r1 == 0) goto L1e
                if (r1 != r14) goto L16
                wn.m.b(r20)     // Catch: java.lang.Throwable -> L11
                goto L52
            L11:
                r0 = move-exception
                r18 = r14
                r1 = r15
                goto L5c
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1e:
                wn.m.b(r20)
                bc.q r1 = bc.q.this     // Catch: java.lang.Throwable -> L57
                com.dena.mirrorman.net.retrofit.MRRequest r1 = bc.q.N3(r1)     // Catch: java.lang.Throwable -> L57
                java.lang.String r2 = "broadcast"
                bc.q r3 = bc.q.this     // Catch: java.lang.Throwable -> L57
                hf.d0 r3 = bc.q.M3(r3)     // Catch: java.lang.Throwable -> L57
                java.lang.String r3 = r3.c()     // Catch: java.lang.Throwable -> L57
                r4 = 1
                java.lang.String r5 = r15.f17450y     // Catch: java.lang.Throwable -> L57
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r16 = 2032(0x7f0, float:2.847E-42)
                r17 = 0
                r15.f17448w = r14     // Catch: java.lang.Throwable -> L57
                r13 = r19
                r18 = r14
                r14 = r16
                r15 = r17
                java.lang.Object r1 = com.dena.mirrorman.net.retrofit.MRRequest.DefaultImpls.postLiveComment$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L55
                if (r1 != r0) goto L52
                return r0
            L52:
                r1 = r19
                goto Lb3
            L55:
                r0 = move-exception
                goto L5a
            L57:
                r0 = move-exception
                r18 = r14
            L5a:
                r1 = r19
            L5c:
                bc.q r2 = bc.q.this
                ac.c0 r2 = bc.q.I3(r2)
                if (r2 != 0) goto L6a
                java.lang.String r2 = "binding"
                jo.p.v(r2)
                r2 = 0
            L6a:
                android.widget.EditText r2 = r2.C
                java.lang.String r3 = r1.f17450y
                r2.setText(r3)
                com.dena.mirrativ.mirrativapi.core.MRException r0 = com.dena.mirrativ.mirrativapi.core.MRErrorKt.convertMRException(r0)
                com.dena.mirrativ.mirrativapi.core.MRError r0 = r0.getError()
                boolean r2 = r0 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Maintenance
                if (r2 == 0) goto L80
                r14 = r18
                goto L86
            L80:
                com.dena.mirrativ.mirrativapi.core.MRError$ForceUpdate r2 = com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate.INSTANCE
                boolean r14 = jo.p.c(r0, r2)
            L86:
                if (r14 == 0) goto L94
                of.n r2 = of.n.f45411a
                bc.q r3 = bc.q.this
                android.content.Context r3 = r3.q0()
                r2.l(r3, r0)
                goto Lb3
            L94:
                of.n r2 = of.n.f45411a
                bc.q r3 = bc.q.this
                android.content.Context r3 = r3.q0()
                java.lang.String r0 = r0.getMessage()
                if (r0 != 0) goto Laf
                bc.q r0 = bc.q.this
                int r4 = xb.r.f60070c
                java.lang.String r0 = r0.U0(r4)
                java.lang.String r4 = "getString(R.string.error_access)"
                jo.p.g(r0, r4)
            Laf:
                r4 = 0
                r2.B(r3, r0, r4)
            Lb3:
                wn.v r0 = wn.v.f59242a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bc.q.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<wn.v> {
        public h() {
            super(0);
        }

        public final void a() {
            if (q.this.X0) {
                return;
            }
            s sVar = q.this.O0;
            if (sVar != null) {
                sVar.z();
            }
            q.this.X0 = true;
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<wn.v> {
        public i() {
            super(0);
        }

        public final void a() {
            s sVar = q.this.O0;
            if (sVar != null) {
                sVar.m0();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17453w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17454x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17455y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17453w = componentCallbacks;
            this.f17454x = aVar;
            this.f17455y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            ComponentCallbacks componentCallbacks = this.f17453w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.r.class), this.f17454x, this.f17455y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17456w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17457x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17458y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17456w = componentCallbacks;
            this.f17457x = aVar;
            this.f17458y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f17456w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRRequest.class), this.f17457x, this.f17458y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17459w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17460x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17461y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17459w = componentCallbacks;
            this.f17460x = aVar;
            this.f17461y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f17459w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.d0.class), this.f17460x, this.f17461y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<kf.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17462w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17463x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17464y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17462w = componentCallbacks;
            this.f17463x = aVar;
            this.f17464y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.v, java.lang.Object] */
        @Override // io.a
        public final kf.v invoke() {
            ComponentCallbacks componentCallbacks = this.f17462w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.v.class), this.f17463x, this.f17464y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<hf.q> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17465w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17466x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17467y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17465w = componentCallbacks;
            this.f17466x = aVar;
            this.f17467y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.q, java.lang.Object] */
        @Override // io.a
        public final hf.q invoke() {
            ComponentCallbacks componentCallbacks = this.f17465w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.q.class), this.f17466x, this.f17467y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o implements ia.a {
        public o() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            q.this.l4();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p implements ia.a {
        public p() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            q.this.l4();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    public q() {
        uo.b0 b10;
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q0 = wn.g.b(iVar, new j(this, null, null));
        b10 = uo.i2.b(null, 1, null);
        this.R0 = b10;
        this.U0 = "STATUS_INIT";
        this.Y0 = wn.g.b(iVar, new k(this, null, null));
        this.Z0 = wn.g.b(iVar, new l(this, null, null));
        this.f17440a1 = wn.g.b(iVar, new m(this, null, null));
        this.f17441b1 = wn.g.b(iVar, new n(this, null, null));
        this.f17442c1 = new b();
    }

    public static final void g4(q qVar) {
        jo.p.h(qVar, "this$0");
        ac.c0 c0Var = qVar.N0;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        c0Var.L.setVisibility(8);
    }

    public static final boolean i4(q qVar, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        jo.p.h(qVar, "this$0");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            ac.c0 c0Var = qVar.N0;
            if (c0Var == null) {
                jo.p.v("binding");
                c0Var = null;
            }
            if (c0Var.E.getVisibility() == 4) {
                qVar.j4();
                return true;
            }
            qVar.Y3();
            return true;
        }
        return false;
    }

    public static final void n4(q qVar, View view) {
        jo.p.h(qVar, "this$0");
        s sVar = qVar.O0;
        if (sVar != null) {
            sVar.F2();
        }
    }

    public static final boolean o4(q qVar, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(qVar, "this$0");
        if (i10 == 4) {
            ac.c0 c0Var = qVar.N0;
            if (c0Var == null) {
                jo.p.v("binding");
                c0Var = null;
            }
            qVar.q4(c0Var.C.getText().toString());
            qVar.Y3();
            return true;
        }
        return false;
    }

    public static final void p4(q qVar, View view) {
        jo.p.h(qVar, "this$0");
        ac.c0 c0Var = qVar.N0;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        qVar.q4(c0Var.C.getText().toString());
        qVar.Y3();
    }

    public static final void v4(q qVar) {
        jo.p.h(qVar, "this$0");
        ac.c0 c0Var = qVar.N0;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        c0Var.L.setVisibility(0);
    }

    public final void A4() {
        lf.a aVar = this.W0;
        if (aVar != null) {
            aVar.a(N2());
            this.W0 = null;
        }
    }

    public final void B4(int i10) {
        ac.c0 c0Var = this.N0;
        ac.c0 c0Var2 = null;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        c0Var.D.setVisibility(i10);
        if (i10 == 4) {
            ac.c0 c0Var3 = this.N0;
            if (c0Var3 == null) {
                jo.p.v("binding");
                c0Var3 = null;
            }
            c0Var3.B.setVisibility(8);
            ac.c0 c0Var4 = this.N0;
            if (c0Var4 == null) {
                jo.p.v("binding");
                c0Var4 = null;
            }
            c0Var4.J.setVisibility(8);
        } else {
            ac.c0 c0Var5 = this.N0;
            if (c0Var5 == null) {
                jo.p.v("binding");
                c0Var5 = null;
            }
            c0Var5.B.setVisibility(i10);
            ac.c0 c0Var6 = this.N0;
            if (c0Var6 == null) {
                jo.p.v("binding");
                c0Var6 = null;
            }
            c0Var6.J.setVisibility(i10);
        }
        ac.c0 c0Var7 = this.N0;
        if (c0Var7 == null) {
            jo.p.v("binding");
            c0Var7 = null;
        }
        c0Var7.W.setVisibility(i10);
        ac.c0 c0Var8 = this.N0;
        if (c0Var8 == null) {
            jo.p.v("binding");
            c0Var8 = null;
        }
        c0Var8.U.setVisibility(i10);
        ac.c0 c0Var9 = this.N0;
        if (c0Var9 == null) {
            jo.p.v("binding");
            c0Var9 = null;
        }
        c0Var9.V.setVisibility(i10);
        ac.c0 c0Var10 = this.N0;
        if (c0Var10 == null) {
            jo.p.v("binding");
            c0Var10 = null;
        }
        c0Var10.T.setVisibility(i10);
        if (b4().e()) {
            ac.c0 c0Var11 = this.N0;
            if (c0Var11 == null) {
                jo.p.v("binding");
            } else {
                c0Var2 = c0Var11;
            }
            c0Var2.P.setVisibility(i10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ac.c0 c0Var = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), xb.p.dialog_fragment_emokara, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        ac.c0 c0Var2 = (ac.c0) e10;
        this.N0 = c0Var2;
        if (c0Var2 == null) {
            jo.p.v("binding");
        } else {
            c0Var = c0Var2;
        }
        View u10 = c0Var.u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        ac.c0 c0Var = this.N0;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        c0Var.M.v();
        d2.a.a(this.R0, null, 1, null);
        A4();
        s4();
        super.F1();
    }

    public final void G() {
        List<Fragment> p02;
        FragmentManager A0 = A0();
        if (A0 == null || (p02 = A0.p0()) == null) {
            return;
        }
        for (Fragment fragment : p02) {
            if (fragment instanceof NavHostFragment) {
                List<Fragment> p03 = ((NavHostFragment) fragment).p0().p0();
                jo.p.g(p03, "it.childFragmentManager.fragments");
                for (Fragment fragment2 : p03) {
                    if (fragment2 instanceof d0) {
                        ((d0) fragment2).G();
                    } else if (fragment2 instanceof EmokaraSongChoiceFragment) {
                        List<Fragment> p04 = ((EmokaraSongChoiceFragment) fragment2).p0().p0();
                        jo.p.g(p04, "fragment.childFragmentManager.fragments");
                        for (Fragment fragment3 : p04) {
                            if (fragment3 instanceof d0) {
                                ((d0) fragment3).G();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        s sVar = this.O0;
        if (sVar != null) {
            sVar.z1();
        }
        this.O0 = null;
        this.P0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void S1() {
        Y3();
        ac.c0 c0Var = this.N0;
        ac.c0 c0Var2 = null;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        if (c0Var.N.getVisibility() == 0) {
            ac.c0 c0Var3 = this.N0;
            if (c0Var3 == null) {
                jo.p.v("binding");
                c0Var3 = null;
            }
            c0Var3.N.setVisibility(8);
            ac.c0 c0Var4 = this.N0;
            if (c0Var4 == null) {
                jo.p.v("binding");
            } else {
                c0Var2 = c0Var4;
            }
            c0Var2.M.v();
            s sVar = this.O0;
            if (sVar != null) {
                sVar.r();
            }
            s sVar2 = this.O0;
            if (sVar2 != null) {
                sVar2.H();
            }
            t4(KaraokeLog.ENTER_BACKGROUND);
        }
        super.S1();
    }

    public final void V3(int i10) {
        ac.c0 c0Var = this.N0;
        if (c0Var == null) {
            return;
        }
        if (c0Var == null) {
            try {
                jo.p.v("binding");
                c0Var = null;
            } catch (IllegalStateException unused) {
                s sVar = this.O0;
                if (sVar != null) {
                    sVar.M();
                    return;
                }
                return;
            }
        }
        c0Var.M.setPitchLevel(i10);
        G();
    }

    public final void W3(int i10) {
        ac.c0 c0Var = this.N0;
        if (c0Var == null) {
            return;
        }
        ac.c0 c0Var2 = null;
        if (c0Var == null) {
            try {
                jo.p.v("binding");
                c0Var = null;
            } catch (IllegalStateException unused) {
                s sVar = this.O0;
                if (sVar != null) {
                    sVar.M();
                    return;
                }
                return;
            }
        }
        c0Var.M.setSpeedLevel(i10);
        KaraokeDetail karaokeDetail = this.S0;
        if (karaokeDetail != null) {
            float bpm = karaokeDetail.getBpm();
            ac.c0 c0Var3 = this.N0;
            if (c0Var3 == null) {
                jo.p.v("binding");
            } else {
                c0Var2 = c0Var3;
            }
            float speed = bpm * c0Var2.M.getSpeed();
            s sVar2 = this.O0;
            if (sVar2 != null) {
                sVar2.N1(speed);
            }
        }
        G();
    }

    public final void X3() {
        ac.c0 c0Var = this.N0;
        ac.c0 c0Var2 = null;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        AppCompatButton appCompatButton = c0Var.S;
        ac.c0 c0Var3 = this.N0;
        if (c0Var3 == null) {
            jo.p.v("binding");
        } else {
            c0Var2 = c0Var3;
        }
        Editable text = c0Var2.C.getText();
        appCompatButton.setEnabled(!(text == null || text.length() == 0));
    }

    public final void Y3() {
        ac.c0 c0Var = this.N0;
        ac.c0 c0Var2 = null;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        c0Var.E.setVisibility(4);
        B4(0);
        of.j jVar = of.j.f45405a;
        Context q02 = q0();
        ac.c0 c0Var3 = this.N0;
        if (c0Var3 == null) {
            jo.p.v("binding");
        } else {
            c0Var2 = c0Var3;
        }
        jVar.c(q02, c0Var2.C);
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        if (e4().G4()) {
            s sVar = this.O0;
            if (sVar != null) {
                sVar.z();
                return;
            }
            return;
        }
        r4();
    }

    public final void Z3() {
        if (this.N0 == null) {
            return;
        }
        this.U0 = "STATUS_FADE_OUT_KARAOKE";
        l4();
        t4(KaraokeLog.USER_TERMINATED);
    }

    public final hf.q a4() {
        return (hf.q) this.f17441b1.getValue();
    }

    public final hf.r b4() {
        return (hf.r) this.Q0.getValue();
    }

    public final hf.d0 c4() {
        return (hf.d0) this.Z0.getValue();
    }

    public final MRRequest d4() {
        return (MRRequest) this.Y0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ac.c0 c0Var = this.N0;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        c0Var.P.setVisibility(0);
        ac.c0 c0Var2 = this.N0;
        if (c0Var2 == null) {
            jo.p.v("binding");
            c0Var2 = null;
        }
        c0Var2.P.setOnClickListener(new View.OnClickListener() { // from class: bc.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q.n4(q.this, view2);
            }
        });
        ac.c0 c0Var3 = this.N0;
        if (c0Var3 == null) {
            jo.p.v("binding");
            c0Var3 = null;
        }
        c0Var3.E.setVisibility(4);
        ac.c0 c0Var4 = this.N0;
        if (c0Var4 == null) {
            jo.p.v("binding");
            c0Var4 = null;
        }
        c0Var4.N.setVisibility(8);
        ac.c0 c0Var5 = this.N0;
        if (c0Var5 == null) {
            jo.p.v("binding");
            c0Var5 = null;
        }
        AppCompatButton appCompatButton = c0Var5.B;
        jo.p.g(appCompatButton, "binding.closeButton");
        yd.g1.a(appCompatButton, new c());
        ac.c0 c0Var6 = this.N0;
        if (c0Var6 == null) {
            jo.p.v("binding");
            c0Var6 = null;
        }
        AppCompatButton appCompatButton2 = c0Var6.D;
        jo.p.g(appCompatButton2, "binding.commentButton");
        yd.g1.a(appCompatButton2, new d());
        ac.c0 c0Var7 = this.N0;
        if (c0Var7 == null) {
            jo.p.v("binding");
            c0Var7 = null;
        }
        AppCompatButton appCompatButton3 = c0Var7.T;
        jo.p.g(appCompatButton3, "binding.settingButton");
        yd.g1.a(appCompatButton3, new e());
        ac.c0 c0Var8 = this.N0;
        if (c0Var8 == null) {
            jo.p.v("binding");
            c0Var8 = null;
        }
        c0Var8.D.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: bc.n
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean o42;
                o42 = q.o4(q.this, textView, i10, keyEvent);
                return o42;
            }
        });
        ac.c0 c0Var9 = this.N0;
        if (c0Var9 == null) {
            jo.p.v("binding");
            c0Var9 = null;
        }
        c0Var9.C.addTextChangedListener(new f());
        ac.c0 c0Var10 = this.N0;
        if (c0Var10 == null) {
            jo.p.v("binding");
            c0Var10 = null;
        }
        c0Var10.S.setOnClickListener(new View.OnClickListener() { // from class: bc.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q.p4(q.this, view2);
            }
        });
        ac.c0 c0Var11 = this.N0;
        if (c0Var11 == null) {
            jo.p.v("binding");
            c0Var11 = null;
        }
        c0Var11.G.setEmomoMotionViewListener(this.P0);
        androidx.fragment.app.z k10 = p0().k();
        ac.c0 c0Var12 = this.N0;
        if (c0Var12 == null) {
            jo.p.v("binding");
            c0Var12 = null;
        }
        k10.r(c0Var12.F.getId(), StreamEmomoCommentFragment.a.b(StreamEmomoCommentFragment.B0, false, 1, null)).i();
        u4();
    }

    public final kf.v e4() {
        return (kf.v) this.f17440a1.getValue();
    }

    public final void f4() {
        androidx.fragment.app.h j02 = j0();
        if (j02 != null) {
            j02.runOnUiThread(new Runnable() { // from class: bc.o
                @Override // java.lang.Runnable
                public final void run() {
                    q.g4(q.this);
                }
            });
        }
        s4();
    }

    public final boolean h4() {
        ac.c0 c0Var = this.N0;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        return c0Var.L.getVisibility() == 0;
    }

    public final boolean j4() {
        Fragment d02;
        wn.v vVar;
        s sVar;
        if (h4()) {
            FragmentManager A0 = A0();
            if (A0 != null && (d02 = A0.d0(xb.o.V5)) != null) {
                View Z0 = d02.Z0();
                if (Z0 != null) {
                    if (!androidx.navigation.w.b(Z0).t() && (sVar = this.O0) != null) {
                        sVar.H();
                    }
                    vVar = wn.v.f59242a;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    return false;
                }
            }
            s sVar2 = this.O0;
            if (sVar2 != null) {
                sVar2.H();
                wn.v vVar2 = wn.v.f59242a;
                return false;
            }
            return false;
        }
        s sVar3 = this.O0;
        if (sVar3 != null) {
            sVar3.x2();
            return false;
        }
        return false;
    }

    public final void k4() {
        if (this.N0 == null) {
            return;
        }
        t4(KaraokeLog.FME_FAILURE);
    }

    public final void l4() {
        s sVar;
        s sVar2;
        String str = this.U0;
        ac.c0 c0Var = null;
        switch (str.hashCode()) {
            case -1735741467:
                if (str.equals("STATUS_FADE_OUT_LIST")) {
                    KaraokeDetail karaokeDetail = this.S0;
                    if (karaokeDetail != null && (sVar = this.O0) != null) {
                        sVar.N(karaokeDetail.getBgUrl(), karaokeDetail.getBpm());
                    }
                    this.U0 = "STATUS_FADE_OUTED_LIST";
                    x4();
                    return;
                }
                return;
            case -244573463:
                if (str.equals("STATUS_SHOWN_KARAOKE")) {
                    y4();
                    UnityManager.setAnimation$default(UnityManager.Companion.getInstance(), UnityAnimation.EMOKARA_ENTER, 0, 2, null);
                    return;
                }
                return;
            case 199855621:
                if (str.equals("STATUS_FINISH_KARAOKE") && (sVar2 = this.O0) != null) {
                    sVar2.H();
                    return;
                }
                return;
            case 223720636:
                if (str.equals("STATUS_FADE_OUTED_KARAOKE")) {
                    s sVar3 = this.O0;
                    if (sVar3 != null) {
                        sVar3.r();
                    }
                    s sVar4 = this.O0;
                    if (sVar4 != null) {
                        sVar4.m0();
                    }
                    this.U0 = "STATUS_FINISH_KARAOKE";
                    w4();
                    return;
                }
                return;
            case 814252317:
                if (str.equals("STATUS_FADE_OUT_KARAOKE")) {
                    ac.c0 c0Var2 = this.N0;
                    if (c0Var2 == null) {
                        jo.p.v("binding");
                        c0Var2 = null;
                    }
                    c0Var2.N.setVisibility(8);
                    this.U0 = "STATUS_FADE_OUTED_KARAOKE";
                    UnityManager.setAnimation$default(UnityManager.Companion.getInstance(), UnityAnimation.EMOKARA_EXIT, 0, 2, null);
                    x4();
                    ac.c0 c0Var3 = this.N0;
                    if (c0Var3 == null) {
                        jo.p.v("binding");
                    } else {
                        c0Var = c0Var3;
                    }
                    c0Var.M.v();
                    return;
                }
                return;
            case 885536934:
                if (str.equals("STATUS_FADE_OUTED_LIST")) {
                    f4();
                    ac.c0 c0Var4 = this.N0;
                    if (c0Var4 == null) {
                        jo.p.v("binding");
                    } else {
                        c0Var = c0Var4;
                    }
                    c0Var.N.setVisibility(0);
                    this.U0 = "STATUS_SHOWN_KARAOKE";
                    w4();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void m4(GiftRankingTopUser giftRankingTopUser) {
        jo.p.h(giftRankingTopUser, "giftRankingTopUser");
        ac.c0 c0Var = this.N0;
        if (c0Var == null) {
            return;
        }
        ac.c0 c0Var2 = null;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        AppCompatImageView appCompatImageView = c0Var.R;
        if (TextUtils.isEmpty(giftRankingTopUser.getUserId())) {
            appCompatImageView.setImageResource(xb.n.ic_avatar_ranking_none);
            ac.c0 c0Var3 = this.N0;
            if (c0Var3 == null) {
                jo.p.v("binding");
            } else {
                c0Var2 = c0Var3;
            }
            c0Var2.Q.setVisibility(8);
            return;
        }
        Context q02 = q0();
        if (q02 != null) {
            GlideApp.with(q02).load(giftRankingTopUser.getIconUrl()).placeholder(xb.n.f59961g0).apply((e8.a<?>) new e8.h().circleCrop()).into(appCompatImageView);
            ac.c0 c0Var4 = this.N0;
            if (c0Var4 == null) {
                jo.p.v("binding");
            } else {
                c0Var2 = c0Var4;
            }
            c0Var2.Q.setVisibility(0);
        }
    }

    public final void q4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ac.c0 c0Var = this.N0;
        if (c0Var == null) {
            jo.p.v("binding");
            c0Var = null;
        }
        Editable editableText = c0Var.C.getEditableText();
        if (editableText != null) {
            editableText.clear();
        }
        uo.l.d(uo.r0.a(uo.g1.c().plus(this.R0)), null, null, new g(str, null), 3, null);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        return new Dialog(N2(), 16973913);
    }

    public final void r4() {
        a.C0576a c0576a = lf.a.f40131c;
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        this.W0 = c0576a.b(N2, new h(), new i());
    }

    public final void s4() {
        Fragment d02 = O2().d0(xb.o.V5);
        if (d02 != null) {
            androidx.fragment.app.z k10 = O2().k();
            k10.q(d02);
            k10.j();
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void t1(Bundle bundle) {
        Window window;
        super.t1(bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 != null) {
            p33.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: bc.k
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                    boolean i42;
                    i42 = q.i4(q.this, dialogInterface, i10, keyEvent);
                    return i42;
                }
            });
        }
        dq.c.c().l(t.h.f19479a);
    }

    public final void t4(String str) {
        KaraokeDetail karaokeDetail = this.S0;
        if (karaokeDetail != null) {
            Puree.d(new KaraokeLog(KaraokeActionType.SING_END, c4().c(), str, null, karaokeDetail.getSingEndLogJson(this.V0), null, null, 104, null));
            Puree.b();
        }
    }

    public final void u4() {
        androidx.fragment.app.h j02 = j0();
        if (j02 != null) {
            j02.runOnUiThread(new Runnable() { // from class: bc.p
                @Override // java.lang.Runnable
                public final void run() {
                    q.v4(q.this);
                }
            });
        }
    }

    public final void w4() {
        Context q02 = q0();
        if (q02 != null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(q02, xb.j.f59916d);
            loadAnimation.setDuration(1000L);
            loadAnimation.setAnimationListener(new o());
            loadAnimation.setFillBefore(true);
            loadAnimation.setFillAfter(true);
            loadAnimation.setFillEnabled(true);
            ac.c0 c0Var = this.N0;
            ac.c0 c0Var2 = null;
            if (c0Var == null) {
                jo.p.v("binding");
                c0Var = null;
            }
            c0Var.O.setVisibility(0);
            ac.c0 c0Var3 = this.N0;
            if (c0Var3 == null) {
                jo.p.v("binding");
            } else {
                c0Var2 = c0Var3;
            }
            c0Var2.O.startAnimation(loadAnimation);
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.O0 = context instanceof s ? (s) context : null;
        this.P0 = context instanceof je.a ? (je.a) context : null;
    }

    public final void x4() {
        Context q02 = q0();
        if (q02 != null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(q02, xb.j.f59915c);
            loadAnimation.setDuration(1000L);
            loadAnimation.setAnimationListener(new p());
            ac.c0 c0Var = this.N0;
            ac.c0 c0Var2 = null;
            if (c0Var == null) {
                jo.p.v("binding");
                c0Var = null;
            }
            c0Var.O.setVisibility(0);
            ac.c0 c0Var3 = this.N0;
            if (c0Var3 == null) {
                jo.p.v("binding");
            } else {
                c0Var2 = c0Var3;
            }
            c0Var2.O.startAnimation(loadAnimation);
        }
    }

    public final void y4() {
        KaraokeDetail karaokeDetail = this.S0;
        if (karaokeDetail != null) {
            ac.c0 c0Var = this.N0;
            ac.c0 c0Var2 = null;
            if (c0Var == null) {
                jo.p.v("binding");
                c0Var = null;
            }
            c0Var.W.setText(karaokeDetail.getTitle());
            ac.c0 c0Var3 = this.N0;
            if (c0Var3 == null) {
                jo.p.v("binding");
                c0Var3 = null;
            }
            c0Var3.U.setText(karaokeDetail.getSingerName());
            ac.c0 c0Var4 = this.N0;
            if (c0Var4 == null) {
                jo.p.v("binding");
                c0Var4 = null;
            }
            c0Var4.V.setText(karaokeDetail.getDisplayTimeString(0));
            ac.c0 c0Var5 = this.N0;
            if (c0Var5 == null) {
                jo.p.v("binding");
                c0Var5 = null;
            }
            c0Var5.M.setOnKaraokeListener(this.f17442c1);
            jf.v vVar = this.T0;
            if (vVar != null) {
                ac.c0 c0Var6 = this.N0;
                if (c0Var6 == null) {
                    jo.p.v("binding");
                    c0Var6 = null;
                }
                KaraokeView karaokeView = c0Var6.M;
                String oggUrl = karaokeDetail.getOggUrl();
                hf.q a42 = a4();
                KaraokeDetail karaokeDetail2 = this.S0;
                jo.p.e(karaokeDetail2);
                int d10 = a42.d(karaokeDetail2.getId());
                hf.q a43 = a4();
                KaraokeDetail karaokeDetail3 = this.S0;
                jo.p.e(karaokeDetail3);
                karaokeView.q(vVar, oggUrl, d10, a43.b(karaokeDetail3.getId()));
                float bpm = karaokeDetail.getBpm();
                ac.c0 c0Var7 = this.N0;
                if (c0Var7 == null) {
                    jo.p.v("binding");
                } else {
                    c0Var2 = c0Var7;
                }
                float speed = bpm * c0Var2.M.getSpeed();
                s sVar = this.O0;
                if (sVar != null) {
                    sVar.N1(speed);
                }
            }
        }
    }

    public final void z4(KaraokeDetail karaokeDetail, jf.v vVar) {
        jo.p.h(karaokeDetail, "karaokeDetail");
        jo.p.h(vVar, "karaokeModel");
        if (this.N0 == null) {
            return;
        }
        this.S0 = karaokeDetail;
        this.T0 = vVar;
        this.U0 = "STATUS_FADE_OUT_LIST";
        l4();
    }
}
