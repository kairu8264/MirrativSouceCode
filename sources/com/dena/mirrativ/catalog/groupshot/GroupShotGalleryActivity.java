package com.dena.mirrativ.catalog.groupshot;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.viewpager.widget.ViewPager;
import co.l;
import com.dena.mirrativ.catalog.groupshot.GroupShotGalleryActivity;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.PhotoCampaign;
import com.google.android.material.tabs.TabLayout;
import gf.y0;
import ha.a;
import java.util.ArrayList;
import java.util.List;
import jo.f0;
import jo.q;
import kotlin.KotlinNothingValueException;
import kq.a;
import nf.p;
import of.n;
import r8.b1;
import r8.d1;
import r8.f1;
import r8.g1;
import r8.h1;
import t8.e0;
import uo.q0;
import uo.r0;
import v8.o;
import wn.m;
import wn.v;
import xn.s;
import xn.t;
import xo.w;

/* loaded from: classes.dex */
public final class GroupShotGalleryActivity extends e.b implements q0 {
    public static final a Y = new a(null);
    public static final int Z = 8;
    public t8.a Q;
    public e0 R;
    public e0 S;
    public final /* synthetic */ da.j O = new da.j();
    public final String P = Referer.GROUPSHOT_CAMPAIGN;
    public final wn.f T = wn.g.a(new c());
    public final wn.f U = wn.g.a(new b());
    public final wn.f V = wn.g.a(new j());
    public final wn.f W = wn.g.b(wn.i.SYNCHRONIZED, new f(this, null, null));
    public final wn.f X = new s0(f0.b(p.class), new i(this), new h(new g(this), null, null, gq.a.a(this)));

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, boolean z10, String str, String str2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = null;
            }
            if ((i10 & 8) != 0) {
                str2 = null;
            }
            return aVar.a(context, z10, str, str2);
        }

        public final Intent a(Context context, boolean z10, String str, String str2) {
            jo.p.h(context, "context");
            Intent intent = new Intent(context, GroupShotGalleryActivity.class);
            intent.putExtra("EXTRA_KEY_IS_CAMPAIGN_TAB_SELECTED", z10);
            intent.putExtra("EXTRA_KEY_CAMPAIGN_ID", str);
            intent.putExtra("EXTRA_KEY_USER_ID", str2);
            return intent;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            GroupShotGalleryActivity.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return GroupShotGalleryActivity.this.getIntent().getStringExtra("EXTRA_KEY_CAMPAIGN_ID");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            GroupShotGalleryActivity.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(GroupShotGalleryActivity.this.getIntent().getBooleanExtra("EXTRA_KEY_IS_CAMPAIGN_TAB_SELECTED", false));
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.GroupShotGalleryActivity$observeStoreValues$1", f = "GroupShotGalleryActivity.kt", l = {100}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w */
        public int f20470w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<PhotoCampaign> {

            /* renamed from: w */
            public final /* synthetic */ GroupShotGalleryActivity f20472w;

            public a(GroupShotGalleryActivity groupShotGalleryActivity) {
                this.f20472w = groupShotGalleryActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(PhotoCampaign photoCampaign, ao.d<? super v> dVar) {
                this.f20472w.J3(photoCampaign);
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ao.d<? super d> dVar) {
            super(2, dVar);
            GroupShotGalleryActivity.this = r1;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f20470w;
            if (i10 == 0) {
                m.b(obj);
                w<PhotoCampaign> j10 = GroupShotGalleryActivity.this.E3().j();
                a aVar = new a(GroupShotGalleryActivity.this);
                this.f20470w = 1;
                if (j10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends ViewPager.n {

        /* renamed from: b */
        public final /* synthetic */ List<o> f20474b;

        public e(List<o> list) {
            GroupShotGalleryActivity.this = r1;
            this.f20474b = list;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            GroupShotGalleryActivity.this.M3(i10, this.f20474b);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<od.q> {

        /* renamed from: w */
        public final /* synthetic */ ComponentCallbacks f20475w;

        /* renamed from: x */
        public final /* synthetic */ vq.a f20476x;

        /* renamed from: y */
        public final /* synthetic */ io.a f20477y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20475w = componentCallbacks;
            this.f20476x = aVar;
            this.f20477y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.q] */
        @Override // io.a
        public final od.q invoke() {
            ComponentCallbacks componentCallbacks = this.f20475w;
            return gq.a.a(componentCallbacks).c(f0.b(od.q.class), this.f20476x, this.f20477y);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.a<kq.a> {

        /* renamed from: w */
        public final /* synthetic */ ComponentActivity f20478w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f20478w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f20478w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.a<t0.b> {

        /* renamed from: w */
        public final /* synthetic */ io.a f20479w;

        /* renamed from: x */
        public final /* synthetic */ vq.a f20480x;

        /* renamed from: y */
        public final /* synthetic */ io.a f20481y;

        /* renamed from: z */
        public final /* synthetic */ xq.a f20482z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20479w = aVar;
            this.f20480x = aVar2;
            this.f20481y = aVar3;
            this.f20482z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20479w;
            vq.a aVar2 = this.f20480x;
            io.a aVar3 = this.f20481y;
            xq.a aVar4 = this.f20482z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(p.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.a<u0> {

        /* renamed from: w */
        public final /* synthetic */ ComponentActivity f20483w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f20483w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f20483w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends q implements io.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j() {
            super(0);
            GroupShotGalleryActivity.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return GroupShotGalleryActivity.this.getIntent().getStringExtra("EXTRA_KEY_USER_ID");
        }
    }

    public static final void I3(GroupShotGalleryActivity groupShotGalleryActivity, ha.a aVar) {
        jo.p.h(groupShotGalleryActivity, "this$0");
        t8.a aVar2 = null;
        if (aVar instanceof a.d) {
            t8.a aVar3 = groupShotGalleryActivity.Q;
            if (aVar3 == null) {
                jo.p.v("binding");
            } else {
                aVar2 = aVar3;
            }
            aVar2.B.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            t8.a aVar4 = groupShotGalleryActivity.Q;
            if (aVar4 == null) {
                jo.p.v("binding");
            } else {
                aVar2 = aVar4;
            }
            aVar2.B.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.C0439a) {
            a.C0439a c0439a = (a.C0439a) aVar;
            MRError b10 = c0439a.b();
            if (b10 instanceof MRError.ForceUpdate ? true : jo.p.c(b10, MRError.Maintenance.INSTANCE)) {
                n.f45411a.l(groupShotGalleryActivity, c0439a.b());
                return;
            }
            t8.a aVar5 = groupShotGalleryActivity.Q;
            if (aVar5 == null) {
                jo.p.v("binding");
                aVar5 = null;
            }
            aVar5.B.b(StatusView.b.c.f20791w);
            groupShotGalleryActivity.J3(null);
        }
    }

    public static final void L3(GroupShotGalleryActivity groupShotGalleryActivity, View view) {
        jo.p.h(groupShotGalleryActivity, "this$0");
        groupShotGalleryActivity.onBackPressed();
    }

    public final od.q C3() {
        return (od.q) this.W.getValue();
    }

    public final String D3() {
        return (String) this.U.getValue();
    }

    public final p E3() {
        return (p) this.X.getValue();
    }

    public final String F3() {
        return (String) this.V.getValue();
    }

    public final boolean G3() {
        return ((Boolean) this.T.getValue()).booleanValue();
    }

    public final void H3() {
        uo.l.d(this, null, null, new d(null), 3, null);
        E3().i().i(this, new androidx.lifecycle.f0() { // from class: v8.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                GroupShotGalleryActivity.I3(GroupShotGalleryActivity.this, (ha.a) obj);
            }
        });
    }

    public final void J3(PhotoCampaign photoCampaign) {
        o oVar;
        e0 e0Var;
        e0 e0Var2;
        int i10 = 0;
        boolean z10 = photoCampaign != null;
        o[] oVarArr = new o[2];
        if (z10) {
            String string = getString(h1.f49920d);
            jo.p.g(string, "getString(R.string.text_campaign)");
            y0.a aVar = y0.I0;
            jo.p.e(photoCampaign);
            y0 a10 = aVar.a(photoCampaign.getUrl(), this.P);
            boolean G3 = G3();
            e0 e0Var3 = this.R;
            if (e0Var3 == null) {
                jo.p.v("campaignTabBinding");
                e0Var2 = null;
            } else {
                e0Var2 = e0Var3;
            }
            oVar = new o(string, a10, G3, e0Var2, d1.f49853p, d1.f49854q);
        } else {
            oVar = null;
        }
        oVarArr[0] = oVar;
        String string2 = getString(h1.text_groupshot);
        jo.p.g(string2, "getString(R.string.text_groupshot)");
        GroupShotGalleryFragment a11 = GroupShotGalleryFragment.B0.a();
        boolean z11 = !G3();
        e0 e0Var4 = this.S;
        if (e0Var4 == null) {
            jo.p.v("groupShotGalleryTabBinding");
            e0Var = null;
        } else {
            e0Var = e0Var4;
        }
        oVarArr[1] = new o(string2, a11, z11, e0Var, d1.ic_group_shot_gallery_selected, d1.ic_group_shot_gallery_unselected);
        List<o> o10 = s.o(oVarArr);
        ArrayList arrayList = new ArrayList(t.u(o10, 10));
        for (o oVar2 : o10) {
            arrayList.add(oVar2.d());
        }
        ArrayList arrayList2 = new ArrayList(t.u(o10, 10));
        for (o oVar3 : o10) {
            arrayList2.add(oVar3.a());
        }
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        rd.h hVar = new rd.h(arrayList, arrayList2, a32);
        t8.a aVar2 = this.Q;
        if (aVar2 == null) {
            jo.p.v("binding");
            aVar2 = null;
        }
        aVar2.F.setAdapter(hVar);
        t8.a aVar3 = this.Q;
        if (aVar3 == null) {
            jo.p.v("binding");
            aVar3 = null;
        }
        aVar3.F.setOffscreenPageLimit(hVar.c());
        t8.a aVar4 = this.Q;
        if (aVar4 == null) {
            jo.p.v("binding");
            aVar4 = null;
        }
        aVar4.F.c(new e(o10));
        t8.a aVar5 = this.Q;
        if (aVar5 == null) {
            jo.p.v("binding");
            aVar5 = null;
        }
        aVar5.C.setVisibility(z10 ? 0 : 8);
        t8.a aVar6 = this.Q;
        if (aVar6 == null) {
            jo.p.v("binding");
            aVar6 = null;
        }
        TabLayout tabLayout = aVar6.C;
        t8.a aVar7 = this.Q;
        if (aVar7 == null) {
            jo.p.v("binding");
            aVar7 = null;
        }
        tabLayout.setupWithViewPager(aVar7.F);
        for (Object obj : o10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.t();
            }
            o oVar4 = (o) obj;
            t8.a aVar8 = this.Q;
            if (aVar8 == null) {
                jo.p.v("binding");
                aVar8 = null;
            }
            TabLayout.g x10 = aVar8.C.x(i10);
            if (x10 != null) {
                e0 c10 = oVar4.c();
                c10.C.setText(oVar4.d());
                x10.p(c10.u());
            }
            if (oVar4.f()) {
                M3(i10, o10);
                t8.a aVar9 = this.Q;
                if (aVar9 == null) {
                    jo.p.v("binding");
                    aVar9 = null;
                }
                aVar9.F.setCurrentItem(i10);
            }
            i10 = i11;
        }
    }

    public final void K3() {
        t8.a aVar = this.Q;
        t8.a aVar2 = null;
        if (aVar == null) {
            jo.p.v("binding");
            aVar = null;
        }
        aVar.E.B.setNavigationIcon(d1.f49847h);
        t8.a aVar3 = this.Q;
        if (aVar3 == null) {
            jo.p.v("binding");
            aVar3 = null;
        }
        aVar3.E.B.setNavigationOnClickListener(new View.OnClickListener() { // from class: v8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupShotGalleryActivity.L3(GroupShotGalleryActivity.this, view);
            }
        });
        t8.a aVar4 = this.Q;
        if (aVar4 == null) {
            jo.p.v("binding");
            aVar4 = null;
        }
        aVar4.E.C.setText(h1.text_groupshot_gallery_title);
        t8.a aVar5 = this.Q;
        if (aVar5 == null) {
            jo.p.v("binding");
        } else {
            aVar2 = aVar5;
        }
        aVar2.E.B.setBackgroundResource(g1.f49912d);
    }

    public final void M3(int i10, List<o> list) {
        int color = getColor(b1.f49834d);
        int color2 = getColor(b1.f49832a);
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                s.t();
            }
            o oVar = (o) obj;
            boolean z10 = i10 == i11;
            e0 c10 = oVar.c();
            c10.B.setImageResource(z10 ? oVar.b() : oVar.e());
            c10.C.setTextColor(z10 ? color : color2);
            c10.C.setTypeface(z10 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            i11 = i12;
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, f1.activity_group_shot_gallery);
        jo.p.g(g10, "setContentView(this, R.l…ivity_group_shot_gallery)");
        this.Q = (t8.a) g10;
        e0 T = e0.T(LayoutInflater.from(this), null, false);
        jo.p.g(T, "inflate(LayoutInflater.from(this), null, false)");
        this.R = T;
        e0 T2 = e0.T(LayoutInflater.from(this), null, false);
        jo.p.g(T2, "inflate(LayoutInflater.from(this), null, false)");
        this.S = T2;
        K3();
        H3();
        C3().c(this.P, D3(), F3());
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }
}
