package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import o3.c0;

/* loaded from: classes3.dex */
public class n extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f27583a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.material.datepicker.a f27584b;

    /* renamed from: c  reason: collision with root package name */
    public final d<?> f27585c;

    /* renamed from: d  reason: collision with root package name */
    public final h.l f27586d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27587e;

    /* loaded from: classes3.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f27588w;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f27588w = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f27588w.getAdapter2().n(i10)) {
                n.this.f27586d.a(this.f27588w.getAdapter2().getItem(i10).longValue());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f27590a;

        /* renamed from: b  reason: collision with root package name */
        public final MaterialCalendarGridView f27591b;

        public b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(wi.f.f58855u);
            this.f27590a = textView;
            c0.s0(textView, true);
            this.f27591b = (MaterialCalendarGridView) linearLayout.findViewById(wi.f.f58851q);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public n(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, h.l lVar) {
        l j10 = aVar.j();
        l g10 = aVar.g();
        l i10 = aVar.i();
        if (j10.compareTo(i10) <= 0) {
            if (i10.compareTo(g10) <= 0) {
                int y32 = m.B * h.y3(context);
                int y33 = i.Q3(context) ? h.y3(context) : 0;
                this.f27583a = context;
                this.f27587e = y32 + y33;
                this.f27584b = aVar;
                this.f27585c = dVar;
                this.f27586d = lVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    public l b(int i10) {
        return this.f27584b.j().p(i10);
    }

    public CharSequence c(int i10) {
        return b(i10).n(this.f27583a);
    }

    public int d(l lVar) {
        return this.f27584b.j().q(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f */
    public void onBindViewHolder(b bVar, int i10) {
        l p10 = this.f27584b.j().p(i10);
        bVar.f27590a.setText(p10.n(bVar.itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f27591b.findViewById(wi.f.f58851q);
        if (materialCalendarGridView.getAdapter2() != null && p10.equals(materialCalendarGridView.getAdapter2().f27579w)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m(materialCalendarGridView);
        } else {
            m mVar = new m(p10, this.f27585c, this.f27584b);
            materialCalendarGridView.setNumColumns(p10.f27578z);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(wi.h.f58878p, viewGroup, false);
        if (i.Q3(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f27587e));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f27584b.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f27584b.j().p(i10).o();
    }
}
