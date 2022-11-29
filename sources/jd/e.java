package jd;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import jd.e;
import pc.e0;

/* loaded from: classes2.dex */
public final class e extends androidx.fragment.app.e {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public e0 N0;
    public androidx.lifecycle.e0<String> O0 = new androidx.lifecycle.e0<>();
    public boolean P0 = true;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a(String str, String str2) {
            jo.p.h(str, "date");
            jo.p.h(str2, "editableDate");
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_INITIAL_DATE", str);
            bundle.putString("EXTRA_EDITABLE_DATE", str2);
            eVar.V2(bundle);
            return eVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.h<RecyclerView.e0> {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<Calendar> f37599a;

        /* renamed from: b  reason: collision with root package name */
        public final String f37600b;

        /* renamed from: c  reason: collision with root package name */
        public int f37601c;

        /* loaded from: classes2.dex */
        public static final class a extends RecyclerView.e0 {
            public a(View view) {
                super(view);
            }
        }

        public b(ArrayList<Calendar> arrayList, String str) {
            jo.p.h(arrayList, "calendars");
            jo.p.h(str, "dateFormat");
            this.f37599a = arrayList;
            this.f37600b = str;
        }

        public final void a(int i10) {
            this.f37601c = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f37599a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
            jo.p.h(e0Var, "holder");
            TextView textView = (TextView) e0Var.itemView.findViewById(nc.e.f41834n6);
            textView.setText(new SimpleDateFormat(this.f37600b, Locale.JAPAN).format(this.f37599a.get(i10).getTime()));
            if (i10 == this.f37601c) {
                textView.setTextColor(c3.a.d(e0Var.itemView.getContext(), nc.b.f41804x));
                textView.setTextSize(18.0f);
                return;
            }
            textView.setTextColor(c3.a.d(e0Var.itemView.getContext(), nc.b.f41800t));
            textView.setTextSize(16.0f);
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
        public final int f37602a;

        public c(int i10) {
            this.f37602a = i10;
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
                rect.top = dimension * ((int) (this.f37602a / 2.0d));
                rect.bottom = 0;
                return;
            }
            RecyclerView.h adapter = recyclerView.getAdapter();
            jo.p.e(adapter);
            if (f02 == adapter.getItemCount() - 1) {
                rect.top = 0;
                rect.bottom = (dimension * ((int) (this.f37602a / 2.0d))) + 1;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        public int f37603a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.s f37605c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f37606d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ArrayList<Calendar> f37607e;

        public d(androidx.recyclerview.widget.s sVar, b bVar, ArrayList<Calendar> arrayList) {
            this.f37605c = sVar;
            this.f37606d = bVar;
            this.f37607e = arrayList;
        }

        public static final void d(RecyclerView.p pVar, b bVar) {
            jo.p.h(pVar, "$layoutManager");
            jo.p.h(bVar, "$dateAdapter");
            bVar.notifyItemRangeChanged(((LinearLayoutManager) pVar).i2(), 5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            RecyclerView.p layoutManager;
            String str;
            jo.p.h(recyclerView, "recyclerView");
            if (i10 != 0 || (layoutManager = e.this.G3().D.getLayoutManager()) == null) {
                return;
            }
            androidx.recyclerview.widget.s sVar = this.f37605c;
            e eVar = e.this;
            ArrayList<Calendar> arrayList = this.f37607e;
            View h10 = sVar.h(layoutManager);
            if (h10 == null || (str = (String) eVar.O0.f()) == null) {
                return;
            }
            androidx.lifecycle.e0 e0Var = eVar.O0;
            jo.p.g(str, "it");
            String substring = str.substring(0, 2);
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String format = String.format("%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(Integer.parseInt(substring)), Integer.valueOf(arrayList.get(layoutManager.o0(h10)).get(5))}, 2));
            jo.p.g(format, "format(this, *args)");
            e0Var.m(format);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int o02;
            jo.p.h(recyclerView, "recyclerView");
            final RecyclerView.p layoutManager = e.this.G3().D.getLayoutManager();
            if (layoutManager != null) {
                androidx.recyclerview.widget.s sVar = this.f37605c;
                final b bVar = this.f37606d;
                View h10 = sVar.h(layoutManager);
                if (h10 == null || (o02 = layoutManager.o0(h10)) == this.f37603a) {
                    return;
                }
                bVar.a(o02);
                recyclerView.post(new Runnable() { // from class: jd.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.d.d(RecyclerView.p.this, bVar);
                    }
                });
                this.f37603a = o02;
            }
        }
    }

    /* renamed from: jd.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0510e extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        public int f37608a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.s f37610c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f37611d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ArrayList<Calendar> f37612e;

        public C0510e(androidx.recyclerview.widget.s sVar, b bVar, ArrayList<Calendar> arrayList) {
            this.f37610c = sVar;
            this.f37611d = bVar;
            this.f37612e = arrayList;
        }

        public static final void d(RecyclerView.p pVar, b bVar) {
            jo.p.h(pVar, "$layoutManager");
            jo.p.h(bVar, "$dateAdapter");
            bVar.notifyItemRangeChanged(((LinearLayoutManager) pVar).i2(), 5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            RecyclerView.p layoutManager;
            String str;
            jo.p.h(recyclerView, "recyclerView");
            if (i10 != 0 || (layoutManager = e.this.G3().E.getLayoutManager()) == null) {
                return;
            }
            androidx.recyclerview.widget.s sVar = this.f37610c;
            e eVar = e.this;
            ArrayList<Calendar> arrayList = this.f37612e;
            View h10 = sVar.h(layoutManager);
            if (h10 == null || (str = (String) eVar.O0.f()) == null) {
                return;
            }
            androidx.lifecycle.e0 e0Var = eVar.O0;
            jo.p.g(str, "it");
            String substring = str.substring(2);
            jo.p.g(substring, "this as java.lang.String).substring(startIndex)");
            String format = String.format("%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(arrayList.get(layoutManager.o0(h10)).get(2) + 1), Integer.valueOf(Integer.parseInt(substring))}, 2));
            jo.p.g(format, "format(this, *args)");
            e0Var.m(format);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int o02;
            jo.p.h(recyclerView, "recyclerView");
            final RecyclerView.p layoutManager = e.this.G3().E.getLayoutManager();
            if (layoutManager != null) {
                androidx.recyclerview.widget.s sVar = this.f37610c;
                final b bVar = this.f37611d;
                View h10 = sVar.h(layoutManager);
                if (h10 == null || (o02 = layoutManager.o0(h10)) == this.f37608a) {
                    return;
                }
                bVar.a(o02);
                recyclerView.post(new Runnable() { // from class: jd.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.C0510e.d(RecyclerView.p.this, bVar);
                    }
                });
                this.f37608a = o02;
            }
        }
    }

    public static final void H3(e eVar, String str) {
        jo.p.h(eVar, "this$0");
        Bundle n02 = eVar.n0();
        String string = n02 != null ? n02.getString("EXTRA_EDITABLE_DATE", "") : null;
        if (!TextUtils.isEmpty(string != null ? string : "")) {
            eVar.P0 = false;
            eVar.G3().B.setBackgroundResource(nc.d.rectangle_corner20_warmgray);
            return;
        }
        try {
            Calendar F3 = eVar.F3();
            F3.set(1, 2020);
            jo.p.g(str, "date");
            String substring = str.substring(0, 2);
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            F3.set(2, Integer.parseInt(substring) - 1);
            String substring2 = str.substring(2);
            jo.p.g(substring2, "this as java.lang.String).substring(startIndex)");
            F3.set(5, Integer.parseInt(substring2));
            F3.setLenient(false);
            F3.getTime();
            eVar.P0 = true;
            eVar.G3().B.setBackgroundResource(nc.d.Y0);
        } catch (Throwable unused) {
            eVar.P0 = false;
            eVar.G3().B.setBackgroundResource(nc.d.rectangle_corner20_warmgray);
        }
    }

    public static final void I3(e eVar, View view) {
        jo.p.h(eVar, "this$0");
        eVar.m3();
    }

    public static final void J3(e eVar, View view) {
        String f10;
        jo.p.h(eVar, "this$0");
        if (eVar.P0) {
            androidx.fragment.app.h j02 = eVar.j0();
            h hVar = j02 instanceof h ? (h) j02 : null;
            if (hVar != null && (f10 = eVar.O0.f()) != null) {
                jo.p.g(f10, "it");
                hVar.K2(f10);
            }
            eVar.m3();
        }
    }

    public final Calendar F3() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPAN);
        calendar.clear(10);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        jo.p.g(calendar, "calendar");
        return calendar;
    }

    public final e0 G3() {
        e0 e0Var = this.N0;
        if (e0Var != null) {
            return e0Var;
        }
        jo.p.v("binding");
        return null;
    }

    public final void K3(String str) {
        RecyclerView recyclerView = G3().E;
        jo.p.g(recyclerView, "binding.monthPickerRecyclerView");
        String substring = str.substring(0, 2);
        jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        L3(recyclerView, Integer.parseInt(substring) - 1);
        RecyclerView recyclerView2 = G3().D;
        jo.p.g(recyclerView2, "binding.datePickerRecyclerView");
        String substring2 = str.substring(2);
        jo.p.g(substring2, "this as java.lang.String).substring(startIndex)");
        L3(recyclerView2, Integer.parseInt(substring2) - 1);
    }

    public final void L3(RecyclerView recyclerView, int i10) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).J2(i10, (O0().getDimensionPixelOffset(nc.c.picker_item_size) * 2) - 1);
    }

    public final void M3(e0 e0Var) {
        jo.p.h(e0Var, "<set-?>");
        this.N0 = e0Var;
    }

    public final void N3() {
        Calendar F3 = F3();
        F3.set(2, 0);
        F3.set(5, 1);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 31; i10++) {
            Object clone = F3.clone();
            jo.p.f(clone, "null cannot be cast to non-null type java.util.Calendar");
            arrayList.add((Calendar) clone);
            F3.add(5, 1);
        }
        b bVar = new b(arrayList, "d日");
        G3().D.setAdapter(bVar);
        androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s();
        sVar.b(G3().D);
        G3().D.setHasFixedSize(true);
        G3().D.setItemAnimator(null);
        G3().D.g(new c(5));
        G3().D.k(new d(sVar, bVar, arrayList));
    }

    public final void O3() {
        Calendar F3 = F3();
        F3.set(2, 0);
        F3.set(5, 1);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 12; i10++) {
            Object clone = F3.clone();
            jo.p.f(clone, "null cannot be cast to non-null type java.util.Calendar");
            arrayList.add((Calendar) clone);
            F3.add(2, 1);
        }
        b bVar = new b(arrayList, "M月");
        G3().E.setAdapter(bVar);
        androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s();
        sVar.b(G3().E);
        G3().E.setHasFixedSize(true);
        G3().E.setItemAnimator(null);
        G3().E.g(new c(5));
        G3().E.k(new C0510e(sVar, bVar, arrayList));
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), nc.f.dialog_date_picker, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        M3((e0) e10);
        Dialog r32 = super.r3(bundle);
        jo.p.g(r32, "super.onCreateDialog(savedInstanceState)");
        r32.setContentView(G3().u());
        r32.setCancelable(true);
        r32.setCanceledOnTouchOutside(true);
        Window window = r32.getWindow();
        jo.p.e(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        O3();
        N3();
        this.O0.i(this, new f0() { // from class: jd.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                e.H3(e.this, (String) obj);
            }
        });
        G3().C.setOnClickListener(new View.OnClickListener() { // from class: jd.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.I3(e.this, view);
            }
        });
        G3().B.setOnClickListener(new View.OnClickListener() { // from class: jd.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.J3(e.this, view);
            }
        });
        Bundle n02 = n0();
        String string = n02 != null ? n02.getString("EXTRA_INITIAL_DATE", "0101") : null;
        if (string == null) {
            string = "0101";
        }
        String str = TextUtils.isEmpty(string) ? "0101" : string;
        this.O0.m(str);
        K3(str);
        Bundle n03 = n0();
        String string2 = n03 != null ? n03.getString("EXTRA_EDITABLE_DATE", "") : null;
        String str2 = string2 != null ? string2 : "";
        if (!TextUtils.isEmpty(str2) && str2.length() == 8) {
            AppCompatTextView appCompatTextView = G3().F;
            int i10 = nc.i.text_anniversary_setting_alert2;
            String substring = str2.substring(0, 4);
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = str2.substring(4, 6);
            jo.p.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring3 = str2.substring(6, 8);
            jo.p.g(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            String format = String.format("%s/%s/%s", Arrays.copyOf(new Object[]{substring, substring2, substring3}, 3));
            jo.p.g(format, "format(this, *args)");
            appCompatTextView.setText(V0(i10, format));
        }
        return r32;
    }
}
