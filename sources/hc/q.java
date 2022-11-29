package hc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* loaded from: classes2.dex */
public final class q extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public final wn.f O0 = wn.g.b(wn.i.SYNCHRONIZED, new b(this, null, null));
    public static final /* synthetic */ qo.h<Object>[] Q0 = {jo.f0.d(new jo.s(q.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/DialogFragmentGroupShotCountSettingBinding;", 0))};
    public static final a P0 = new a(null);
    public static final int R0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q a(int i10, int i11) {
            q qVar = new q();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_NUMBER_OF_MEMBERS", i10);
            bundle.putInt("EXTRA_MAX_NUMBER_OF_MEMBERS", i11);
            qVar.V2(bundle);
            return qVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<od.n0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35209w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35210x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35211y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35209w = componentCallbacks;
            this.f35210x = aVar;
            this.f35211y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.n0, java.lang.Object] */
        @Override // io.a
        public final od.n0 invoke() {
            ComponentCallbacks componentCallbacks = this.f35209w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.n0.class), this.f35210x, this.f35211y);
        }
    }

    public static final void H3(q qVar, View view) {
        jo.p.h(qVar, "this$0");
        qVar.G3().t(1);
        qVar.F3().D.setTextColor(c3.a.d(qVar.N2(), xb.l.f59943n));
        AppCompatRadioButton appCompatRadioButton = qVar.F3().G;
        Context N2 = qVar.N2();
        int i10 = xb.l.f59940j;
        appCompatRadioButton.setTextColor(c3.a.d(N2, i10));
        qVar.F3().E.setTextColor(c3.a.d(qVar.N2(), i10));
    }

    public static final void I3(q qVar, View view) {
        jo.p.h(qVar, "this$0");
        qVar.G3().t(2);
        AppCompatRadioButton appCompatRadioButton = qVar.F3().D;
        Context N2 = qVar.N2();
        int i10 = xb.l.f59940j;
        appCompatRadioButton.setTextColor(c3.a.d(N2, i10));
        qVar.F3().G.setTextColor(c3.a.d(qVar.N2(), xb.l.f59943n));
        qVar.F3().E.setTextColor(c3.a.d(qVar.N2(), i10));
    }

    public static final void J3(q qVar, View view) {
        jo.p.h(qVar, "this$0");
        qVar.G3().t(3);
        AppCompatRadioButton appCompatRadioButton = qVar.F3().D;
        Context N2 = qVar.N2();
        int i10 = xb.l.f59940j;
        appCompatRadioButton.setTextColor(c3.a.d(N2, i10));
        qVar.F3().G.setTextColor(c3.a.d(qVar.N2(), i10));
        qVar.F3().E.setTextColor(c3.a.d(qVar.N2(), xb.l.f59943n));
    }

    public static final void K3(q qVar, View view) {
        jo.p.h(qVar, "this$0");
        qVar.m3();
    }

    public final ac.q0 F3() {
        return (ac.q0) this.N0.b(this, Q0[0]);
    }

    public final od.n0 G3() {
        return (od.n0) this.O0.getValue();
    }

    public final void L3(ac.q0 q0Var) {
        this.N0.a(this, Q0[0], q0Var);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        int i10;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), xb.p.dialog_fragment_group_shot_count_setting, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        L3((ac.q0) e10);
        AppCompatRadioButton appCompatRadioButton = F3().D;
        Resources O0 = O0();
        int i11 = xb.r.G1;
        appCompatRadioButton.setText(O0.getString(i11, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        F3().G.setText(O0().getString(i11, "2"));
        F3().E.setText(O0().getString(i11, "3"));
        RadioGroup radioGroup = F3().C;
        int i12 = M2().getInt("EXTRA_NUMBER_OF_MEMBERS");
        if (i12 == 1) {
            i10 = xb.o.one_radio_button;
        } else if (i12 != 2) {
            i10 = i12 != 3 ? -1 : xb.o.three_radio_button;
        } else {
            i10 = xb.o.two_radio_button;
        }
        radioGroup.check(i10);
        int i13 = M2().getInt("EXTRA_MAX_NUMBER_OF_MEMBERS");
        if (i13 == 1) {
            F3().G.setEnabled(false);
            F3().G.setAlpha(0.5f);
            F3().E.setEnabled(false);
            F3().E.setAlpha(0.5f);
        } else if (i13 == 2) {
            F3().E.setEnabled(false);
            F3().E.setAlpha(0.5f);
        }
        F3().D.setOnClickListener(new View.OnClickListener() { // from class: hc.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.H3(q.this, view);
            }
        });
        F3().G.setOnClickListener(new View.OnClickListener() { // from class: hc.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.I3(q.this, view);
            }
        });
        F3().E.setOnClickListener(new View.OnClickListener() { // from class: hc.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.J3(q.this, view);
            }
        });
        F3().B.setOnClickListener(new View.OnClickListener() { // from class: hc.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.K3(q.this, view);
            }
        });
        Dialog dialog = new Dialog(N2(), xb.s.f60094a);
        dialog.setContentView(F3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        return dialog;
    }
}
