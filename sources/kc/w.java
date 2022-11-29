package kc;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;
import com.dena.mirrorman.net.MRUrl;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import jc.c;
import jo.f0;
import kc.i;
import kq.a;
import uo.q0;
import uo.r0;
import yd.g1;

/* loaded from: classes2.dex */
public final class w extends com.google.android.material.bottomsheet.b implements jc.d, q0 {
    public jc.f P0;
    public jc.j Q0;
    public static final /* synthetic */ qo.h<Object>[] T0 = {f0.d(new jo.s(w.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/BottomSheetDialogFragmentLiveDetailSettingsBinding;", 0))};
    public static final a S0 = new a(null);
    public static final int U0 = 8;
    public final /* synthetic */ da.j O0 = new da.j();
    public final AutoClearedValue R0 = nd.a.a(this);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w a() {
            return new w();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f38623w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f38623w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f38623w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f38623w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38624w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar) {
            super(0);
            this.f38624w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f38624w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38625w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f38626x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f38627y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f38628z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f38625w = aVar;
            this.f38626x = aVar2;
            this.f38627y = aVar3;
            this.f38628z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f38625w;
            vq.a aVar2 = this.f38626x;
            io.a aVar3 = this.f38627y;
            xq.a aVar4 = this.f38628z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(jc.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38629w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f38629w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f38629w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f38630w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f38630w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f38630w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38631w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f38631w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f38631w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38632w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f38633x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f38634y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f38635z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f38632w = aVar;
            this.f38633x = aVar2;
            this.f38634y = aVar3;
            this.f38635z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f38632w;
            vq.a aVar2 = this.f38633x;
            io.a aVar3 = this.f38634y;
            xq.a aVar4 = this.f38635z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(jc.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38636w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar) {
            super(0);
            this.f38636w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f38636w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends tj.f {
        public j() {
        }

        @Override // tj.f
        public void c(float f10, float f11, float f12, tj.m mVar) {
            jo.p.h(mVar, "shapePath");
            mVar.m(f10 - de.e.a(w.this, 19.0f), 0.0f);
            mVar.m(f10 - de.e.a(w.this, 12.0f), -de.e.a(w.this, 7.0f));
            mVar.m(f10 - de.e.a(w.this, 6.0f), 0.0f);
            mVar.m(f10, 0.0f);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k implements TextWatcher {
        public k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            jo.p.h(editable, "s");
            jc.f fVar = w.this.P0;
            if (fVar == null) {
                jo.p.v("actionCreator");
                fVar = null;
            }
            fVar.t(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            jo.p.h(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            jo.p.h(charSequence, "s");
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.p<Integer, KeyEvent, wn.v> {
        public l() {
            super(2);
        }

        public final void a(int i10, KeyEvent keyEvent) {
            jo.p.h(keyEvent, "event");
            if (i10 == 4 && keyEvent.getAction() == 1) {
                w.this.R3().Z.clearFocus();
                of.j.f45405a.c(w.this.N2(), w.this.R3().Z);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, KeyEvent keyEvent) {
            a(num.intValue(), keyEvent);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.l<View, wn.v> {
        public m() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            jc.j jVar = w.this.Q0;
            if (jVar == null) {
                jo.p.v("store");
                jVar = null;
            }
            if (jVar.a0()) {
                return;
            }
            kc.g.R0.a().z3(w.this.p0(), "CollabSettingDialog");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<View, wn.v> {
        public n() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            w wVar = w.this;
            WebViewActivity.a aVar = WebViewActivity.X;
            Context N2 = wVar.N2();
            jo.p.g(N2, "requireContext()");
            wVar.f3(WebViewActivity.a.b(aVar, N2, MRUrl.Faq.INSTANCE.getUrl(), false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.l<View, wn.v> {
        public o() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            w wVar = w.this;
            WebViewActivity.a aVar = WebViewActivity.X;
            Context N2 = wVar.N2();
            jo.p.g(N2, "requireContext()");
            wVar.f3(WebViewActivity.a.b(aVar, N2, MRUrl.TipsOfStreaming.INSTANCE.getUrl(), false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.l<View, wn.v> {
        public p() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            w.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q implements SeekBar.OnSeekBarChangeListener {
        public q() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            jo.p.h(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            jo.p.h(seekBar, "seekBar");
            jc.f fVar = w.this.P0;
            jc.f fVar2 = null;
            if (fVar == null) {
                jo.p.v("actionCreator");
                fVar = null;
            }
            fVar.w(seekBar.getProgress() != 0);
            jc.f fVar3 = w.this.P0;
            if (fVar3 == null) {
                jo.p.v("actionCreator");
            } else {
                fVar2 = fVar3;
            }
            fVar2.x(seekBar.getProgress() / 10.0f);
        }
    }

    public static final void S3(w wVar, DialogInterface dialogInterface) {
        jo.p.h(wVar, "this$0");
        wVar.V3();
    }

    public static final void T3(w wVar, Integer num) {
        jo.p.h(wVar, "this$0");
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 28) {
            wVar.R3().S.setVisibility(8);
            wVar.R3().f884d0.setVisibility(8);
            wVar.R3().R.setVisibility(0);
            if (num != null && num.intValue() == 1) {
                wVar.R3().R.setChecked(true);
                wVar.R3().f887g0.setVisibility(8);
                return;
            }
            wVar.R3().R.setChecked(false);
            wVar.R3().f887g0.setVisibility(0);
            return;
        }
        wVar.R3().R.setVisibility(8);
        if ((num == null || num.intValue() != 2) && (num == null || num.intValue() != 1)) {
            z10 = false;
        }
        if (z10) {
            wVar.R3().S.setText(wVar.U0(xb.r.text_label_on));
            wVar.R3().S.setVisibility(0);
            wVar.R3().f884d0.setVisibility(8);
            wVar.R3().f887g0.setVisibility(8);
        } else if (num != null && num.intValue() == 0) {
            wVar.R3().S.setText(wVar.U0(xb.r.text_label_off));
            wVar.R3().S.setVisibility(0);
            wVar.R3().f884d0.setVisibility(8);
            wVar.R3().f887g0.setVisibility(0);
        } else if (num != null && num.intValue() == -1) {
            wVar.R3().S.setVisibility(8);
            wVar.R3().f884d0.setVisibility(0);
            wVar.R3().f887g0.setVisibility(0);
        }
    }

    public static final void Y3(w wVar, View view) {
        jo.p.h(wVar, "this$0");
        jc.f fVar = null;
        if (wVar.R3().R.isChecked()) {
            Object systemService = wVar.N2().getSystemService("notification");
            jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            if (!((NotificationManager) systemService).isNotificationPolicyAccessGranted()) {
                c.a aVar = jc.c.T0;
                String U02 = wVar.U0(xb.r.text_confirm_access_notificaiton_stop_broadcast);
                jo.p.g(U02, "getString(R.string.text_…ificaiton_stop_broadcast)");
                String U03 = wVar.U0(xb.r.text_moderator_appointment);
                jo.p.g(U03, "getString(R.string.text_moderator_appointment)");
                aVar.a(U02, "", U03).z3(wVar.p0(), "ConfirmNotificationGuardDialog");
            }
            jc.f fVar2 = wVar.P0;
            if (fVar2 == null) {
                jo.p.v("actionCreator");
            } else {
                fVar = fVar2;
            }
            fVar.z(1);
            return;
        }
        jc.f fVar3 = wVar.P0;
        if (fVar3 == null) {
            jo.p.v("actionCreator");
        } else {
            fVar = fVar3;
        }
        fVar.z(0);
    }

    public static final void Z3(w wVar, View view) {
        jo.p.h(wVar, "this$0");
        i.a aVar = kc.i.U0;
        String U02 = wVar.U0(xb.r.text_hidden_push_notification);
        jo.p.g(U02, "getString(R.string.text_hidden_push_notification)");
        jc.j jVar = wVar.Q0;
        if (jVar == null) {
            jo.p.v("store");
            jVar = null;
        }
        Integer f10 = jVar.M().f();
        if (f10 == null) {
            f10 = -1;
        }
        aVar.a(U02, false, f10.intValue()).z3(wVar.p0(), "ConfirmNotificationGuardDialog");
    }

    public static final void a4(w wVar, View view) {
        jo.p.h(wVar, "this$0");
        i.a aVar = kc.i.U0;
        String U02 = wVar.U0(xb.r.text_hidden_push_notification);
        jo.p.g(U02, "getString(R.string.text_hidden_push_notification)");
        jc.j jVar = wVar.Q0;
        if (jVar == null) {
            jo.p.v("store");
            jVar = null;
        }
        Integer f10 = jVar.M().f();
        if (f10 == null) {
            f10 = -1;
        }
        aVar.a(U02, false, f10.intValue()).z3(wVar.p0(), "ConfirmNotificationGuardDialog");
    }

    public static final void b4(w wVar, View view) {
        jo.p.h(wVar, "this$0");
        wVar.R3().Z.requestFocus();
    }

    public static final boolean c4(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent.getAction() & 255) == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    public static final void d4(w wVar, CompoundButton compoundButton, boolean z10) {
        jo.p.h(wVar, "this$0");
        jc.f fVar = wVar.P0;
        if (fVar == null) {
            jo.p.v("actionCreator");
            fVar = null;
        }
        fVar.p(z10);
    }

    public static final void e4(w wVar, CompoundButton compoundButton, boolean z10) {
        jo.p.h(wVar, "this$0");
        jc.f fVar = wVar.P0;
        if (fVar == null) {
            jo.p.v("actionCreator");
            fVar = null;
        }
        fVar.s(z10);
    }

    @Override // jc.d
    public void D() {
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ac.k T = ac.k.T(LayoutInflater.from(N2()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        U3(T);
        View u10 = R3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final ac.k R3() {
        return (ac.k) this.R0.b(this, T0[0]);
    }

    public final void U3(ac.k kVar) {
        this.R0.a(this, T0[0], kVar);
    }

    public final void V3() {
        Window window;
        View decorView;
        Rect rect = new Rect();
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int height = rect.height() - de.e.b(this, 24);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(R3().K);
        cVar.l(R3().L.getId(), height);
        cVar.c(R3().K);
        Dialog p33 = p3();
        jo.p.f(p33, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        View findViewById = ((com.google.android.material.bottomsheet.a) p33).findViewById(xb.o.f60021p2);
        if (findViewById == null) {
            return;
        }
        BottomSheetBehavior c02 = BottomSheetBehavior.c0(findViewById);
        jo.p.g(c02, "from(bottomSheet)");
        c02.z0(3);
        c02.v0(height);
        findViewById.setBackgroundColor(c3.a.d(N2(), 17170445));
    }

    public final void W3() {
        if (Build.VERSION.SDK_INT < 28) {
            R3().T.setText(U0(xb.r.text_notification_guard_stop_broadcast));
            R3().P.setText(U0(xb.r.text_hide_notificaiton_android8_description));
        } else {
            R3().T.setText(U0(xb.r.text_hidden_push_notification));
            R3().P.setText(U0(xb.r.text_setting_description_notification_guard));
        }
        R3().f885e0.setCardBackgroundColor(c3.a.d(N2(), xb.l.f59937f));
        R3().f885e0.setShapeAppearanceModel(tj.k.a().p(new tj.a(de.e.a(this, 8.0f))).A(new j()).m());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void X3() {
        R3().u().setOnClickListener(new View.OnClickListener() { // from class: kc.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.b4(w.this, view);
            }
        });
        EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener = R3().Z;
        editTextWithOnKeyPreImeListener.addTextChangedListener(new k());
        editTextWithOnKeyPreImeListener.setOnKeyPreImeListener(new l());
        EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener2 = R3().Z;
        Integer valueOf = Integer.valueOf(O0().getString(xb.r.limit_memo_broadcast));
        jo.p.g(valueOf, "valueOf(resources.getStr…ng.limit_memo_broadcast))");
        editTextWithOnKeyPreImeListener2.setFilters(new sf.b[]{new sf.b(valueOf.intValue())});
        R3().Z.setOnTouchListener(s.f38619w);
        ConstraintLayout constraintLayout = R3().F;
        jo.p.g(constraintLayout, "binding.collabContainer");
        g1.a(constraintLayout, new m());
        ConstraintLayout constraintLayout2 = R3().M;
        jo.p.g(constraintLayout2, "binding.helpContainer");
        g1.a(constraintLayout2, new n());
        ConstraintLayout constraintLayout3 = R3().f890j0;
        jo.p.g(constraintLayout3, "binding.tipsContainer");
        g1.a(constraintLayout3, new o());
        AppCompatTextView appCompatTextView = R3().J;
        jo.p.g(appCompatTextView, "binding.completeTextView");
        g1.a(appCompatTextView, new p());
        R3().f897q0.setOnSeekBarChangeListener(new q());
        R3().D.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kc.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                w.d4(w.this, compoundButton, z10);
            }
        });
        R3().W.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kc.t
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                w.e4(w.this, compoundButton, z10);
            }
        });
        R3().R.setOnClickListener(new View.OnClickListener() { // from class: kc.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.Y3(w.this, view);
            }
        });
        R3().S.setOnClickListener(new View.OnClickListener() { // from class: kc.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.Z3(w.this, view);
            }
        });
        R3().f884d0.setOnClickListener(new View.OnClickListener() { // from class: kc.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.a4(w.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        jc.f fVar = this.P0;
        if (fVar == null) {
            jo.p.v("actionCreator");
            fVar = null;
        }
        fVar.K();
    }

    @Override // jc.d
    public void b0() {
        jc.f fVar = this.P0;
        if (fVar == null) {
            jo.p.v("actionCreator");
            fVar = null;
        }
        fVar.K();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void c2() {
        Window window;
        FrameLayout frameLayout;
        super.c2();
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null || (frameLayout = (FrameLayout) window.findViewById(xb.o.f60021p2)) == null) {
            return;
        }
        BottomSheetBehavior.c0(frameLayout).u0(-1);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        f fVar = new f(this);
        jc.j jVar = null;
        this.P0 = (jc.f) ((androidx.lifecycle.q0) e0.a(this, f0.b(jc.f.class), new i(new g(fVar)), new h(fVar, null, null, gq.a.a(this))).getValue());
        b bVar = new b(this);
        this.Q0 = (jc.j) ((androidx.lifecycle.q0) e0.a(this, f0.b(jc.j.class), new e(new c(bVar)), new d(bVar, null, null, gq.a.a(this))).getValue());
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 != null) {
            p33.setOnShowListener(new DialogInterface.OnShowListener() { // from class: kc.n
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    w.S3(w.this, dialogInterface);
                }
            });
        }
        R3().M(a1());
        ac.k R3 = R3();
        jc.j jVar2 = this.Q0;
        if (jVar2 == null) {
            jo.p.v("store");
            jVar2 = null;
        }
        R3.V(jVar2.y());
        X3();
        W3();
        jc.j jVar3 = this.Q0;
        if (jVar3 == null) {
            jo.p.v("store");
        } else {
            jVar = jVar3;
        }
        jVar.M().i(this, new androidx.lifecycle.f0() { // from class: kc.v
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                w.T3(w.this, (Integer) obj);
            }
        });
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        jo.p.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        Context q02 = q0();
        Object systemService = q02 != null ? q02.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(1, 0);
        }
    }
}
