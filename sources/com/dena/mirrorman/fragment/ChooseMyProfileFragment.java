package com.dena.mirrorman.fragment;

import ae.g6;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.fragment.ChooseMyProfileFragment;
import gf.t;
import java.util.List;
import java.util.Locale;
import jo.f0;
import jo.s;
import kotlin.NoWhenBranchMatchedException;
import kq.a;
import nd.b1;
import nd.f1;
import nd.w0;
import nd.x0;
import nd.y0;
import nd.z0;
import nf.e;
import od.d;
import od.s0;
import uo.q0;
import wn.v;
import xn.r;

/* loaded from: classes2.dex */
public final class ChooseMyProfileFragment extends Fragment implements q0 {
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public t E0;
    public final wn.f F0;
    public final wn.f G0;
    public final wn.f H0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f26016x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final AutoClearedValue f26017y0 = nd.a.a(this);

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f26018z0;
    public static final /* synthetic */ qo.h<Object>[] J0 = {f0.d(new s(ChooseMyProfileFragment.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/FragmentChooseMyProfileBinding;", 0))};
    public static final a I0 = new a(null);
    public static final int K0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final ChooseMyProfileFragment a(String str, int i10, boolean z10) {
            jo.p.h(str, "closeText");
            ChooseMyProfileFragment chooseMyProfileFragment = new ChooseMyProfileFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_CLOSE_TEXT", str);
            bundle.putInt("EXTRA_KEY_BACKGROUND_RESOURCE_ID", i10);
            bundle.putBoolean("EXTRA_KEY_IS_DIALOG", z10);
            chooseMyProfileFragment.V2(bundle);
            return chooseMyProfileFragment;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.h<RecyclerView.e0> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f26019a;

        /* renamed from: b  reason: collision with root package name */
        public final List<e.b> f26020b;

        /* renamed from: c  reason: collision with root package name */
        public final io.p<Integer, e.b, v> f26021c;

        /* renamed from: d  reason: collision with root package name */
        public int f26022d;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f26023a;

            static {
                int[] iArr = new int[e.b.EnumC0631b.values().length];
                iArr[e.b.EnumC0631b.BEFORE.ordinal()] = 1;
                iArr[e.b.EnumC0631b.JUST.ordinal()] = 2;
                iArr[e.b.EnumC0631b.LATER.ordinal()] = 3;
                f26023a = iArr;
            }
        }

        /* renamed from: com.dena.mirrorman.fragment.ChooseMyProfileFragment$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0229b extends RecyclerView.e0 {
            public C0229b(View view) {
                super(view);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Context context, List<? extends e.b> list, io.p<? super Integer, ? super e.b, v> pVar) {
            jo.p.h(context, "context");
            jo.p.h(list, "generationList");
            jo.p.h(pVar, "onClickListener");
            this.f26019a = context;
            this.f26020b = list;
            this.f26021c = pVar;
        }

        public static final void b(b bVar, int i10, View view) {
            jo.p.h(bVar, "this$0");
            bVar.f26021c.invoke(Integer.valueOf(i10), bVar.f26020b.get(i10));
        }

        public final void c(int i10) {
            this.f26022d = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f26020b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.e0 e0Var, final int i10) {
            String string;
            jo.p.h(e0Var, "holder");
            e.b bVar = this.f26020b.get(i10);
            if (bVar instanceof e.b.c) {
                e.b.c cVar = (e.b.c) bVar;
                int i11 = a.f26023a[cVar.a().ordinal()];
                if (i11 == 1) {
                    string = this.f26019a.getString(f1.f41978k3, String.valueOf(cVar.b()));
                } else if (i11 == 2) {
                    string = this.f26019a.getString(f1.f41980n3, String.valueOf(cVar.b()));
                } else if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    string = this.f26019a.getString(f1.text_myprofile_registration_generation_later, String.valueOf(cVar.b()));
                }
            } else if (bVar instanceof e.b.a) {
                string = this.f26019a.getString(f1.f41979m3);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            jo.p.g(string, "when (val generation = g…          }\n            }");
            TextView textView = (TextView) e0Var.itemView.findViewById(z0.f42358ve);
            textView.setText(string);
            if (i10 == this.f26022d) {
                textView.setTextColor(c3.a.d(e0Var.itemView.getContext(), w0.f42242u0));
                textView.setTextSize(18.0f);
            } else {
                textView.setTextColor(c3.a.d(e0Var.itemView.getContext(), w0.Y));
                textView.setTextSize(16.0f);
            }
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: gf.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChooseMyProfileFragment.b.b(ChooseMyProfileFragment.b.this, i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
            jo.p.h(viewGroup, "parent");
            C0229b c0229b = new C0229b(LayoutInflater.from(viewGroup.getContext()).inflate(b1.M3, viewGroup, false));
            ViewGroup.LayoutParams layoutParams = c0229b.itemView.getLayoutParams();
            layoutParams.height = viewGroup.getMeasuredHeight() / 5;
            c0229b.itemView.setLayoutParams(layoutParams);
            return c0229b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        public final int f26024a;

        public c(int i10) {
            this.f26024a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            jo.p.h(rect, "outRect");
            jo.p.h(view, "view");
            jo.p.h(recyclerView, "parent");
            jo.p.h(b0Var, "state");
            int f02 = recyclerView.f0(view);
            int dimension = (int) view.getResources().getDimension(x0.f42244p);
            if (f02 == 0) {
                rect.top = dimension * ((int) (this.f26024a / 2.0d));
                rect.bottom = 0;
                return;
            }
            RecyclerView.h adapter = recyclerView.getAdapter();
            jo.p.e(adapter);
            if (f02 == adapter.getItemCount() - 1) {
                rect.top = 0;
                rect.bottom = (dimension * ((int) (this.f26024a / 2.0d))) + 1;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<Integer> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            Bundle n02 = ChooseMyProfileFragment.this.n0();
            if (n02 != null) {
                return Integer.valueOf(n02.getInt("EXTRA_KEY_BACKGROUND_RESOURCE_ID"));
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<String> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            Bundle n02 = ChooseMyProfileFragment.this.n0();
            if (n02 != null) {
                return n02.getString("EXTRA_KEY_CLOSE_TEXT");
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<Boolean> {
        public f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            Bundle n02 = ChooseMyProfileFragment.this.n0();
            if (n02 != null) {
                return Boolean.valueOf(n02.getBoolean("EXTRA_KEY_IS_DIALOG"));
            }
            return null;
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.ChooseMyProfileFragment$observeStoreValues$3", f = "ChooseMyProfileFragment.kt", l = {397}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f26028w;

        /* renamed from: x  reason: collision with root package name */
        public Object f26029x;

        /* renamed from: y  reason: collision with root package name */
        public Object f26030y;

        /* renamed from: z  reason: collision with root package name */
        public int f26031z;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068), top: B:32:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f26031z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f26030y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f26029x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f26028w
                com.dena.mirrorman.fragment.ChooseMyProfileFragment r4 = (com.dena.mirrorman.fragment.ChooseMyProfileFragment) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7a
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrorman.fragment.ChooseMyProfileFragment r9 = com.dena.mirrorman.fragment.ChooseMyProfileFragment.this
                nf.e r9 = com.dena.mirrorman.fragment.ChooseMyProfileFragment.s3(r9)
                wo.x r3 = r9.m()
                com.dena.mirrorman.fragment.ChooseMyProfileFragment r9 = com.dena.mirrorman.fragment.ChooseMyProfileFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7a
                r4 = r9
                r9 = r8
            L3d:
                r9.f26028w = r4     // Catch: java.lang.Throwable -> L7a
                r9.f26029x = r3     // Catch: java.lang.Throwable -> L7a
                r9.f26030y = r1     // Catch: java.lang.Throwable -> L7a
                r9.f26031z = r2     // Catch: java.lang.Throwable -> L7a
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7a
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L77
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L77
                if (r9 == 0) goto L71
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L77
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L77
                gf.t r9 = com.dena.mirrorman.fragment.ChooseMyProfileFragment.t3(r5)     // Catch: java.lang.Throwable -> L77
                if (r9 == 0) goto L6b
                r9.o0()     // Catch: java.lang.Throwable -> L77
            L6b:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L71:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L77:
                r9 = move-exception
                r3 = r4
                goto L7b
            L7a:
                r9 = move-exception
            L7b:
                throw r9     // Catch: java.lang.Throwable -> L7c
            L7c:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.fragment.ChooseMyProfileFragment.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends RecyclerView.u {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.s f26033b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f26034c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ List<e.b> f26035d;

        /* JADX WARN: Multi-variable type inference failed */
        public h(androidx.recyclerview.widget.s sVar, b bVar, List<? extends e.b> list) {
            this.f26033b = sVar;
            this.f26034c = bVar;
            this.f26035d = list;
        }

        public static final void d(RecyclerView recyclerView, b bVar) {
            jo.p.h(recyclerView, "$recyclerView");
            jo.p.h(bVar, "$generationPickerAdapter");
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            bVar.notifyItemRangeChanged(((LinearLayoutManager) layoutManager).i2(), 5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            if (i10 == 0) {
                RecyclerView.p layoutManager = ChooseMyProfileFragment.this.w3().J.getLayoutManager();
                jo.p.e(layoutManager);
                androidx.recyclerview.widget.s sVar = this.f26033b;
                RecyclerView.p layoutManager2 = ChooseMyProfileFragment.this.w3().J.getLayoutManager();
                jo.p.e(layoutManager2);
                View h10 = sVar.h(layoutManager2);
                jo.p.e(h10);
                int o02 = layoutManager.o0(h10);
                ChooseMyProfileFragment.this.x3().e(this.f26035d.get(o02));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(final RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            RecyclerView.p layoutManager = ChooseMyProfileFragment.this.w3().J.getLayoutManager();
            jo.p.e(layoutManager);
            androidx.recyclerview.widget.s sVar = this.f26033b;
            RecyclerView.p layoutManager2 = ChooseMyProfileFragment.this.w3().J.getLayoutManager();
            jo.p.e(layoutManager2);
            View h10 = sVar.h(layoutManager2);
            jo.p.e(h10);
            this.f26034c.c(layoutManager.o0(h10));
            final b bVar = this.f26034c;
            recyclerView.post(new Runnable() { // from class: gf.s
                @Override // java.lang.Runnable
                public final void run() {
                    ChooseMyProfileFragment.h.d(RecyclerView.this, bVar);
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.p<Integer, e.b, v> {
        public i() {
            super(2);
        }

        public final void a(int i10, e.b bVar) {
            jo.p.h(bVar, "generation");
            ChooseMyProfileFragment chooseMyProfileFragment = ChooseMyProfileFragment.this;
            RecyclerView recyclerView = chooseMyProfileFragment.w3().J;
            jo.p.g(recyclerView, "binding.generationRecyclerView");
            chooseMyProfileFragment.H3(recyclerView, i10);
            ChooseMyProfileFragment.this.x3().e(bVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(Integer num, e.b bVar) {
            a(num.intValue(), bVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26037w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26038x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26039y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26037w = componentCallbacks;
            this.f26038x = aVar;
            this.f26039y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f26037w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f26038x, this.f26039y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<od.d> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26040w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26041x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26042y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26040w = componentCallbacks;
            this.f26041x = aVar;
            this.f26042y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.d, java.lang.Object] */
        @Override // io.a
        public final od.d invoke() {
            ComponentCallbacks componentCallbacks = this.f26040w;
            return gq.a.a(componentCallbacks).c(f0.b(od.d.class), this.f26041x, this.f26042y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26043w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26044x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26045y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26043w = componentCallbacks;
            this.f26044x = aVar;
            this.f26045y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f26043w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.k.class), this.f26044x, this.f26045y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<s0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26046w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26047x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26048y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26046w = componentCallbacks;
            this.f26047x = aVar;
            this.f26048y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.s0] */
        @Override // io.a
        public final s0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26046w;
            return gq.a.a(componentCallbacks).c(f0.b(s0.class), this.f26047x, this.f26048y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f26049w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Fragment fragment) {
            super(0);
            this.f26049w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f26049w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f26050w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f26050w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f26050w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f26051w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26052x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26053y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f26054z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f26051w = aVar;
            this.f26052x = aVar2;
            this.f26053y = aVar3;
            this.f26054z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f26051w;
            vq.a aVar2 = this.f26052x;
            io.a aVar3 = this.f26053y;
            xq.a aVar4 = this.f26054z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(nf.e.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f26055w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(io.a aVar) {
            super(0);
            this.f26055w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f26055w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public ChooseMyProfileFragment() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f26018z0 = wn.g.b(iVar, new j(this, null, null));
        this.A0 = wn.g.b(iVar, new k(this, null, null));
        n nVar = new n(this);
        xq.a a10 = gq.a.a(this);
        o oVar = new o(nVar);
        this.B0 = e0.a(this, f0.b(nf.e.class), new q(oVar), new p(nVar, null, null, a10));
        this.C0 = wn.g.b(iVar, new l(this, null, null));
        this.D0 = wn.g.b(iVar, new m(this, null, null));
        this.F0 = wn.g.a(new e());
        this.G0 = wn.g.a(new d());
        this.H0 = wn.g.a(new f());
    }

    public static final void F3(ChooseMyProfileFragment chooseMyProfileFragment, d.a aVar) {
        jo.p.h(chooseMyProfileFragment, "this$0");
        AppCompatButton appCompatButton = chooseMyProfileFragment.w3().L;
        jo.p.g(appCompatButton, "binding.maleButton");
        chooseMyProfileFragment.Q3(appCompatButton, aVar == d.a.MALE);
        AppCompatButton appCompatButton2 = chooseMyProfileFragment.w3().E;
        jo.p.g(appCompatButton2, "binding.femaleButton");
        chooseMyProfileFragment.Q3(appCompatButton2, aVar == d.a.FEMALE);
        AppCompatButton appCompatButton3 = chooseMyProfileFragment.w3().M;
        jo.p.g(appCompatButton3, "binding.otherButton");
        chooseMyProfileFragment.Q3(appCompatButton3, aVar == d.a.OTHER);
    }

    public static final void G3(ChooseMyProfileFragment chooseMyProfileFragment, Boolean bool) {
        jo.p.h(chooseMyProfileFragment, "this$0");
        jo.p.g(bool, "isSendEnabled");
        if (bool.booleanValue()) {
            chooseMyProfileFragment.w3().P.setVisibility(8);
            chooseMyProfileFragment.w3().O.setBackground(c3.a.f(chooseMyProfileFragment.N2(), y0.ripple_tealish30_rectangle_corner24_whitethree));
            chooseMyProfileFragment.w3().O.setTextColor(c3.a.d(chooseMyProfileFragment.N2(), w0.f42242u0));
            chooseMyProfileFragment.w3().O.setEnabled(true);
            return;
        }
        chooseMyProfileFragment.w3().P.setVisibility(0);
        chooseMyProfileFragment.w3().O.setBackground(c3.a.f(chooseMyProfileFragment.N2(), y0.rectangle_corner24_disabled_choose_my_apps_to_next));
        chooseMyProfileFragment.w3().O.setTextColor(c3.a.d(chooseMyProfileFragment.N2(), w0.X));
        chooseMyProfileFragment.w3().O.setEnabled(false);
    }

    public static final void L3(ChooseMyProfileFragment chooseMyProfileFragment, View view) {
        e.b f10;
        jo.p.h(chooseMyProfileFragment, "this$0");
        d.a f11 = chooseMyProfileFragment.y3().j().f();
        if (f11 == null || (f10 = chooseMyProfileFragment.y3().k().f()) == null || jo.p.c(f10, e.b.a.f42608a)) {
            return;
        }
        e.b.c cVar = f10 instanceof e.b.c ? (e.b.c) f10 : null;
        if (cVar != null) {
            int b10 = cVar.b();
            MRLogger B3 = chooseMyProfileFragment.B3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_DEMOGRAPHIC);
            builder.setTargetType("reg_done");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" \n                            {\"gender\" :\"");
            String name = f11.name();
            Locale locale = Locale.getDefault();
            jo.p.g(locale, "getDefault()");
            String lowerCase = name.toLowerCase(locale);
            jo.p.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            sb2.append(lowerCase);
            sb2.append("\", \"generation\" :");
            sb2.append(b10);
            sb2.append("} \n                            ");
            builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, so.g.f(sb2.toString()))));
            B3.sendLog(builder.build());
            chooseMyProfileFragment.x3().c(f11, b10);
            chooseMyProfileFragment.w3().O.setEnabled(false);
        }
    }

    public static final void M3(ChooseMyProfileFragment chooseMyProfileFragment, View view) {
        jo.p.h(chooseMyProfileFragment, "this$0");
        d.a f10 = chooseMyProfileFragment.y3().j().f();
        d.a aVar = d.a.MALE;
        if (f10 == aVar) {
            chooseMyProfileFragment.x3().d(null);
        } else {
            chooseMyProfileFragment.x3().d(aVar);
        }
    }

    public static final void N3(ChooseMyProfileFragment chooseMyProfileFragment, View view) {
        jo.p.h(chooseMyProfileFragment, "this$0");
        d.a f10 = chooseMyProfileFragment.y3().j().f();
        d.a aVar = d.a.FEMALE;
        if (f10 == aVar) {
            chooseMyProfileFragment.x3().d(null);
        } else {
            chooseMyProfileFragment.x3().d(aVar);
        }
    }

    public static final void O3(ChooseMyProfileFragment chooseMyProfileFragment, View view) {
        jo.p.h(chooseMyProfileFragment, "this$0");
        d.a f10 = chooseMyProfileFragment.y3().j().f();
        d.a aVar = d.a.OTHER;
        if (f10 == aVar) {
            chooseMyProfileFragment.x3().d(null);
        } else {
            chooseMyProfileFragment.x3().d(aVar);
        }
    }

    public static final void P3(ChooseMyProfileFragment chooseMyProfileFragment, View view) {
        jo.p.h(chooseMyProfileFragment, "this$0");
        t tVar = chooseMyProfileFragment.E0;
        if (tVar != null) {
            tVar.w1();
        }
    }

    public final nf.k A3() {
        return (nf.k) this.C0.getValue();
    }

    public final MRLogger B3() {
        return (MRLogger) this.f26018z0.getValue();
    }

    public final s0 C3() {
        return (s0) this.D0.getValue();
    }

    public final Boolean D3() {
        return (Boolean) this.H0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        g6 T = g6.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(\n            inf…          false\n        )");
        I3(T);
        View u10 = w3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final void E3() {
        y3().j().i(a1(), new androidx.lifecycle.f0() { // from class: gf.p
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                ChooseMyProfileFragment.F3(ChooseMyProfileFragment.this, (d.a) obj);
            }
        });
        y3().n().i(a1(), new androidx.lifecycle.f0() { // from class: gf.q
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                ChooseMyProfileFragment.G3(ChooseMyProfileFragment.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new g(null), 3, null);
    }

    public final void H3(RecyclerView recyclerView, int i10) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).J2(i10, (O0().getDimensionPixelOffset(x0.f42244p) * 2) - 1);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.E0 = null;
        super.I1();
    }

    public final void I3(g6 g6Var) {
        this.f26017y0.a(this, J0[0], g6Var);
    }

    public final void J3() {
        androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s();
        sVar.b(w3().J);
        List<e.b> l10 = y3().l();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        b bVar = new b(N2, l10, new i());
        w3().J.setHasFixedSize(true);
        w3().J.setItemAnimator(null);
        w3().J.g(new c(5));
        w3().J.setAdapter(bVar);
        w3().J.k(new h(sVar, bVar, l10));
        int indexOf = y3().l().indexOf(e.b.a.f42608a);
        if (indexOf == -1) {
            return;
        }
        RecyclerView recyclerView = w3().J;
        jo.p.g(recyclerView, "binding.generationRecyclerView");
        H3(recyclerView, indexOf);
    }

    public final void K3() {
        String z32 = z3();
        if (z32 != null) {
            w3().P.setText(z32);
        }
        Integer v32 = v3();
        if (v32 != null) {
            w3().C.setBackgroundResource(v32.intValue());
        }
        w3().L.setOnClickListener(new View.OnClickListener() { // from class: gf.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseMyProfileFragment.M3(ChooseMyProfileFragment.this, view);
            }
        });
        w3().E.setOnClickListener(new View.OnClickListener() { // from class: gf.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseMyProfileFragment.N3(ChooseMyProfileFragment.this, view);
            }
        });
        w3().M.setOnClickListener(new View.OnClickListener() { // from class: gf.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseMyProfileFragment.O3(ChooseMyProfileFragment.this, view);
            }
        });
        AppCompatTextView appCompatTextView = w3().P;
        appCompatTextView.setPaintFlags(w3().P.getPaintFlags() | 8);
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: gf.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseMyProfileFragment.P3(ChooseMyProfileFragment.this, view);
            }
        });
        w3().O.setOnClickListener(new View.OnClickListener() { // from class: gf.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseMyProfileFragment.L3(ChooseMyProfileFragment.this, view);
            }
        });
        if (jo.p.c(D3(), Boolean.TRUE)) {
            AppCompatTextView appCompatTextView2 = w3().Q;
            ViewGroup.LayoutParams layoutParams = w3().Q.getLayoutParams();
            jo.p.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.setMargins(((ViewGroup.MarginLayoutParams) bVar).leftMargin, de.e.b(this, 24), ((ViewGroup.MarginLayoutParams) bVar).rightMargin, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
            appCompatTextView2.setLayoutParams(bVar);
            w3().D.setTextSize(2, 12.0f);
            ConstraintLayout constraintLayout = w3().B;
            ViewGroup.LayoutParams layoutParams2 = w3().B.getLayoutParams();
            jo.p.f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.setMargins(((ViewGroup.MarginLayoutParams) bVar2).leftMargin, de.e.b(this, 16), ((ViewGroup.MarginLayoutParams) bVar2).rightMargin, ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin);
            constraintLayout.setLayoutParams(bVar2);
            CardView cardView = w3().I;
            ViewGroup.LayoutParams layoutParams3 = w3().I.getLayoutParams();
            jo.p.f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
            bVar3.setMargins(((ViewGroup.MarginLayoutParams) bVar3).leftMargin, de.e.b(this, 16), ((ViewGroup.MarginLayoutParams) bVar3).rightMargin, ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin);
            cardView.setLayoutParams(bVar3);
        }
    }

    public final void Q3(Button button, boolean z10) {
        if (z10) {
            button.setTextColor(c3.a.d(N2(), w0.f42242u0));
            button.setCompoundDrawablesWithIntrinsicBounds(c3.a.f(N2(), y0.ic_my_profile_check_selected), (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        button.setTextColor(c3.a.d(N2(), w0.f42230e0));
        button.setCompoundDrawablesWithIntrinsicBounds(c3.a.f(N2(), y0.ic_my_profile_check_unselected), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        w3().M(a1());
        E3();
        K3();
        J3();
        MRLogger B3 = B3();
        MRLog.Companion companion = MRLog.Companion;
        B3.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_DEMOGRAPHIC_IMP).build());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f26016x0.getCoroutineContext();
    }

    public final Integer v3() {
        return (Integer) this.G0.getValue();
    }

    public final g6 w3() {
        return (g6) this.f26017y0.b(this, J0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        t tVar = null;
        t tVar2 = context instanceof t ? (t) context : null;
        if (tVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof t) {
                tVar = (t) H0;
            }
        } else {
            tVar = tVar2;
        }
        this.E0 = tVar;
        C3().b(A3().h());
    }

    public final od.d x3() {
        return (od.d) this.A0.getValue();
    }

    public final nf.e y3() {
        return (nf.e) this.B0.getValue();
    }

    public final String z3() {
        return (String) this.F0.getValue();
    }
}
