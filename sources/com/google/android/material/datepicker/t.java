package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public class t extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    public final h<?> f27598a;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f27599w;

        public a(int i10) {
            this.f27599w = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f27598a.C3(t.this.f27598a.u3().e(l.c(this.f27599w, t.this.f27598a.w3().f27576x)));
            t.this.f27598a.D3(h.k.DAY);
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f27601a;

        public b(TextView textView) {
            super(textView);
            this.f27601a = textView;
        }
    }

    public t(h<?> hVar) {
        this.f27598a = hVar;
    }

    public final View.OnClickListener b(int i10) {
        return new a(i10);
    }

    public int c(int i10) {
        return i10 - this.f27598a.u3().j().f27577y;
    }

    public int d(int i10) {
        return this.f27598a.u3().j().f27577y + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f */
    public void onBindViewHolder(b bVar, int i10) {
        int d10 = d(i10);
        String string = bVar.f27601a.getContext().getString(wi.j.f58898o);
        bVar.f27601a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(d10)));
        bVar.f27601a.setContentDescription(String.format(string, Integer.valueOf(d10)));
        c v32 = this.f27598a.v3();
        Calendar i11 = s.i();
        com.google.android.material.datepicker.b bVar2 = i11.get(1) == d10 ? v32.f27533f : v32.f27531d;
        for (Long l10 : this.f27598a.x3().D1()) {
            i11.setTimeInMillis(l10.longValue());
            if (i11.get(1) == d10) {
                bVar2 = v32.f27532e;
            }
        }
        bVar2.d(bVar.f27601a);
        bVar.f27601a.setOnClickListener(b(d10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(wi.h.f58880r, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f27598a.u3().k();
    }
}
