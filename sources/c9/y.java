package c9;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import com.dena.mirrativ.catalog.search.SearchAppDialog;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.net.api.Referer;
import java.util.ArrayList;
import java.util.UUID;
import r8.f1;
import r8.h1;
import r8.w0;
import uo.q0;
import wb.a;

/* loaded from: classes.dex */
public final class y extends Fragment implements q0 {
    public String A0;
    public ArrayAdapter<String> B0;
    public SearchAppDialog C0;
    public static final /* synthetic */ qo.h<Object>[] F0 = {jo.f0.d(new jo.s(y.class, "binding", "getBinding()Lcom/dena/mirrativ/catalog/databinding/FragmentSearchLiveBinding;", 0))};
    public static final a E0 = new a(null);
    public static final int G0 = 8;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f18988x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final AutoClearedValue f18989y0 = nd.a.a(this);

    /* renamed from: z0  reason: collision with root package name */
    public String f18990z0 = "";
    public final wn.f D0 = wn.g.b(wn.i.SYNCHRONIZED, new b(this, null, null));

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18991w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18992x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18993y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18991w = componentCallbacks;
            this.f18992x = aVar;
            this.f18993y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f18991w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.d0.class), this.f18992x, this.f18993y);
        }
    }

    public static final void q3(y yVar, AdapterView adapterView, View view, int i10, long j10) {
        jo.p.h(yVar, "this$0");
        ArrayAdapter<String> arrayAdapter = yVar.B0;
        jo.p.e(arrayAdapter);
        String item = arrayAdapter.getItem(i10);
        if (item == null || jo.p.c(item, yVar.U0(h1.text_search_history_not_exist))) {
            return;
        }
        yVar.I0().g1("EventSearchLiveKeyword", k3.b.a(wn.q.a("bundleKey", item)));
    }

    public static final void r3(y yVar, View view) {
        jo.p.h(yVar, "this$0");
        SearchAppDialog a10 = SearchAppDialog.U0.a(yVar.A0);
        yVar.C0 = a10;
        if (a10 != null) {
            a10.z3(yVar.I0(), "SearchAppDialog");
        }
    }

    public static final void s3(y yVar, String str, Bundle bundle) {
        jo.p.h(yVar, "this$0");
        jo.p.h(str, "<anonymous parameter 0>");
        jo.p.h(bundle, "bundle");
        String string = bundle.getString("bundleKey1");
        yVar.A0 = bundle.getString("bundleKey2");
        if (string != null) {
            yVar.u3(string);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        if (bundle != null) {
            this.A0 = bundle.getString("STATE_KEY_SEARCH_APP_ID");
        }
        ViewDataBinding e10 = androidx.databinding.f.e(layoutInflater, f1.fragment_search_live, viewGroup, false);
        jo.p.g(e10, "inflate(inflater, R.layo…h_live, container, false)");
        v3((t8.a0) e10);
        p3();
        View u10 = m3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void b2(Bundle bundle) {
        jo.p.h(bundle, "outState");
        super.b2(bundle);
        bundle.putString("STATE_KEY_SEARCH_APP_ID", this.A0);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f18988x0.getCoroutineContext();
    }

    public final t8.a0 m3() {
        return (t8.a0) this.f18989y0.b(this, F0[0]);
    }

    public final hf.d0 n3() {
        return (hf.d0) this.D0.getValue();
    }

    public final void o3() {
        ArrayList<String> g10 = n3().g();
        if (g10.isEmpty()) {
            g10.add(U0(h1.text_search_history_not_exist));
        }
        this.B0 = new ArrayAdapter<>(N2(), f1.item_keywordlist, g10);
        m3().C.setAdapter((ListAdapter) this.B0);
        w3();
    }

    public final void p3() {
        y3();
        m3().C.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: c9.w
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                y.q3(y.this, adapterView, view, i10, j10);
            }
        });
        if (this.B0 == null) {
            if (TextUtils.isEmpty(this.f18990z0)) {
                o3();
            } else {
                u3(this.f18990z0);
            }
        } else {
            m3().C.setAdapter((ListAdapter) this.B0);
            if (TextUtils.isEmpty(this.f18990z0)) {
                w3();
            } else {
                x3();
            }
        }
        m3().E.setOnClickListener(new View.OnClickListener() { // from class: c9.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.r3(y.this, view);
            }
        });
        I0().h1(U0(h1.f49919c), a1(), new androidx.fragment.app.v() { // from class: c9.x
            @Override // androidx.fragment.app.v
            public final void a(String str, Bundle bundle) {
                y.s3(y.this, str, bundle);
            }
        });
        I0().g1("SearchLiveLoaded", k3.b.a(wn.q.a("bundleKey", "loaded")));
    }

    public final boolean t3() {
        androidx.fragment.app.h j02;
        return h1() || m1() || (j02 = j0()) == null || j02.isFinishing();
    }

    public final void u3(String str) {
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.f18990z0)) {
                ArrayAdapter<String> arrayAdapter = this.B0;
                if (arrayAdapter != null) {
                    jo.p.e(arrayAdapter);
                    arrayAdapter.clear();
                }
                this.f18990z0 = "";
            }
            o3();
            return;
        }
        x3();
        this.f18990z0 = str;
        a.e eVar = new a.e(str, this.A0);
        w0.a aVar = w0.P0;
        String uuid = UUID.randomUUID().toString();
        jo.p.g(uuid, "randomUUID().toString()");
        p0().k().r(m3().B.getId(), aVar.a(uuid, Referer.Search.LIVE, eVar)).i();
    }

    public final void v3(t8.a0 a0Var) {
        this.f18989y0.a(this, F0[0], a0Var);
    }

    public final void w3() {
        if (t3()) {
            return;
        }
        m3().F.setVisibility(8);
        m3().C.setVisibility(0);
        m3().D.setVisibility(8);
    }

    public final void x3() {
        if (t3()) {
            return;
        }
        m3().F.setVisibility(8);
        m3().C.setVisibility(8);
        m3().D.setVisibility(0);
    }

    public final void y3() {
        if (t3()) {
            return;
        }
        m3().F.setVisibility(0);
        m3().C.setVisibility(8);
        m3().D.setVisibility(8);
    }
}
