package com.dena.mirrativ.catalog.home.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c9.u;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.catalog.search.SearchActivity;
import com.dena.mirrorman.clientlog.logs.Home;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import io.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jf.d0;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import oq.a;
import r8.d1;
import t8.i0;
import ud.i2;
import ud.j2;
import wn.v;
import xn.t;
import y8.c;
import y8.d;
import y8.g;

/* loaded from: classes.dex */
public final class AppsView extends ConstraintLayout implements oq.a {
    public final wn.f U;
    public l<? super App.AppParams, v> V;
    public final y8.e W;

    /* renamed from: a0  reason: collision with root package name */
    public App.AppParams f20663a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f20664b0;

    /* renamed from: c0  reason: collision with root package name */
    public y8.c f20665c0;

    /* renamed from: d0  reason: collision with root package name */
    public i0 f20666d0;

    /* loaded from: classes.dex */
    public static final class a extends RecyclerView.o {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f20668b;

        public a(Context context) {
            this.f20668b = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            int a10;
            p.h(rect, "outRect");
            p.h(view, "view");
            p.h(recyclerView, "parent");
            p.h(b0Var, "state");
            y8.c cVar = AppsView.this.f20665c0;
            if (cVar == null) {
                return;
            }
            int f02 = recyclerView.f0(view);
            RecyclerView.h adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int a11 = cVar.a();
            if (f02 == itemCount - 1) {
                a10 = cVar.b(AppsView.this.f20666d0.J.getWidth());
            } else {
                a10 = cVar.i(f02) ? cVar.a() + cVar.f() : 0;
            }
            rect.set(a11, 0, a10, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            p.h(canvas, "c");
            p.h(recyclerView, "parent");
            p.h(b0Var, "state");
            Drawable drawable = this.f20668b.getDrawable(d1.divider_very_light_pink);
            if (drawable != null) {
                AppsView appsView = AppsView.this;
                int paddingTop = recyclerView.getPaddingTop();
                int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                int childCount = recyclerView.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = recyclerView.getChildAt(i10);
                    int f02 = recyclerView.f0(childAt);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    p.f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    RecyclerView.q qVar = (RecyclerView.q) layoutParams;
                    y8.c cVar = appsView.f20665c0;
                    if (cVar != null && cVar.i(f02)) {
                        int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + cVar.a();
                        drawable.setBounds(right, paddingTop, drawable.getIntrinsicWidth() + right, height);
                        drawable.draw(canvas);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            p.h(recyclerView, "recyclerView");
            AppsView.this.f20664b0 += i10;
            AppsView.this.B();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20670a;

        static {
            int[] iArr = new int[d.a.values().length];
            iArr[d.a.Add.ordinal()] = 1;
            iArr[d.a.AddWithRegistrationGuide.ordinal()] = 2;
            f20670a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements l<String, v> {
        public d() {
            super(1);
        }

        public final void a(String str) {
            List<y8.d> c10;
            App.AppParams a10;
            l<App.AppParams, v> onAppClickListener;
            p.h(str, "appId");
            y8.c cVar = AppsView.this.f20665c0;
            if (cVar == null || (c10 = cVar.c()) == null) {
                return;
            }
            for (y8.d dVar : c10) {
                App.AppParams a11 = dVar.a();
                if (p.c(a11 != null ? a11.getAppId() : null, str)) {
                    if (dVar == null || (a10 = dVar.a()) == null || (onAppClickListener = AppsView.this.getOnAppClickListener()) == null) {
                        return;
                    }
                    onAppClickListener.invoke(a10);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Context f20672w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.f20672w = context;
        }

        public final void a() {
            Context context = this.f20672w;
            context.startActivity(SearchActivity.Q.a(context, u.APPS, null, null));
            Puree.d(new Home.ClickPlusApp(Referer.HOME_SELECT));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f20673w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20674x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20675y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f20673w = aVar;
            this.f20674x = aVar2;
            this.f20675y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jf.d0] */
        @Override // io.a
        public final d0 invoke() {
            xq.a b10;
            oq.a aVar = this.f20673w;
            vq.a aVar2 = this.f20674x;
            io.a<? extends uq.a> aVar3 = this.f20675y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(d0.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ AppsView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final d0 getMyAppRepository() {
        return (d0) this.U.getValue();
    }

    public final void B() {
        ConstraintLayout constraintLayout = this.f20666d0.L;
        y8.c cVar = this.f20665c0;
        constraintLayout.setTranslationX(cVar != null ? cVar.g(c.a.Pr, this.f20664b0, constraintLayout.getWidth()) : 0.0f);
        ConstraintLayout constraintLayout2 = this.f20666d0.D;
        y8.c cVar2 = this.f20665c0;
        constraintLayout2.setTranslationX(cVar2 != null ? cVar2.g(c.a.Event, this.f20664b0, constraintLayout2.getWidth()) : 0.0f);
        ConstraintLayout constraintLayout3 = this.f20666d0.F;
        y8.c cVar3 = this.f20665c0;
        constraintLayout3.setTranslationX(cVar3 != null ? cVar3.g(c.a.MyApp, this.f20664b0, constraintLayout3.getWidth()) : 0.0f);
        ConstraintLayout constraintLayout4 = this.f20666d0.J;
        y8.c cVar4 = this.f20665c0;
        constraintLayout4.setTranslationX(cVar4 != null ? cVar4.g(c.a.OnliveApp, this.f20664b0, constraintLayout4.getWidth()) : 0.0f);
    }

    public final void C(List<App.AppParams> list, App.AppParams appParams) {
        boolean z10;
        boolean z11;
        j2 i2Var;
        List<y8.d> c10;
        d.a aVar;
        Object obj;
        l<? super App.AppParams, v> lVar;
        p.h(list, "apps");
        setSelectedApp(appParams);
        if (appParams != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p.c(((App.AppParams) obj).getAppId(), appParams.getAppId())) {
                    break;
                }
            }
            if (obj == null && (lVar = this.V) != null) {
                lVar.invoke(appParams);
            }
        }
        this.f20666d0.B.setVisibility(0);
        ArrayList<y8.d> arrayList = new ArrayList(t.u(list, 10));
        for (App.AppParams appParams2 : list) {
            y8.d dVar = new y8.d();
            dVar.c(appParams2);
            if (appParams == null) {
                aVar = d.a.Normal;
            } else {
                aVar = p.c(appParams.getAppId(), appParams2.getAppId()) ? d.a.Selected : d.a.NotSelected;
            }
            dVar.d(aVar);
            arrayList.add(dVar);
        }
        Context context = getContext();
        p.g(context, "context");
        y8.c cVar = new y8.c(context, arrayList);
        this.f20665c0 = cVar;
        this.f20666d0.L.setVisibility(cVar.h(c.a.Pr));
        ConstraintLayout constraintLayout = this.f20666d0.D;
        y8.c cVar2 = this.f20665c0;
        constraintLayout.setVisibility(cVar2 != null ? cVar2.h(c.a.Event) : 8);
        ConstraintLayout constraintLayout2 = this.f20666d0.J;
        y8.c cVar3 = this.f20665c0;
        constraintLayout2.setVisibility(cVar3 != null ? cVar3.h(c.a.OnliveApp) : 8);
        y8.c cVar4 = this.f20665c0;
        if (cVar4 != null && (c10 = cVar4.c()) != null) {
            arrayList = c10;
        }
        if (!arrayList.isEmpty()) {
            for (y8.d dVar2 : arrayList) {
                if (dVar2.b() == d.a.Selected) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        y8.e eVar = this.W;
        ArrayList arrayList2 = new ArrayList(t.u(arrayList, 10));
        for (y8.d dVar3 : arrayList) {
            d.a b10 = dVar3.b();
            int i10 = b10 == null ? -1 : c.f20670a[b10.ordinal()];
            if (i10 == 1) {
                i2Var = new i2(false, null, 2, null);
            } else if (i10 != 2) {
                i2Var = g.f61300g.a(dVar3, z11);
            } else {
                i2Var = new i2(true, null, 2, null);
            }
            arrayList2.add(i2Var);
        }
        eVar.c(arrayList2);
        B();
        this.W.notifyDataSetChanged();
    }

    public final void D(App.AppParams appParams) {
        if (appParams != null && !TextUtils.isEmpty(appParams.getAppId()) && !appParams.isListing()) {
            this.f20666d0.I.setVisibility(0);
            this.f20666d0.H.setMyApp(getMyAppRepository().e(appParams.getAppId()) != null);
            AppsMyAppButton appsMyAppButton = this.f20666d0.H;
            App.AdParams ad2 = appParams.getAd();
            appsMyAppButton.setAdHeaderBanner(ad2 != null ? ad2.getHeaderBanner() : null);
            return;
        }
        this.f20666d0.I.setVisibility(8);
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final AppsMyAppButton getMyAppButton() {
        AppsMyAppButton appsMyAppButton = this.f20666d0.H;
        p.g(appsMyAppButton, "binding.myappButton");
        return appsMyAppButton;
    }

    public final l<App.AppParams, v> getOnAppClickListener() {
        return this.V;
    }

    public final App.AppParams getSelectedApp() {
        return this.f20663a0;
    }

    public final void setOnAppClickListener(l<? super App.AppParams, v> lVar) {
        this.V = lVar;
    }

    public final void setSelectedApp(App.AppParams appParams) {
        this.f20663a0 = appParams;
        D(appParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.U = wn.g.b(cr.a.f28611a.b(), new f(this, null, null));
        y8.e eVar = new y8.e(new d(), new e(context));
        this.W = eVar;
        i0 T = i0.T(LayoutInflater.from(getContext()), this, true);
        p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f20666d0 = T;
        T.C.setLayoutManager(new LinearLayoutManager(context, 0, false));
        T.C.g(new a(context));
        T.C.k(new b());
        T.C.setAdapter(eVar);
    }
}
