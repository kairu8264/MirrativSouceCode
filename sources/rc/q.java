package rc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import be.u2;
import be.v2;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.api.response.AppCampaign;
import com.dena.mirrorman.util.FragmentRunner;
import java.util.List;
import kq.a;
import rc.s;

/* loaded from: classes2.dex */
public final class q extends androidx.fragment.app.e implements sc.j, v2, uo.q0 {
    public static final a W0 = new a(null);
    public static final int X0 = 8;
    public final /* synthetic */ da.j N0 = new da.j();
    public pc.w0 O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final FragmentRunner T0;
    public final wn.f U0;
    public final wn.f V0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q a(String str, String str2, String str3, String str4, String str5) {
            jo.p.h(str, "referer");
            jo.p.h(str2, "appId");
            jo.p.h(str3, "appIconUrl");
            jo.p.h(str4, "appTitle");
            jo.p.h(str5, "shortTitle");
            q qVar = new q();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_REFERER", str);
            bundle.putParcelable("EXTRA_LIVE_APP_SETTING", new jf.w(str2, str3, str4, str5));
            qVar.V2(bundle);
            return qVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<jf.w> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final jf.w invoke() {
            Parcelable parcelable = q.this.M2().getParcelable("EXTRA_LIVE_APP_SETTING");
            jo.p.e(parcelable);
            return (jf.w) parcelable;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.LiveAnnounceSettingDialog$observeStoreValues$9", f = "LiveAnnounceSettingDialog.kt", l = {285}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50841w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50842x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50843y;

        /* renamed from: z  reason: collision with root package name */
        public int f50844z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q f50845w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q qVar) {
                super(0);
                this.f50845w = qVar;
            }

            public final void a() {
                s.a aVar = s.O0;
                Integer f10 = this.f50845w.X3().p().f();
                aVar.a(f10 == null || f10.intValue() != 0).z3(this.f50845w.O2(), "LiveAnnounceSettingSuccessDialog");
                this.f50845w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
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
                int r1 = r8.f50844z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f50843y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f50842x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f50841w
                rc.q r4 = (rc.q) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7d
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
                rc.q r9 = rc.q.this
                rc.u r9 = rc.q.R3(r9)
                wo.x r3 = r9.o()
                rc.q r9 = rc.q.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7d
                r4 = r9
                r9 = r8
            L3d:
                r9.f50841w = r4     // Catch: java.lang.Throwable -> L7d
                r9.f50842x = r3     // Catch: java.lang.Throwable -> L7d
                r9.f50843y = r1     // Catch: java.lang.Throwable -> L7d
                r9.f50844z = r2     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7d
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7a
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7a
                if (r9 == 0) goto L74
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L7a
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrorman.util.FragmentRunner r9 = rc.q.P3(r5)     // Catch: java.lang.Throwable -> L7a
                rc.q$c$a r6 = new rc.q$c$a     // Catch: java.lang.Throwable -> L7a
                r6.<init>(r5)     // Catch: java.lang.Throwable -> L7a
                r9.c(r6)     // Catch: java.lang.Throwable -> L7a
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L74:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L7a:
                r9 = move-exception
                r3 = r4
                goto L7e
            L7d:
                r9 = move-exception
            L7e:
                throw r9     // Catch: java.lang.Throwable -> L7f
            L7f:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rc.q.c.invokeSuspend(java.lang.Object):java.lang.Object");
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
            String string = q.this.M2().getString("EXTRA_REFERER");
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
            String f10 = q.this.X3().i().f();
            if (f10 == null) {
                f10 = "";
            }
            String str = f10;
            Integer f11 = q.this.X3().j().f();
            if (f11 == null) {
                f11 = 0;
            }
            int intValue = f11.intValue();
            boolean isChecked = q.this.T3().M.isChecked();
            t S3 = q.this.S3();
            String W3 = q.this.W3();
            jo.p.g(W3, "referer");
            jf.w f12 = q.this.X3().h().f();
            S3.t(W3, str, intValue, isChecked, f12 != null ? f12.b() : null);
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
            q.this.S3().w(q.this.T3().B.getText().toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            u2.a aVar = u2.Z0;
            jf.w f10 = q.this.X3().h().f();
            String b10 = f10 != null ? f10.b() : null;
            List<AppCampaign> f11 = q.this.X3().g().f();
            if (f11 == null) {
                f11 = xn.s.k();
            }
            aVar.a(b10, f11).z3(q.this.p0(), "LiveAppSettingDialog");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50850w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50851x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50852y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50850w = componentCallbacks;
            this.f50851x = aVar;
            this.f50852y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f50850w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.v0.class), this.f50851x, this.f50852y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50853w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50854x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50855y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50853w = componentCallbacks;
            this.f50854x = aVar;
            this.f50855y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f50853w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f50854x, this.f50855y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50856w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f50856w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f50856w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50857w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f50857w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50857w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50858w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50859x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50860y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50861z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50858w = aVar;
            this.f50859x = aVar2;
            this.f50860y = aVar3;
            this.f50861z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50858w;
            vq.a aVar2 = this.f50859x;
            io.a aVar3 = this.f50860y;
            xq.a aVar4 = this.f50861z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(t.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50862w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f50862w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50862w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50863w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Fragment fragment) {
            super(0);
            this.f50863w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f50863w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50864w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f50864w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50864w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50865w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50866x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50867y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50868z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50865w = aVar;
            this.f50866x = aVar2;
            this.f50867y = aVar3;
            this.f50868z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50865w;
            vq.a aVar2 = this.f50866x;
            io.a aVar3 = this.f50867y;
            xq.a aVar4 = this.f50868z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(u.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* renamed from: rc.q$q  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0778q extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50869w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0778q(io.a aVar) {
            super(0);
            this.f50869w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50869w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public q() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new h(this, null, null));
        this.Q0 = wn.g.b(iVar, new i(this, null, null));
        j jVar = new j(this);
        xq.a a10 = gq.a.a(this);
        k kVar = new k(jVar);
        this.R0 = androidx.fragment.app.e0.a(this, jo.f0.b(t.class), new m(kVar), new l(jVar, null, null, a10));
        n nVar = new n(this);
        xq.a a11 = gq.a.a(this);
        o oVar = new o(nVar);
        this.S0 = androidx.fragment.app.e0.a(this, jo.f0.b(u.class), new C0778q(oVar), new p(nVar, null, null, a11));
        this.T0 = new FragmentRunner(this);
        this.U0 = wn.g.a(new d());
        this.V0 = wn.g.a(new b());
    }

    public static final void a4(q qVar, Boolean bool) {
        jo.p.h(qVar, "this$0");
        ProgressBar progressBar = qVar.T3().E;
        jo.p.g(bool, "isProcessing");
        progressBar.setVisibility(bool.booleanValue() ? 0 : 8);
        qVar.T3().F.setEnabled(!bool.booleanValue());
    }

    public static final void b4(q qVar, Boolean bool) {
        jo.p.h(qVar, "this$0");
        ConstraintLayout constraintLayout = qVar.T3().K;
        jo.p.g(bool, "isProcessing");
        constraintLayout.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void c4(q qVar, Integer num) {
        Integer f10;
        jo.p.h(qVar, "this$0");
        boolean z10 = false;
        if (num == null || num.intValue() != 0) {
            qVar.T3().Q.setTextColor(c3.a.d(qVar.N2(), nc.b.darkSkyBlueTwo));
            qVar.T3().Q.setTypeface(Typeface.DEFAULT_BOLD);
            qVar.T3().Q.setTextSize(2, 12.0f);
            AppCompatTextView appCompatTextView = qVar.T3().Q;
            jo.p.g(appCompatTextView, "binding.timeSetTextView");
            td.b.b(appCompatTextView, num);
            qVar.T3().U.setVisibility(0);
        } else {
            qVar.T3().Q.setTextColor(c3.a.d(qVar.N2(), nc.b.f41800t));
            qVar.T3().Q.setTextSize(2, 14.0f);
            qVar.T3().Q.setText(nc.i.text_no_setting);
            qVar.T3().U.setVisibility(8);
        }
        RoundedButtonView roundedButtonView = qVar.T3().F;
        String f11 = qVar.X3().i().f();
        if (!(f11 == null || f11.length() == 0) || (f10 = qVar.X3().j().f()) == null || f10.intValue() != 0) {
            z10 = true;
        }
        roundedButtonView.setEnabled(z10);
    }

    public static final void d4(q qVar, String str) {
        Integer f10;
        jo.p.h(qVar, "this$0");
        if (!jo.p.c(str, qVar.T3().B.getText().toString())) {
            qVar.T3().B.setText(str);
        }
        AppCompatTextView appCompatTextView = qVar.T3().O;
        StringBuilder sb2 = new StringBuilder();
        jo.p.g(str, "text");
        sb2.append(de.l.a(str));
        sb2.append('/');
        sb2.append(qVar.O0().getString(nc.i.limit_next_announce));
        appCompatTextView.setText(sb2.toString());
        RoundedButtonView roundedButtonView = qVar.T3().F;
        boolean z10 = true;
        if (!(str.length() > 0) && (f10 = qVar.X3().j().f()) != null && f10.intValue() == 0) {
            z10 = false;
        }
        roundedButtonView.setEnabled(z10);
    }

    public static final void e4(q qVar, Boolean bool) {
        jo.p.h(qVar, "this$0");
        SwitchCompat switchCompat = qVar.T3().W;
        jo.p.g(bool, "isEnabled");
        switchCompat.setChecked(bool.booleanValue());
        qVar.k4(bool.booleanValue());
    }

    public static final void f4(q qVar, Boolean bool) {
        jo.p.h(qVar, "this$0");
        qVar.T3().W.setEnabled(!bool.booleanValue());
    }

    public static final void g4(q qVar, MRError mRError) {
        jo.p.h(qVar, "this$0");
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(qVar.q0(), mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned) {
            of.n.f45411a.B(qVar.q0(), mRError.getMessage(), false);
        } else if (mRError instanceof MRError.Network) {
            of.n.z(qVar.q0());
        }
    }

    public static final void h4(q qVar, jf.w wVar) {
        jo.p.h(qVar, "this$0");
        AppCompatImageView appCompatImageView = qVar.T3().C;
        jo.p.g(appCompatImageView, "binding.appImageView");
        td.a.n(appCompatImageView, wVar != null ? wVar.a() : null, nc.d.K);
    }

    public static final void m4(q qVar, View view) {
        jo.p.h(qVar, "this$0");
        qVar.n3();
    }

    public static final void n4(q qVar, View view) {
        jo.p.h(qVar, "this$0");
        Integer f10 = qVar.X3().j().f();
        sc.d.R0.a((f10 != null ? f10.intValue() : 0L) * 1000).z3(qVar.p0(), "DatetimePickerDialog");
    }

    public static final void o4(q qVar, CompoundButton compoundButton, boolean z10) {
        jo.p.h(qVar, "this$0");
        qVar.j4(z10);
    }

    public static final void p4(q qVar, CompoundButton compoundButton, boolean z10) {
        jo.p.h(qVar, "this$0");
        t S3 = qVar.S3();
        androidx.fragment.app.h L2 = qVar.L2();
        jo.p.g(L2, "requireActivity()");
        FragmentManager O2 = qVar.O2();
        jo.p.g(O2, "requireFragmentManager()");
        String W3 = qVar.W3();
        jo.p.g(W3, "referer");
        S3.v(z10, L2, O2, W3);
    }

    public static final void q4(q qVar, View view) {
        jo.p.h(qVar, "this$0");
        qVar.S3().x(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        uo.r0.d(this, null, 1, null);
        super.F1();
    }

    @Override // sc.j
    public void I(int i10) {
        S3().x(i10);
    }

    public final t S3() {
        return (t) this.R0.getValue();
    }

    public final pc.w0 T3() {
        pc.w0 w0Var = this.O0;
        if (w0Var != null) {
            return w0Var;
        }
        jo.p.v("binding");
        return null;
    }

    public final jf.w U3() {
        return (jf.w) this.V0.getValue();
    }

    public final MRLogger V3() {
        return (MRLogger) this.Q0.getValue();
    }

    public final String W3() {
        return (String) this.U0.getValue();
    }

    public final u X3() {
        return (u) this.S0.getValue();
    }

    public final hf.v0 Y3() {
        return (hf.v0) this.P0.getValue();
    }

    public final void Z3() {
        X3().m().i(this, new androidx.lifecycle.f0() { // from class: rc.o
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.a4(q.this, (Boolean) obj);
            }
        });
        X3().l().i(this, new androidx.lifecycle.f0() { // from class: rc.p
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.b4(q.this, (Boolean) obj);
            }
        });
        X3().j().i(this, new androidx.lifecycle.f0() { // from class: rc.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.c4(q.this, (Integer) obj);
            }
        });
        X3().i().i(this, new androidx.lifecycle.f0() { // from class: rc.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.d4(q.this, (String) obj);
            }
        });
        X3().q().i(this, new androidx.lifecycle.f0() { // from class: rc.n
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.e4(q.this, (Boolean) obj);
            }
        });
        X3().n().i(this, new androidx.lifecycle.f0() { // from class: rc.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.f4(q.this, (Boolean) obj);
            }
        });
        X3().k().i(this, new androidx.lifecycle.f0() { // from class: rc.l
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.g4(q.this, (MRError) obj);
            }
        });
        X3().h().i(this, new androidx.lifecycle.f0() { // from class: rc.m
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.h4(q.this, (jf.w) obj);
            }
        });
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    public final void i4(pc.w0 w0Var) {
        jo.p.h(w0Var, "<set-?>");
        this.O0 = w0Var;
    }

    public final void j4(boolean z10) {
        if (z10) {
            T3().L.getImageTintList();
            AppCompatImageView appCompatImageView = T3().L;
            Context N2 = N2();
            int i10 = nc.b.f41804x;
            appCompatImageView.setColorFilter(c3.a.d(N2, i10));
            T3().N.setTextColor(c3.a.d(N2(), i10));
            return;
        }
        AppCompatImageView appCompatImageView2 = T3().L;
        Context N22 = N2();
        int i11 = nc.b.f41793d;
        appCompatImageView2.setColorFilter(c3.a.d(N22, i11));
        T3().N.setTextColor(c3.a.d(N2(), i11));
    }

    public final void k4(boolean z10) {
        if (z10) {
            T3().V.setColorFilter(c3.a.d(N2(), nc.b.f41796m));
            T3().X.setTextColor(c3.a.d(N2(), nc.b.f41804x));
            return;
        }
        AppCompatImageView appCompatImageView = T3().V;
        Context N2 = N2();
        int i10 = nc.b.f41793d;
        appCompatImageView.setColorFilter(c3.a.d(N2, i10));
        T3().X.setTextColor(c3.a.d(N2(), i10));
    }

    public final void l4() {
        T3().I.setOnClickListener(new View.OnClickListener() { // from class: rc.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.m4(q.this, view);
            }
        });
        RoundedButtonView roundedButtonView = T3().F;
        jo.p.g(roundedButtonView, "binding.applyButtonTextView");
        yd.g1.a(roundedButtonView, new e());
        T3().B.setText(X3().i().f());
        EditText editText = T3().B;
        boolean z10 = false;
        editText.setHorizontallyScrolling(false);
        editText.setMaxLines(4);
        T3().R.setOnClickListener(new View.OnClickListener() { // from class: rc.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.n4(q.this, view);
            }
        });
        T3().B.addTextChangedListener(new f());
        EditText editText2 = T3().B;
        Integer valueOf = Integer.valueOf(O0().getString(nc.i.limit_next_announce));
        jo.p.g(valueOf, "valueOf(resources.getStr…ing.limit_next_announce))");
        editText2.setFilters(new sf.b[]{new sf.b(valueOf.intValue())});
        T3().M.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rc.k
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                q.o4(q.this, compoundButton, z11);
            }
        });
        T3().M.setChecked(true);
        j4(true);
        T3().W.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rc.j
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                q.p4(q.this, compoundButton, z11);
            }
        });
        if (Y3().p() && jo.p.c(X3().q().f(), Boolean.TRUE)) {
            z10 = true;
        }
        T3().W.setChecked(z10);
        k4(z10);
        T3().U.setOnClickListener(new View.OnClickListener() { // from class: rc.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.q4(q.this, view);
            }
        });
        AppCompatImageView appCompatImageView = T3().C;
        jo.p.g(appCompatImageView, "binding.appImageView");
        yd.g1.a(appCompatImageView, new g());
    }

    @Override // be.v2
    public void p1(jf.w wVar) {
        S3().p(wVar);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nc.f.dialog_fragment_live_announce_setting, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        i4((pc.w0) e10);
        Z3();
        l4();
        t S3 = S3();
        String W3 = W3();
        jo.p.g(W3, "referer");
        S3.r(W3);
        S3().p(U3());
        MRLogger V3 = V3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_ANNOUNCEMENT_IMP);
        builder.setPageId(W3());
        V3.sendLog(builder.build());
        Dialog dialog = new Dialog(N2(), nc.j.f41900a);
        dialog.setContentView(T3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(de.e.b(this, 320), -2);
        }
        return dialog;
    }
}
