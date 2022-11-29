package se;

import ae.z2;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.HashMap;
import jo.f0;
import jo.p;
import jo.q;
import nd.b1;
import nd.f1;
import nd.y0;
import xn.r;

/* loaded from: classes2.dex */
public final class k extends androidx.fragment.app.e {
    public static final a S0 = new a(null);
    public static final int T0 = 8;
    public final wn.f N0 = wn.g.b(wn.i.SYNCHRONIZED, new d(this, null, null));
    public z2 O0;
    public l P0;
    public int Q0;
    public b R0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(l lVar, int i10, int i11) {
            p.h(lVar, "giftCodeType");
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_gift_code_type", lVar);
            bundle.putInt("extra_exchange_gift_code", i10);
            bundle.putInt("gift_code_present_id", i11);
            kVar.V2(bundle);
            return kVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void Y0(l lVar);
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52684a;

        static {
            int[] iArr = new int[l.values().length];
            iArr[l.ITUNES.ordinal()] = 1;
            iArr[l.PLAY_STORE.ordinal()] = 2;
            f52684a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f52685w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f52686x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f52687y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f52685w = componentCallbacks;
            this.f52686x = aVar;
            this.f52687y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f52685w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f52686x, this.f52687y);
        }
    }

    public static final void G3(k kVar, View view) {
        p.h(kVar, "this$0");
        kVar.J3("cancel");
        kVar.m3();
    }

    public static final void H3(k kVar, View view) {
        p.h(kVar, "this$0");
        kVar.J3("exchange");
        b bVar = kVar.R0;
        if (bVar != null) {
            l lVar = kVar.P0;
            if (lVar == null) {
                p.v("giftCodeType");
                lVar = null;
            }
            bVar.Y0(lVar);
        }
        kVar.m3();
    }

    public static final void I3(k kVar, View view) {
        p.h(kVar, "this$0");
        kVar.m3();
    }

    public final z2 E3() {
        z2 z2Var = this.O0;
        if (z2Var != null) {
            return z2Var;
        }
        p.v("binding");
        return null;
    }

    public final MRLogger F3() {
        return (MRLogger) this.N0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.R0 = null;
    }

    public final void J3(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_gift_code_present_id", String.valueOf(M2().getInt("gift_code_present_id")));
        hashMap.put("price", String.valueOf(this.Q0));
        l lVar = this.P0;
        if (lVar == null) {
            p.v("giftCodeType");
            lVar = null;
        }
        hashMap.put("type", lVar == l.ITUNES ? "itunes" : "play_store");
        MRLogger F3 = F3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_INCENTIVE_GIFT_CODE_CONFIRM);
        builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new xm.e().s(hashMap))));
        builder.setTargetId(str);
        F3.sendLog(builder.build());
    }

    public final void K3(z2 z2Var) {
        p.h(z2Var, "<set-?>");
        this.O0 = z2Var;
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog r32 = super.r3(bundle);
        p.g(r32, "super.onCreateDialog(savedInstanceState)");
        l lVar = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), b1.dialog_fragment_gift_code_selection, null, false);
        p.g(e10, "inflate(\n            Lay…          false\n        )");
        K3((z2) e10);
        Serializable serializable = M2().getSerializable("extra_gift_code_type");
        p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.feature.passbook.orb.GiftCodeType");
        this.P0 = (l) serializable;
        this.Q0 = M2().getInt("extra_exchange_gift_code");
        E3().B.setText(NumberFormat.getNumberInstance().format(Integer.valueOf(this.Q0)));
        E3().D.setOnClickListener(new View.OnClickListener() { // from class: se.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.G3(k.this, view);
            }
        });
        E3().K.setOnClickListener(new View.OnClickListener() { // from class: se.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.H3(k.this, view);
            }
        });
        l lVar2 = this.P0;
        if (lVar2 == null) {
            p.v("giftCodeType");
        } else {
            lVar = lVar2;
        }
        int i10 = c.f52684a[lVar.ordinal()];
        if (i10 == 1) {
            E3().G.setImageResource(y0.itunes_gift_card);
            E3().E.setText(U0(f1.text_giftcode_select_itunes_confirm));
            E3().C.setText(U0(f1.text_trademark_apple));
        } else if (i10 == 2) {
            E3().G.setImageResource(y0.play_store_gift_card);
            E3().E.setText(U0(f1.text_giftcode_select_googleplay_confirm));
            E3().C.setText(U0(f1.text_trademark_logo_google));
        }
        E3().J.setOnClickListener(new View.OnClickListener() { // from class: se.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.I3(k.this, view);
            }
        });
        r32.setContentView(E3().u());
        Window window = r32.getWindow();
        p.e(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = r32.getWindow();
        p.e(window2);
        window2.setLayout(-1, -1);
        return r32;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.R0 = (b) context;
    }
}
