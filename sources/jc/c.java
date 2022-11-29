package jc;

import ac.w;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.List;
import jo.f0;
import jo.p;
import jo.q;
import kf.t;
import xb.s;

/* loaded from: classes2.dex */
public final class c extends androidx.fragment.app.e {
    public static final a T0 = new a(null);
    public static final int U0 = 8;
    public final wn.f N0;
    public jc.d O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public boolean S0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(String str, String str2, String str3) {
            p.h(str, "title");
            p.h(str2, "note");
            p.h(str3, "okButtonText");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TITLE", str);
            bundle.putString("EXTRA_NOTE", str2);
            bundle.putString("EXTRA_OK_BUTTON_TEXT", str3);
            cVar.V2(bundle);
            return cVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = c.this.M2().getString("EXTRA_NOTE");
            p.e(string);
            return string;
        }
    }

    /* renamed from: jc.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0506c extends q implements io.a<String> {
        public C0506c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = c.this.M2().getString("EXTRA_OK_BUTTON_TEXT");
            p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37484w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37485x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37486y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37484w = componentCallbacks;
            this.f37485x = aVar;
            this.f37486y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final t invoke() {
            ComponentCallbacks componentCallbacks = this.f37484w;
            return gq.a.a(componentCallbacks).c(f0.b(t.class), this.f37485x, this.f37486y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<String> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = c.this.M2().getString("EXTRA_TITLE");
            p.e(string);
            return string;
        }
    }

    public c() {
        super(xb.p.dialog_fragment_confirm_access_setting_notification);
        this.N0 = wn.g.b(wn.i.SYNCHRONIZED, new d(this, null, null));
        this.P0 = wn.g.a(new e());
        this.Q0 = wn.g.a(new b());
        this.R0 = wn.g.a(new C0506c());
    }

    public static final void I3(c cVar, View view) {
        p.h(cVar, "this$0");
        cVar.D3();
        jc.d dVar = cVar.O0;
        if (dVar != null) {
            dVar.D();
        }
        if (Build.VERSION.SDK_INT < 28) {
            cVar.G3().I4(1);
        }
        cVar.n3();
    }

    public static final void J3(c cVar, View view) {
        p.h(cVar, "this$0");
        cVar.n3();
    }

    public final void D3() {
        this.S0 = true;
        Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        List<ResolveInfo> queryIntentActivities = N2().getPackageManager().queryIntentActivities(intent, 0);
        p.g(queryIntentActivities, "pm.queryIntentActivities(intent, 0)");
        if (queryIntentActivities.size() < 1) {
            intent = new Intent("android.settings.SETTINGS");
        }
        f3(intent);
    }

    public final String E3() {
        return (String) this.Q0.getValue();
    }

    public final String F3() {
        return (String) this.R0.getValue();
    }

    public final t G3() {
        return (t) this.N0.getValue();
    }

    public final String H3() {
        return (String) this.P0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        if (!this.S0) {
            jc.d dVar = this.O0;
            if (dVar != null) {
                dVar.b0();
            }
            if (Build.VERSION.SDK_INT < 28) {
                G3().I4(0);
            }
        }
        this.O0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        p.h(view, "view");
        super.e2(view, bundle);
        w T = w.T(view);
        T.G.setText(H3());
        T.F.setVisibility(E3().length() > 0 ? 0 : 8);
        T.F.setText(E3());
        T.B.setText(F3());
        T.B.setOnClickListener(new View.OnClickListener() { // from class: jc.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.I3(c.this, view2);
            }
        });
        T.C.setOnClickListener(new View.OnClickListener() { // from class: jc.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.J3(c.this, view2);
            }
        });
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), s.f60094a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        jc.d dVar = null;
        jc.d dVar2 = context instanceof jc.d ? (jc.d) context : null;
        if (dVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof jc.d) {
                dVar = (jc.d) H0;
            }
        } else {
            dVar = dVar2;
        }
        this.O0 = dVar;
    }
}
