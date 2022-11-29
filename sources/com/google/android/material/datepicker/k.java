package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k<S> extends p<S> {
    public com.google.android.material.datepicker.a A0;

    /* renamed from: y0  reason: collision with root package name */
    public int f27572y0;

    /* renamed from: z0  reason: collision with root package name */
    public d<S> f27573z0;

    /* loaded from: classes3.dex */
    public class a extends o<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s10) {
            Iterator<o<S>> it = k.this.f27592x0.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    public static <T> k<T> l3(d<T> dVar, int i10, com.google.android.material.datepicker.a aVar) {
        k<T> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.V2(bundle);
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        if (bundle == null) {
            bundle = n0();
        }
        this.f27572y0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f27573z0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.A0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f27573z0.o1(layoutInflater.cloneInContext(new ContextThemeWrapper(q0(), this.f27572y0)), viewGroup, bundle, this.A0, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void b2(Bundle bundle) {
        super.b2(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f27572y0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f27573z0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A0);
    }
}
