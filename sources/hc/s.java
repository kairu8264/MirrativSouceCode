package hc;

import ac.d3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes2.dex */
public final class s extends Fragment {

    /* renamed from: x0  reason: collision with root package name */
    public final AutoClearedValue f35258x0 = nd.a.a(this);

    /* renamed from: y0  reason: collision with root package name */
    public t f35259y0;
    public static final /* synthetic */ qo.h<Object>[] A0 = {jo.f0.d(new jo.s(s.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/FragmentGroupShotFinishBinding;", 0))};

    /* renamed from: z0  reason: collision with root package name */
    public static final a f35257z0 = new a(null);
    public static final int B0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s a(String str) {
            jo.p.h(str, "referer");
            s sVar = new s();
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_REFERER", str);
            sVar.V2(bundle);
            return sVar;
        }
    }

    public static final void l3(s sVar, View view) {
        jo.p.h(sVar, "this$0");
        t tVar = sVar.f35259y0;
        if (tVar != null) {
            tVar.p0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), xb.p.fragment_group_shot_finish, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        m3((d3) e10);
        View u10 = k3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.f35259y0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        k3().B.setOnClickListener(new View.OnClickListener() { // from class: hc.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                s.l3(s.this, view2);
            }
        });
    }

    public final d3 k3() {
        return (d3) this.f35258x0.b(this, A0[0]);
    }

    public final void m3(d3 d3Var) {
        this.f35258x0.a(this, A0[0], d3Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.f35259y0 = context instanceof t ? (t) context : null;
    }
}
