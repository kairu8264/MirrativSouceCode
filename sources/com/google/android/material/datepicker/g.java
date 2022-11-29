package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public class g extends BaseAdapter {

    /* renamed from: z  reason: collision with root package name */
    public static final int f27537z;

    /* renamed from: w  reason: collision with root package name */
    public final Calendar f27538w;

    /* renamed from: x  reason: collision with root package name */
    public final int f27539x;

    /* renamed from: y  reason: collision with root package name */
    public final int f27540y;

    static {
        f27537z = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar k10 = s.k();
        this.f27538w = k10;
        this.f27539x = k10.getMaximum(7);
        this.f27540y = k10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i10) {
        if (i10 >= this.f27539x) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    public final int b(int i10) {
        int i11 = i10 + this.f27540y;
        int i12 = this.f27539x;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f27539x;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(wi.h.f58876n, viewGroup, false);
        }
        this.f27538w.set(7, b(i10));
        textView.setText(this.f27538w.getDisplayName(7, f27537z, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(wi.j.f58897n), this.f27538w.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
