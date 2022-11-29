package lc;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import kq.a;
import yd.g1;

/* loaded from: classes2.dex */
public final class a0 extends com.google.android.material.bottomsheet.b {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public b0 O0;
    public jc.j P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a0 a() {
            return new a0();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f39819w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f39819w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f39819w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f39819w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f39820w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar) {
            super(0);
            this.f39820w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f39820w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f39821w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f39822x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f39823y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f39824z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f39821w = aVar;
            this.f39822x = aVar2;
            this.f39823y = aVar3;
            this.f39824z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f39821w;
            vq.a aVar2 = this.f39822x;
            io.a aVar3 = this.f39823y;
            xq.a aVar4 = this.f39824z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(jc.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f39825w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f39825w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f39825w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b0 b0Var = a0.this.O0;
            if (b0Var != null) {
                b0Var.q();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b0 b0Var = a0.this.O0;
            if (b0Var != null) {
                b0Var.F();
            }
            a0.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ac.o f39828w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ac.o oVar) {
            super(1);
            this.f39828w = oVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            SwitchCompat switchCompat = this.f39828w.K;
            switchCompat.setChecked(!switchCompat.isChecked());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public static final void H3(a0 a0Var, CompoundButton compoundButton, boolean z10) {
        jo.p.h(a0Var, "this$0");
        b0 b0Var = a0Var.O0;
        if (b0Var != null) {
            b0Var.t(z10);
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.e
    public int q3() {
        return xb.s.f60096d;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        b0 b0Var = null;
        b0 b0Var2 = context instanceof b0 ? (b0) context : null;
        if (b0Var2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof b0) {
                b0Var = (b0) H0;
            }
        } else {
            b0Var = b0Var2;
        }
        this.O0 = b0Var;
    }

    @Override // e.g, androidx.fragment.app.e
    public void y3(Dialog dialog, int i10) {
        jo.p.h(dialog, "dialog");
        jc.j jVar = null;
        ac.o oVar = (ac.o) androidx.databinding.f.e(LayoutInflater.from(q0()), xb.p.bottom_sheet_dialog_fragment_live_option_menu, null, false);
        b bVar = new b(this);
        this.P0 = (jc.j) ((q0) androidx.fragment.app.e0.a(this, jo.f0.b(jc.j.class), new e(new c(bVar)), new d(bVar, null, null, gq.a.a(this))).getValue());
        AppCompatTextView appCompatTextView = oVar.F;
        jo.p.g(appCompatTextView, "binding.friendOnlyBroadcastSettingTextView");
        g1.a(appCompatTextView, new f());
        AppCompatTextView appCompatTextView2 = oVar.E;
        jo.p.g(appCompatTextView2, "binding.favoriteSettingTextView");
        g1.a(appCompatTextView2, new g());
        jc.j jVar2 = this.P0;
        if (jVar2 == null) {
            jo.p.v("store");
            jVar2 = null;
        }
        if (jo.p.c(jVar2.L().o().f(), Boolean.TRUE)) {
            oVar.I.setVisibility(8);
            oVar.K.setEnabled(true);
            SwitchCompat switchCompat = oVar.K;
            jc.j jVar3 = this.P0;
            if (jVar3 == null) {
                jo.p.v("store");
                jVar3 = null;
            }
            Boolean f10 = jVar3.c0().f();
            switchCompat.setChecked(f10 != null ? f10.booleanValue() : false);
            ConstraintLayout constraintLayout = oVar.G;
            jo.p.g(constraintLayout, "binding.omotenashiBroadcastContainer");
            g1.a(constraintLayout, new h(oVar));
            oVar.K.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lc.z
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    a0.H3(a0.this, compoundButton, z10);
                }
            });
        } else {
            oVar.I.setVisibility(0);
            oVar.K.setEnabled(false);
        }
        jc.j jVar4 = this.P0;
        if (jVar4 == null) {
            jo.p.v("store");
        } else {
            jVar = jVar4;
        }
        String f11 = jVar.L().d().f();
        if (f11 != null) {
            oVar.H.setText(f11);
        }
        dialog.setContentView(oVar.u());
    }
}
