package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class m extends BaseAdapter {
    public static final int B = s.k().getMaximum(4);
    public final a A;

    /* renamed from: w  reason: collision with root package name */
    public final l f27579w;

    /* renamed from: x  reason: collision with root package name */
    public final d<?> f27580x;

    /* renamed from: y  reason: collision with root package name */
    public Collection<Long> f27581y;

    /* renamed from: z  reason: collision with root package name */
    public c f27582z;

    public m(l lVar, d<?> dVar, a aVar) {
        this.f27579w = lVar;
        this.f27580x = dVar;
        this.A = aVar;
        this.f27581y = dVar.D1();
    }

    public int a(int i10) {
        return b() + (i10 - 1);
    }

    public int b() {
        return this.f27579w.i();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i10) {
        if (i10 < this.f27579w.i() || i10 > i()) {
            return null;
        }
        return Long.valueOf(this.f27579w.l(j(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = wi.h.f58875m
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.l r8 = r5.f27579w
            int r2 = r8.A
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.l r8 = r5.f27579w
            long r7 = r8.l(r7)
            com.google.android.material.datepicker.l r3 = r5.f27579w
            int r3 = r3.f27577y
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.l.h()
            int r4 = r4.f27577y
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.e.d(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void e(Context context) {
        if (this.f27582z == null) {
            this.f27582z = new c(context);
        }
    }

    public boolean f(int i10) {
        return i10 % this.f27579w.f27578z == 0;
    }

    public boolean g(int i10) {
        return (i10 + 1) % this.f27579w.f27578z == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f27579w.A + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f27579w.f27578z;
    }

    public final boolean h(long j10) {
        Iterator<Long> it = this.f27580x.D1().iterator();
        while (it.hasNext()) {
            if (s.a(j10) == s.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public int i() {
        return (this.f27579w.i() + this.f27579w.A) - 1;
    }

    public int j(int i10) {
        return (i10 - this.f27579w.i()) + 1;
    }

    public final void k(TextView textView, long j10) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.A.f().p0(j10)) {
            textView.setEnabled(true);
            if (h(j10)) {
                bVar = this.f27582z.f27529b;
            } else if (s.i().getTimeInMillis() == j10) {
                bVar = this.f27582z.f27530c;
            } else {
                bVar = this.f27582z.f27528a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f27582z.f27534g;
        }
        bVar.d(textView);
    }

    public final void l(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (l.e(j10).equals(this.f27579w)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(this.f27579w.m(j10)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l10 : this.f27581y) {
            l(materialCalendarGridView, l10.longValue());
        }
        d<?> dVar = this.f27580x;
        if (dVar != null) {
            for (Long l11 : dVar.D1()) {
                l(materialCalendarGridView, l11.longValue());
            }
            this.f27581y = this.f27580x.D1();
        }
    }

    public boolean n(int i10) {
        return i10 >= b() && i10 <= i();
    }
}
