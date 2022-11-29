package yd;

import androidx.recyclerview.widget.j;

/* loaded from: classes2.dex */
public final class p1 extends j.f<wn.k<? extends String, ? extends Boolean>> {
    @Override // androidx.recyclerview.widget.j.f
    /* renamed from: d */
    public boolean a(wn.k<String, Boolean> kVar, wn.k<String, Boolean> kVar2) {
        jo.p.h(kVar, "oldItem");
        jo.p.h(kVar2, "newItem");
        return jo.p.c(kVar, kVar2);
    }

    @Override // androidx.recyclerview.widget.j.f
    /* renamed from: e */
    public boolean b(wn.k<String, Boolean> kVar, wn.k<String, Boolean> kVar2) {
        jo.p.h(kVar, "oldItem");
        jo.p.h(kVar2, "newItem");
        return jo.p.c(kVar.c(), kVar2.c()) && kVar.d().booleanValue() == kVar2.d().booleanValue();
    }
}
