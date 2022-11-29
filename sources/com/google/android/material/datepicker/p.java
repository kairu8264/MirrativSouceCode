package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public abstract class p<S> extends Fragment {

    /* renamed from: x0  reason: collision with root package name */
    public final LinkedHashSet<o<S>> f27592x0 = new LinkedHashSet<>();

    public boolean j3(o<S> oVar) {
        return this.f27592x0.add(oVar);
    }

    public void k3() {
        this.f27592x0.clear();
    }
}
