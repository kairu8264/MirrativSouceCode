package com.dena.mirrativ.catalog.groupshot;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.dena.mirrativ.catalog.groupshot.GroupShotGalleryDetailActivity;
import com.dena.mirrativ.catalog.groupshot.GroupShotGalleryFragment;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.GroupShotItem;
import ha.a;
import io.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jo.q;
import kotlin.KotlinNothingValueException;
import kq.a;
import of.n;
import r8.f1;
import r8.h1;
import t8.o;
import uo.q0;
import uo.r0;
import v8.g;
import v8.l;
import wn.v;
import xn.r;
import xn.s;
import xn.t;
import xo.w;
import yd.t1;

/* loaded from: classes.dex */
public final class GroupShotGalleryFragment extends Fragment implements q0 {
    public static final a B0 = new a(null);
    public static final int C0 = 8;
    public static final List<Integer> D0 = s.m(2, 20);
    public static final List<Integer> E0 = s.m(8, 15);
    public final wn.f A0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f20498x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f20499y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f20500z0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final GroupShotGalleryFragment a() {
            return new GroupShotGalleryFragment();
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.GroupShotGalleryFragment$observeStoreValues$1", f = "GroupShotGalleryFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20501w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o f20503y;

        /* loaded from: classes.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ GroupShotGalleryFragment f20504w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GroupShotGalleryFragment groupShotGalleryFragment) {
                super(0);
                this.f20504w = groupShotGalleryFragment;
            }

            public final void a() {
                this.f20504w.p3().e(Referer.Broadcast.GROUPSHOT_GALLERY);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f20503y = oVar;
        }

        public static final void g(o oVar, GroupShotGalleryFragment groupShotGalleryFragment, ha.a aVar) {
            oVar.C.setRefreshing(false);
            if (aVar instanceof a.d) {
                oVar.D.b(StatusView.b.c.f20791w);
            } else if (aVar instanceof a.b) {
                oVar.D.b(StatusView.b.C0181b.f20790w);
            } else if (aVar instanceof a.C0439a) {
                StatusView statusView = oVar.D;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = groupShotGalleryFragment.U0(h1.f49918a);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                statusView.b(new StatusView.b.a(message, new a(groupShotGalleryFragment)));
            }
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f20503y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f20501w == 0) {
                wn.m.b(obj);
                LiveData<ha.a> m10 = GroupShotGalleryFragment.this.r3().m();
                u a12 = GroupShotGalleryFragment.this.a1();
                final o oVar = this.f20503y;
                final GroupShotGalleryFragment groupShotGalleryFragment = GroupShotGalleryFragment.this;
                m10.i(a12, new f0() { // from class: v8.j
                    @Override // androidx.lifecycle.f0
                    public final void d(Object obj2) {
                        GroupShotGalleryFragment.b.g(t8.o.this, groupShotGalleryFragment, (ha.a) obj2);
                    }
                });
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.GroupShotGalleryFragment$observeStoreValues$2", f = "GroupShotGalleryFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20505w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o f20507y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o oVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f20507y = oVar;
        }

        public static final void g(o oVar, GroupShotGalleryFragment groupShotGalleryFragment, List list) {
            RecyclerView.h adapter = oVar.B.getAdapter();
            jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.catalog.groupshot.GroupShotGalleryAdapter");
            jo.p.g(list, "groupShotItems");
            ((v8.d) adapter).d(groupShotGalleryFragment.o3(list));
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f20507y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f20505w == 0) {
                wn.m.b(obj);
                LiveData<List<GroupShotItem>> k10 = GroupShotGalleryFragment.this.r3().k();
                u a12 = GroupShotGalleryFragment.this.a1();
                final o oVar = this.f20507y;
                final GroupShotGalleryFragment groupShotGalleryFragment = GroupShotGalleryFragment.this;
                k10.i(a12, new f0() { // from class: v8.k
                    @Override // androidx.lifecycle.f0
                    public final void d(Object obj2) {
                        GroupShotGalleryFragment.c.g(t8.o.this, groupShotGalleryFragment, (List) obj2);
                    }
                });
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.GroupShotGalleryFragment$observeStoreValues$3", f = "GroupShotGalleryFragment.kt", l = {197}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20508w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ GroupShotGalleryFragment f20510w;

            public a(GroupShotGalleryFragment groupShotGalleryFragment) {
                this.f20510w = groupShotGalleryFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                if (jo.p.c(mRError, MRError.ForceUpdate.INSTANCE) ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                    n.f45411a.l(this.f20510w.N2(), mRError);
                } else {
                    t1.a aVar = t1.f61795x;
                    Context N2 = this.f20510w.N2();
                    jo.p.g(N2, "requireContext()");
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f20510w.U0(h1.f49918a);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    aVar.a(N2, message);
                }
                return v.f59242a;
            }
        }

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
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
            int i10 = this.f20508w;
            if (i10 == 0) {
                wn.m.b(obj);
                w<MRError> h10 = GroupShotGalleryFragment.this.r3().h();
                a aVar = new a(GroupShotGalleryFragment.this);
                this.f20508w = 1;
                if (h10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o f20511a;

        public e(o oVar) {
            this.f20511a = oVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            jo.p.h(rect, "outRect");
            jo.p.h(view, "view");
            jo.p.h(recyclerView, "parent");
            jo.p.h(b0Var, "state");
            super.g(rect, view, recyclerView, b0Var);
            int f02 = recyclerView.f0(view);
            if (f02 == -1) {
                return;
            }
            int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd();
            int i10 = ((int) (measuredWidth * 0.02f)) / 2;
            int i11 = (measuredWidth / 3) - i10;
            int i12 = (i11 * 150) / 113;
            RecyclerView.e0 h02 = recyclerView.h0(view);
            if (h02 instanceof v8.m) {
                view.getLayoutParams().width = (i11 * 2) + i10;
            } else if (h02 instanceof v8.n) {
                RecyclerView.h adapter = this.f20511a.B.getAdapter();
                jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.catalog.groupshot.GroupShotGalleryAdapter");
                v8.d dVar = (v8.d) adapter;
                int i13 = f02 / 3;
                boolean z17 = true;
                if (i13 > 0) {
                    int i14 = (i13 - 1) * 3;
                    List<v8.l> subList = dVar.a().subList(i14, Math.min(i14 + 3, dVar.getItemCount()));
                    boolean z18 = subList instanceof Collection;
                    if (!z18 || !subList.isEmpty()) {
                        for (v8.l lVar : subList) {
                            if (lVar.f() == l.b.LARGE) {
                                z13 = true;
                                continue;
                            } else {
                                z13 = false;
                                continue;
                            }
                            if (z13) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    z14 = false;
                    if (!z18 || !subList.isEmpty()) {
                        for (v8.l lVar2 : subList) {
                            if (lVar2.f() == l.b.VERTICAL) {
                                z15 = true;
                                continue;
                            } else {
                                z15 = false;
                                continue;
                            }
                            if (z15) {
                                z16 = true;
                                break;
                            }
                        }
                    }
                    z16 = false;
                    if (z14 || z16) {
                        rect.set(0, -i12, 0, 0);
                    }
                }
                int i15 = i13 * 3;
                List<v8.l> subList2 = dVar.a().subList(i15, Math.min(i15 + 3, dVar.getItemCount()));
                boolean z19 = subList2 instanceof Collection;
                if (!z19 || !subList2.isEmpty()) {
                    for (v8.l lVar3 : subList2) {
                        if (lVar3.f() == l.b.LARGE) {
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
                if (!z19 || !subList2.isEmpty()) {
                    for (v8.l lVar4 : subList2) {
                        if (lVar4.f() == l.b.VERTICAL) {
                            z12 = true;
                            continue;
                        } else {
                            z12 = false;
                            continue;
                        }
                        if (z12) {
                            break;
                        }
                    }
                }
                z17 = false;
                if (z11 || z17) {
                    rect.set(0, 0, 0, i12);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements v8.e {
        public f() {
        }

        @Override // v8.e
        public void a(String str) {
            jo.p.h(str, "userId");
            GroupShotGalleryFragment groupShotGalleryFragment = GroupShotGalleryFragment.this;
            tb.c q32 = groupShotGalleryFragment.q3();
            Context N2 = GroupShotGalleryFragment.this.N2();
            jo.p.g(N2, "requireContext()");
            groupShotGalleryFragment.f3(q32.s(N2, str, Referer.Broadcast.GROUPSHOT_GALLERY));
        }

        @Override // v8.e
        public void b(String str, n3.d<View, String>... dVarArr) {
            Object obj;
            jo.p.h(str, "groupShotId");
            jo.p.h(dVarArr, "sharedElements");
            List<GroupShotItem> f10 = GroupShotGalleryFragment.this.r3().k().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((GroupShotItem) obj).getId(), str)) {
                        break;
                    }
                }
                GroupShotItem groupShotItem = (GroupShotItem) obj;
                if (groupShotItem == null) {
                    return;
                }
                g.a aVar = v8.g.J;
                Context N2 = GroupShotGalleryFragment.this.N2();
                jo.p.g(N2, "requireContext()");
                v8.g a10 = aVar.a(N2, groupShotItem);
                GroupShotGalleryDetailActivity.a aVar2 = GroupShotGalleryDetailActivity.U;
                Context N22 = GroupShotGalleryFragment.this.N2();
                jo.p.g(N22, "requireContext()");
                Intent a11 = aVar2.a(N22, a10, Referer.Broadcast.GROUPSHOT_GALLERY);
                b3.b a12 = b3.b.a(GroupShotGalleryFragment.this.L2(), (n3.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
                jo.p.g(a12, "makeSceneTransitionAnima…ivity(), *sharedElements)");
                GroupShotGalleryFragment.this.g3(a11, a12.b());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends RecyclerView.u {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            Integer f10;
            int intValue;
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager == null) {
                return;
            }
            int l22 = gridLayoutManager.l2();
            ha.a f11 = GroupShotGalleryFragment.this.r3().m().f();
            boolean z10 = true;
            if (f11 == null || !f11.a()) {
                z10 = false;
            }
            if (z10 || (f10 = GroupShotGalleryFragment.this.r3().l().f()) == null || (intValue = f10.intValue()) == 0 || l22 + 5 < gridLayoutManager.j0()) {
                return;
            }
            GroupShotGalleryFragment.this.p3().d(Referer.Broadcast.GROUPSHOT_GALLERY, intValue);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.a<od.q> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20514w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20515x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20516y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20514w = componentCallbacks;
            this.f20515x = aVar;
            this.f20516y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.q] */
        @Override // io.a
        public final od.q invoke() {
            ComponentCallbacks componentCallbacks = this.f20514w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.q.class), this.f20515x, this.f20516y);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20517w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20518x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20519y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20517w = componentCallbacks;
            this.f20518x = aVar;
            this.f20519y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f20517w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f20518x, this.f20519y);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f20520w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f20520w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f20520w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f20520w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20521w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f20521w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f20521w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20522w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20523x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20524y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20525z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20522w = aVar;
            this.f20523x = aVar2;
            this.f20524y = aVar3;
            this.f20525z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20522w;
            vq.a aVar2 = this.f20523x;
            io.a aVar3 = this.f20524y;
            xq.a aVar4 = this.f20525z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.p.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20526w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f20526w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f20526w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public GroupShotGalleryFragment() {
        super(f1.fragment_group_shot_gallery);
        this.f20498x0 = new da.j();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f20499y0 = wn.g.b(iVar, new h(this, null, null));
        j jVar = new j(this);
        xq.a a10 = gq.a.a(this);
        k kVar = new k(jVar);
        this.f20500z0 = e0.a(this, jo.f0.b(nf.p.class), new m(kVar), new l(jVar, null, null, a10));
        this.A0 = wn.g.b(iVar, new i(this, null, null));
    }

    public static final void u3(GroupShotGalleryFragment groupShotGalleryFragment) {
        jo.p.h(groupShotGalleryFragment, "this$0");
        groupShotGalleryFragment.p3().e(Referer.Broadcast.GROUPSHOT_GALLERY);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        o T = o.T(view);
        jo.p.g(T, "binding");
        t3(T);
        s3(T);
        p3().e(Referer.Broadcast.GROUPSHOT_GALLERY);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f20498x0.getCoroutineContext();
    }

    public final List<v8.l> o3(List<GroupShotItem> list) {
        List m10;
        l.b bVar;
        ArrayList arrayList = new ArrayList(t.u(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.t();
            }
            GroupShotItem groupShotItem = (GroupShotItem) obj;
            int i12 = i10 % 28;
            if (D0.contains(Integer.valueOf(i12))) {
                bVar = l.b.VERTICAL;
            } else {
                bVar = E0.contains(Integer.valueOf(i12)) ? l.b.LARGE : l.b.SMALL;
            }
            l.a aVar = v8.l.I;
            Context N2 = N2();
            jo.p.g(N2, "requireContext()");
            arrayList.add(aVar.a(N2, groupShotItem, bVar));
            i10 = i11;
        }
        ArrayList arrayList2 = new ArrayList(t.u(arrayList, 10));
        int i13 = 0;
        for (Object obj2 : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                s.t();
            }
            v8.l lVar = (v8.l) obj2;
            l.b f10 = ((v8.l) arrayList.get(Math.max(i13 - 1, 0))).f();
            l.b bVar2 = l.b.LARGE;
            if (f10 == bVar2) {
                m10 = s.m(v8.l.I.b(), lVar);
            } else if (((v8.l) arrayList.get(Math.max(i13 - 2, 0))).f() == bVar2) {
                l.a aVar2 = v8.l.I;
                m10 = s.m(aVar2.b(), aVar2.b(), lVar);
            } else {
                m10 = ((v8.l) arrayList.get(Math.max(i13 + (-3), 0))).f() == l.b.VERTICAL ? s.m(v8.l.I.b(), lVar) : r.d(lVar);
            }
            arrayList2.add(m10);
            i13 = i14;
        }
        return t.v(arrayList2);
    }

    public final od.q p3() {
        return (od.q) this.f20499y0.getValue();
    }

    public final tb.c q3() {
        return (tb.c) this.A0.getValue();
    }

    public final nf.p r3() {
        return (nf.p) this.f20500z0.getValue();
    }

    public final void s3(o oVar) {
        uo.l.d(this, null, null, new b(oVar, null), 3, null);
        uo.l.d(this, null, null, new c(oVar, null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final void t3(final o oVar) {
        oVar.C.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: v8.i
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                GroupShotGalleryFragment.u3(GroupShotGalleryFragment.this);
            }
        });
        RecyclerView recyclerView = oVar.B;
        final Context N2 = N2();
        recyclerView.setLayoutManager(new GridLayoutManager(N2) { // from class: com.dena.mirrativ.catalog.groupshot.GroupShotGalleryFragment$setupUserActions$2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void V1(RecyclerView.b0 b0Var, int[] iArr) {
                jo.p.h(b0Var, "state");
                jo.p.h(iArr, "extraLayoutSpace");
                int measuredHeight = o.this.B.getMeasuredHeight();
                iArr[0] = 0;
                iArr[1] = measuredHeight / 2;
            }
        });
        oVar.B.g(new e(oVar));
        RecyclerView recyclerView2 = oVar.B;
        v8.d dVar = new v8.d(3, 0.02f);
        dVar.g(new f());
        recyclerView2.setAdapter(dVar);
        oVar.B.setItemAnimator(null);
        oVar.B.k(new g());
    }
}
