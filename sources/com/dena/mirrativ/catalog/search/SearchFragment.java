package com.dena.mirrativ.catalog.search;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e0;
import androidx.fragment.app.v;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.viewpager.widget.ViewPager;
import c9.b0;
import c9.u;
import c9.z;
import com.dena.mirrativ.catalog.search.SearchFragment;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.widget.PagerSlidingTab;
import com.dena.mirrorman.widget.SafeViewPager;
import jo.f0;
import jo.p;
import jo.q;
import jo.s;
import kq.a;
import of.j;
import of.t;
import qo.h;
import r8.b1;
import r8.c1;
import r8.f1;
import r8.h1;
import t8.y;

/* loaded from: classes.dex */
public final class SearchFragment extends Fragment {
    public static final /* synthetic */ h<Object>[] D0 = {f0.d(new s(SearchFragment.class, "binding", "getBinding()Lcom/dena/mirrativ/catalog/databinding/FragmentSearchBinding;", 0))};
    public static final int E0 = 8;
    public String A0;
    public String B0;
    public String C0;

    /* renamed from: x0  reason: collision with root package name */
    public final AutoClearedValue f20762x0 = nd.a.a(this);

    /* renamed from: y0  reason: collision with root package name */
    public z f20763y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f20764z0;

    /* loaded from: classes.dex */
    public static final class a implements ViewPager.j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            String obj = SearchFragment.this.s3().F.getText().toString();
            EditText editText = SearchFragment.this.s3().F;
            z zVar = SearchFragment.this.f20763y0;
            if (zVar == null) {
                p.v("mPagerAdapter");
                zVar = null;
            }
            editText.setHint(zVar.t(i10));
            SearchFragment.this.B3(obj, false);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            p.h(editable, "s");
            if (of.s.f45426a.b(SearchFragment.this.s3().F.getText().toString())) {
                SearchFragment.this.s3().B.setVisibility(8);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            p.h(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            p.h(charSequence, "s");
            SearchFragment.this.s3().B.setVisibility(0);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f20767w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f20767w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f20767w.L2();
            p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f20767w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20768w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar) {
            super(0);
            this.f20768w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f20768w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20769w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20770x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20771y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20772z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20769w = aVar;
            this.f20770x = aVar2;
            this.f20771y = aVar3;
            this.f20772z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20769w;
            vq.a aVar2 = this.f20770x;
            io.a aVar3 = this.f20771y;
            xq.a aVar4 = this.f20772z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(b0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20773w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f20773w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f20773w.invoke()).U();
            p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public SearchFragment() {
        c cVar = new c(this);
        xq.a a10 = gq.a.a(this);
        d dVar = new d(cVar);
        this.f20764z0 = e0.a(this, f0.b(b0.class), new f(dVar), new e(cVar, null, null, a10));
        this.A0 = "";
        this.B0 = "";
        this.C0 = "";
    }

    public static final void A3(SearchFragment searchFragment, String str, Bundle bundle) {
        p.h(searchFragment, "this$0");
        p.h(str, "<anonymous parameter 0>");
        p.h(bundle, "bundle");
        String string = bundle.getString("bundleKey");
        if (string != null) {
            searchFragment.s3().F.setText(string);
            searchFragment.B3(string, false);
        }
    }

    public static final void v3(SearchFragment searchFragment, String str, Bundle bundle) {
        p.h(searchFragment, "this$0");
        p.h(str, "<anonymous parameter 0>");
        p.h(bundle, "<anonymous parameter 1>");
        String h10 = searchFragment.t3().h();
        if (h10 != null) {
            searchFragment.D3(h10, true);
        }
    }

    public static final void w3(SearchFragment searchFragment, String str, Bundle bundle) {
        p.h(searchFragment, "this$0");
        p.h(str, "<anonymous parameter 0>");
        p.h(bundle, "bundle");
        searchFragment.t3().i(bundle.getString("bundleKey"));
        searchFragment.D3(searchFragment.B0, true);
    }

    public static final boolean x3(SearchFragment searchFragment, TextView textView, int i10, KeyEvent keyEvent) {
        p.h(searchFragment, "this$0");
        if (i10 == 3) {
            String obj = searchFragment.s3().F.getText().toString();
            if (!TextUtils.isEmpty(obj)) {
                j jVar = j.f45405a;
                androidx.fragment.app.h L2 = searchFragment.L2();
                p.g(L2, "requireActivity()");
                jVar.b(L2);
            }
            searchFragment.B3(obj, true);
        }
        return true;
    }

    public static final void y3(SearchFragment searchFragment, View view) {
        p.h(searchFragment, "this$0");
        searchFragment.B3(searchFragment.s3().F.getText().toString(), true);
    }

    public static final void z3(SearchFragment searchFragment, View view) {
        p.h(searchFragment, "this$0");
        searchFragment.s3().F.getText().clear();
        searchFragment.B3("", true);
    }

    public final void B3(String str, boolean z10) {
        int currentItem = s3().C.getCurrentItem();
        if (currentItem == u.STREAMS.c()) {
            D3(str, z10);
        } else if (currentItem == u.USERS.c()) {
            E3(str, z10);
        } else if (currentItem == u.APPS.c()) {
            C3(str, z10);
        } else {
            C3(str, z10);
        }
    }

    public final void C3(String str, boolean z10) {
        if (z10 || !p.c(str, this.C0)) {
            this.C0 = str;
            p0().g1(U0(h1.text_search_app), k3.b.a(wn.q.a("bundleKey", this.C0)));
        }
    }

    public final void D3(String str, boolean z10) {
        if (z10 || !p.c(str, this.B0)) {
            this.B0 = str;
            p0().g1(U0(h1.f49919c), k3.b.a(wn.q.a("bundleKey1", this.B0), wn.q.a("bundleKey2", t3().f())));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        ViewDataBinding e10 = androidx.databinding.f.e(layoutInflater, f1.fragment_search, viewGroup, false);
        p.g(e10, "inflate(inflater, R.layo…search, container, false)");
        F3((y) e10);
        View u10 = s3().u();
        p.g(u10, "binding.root");
        return u10;
    }

    public final void E3(String str, boolean z10) {
        if (z10 || !p.c(str, this.A0)) {
            this.A0 = str;
            p0().g1(U0(h1.text_users), k3.b.a(wn.q.a("bundleKey", this.A0)));
        }
    }

    public final void F3(y yVar) {
        this.f20762x0.a(this, D0[0], yVar);
    }

    public final y s3() {
        return (y) this.f20762x0.b(this, D0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void t1(Bundle bundle) {
        super.t1(bundle);
        u3();
    }

    public final b0 t3() {
        return (b0) this.f20764z0.getValue();
    }

    public final void u3() {
        Context N2 = N2();
        p.g(N2, "requireContext()");
        FragmentManager p02 = p0();
        p.g(p02, "childFragmentManager");
        this.f20763y0 = new z(N2, p02);
        SafeViewPager safeViewPager = s3().C;
        safeViewPager.setOffscreenPageLimit(2);
        z zVar = this.f20763y0;
        z zVar2 = null;
        if (zVar == null) {
            p.v("mPagerAdapter");
            zVar = null;
        }
        safeViewPager.setAdapter(zVar);
        safeViewPager.setCurrentItem(t3().g().c());
        EditText editText = s3().F;
        z zVar3 = this.f20763y0;
        if (zVar3 == null) {
            p.v("mPagerAdapter");
        } else {
            zVar2 = zVar3;
        }
        editText.setHint(zVar2.t(t3().g().c()));
        PagerSlidingTab pagerSlidingTab = s3().H;
        pagerSlidingTab.setTextSize(pagerSlidingTab.getResources().getDimensionPixelOffset(c1.f49841f));
        pagerSlidingTab.setTextColor(c3.a.d(pagerSlidingTab.getContext(), b1.f49835e));
        pagerSlidingTab.setAllCaps(false);
        Context context = pagerSlidingTab.getContext();
        p.g(context, "context");
        pagerSlidingTab.setIndicatorHeight(t.b(context, 1));
        pagerSlidingTab.setIndicatorColorResource(b1.f49836f);
        SafeViewPager safeViewPager2 = s3().C;
        p.g(safeViewPager2, "binding.pager");
        pagerSlidingTab.setViewPager(safeViewPager2);
        pagerSlidingTab.setOnPageChangeListener(new a());
        s3().F.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: c9.q
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean x32;
                x32 = SearchFragment.x3(SearchFragment.this, textView, i10, keyEvent);
                return x32;
            }
        });
        s3().F.addTextChangedListener(new b());
        s3().E.setOnClickListener(new View.OnClickListener() { // from class: c9.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchFragment.y3(SearchFragment.this, view);
            }
        });
        s3().B.setOnClickListener(new View.OnClickListener() { // from class: c9.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchFragment.z3(SearchFragment.this, view);
            }
        });
        String h10 = t3().h();
        if (h10 != null) {
            s3().F.setText(h10);
            if (s3().C.getCurrentItem() != 0) {
                B3(h10, true);
            }
        }
        p0().h1("EventSearchLiveKeyword", a1(), new v() { // from class: c9.r
            @Override // androidx.fragment.app.v
            public final void a(String str, Bundle bundle) {
                SearchFragment.A3(SearchFragment.this, str, bundle);
            }
        });
        p0().h1("SearchLiveLoaded", a1(), new v() { // from class: c9.s
            @Override // androidx.fragment.app.v
            public final void a(String str, Bundle bundle) {
                SearchFragment.v3(SearchFragment.this, str, bundle);
            }
        });
        p0().h1("SearchLiveWithApp", a1(), new v() { // from class: c9.t
            @Override // androidx.fragment.app.v
            public final void a(String str, Bundle bundle) {
                SearchFragment.w3(SearchFragment.this, str, bundle);
            }
        });
    }
}
