package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class h3 extends androidx.fragment.app.e implements uo.q0 {
    public boolean O0;
    public b T0;
    public static final /* synthetic */ qo.h<Object>[] V0 = {jo.f0.d(new jo.s(h3.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentMissionAchievementBinding;", 0))};
    public static final a U0 = new a(null);
    public static final int W0 = 8;
    public final /* synthetic */ da.j N0 = new da.j();
    public final wn.f P0 = wn.g.b(wn.i.SYNCHRONIZED, new e(this, null, null));
    public final wn.f Q0 = wn.g.a(new d());
    public final wn.f R0 = wn.g.a(new c());
    public final AutoClearedValue S0 = nd.a.a(this);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h3 a(String str, String str2) {
            jo.p.h(str, "referer");
            h3 h3Var = new h3();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putString("EXTRA_KEY_LIVE_ID", str2);
            h3Var.V2(bundle);
            return h3Var;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void n();
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return h3.this.M2().getString("EXTRA_KEY_LIVE_ID");
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
            String string = h3.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17869w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17870x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17871y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17869w = componentCallbacks;
            this.f17870x = aVar;
            this.f17871y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f17869w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f17870x, this.f17871y);
        }
    }

    public static final void I3(h3 h3Var, View view) {
        jo.p.h(h3Var, "this$0");
        h3Var.n3();
    }

    public static final void J3(h3 h3Var, View view) {
        jo.p.h(h3Var, "this$0");
        h3Var.O0 = true;
        h3Var.T0 = null;
        h3Var.n3();
    }

    public static final boolean K3(h3 h3Var, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        jo.p.h(h3Var, "this$0");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            h3Var.T0 = null;
            h3Var.n3();
            return true;
        }
        return false;
    }

    public final ae.u3 E3() {
        return (ae.u3) this.S0.b(this, V0[0]);
    }

    public final String F3() {
        return (String) this.R0.getValue();
    }

    public final MRLogger G3() {
        return (MRLogger) this.P0.getValue();
    }

    public final String H3() {
        return (String) this.Q0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.T0 = null;
        super.I1();
    }

    public final void L3(ae.u3 u3Var) {
        this.S0.a(this, V0[0], u3Var);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        jo.p.h(dialogInterface, "dialog");
        HashMap hashMap = new HashMap();
        hashMap.put("is_cancel", Integer.valueOf(this.O0 ? 1 : 0));
        MRLogger G3 = G3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MISSION_CLEAR_POP_TAP);
        builder.setPageId(H3());
        List<wn.k<String, String>> p10 = xn.s.p(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new xm.e().s(hashMap)));
        String F3 = F3();
        if (F3 != null) {
            p10.add(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, F3));
        }
        builder.setPayload(p10);
        G3.sendLog(builder.build());
        b bVar = this.T0;
        if (bVar != null) {
            bVar.n();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ae.u3 T = ae.u3.T(LayoutInflater.from(q0()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        L3(T);
        E3().E.setOnClickListener(new View.OnClickListener() { // from class: be.f3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h3.I3(h3.this, view);
            }
        });
        E3().B.setOnClickListener(new View.OnClickListener() { // from class: be.g3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h3.J3(h3.this, view);
            }
        });
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        E3().H.startAnimation(rotateAnimation);
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        Window window = dialog.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        dialog.setContentView(E3().u());
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(nd.w0.Q0);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setLayout(-1, -1);
        }
        Window window4 = dialog.getWindow();
        if (window4 != null) {
            window4.clearFlags(2);
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: be.e3
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean K3;
                K3 = h3.K3(h3.this, dialogInterface, i10, keyEvent);
                return K3;
            }
        });
        MRLogger G3 = G3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MISSION_CLEAR_POP_IMP);
        builder.setPageId(H3());
        builder.setTargetId(F3());
        G3.sendLog(builder.build());
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.T0 = (b) context;
    }
}
