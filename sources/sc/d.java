package sc;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import io.p;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import jo.f0;
import jo.i0;
import jo.q;
import kq.a;
import pc.g0;
import rc.r0;
import sc.d;
import wn.v;
import xn.a0;

/* loaded from: classes2.dex */
public final class d extends androidx.fragment.app.e {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public g0 N0;
    public e0<Calendar> O0 = new e0<>();
    public final wn.f P0;
    public sc.j Q0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a(long j10) {
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putLong("EXTRA_INITIAL_MILLIS", j10);
            dVar.V2(bundle);
            return dVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.h<RecyclerView.e0> {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<Calendar> f52610a;

        /* renamed from: b  reason: collision with root package name */
        public final p<Integer, Calendar, v> f52611b;

        /* renamed from: c  reason: collision with root package name */
        public int f52612c;

        /* loaded from: classes2.dex */
        public static final class a extends RecyclerView.e0 {
            public a(View view) {
                super(view);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(ArrayList<Calendar> arrayList, p<? super Integer, ? super Calendar, v> pVar) {
            jo.p.h(arrayList, "calendars");
            jo.p.h(pVar, "onClickListener");
            this.f52610a = arrayList;
            this.f52611b = pVar;
        }

        public static final void c(b bVar, int i10, View view) {
            jo.p.h(bVar, "this$0");
            p<Integer, Calendar, v> pVar = bVar.f52611b;
            Integer valueOf = Integer.valueOf(i10);
            Calendar calendar = bVar.f52610a.get(i10);
            jo.p.g(calendar, "calendars[position]");
            pVar.invoke(valueOf, calendar);
        }

        public final Calendar b() {
            Calendar calendar = this.f52610a.get(0);
            jo.p.g(calendar, "calendars[0]");
            return calendar;
        }

        public final void d(int i10) {
            this.f52612c = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f52610a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.e0 e0Var, final int i10) {
            jo.p.h(e0Var, "holder");
            TextView textView = (TextView) e0Var.itemView.findViewById(nc.e.f41834n6);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            if (jo.p.c(simpleDateFormat.format(Calendar.getInstance().getTime()), simpleDateFormat.format(this.f52610a.get(i10).getTime()))) {
                textView.setText(new SimpleDateFormat("今日 (E)", Locale.JAPAN).format(new Date()));
            } else {
                textView.setText(new SimpleDateFormat("M月d日 (E)", Locale.JAPAN).format(this.f52610a.get(i10).getTime()));
            }
            if (i10 == this.f52612c) {
                textView.setTextColor(c3.a.d(e0Var.itemView.getContext(), nc.b.f41804x));
                textView.setTextSize(18.0f);
            } else {
                textView.setTextColor(c3.a.d(e0Var.itemView.getContext(), nc.b.f41800t));
                textView.setTextSize(16.0f);
            }
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: sc.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.b.c(d.b.this, i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
            jo.p.h(viewGroup, "parent");
            a aVar = new a(LayoutInflater.from(viewGroup.getContext()).inflate(nc.f.view_holder_date_picker_layout, viewGroup, false));
            ViewGroup.LayoutParams layoutParams = aVar.itemView.getLayoutParams();
            layoutParams.height = viewGroup.getMeasuredHeight() / 5;
            aVar.itemView.setLayoutParams(layoutParams);
            return aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        public final int f52613a;

        public c(int i10) {
            this.f52613a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            jo.p.h(rect, "outRect");
            jo.p.h(view, "view");
            jo.p.h(recyclerView, "parent");
            jo.p.h(b0Var, "state");
            int f02 = recyclerView.f0(view);
            int dimension = (int) view.getResources().getDimension(nc.c.picker_item_size);
            if (f02 == 0) {
                rect.top = dimension * ((int) (this.f52613a / 2.0d));
                rect.bottom = 0;
                return;
            }
            RecyclerView.h adapter = recyclerView.getAdapter();
            jo.p.e(adapter);
            if (f02 == adapter.getItemCount() - 1) {
                rect.top = 0;
                rect.bottom = (dimension * ((int) (this.f52613a / 2.0d))) + 1;
            }
        }
    }

    /* renamed from: sc.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0804d extends RecyclerView.h<RecyclerView.e0> {

        /* renamed from: a  reason: collision with root package name */
        public final List<Integer> f52614a;

        /* renamed from: b  reason: collision with root package name */
        public final p<Integer, Integer, v> f52615b;

        /* renamed from: c  reason: collision with root package name */
        public int f52616c;

        /* renamed from: sc.d$d$a */
        /* loaded from: classes2.dex */
        public static final class a extends RecyclerView.e0 {
            public a(View view) {
                super(view);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0804d(List<Integer> list, p<? super Integer, ? super Integer, v> pVar) {
            jo.p.h(list, "numbers");
            jo.p.h(pVar, "onClickListener");
            this.f52614a = list;
            this.f52615b = pVar;
        }

        public static final void c(C0804d c0804d, int i10, int i11, View view) {
            jo.p.h(c0804d, "this$0");
            c0804d.f52615b.invoke(Integer.valueOf(i10), c0804d.f52614a.get(i11));
        }

        public final int b() {
            return this.f52614a.size();
        }

        public final void d(int i10) {
            this.f52616c = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return Integer.MAX_VALUE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.e0 e0Var, final int i10) {
            jo.p.h(e0Var, "holder");
            final int size = i10 % this.f52614a.size();
            TextView textView = (TextView) e0Var.itemView.findViewById(nc.e.f41834n6);
            i0 i0Var = i0.f38149a;
            String format = String.format(Locale.US, "%02d", Arrays.copyOf(new Object[]{this.f52614a.get(size)}, 1));
            jo.p.g(format, "format(locale, format, *args)");
            textView.setText(format);
            if (size == this.f52616c) {
                textView.setTextColor(c3.a.d(e0Var.itemView.getContext(), nc.b.f41804x));
                textView.setTextSize(18.0f);
            } else {
                textView.setTextColor(c3.a.d(e0Var.itemView.getContext(), nc.b.f41800t));
                textView.setTextSize(16.0f);
            }
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: sc.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.C0804d.c(d.C0804d.this, i10, size, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
            jo.p.h(viewGroup, "parent");
            a aVar = new a(LayoutInflater.from(viewGroup.getContext()).inflate(nc.f.f41866r0, viewGroup, false));
            ViewGroup.LayoutParams layoutParams = aVar.itemView.getLayoutParams();
            layoutParams.height = viewGroup.getMeasuredHeight() / 5;
            aVar.itemView.setLayoutParams(layoutParams);
            return aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends RecyclerView.u {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s f52618b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C0804d f52619c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ List<Integer> f52620d;

        public e(s sVar, C0804d c0804d, List<Integer> list) {
            this.f52618b = sVar;
            this.f52619c = c0804d;
            this.f52620d = list;
        }

        public static final void d(RecyclerView recyclerView, C0804d c0804d) {
            jo.p.h(recyclerView, "$recyclerView");
            jo.p.h(c0804d, "$minutePickerAdapter");
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            c0804d.notifyItemRangeChanged(((LinearLayoutManager) layoutManager).i2(), 5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            if (i10 == 0) {
                RecyclerView.p layoutManager = d.this.H3().H.getLayoutManager();
                jo.p.e(layoutManager);
                s sVar = this.f52618b;
                RecyclerView.p layoutManager2 = d.this.H3().H.getLayoutManager();
                jo.p.e(layoutManager2);
                View h10 = sVar.h(layoutManager2);
                jo.p.e(h10);
                int intValue = this.f52620d.get(layoutManager.o0(h10) % this.f52619c.b()).intValue();
                Calendar calendar = (Calendar) d.this.O0.f();
                jo.p.e(calendar);
                calendar.set(12, intValue);
                d.this.O0.m(calendar);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(final RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            RecyclerView.p layoutManager = d.this.H3().H.getLayoutManager();
            jo.p.e(layoutManager);
            s sVar = this.f52618b;
            RecyclerView.p layoutManager2 = d.this.H3().H.getLayoutManager();
            jo.p.e(layoutManager2);
            View h10 = sVar.h(layoutManager2);
            jo.p.e(h10);
            int o02 = layoutManager.o0(h10);
            C0804d c0804d = this.f52619c;
            c0804d.d(o02 % c0804d.b());
            final C0804d c0804d2 = this.f52619c;
            recyclerView.post(new Runnable() { // from class: sc.g
                @Override // java.lang.Runnable
                public final void run() {
                    d.e.d(RecyclerView.this, c0804d2);
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements p<Integer, Integer, v> {
        public f() {
            super(2);
        }

        public final void a(int i10, int i11) {
            d dVar = d.this;
            RecyclerView recyclerView = dVar.H3().H;
            jo.p.g(recyclerView, "binding.minutePickerRecyclerView");
            dVar.O3(recyclerView, i10);
            Calendar calendar = (Calendar) d.this.O0.f();
            jo.p.e(calendar);
            calendar.set(12, i11);
            d.this.O0.m(calendar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        public int f52622a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s f52624c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f52625d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ArrayList<Calendar> f52626e;

        public g(s sVar, b bVar, ArrayList<Calendar> arrayList) {
            this.f52624c = sVar;
            this.f52625d = bVar;
            this.f52626e = arrayList;
        }

        public static final void d(d dVar, b bVar) {
            jo.p.h(dVar, "this$0");
            jo.p.h(bVar, "$dateAdapter");
            RecyclerView.p layoutManager = dVar.H3().E.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            bVar.notifyItemRangeChanged(((LinearLayoutManager) layoutManager).i2(), 5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            if (i10 == 0) {
                RecyclerView.p layoutManager = d.this.H3().E.getLayoutManager();
                jo.p.e(layoutManager);
                s sVar = this.f52624c;
                RecyclerView.p layoutManager2 = d.this.H3().E.getLayoutManager();
                jo.p.e(layoutManager2);
                View h10 = sVar.h(layoutManager2);
                jo.p.e(h10);
                Calendar calendar = this.f52626e.get(layoutManager.o0(h10));
                jo.p.g(calendar, "selectableCalendars[position]");
                Calendar calendar2 = calendar;
                Calendar calendar3 = (Calendar) d.this.O0.f();
                jo.p.e(calendar3);
                calendar3.set(calendar2.get(1), calendar2.get(2), calendar2.get(5));
                d.this.O0.m(calendar3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            RecyclerView.p layoutManager = d.this.H3().E.getLayoutManager();
            jo.p.e(layoutManager);
            s sVar = this.f52624c;
            RecyclerView.p layoutManager2 = d.this.H3().E.getLayoutManager();
            jo.p.e(layoutManager2);
            View h10 = sVar.h(layoutManager2);
            jo.p.e(h10);
            int o02 = layoutManager.o0(h10);
            if (o02 != this.f52622a) {
                this.f52625d.d(o02);
                final d dVar = d.this;
                final b bVar = this.f52625d;
                recyclerView.post(new Runnable() { // from class: sc.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.g.d(d.this, bVar);
                    }
                });
                this.f52622a = o02;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements p<Integer, Calendar, v> {
        public h() {
            super(2);
        }

        public final void a(int i10, Calendar calendar) {
            jo.p.h(calendar, "clickedCalendar");
            d dVar = d.this;
            RecyclerView recyclerView = dVar.H3().E;
            jo.p.g(recyclerView, "binding.datePickerRecyclerView");
            dVar.O3(recyclerView, i10);
            Calendar calendar2 = (Calendar) d.this.O0.f();
            jo.p.e(calendar2);
            calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5));
            d.this.O0.m(calendar2);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(Integer num, Calendar calendar) {
            a(num.intValue(), calendar);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        public int f52628a = -1;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s f52630c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ C0804d f52631d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ArrayList<Integer> f52632e;

        public i(s sVar, C0804d c0804d, ArrayList<Integer> arrayList) {
            this.f52630c = sVar;
            this.f52631d = c0804d;
            this.f52632e = arrayList;
        }

        public static final void d(d dVar, C0804d c0804d) {
            jo.p.h(dVar, "this$0");
            jo.p.h(c0804d, "$numberPickAdapter");
            RecyclerView.p layoutManager = dVar.H3().G.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            c0804d.notifyItemRangeChanged(((LinearLayoutManager) layoutManager).i2(), 5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            if (i10 == 0) {
                RecyclerView.p layoutManager = d.this.H3().G.getLayoutManager();
                jo.p.e(layoutManager);
                s sVar = this.f52630c;
                RecyclerView.p layoutManager2 = d.this.H3().G.getLayoutManager();
                jo.p.e(layoutManager2);
                View h10 = sVar.h(layoutManager2);
                jo.p.e(h10);
                Integer num = this.f52632e.get(layoutManager.o0(h10) % this.f52631d.b());
                jo.p.g(num, "hours24[realPosition]");
                int intValue = num.intValue();
                Calendar calendar = (Calendar) d.this.O0.f();
                jo.p.e(calendar);
                calendar.set(11, intValue);
                d.this.O0.m(calendar);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            RecyclerView.p layoutManager = d.this.H3().G.getLayoutManager();
            jo.p.e(layoutManager);
            s sVar = this.f52630c;
            RecyclerView.p layoutManager2 = d.this.H3().G.getLayoutManager();
            jo.p.e(layoutManager2);
            View h10 = sVar.h(layoutManager2);
            jo.p.e(h10);
            int o02 = layoutManager.o0(h10);
            if (o02 != this.f52628a) {
                C0804d c0804d = this.f52631d;
                c0804d.d(o02 % c0804d.b());
                final d dVar = d.this;
                final C0804d c0804d2 = this.f52631d;
                recyclerView.post(new Runnable() { // from class: sc.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.i.d(d.this, c0804d2);
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements p<Integer, Integer, v> {
        public j() {
            super(2);
        }

        public final void a(int i10, int i11) {
            d dVar = d.this;
            RecyclerView recyclerView = dVar.H3().G;
            jo.p.g(recyclerView, "binding.hourPickerRecyclerView");
            dVar.O3(recyclerView, i10);
            Calendar calendar = (Calendar) d.this.O0.f();
            jo.p.e(calendar);
            calendar.set(11, i11);
            d.this.O0.m(calendar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f52634w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f52634w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f52634w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f52634w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f52635w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f52635w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f52635w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f52636w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f52637x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f52638y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f52639z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f52636w = aVar;
            this.f52637x = aVar2;
            this.f52638y = aVar3;
            this.f52639z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f52636w;
            vq.a aVar2 = this.f52637x;
            io.a aVar3 = this.f52638y;
            xq.a aVar4 = this.f52639z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(r0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f52640w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar) {
            super(0);
            this.f52640w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f52640w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public d() {
        k kVar = new k(this);
        xq.a a10 = gq.a.a(this);
        l lVar = new l(kVar);
        this.P0 = androidx.fragment.app.e0.a(this, f0.b(r0.class), new n(lVar), new m(kVar, null, null, a10));
    }

    public static final void K3(d dVar, Calendar calendar) {
        jo.p.h(dVar, "this$0");
        if ((calendar != null ? calendar.compareTo(dVar.G3()) : 0) < 0) {
            Calendar J3 = dVar.J3();
            dVar.O0.m(J3);
            dVar.N3(J3);
        }
    }

    public static final void L3(d dVar, View view) {
        jo.p.h(dVar, "this$0");
        dVar.m3();
    }

    public static final void M3(d dVar, View view) {
        jo.p.h(dVar, "this$0");
        Calendar f10 = dVar.O0.f();
        int timeInMillis = (int) ((f10 != null ? f10.getTimeInMillis() : 0L) / 1000);
        dVar.I3().O(timeInMillis);
        sc.j jVar = dVar.Q0;
        if (jVar != null) {
            jVar.I(timeInMillis);
        }
        dVar.m3();
    }

    public final Calendar G3() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPAN);
        calendar.clear(13);
        calendar.clear(14);
        jo.p.g(calendar, "calendar");
        return calendar;
    }

    public final g0 H3() {
        g0 g0Var = this.N0;
        if (g0Var != null) {
            return g0Var;
        }
        jo.p.v("binding");
        return null;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.Q0 = null;
        super.I1();
    }

    public final r0 I3() {
        return (r0) this.P0.getValue();
    }

    public final Calendar J3() {
        Calendar G3 = G3();
        G3.add(12, 15);
        return G3;
    }

    public final void N3(Calendar calendar) {
        RecyclerView.h adapter = H3().E.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.user.mypage.announce.DatetimePickerDialog.DatePickerAdapter");
        Calendar b10 = ((b) adapter).b();
        Object clone = calendar.clone();
        jo.p.f(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) clone;
        calendar2.set(11, 0);
        calendar2.clear(12);
        Calendar G3 = G3();
        G3.setTime(new Date(calendar2.getTimeInMillis() - b10.getTimeInMillis()));
        RecyclerView recyclerView = H3().E;
        jo.p.g(recyclerView, "binding.datePickerRecyclerView");
        O3(recyclerView, G3.get(5) - 1);
        RecyclerView.h adapter2 = H3().G.getAdapter();
        jo.p.f(adapter2, "null cannot be cast to non-null type com.dena.mirrativ.user.mypage.announce.DatetimePickerDialog.NumberPickerAdapter");
        int b11 = (1073741823 - (1073741823 % ((C0804d) adapter2).b())) + calendar.get(11);
        RecyclerView recyclerView2 = H3().G;
        jo.p.g(recyclerView2, "binding.hourPickerRecyclerView");
        O3(recyclerView2, b11);
        RecyclerView.h adapter3 = H3().H.getAdapter();
        jo.p.f(adapter3, "null cannot be cast to non-null type com.dena.mirrativ.user.mypage.announce.DatetimePickerDialog.NumberPickerAdapter");
        int i10 = calendar.get(12);
        RecyclerView recyclerView3 = H3().H;
        jo.p.g(recyclerView3, "binding.minutePickerRecyclerView");
        O3(recyclerView3, i10 + (1073741823 - (1073741823 % ((C0804d) adapter3).b())));
    }

    public final void O3(RecyclerView recyclerView, int i10) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).J2(i10, (O0().getDimensionPixelOffset(nc.c.picker_item_size) * 2) - 1);
    }

    public final void P3(g0 g0Var) {
        jo.p.h(g0Var, "<set-?>");
        this.N0 = g0Var;
    }

    public final void Q3() {
        List B0 = a0.B0(new po.i(0, 59));
        s sVar = new s();
        sVar.b(H3().H);
        C0804d c0804d = new C0804d(B0, new f());
        H3().H.setHasFixedSize(true);
        H3().H.setItemAnimator(null);
        H3().H.setAdapter(c0804d);
        H3().H.k(new e(sVar, c0804d, B0));
    }

    public final void R3() {
        Calendar G3 = G3();
        G3.set(11, 0);
        G3.clear(12);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 30; i10++) {
            Object clone = G3.clone();
            jo.p.f(clone, "null cannot be cast to non-null type java.util.Calendar");
            arrayList.add((Calendar) clone);
            G3.add(5, 1);
        }
        b bVar = new b(arrayList, new h());
        H3().E.setAdapter(bVar);
        s sVar = new s();
        sVar.b(H3().E);
        H3().E.setHasFixedSize(true);
        H3().E.setItemAnimator(null);
        H3().E.g(new c(5));
        H3().E.k(new g(sVar, bVar, arrayList));
    }

    public final void S3() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 24; i10++) {
            arrayList.add(Integer.valueOf(i10));
        }
        C0804d c0804d = new C0804d(arrayList, new j());
        s sVar = new s();
        sVar.b(H3().G);
        H3().G.setHasFixedSize(true);
        H3().G.setItemAnimator(null);
        H3().G.setAdapter(c0804d);
        H3().G.k(new i(sVar, c0804d, arrayList));
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Calendar calendar;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), nc.f.dialog_datetime_picker, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        P3((g0) e10);
        Dialog r32 = super.r3(bundle);
        jo.p.g(r32, "super.onCreateDialog(savedInstanceState)");
        r32.setContentView(H3().u());
        r32.setCancelable(true);
        r32.setCanceledOnTouchOutside(true);
        Window window = r32.getWindow();
        jo.p.e(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        R3();
        Q3();
        S3();
        this.O0.i(this, new androidx.lifecycle.f0() { // from class: sc.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                d.K3(d.this, (Calendar) obj);
            }
        });
        H3().C.setOnClickListener(new View.OnClickListener() { // from class: sc.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.L3(d.this, view);
            }
        });
        H3().B.setOnClickListener(new View.OnClickListener() { // from class: sc.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.M3(d.this, view);
            }
        });
        long j10 = M2().getLong("EXTRA_INITIAL_MILLIS", 0L);
        if (j10 == 0) {
            calendar = J3();
        } else {
            Calendar G3 = G3();
            G3.setTime(new Date(j10));
            G3.clear(13);
            G3.clear(14);
            calendar = G3;
        }
        this.O0.m(calendar);
        N3(calendar);
        return r32;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.Q0 = H0 instanceof sc.j ? (sc.j) H0 : null;
    }
}
