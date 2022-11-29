package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class q extends LinearLayoutManager {

    /* loaded from: classes3.dex */
    public class a extends androidx.recyclerview.widget.r {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public q(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void R1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        S1(aVar);
    }
}
