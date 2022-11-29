package com.dena.mirrorman.util;

import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import io.a;
import java.util.LinkedList;
import jo.p;
import wn.v;
import xn.a0;

/* loaded from: classes3.dex */
public final class FragmentRunner {

    /* renamed from: a  reason: collision with root package name */
    public final u f26238a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedList<a<v>> f26239b;

    public FragmentRunner(u uVar) {
        p.h(uVar, "lifecycleOwner");
        this.f26238a = uVar;
        this.f26239b = new LinkedList<>();
        uVar.g().a(new r() { // from class: com.dena.mirrorman.util.FragmentRunner.1

            /* renamed from: com.dena.mirrorman.util.FragmentRunner$1$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f26241a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_RESUME.ordinal()] = 1;
                    iArr[o.b.ON_DESTROY.ordinal()] = 2;
                    f26241a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar2, o.b bVar) {
                p.h(uVar2, "source");
                p.h(bVar, "event");
                int i10 = a.f26241a[bVar.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        return;
                    }
                    FragmentRunner.this.f26238a.g().c(this);
                    return;
                }
                for (io.a aVar : a0.r0(FragmentRunner.this.f26239b)) {
                    aVar.invoke();
                }
                v vVar = v.f59242a;
                FragmentRunner.this.f26239b.clear();
            }
        });
    }

    public final void c(a<v> aVar) {
        p.h(aVar, "callback");
        if (this.f26238a.g().b() == o.c.RESUMED) {
            aVar.invoke();
        } else {
            this.f26239b.add(aVar);
        }
    }
}
