package com.dena.mirrorman;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import jo.p;
import mo.c;

/* loaded from: classes2.dex */
public final class AutoClearedValue<T> implements c<Fragment, T> {

    /* renamed from: c  reason: collision with root package name */
    public static final int f25045c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f25046a;

    /* renamed from: b  reason: collision with root package name */
    public T f25047b;

    public AutoClearedValue(Fragment fragment) {
        p.h(fragment, "fragment");
        this.f25046a = fragment;
        fragment.g().a(new h(this) { // from class: com.dena.mirrorman.AutoClearedValue.1

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ AutoClearedValue<T> f25048w;

            /* renamed from: com.dena.mirrorman.AutoClearedValue$1$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements f0 {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ AutoClearedValue f25049a;

                public a(AutoClearedValue autoClearedValue) {
                    this.f25049a = autoClearedValue;
                }

                @Override // androidx.lifecycle.f0
                public final void d(T t10) {
                    o g10;
                    u uVar = (u) t10;
                    if (uVar == null || (g10 = uVar.g()) == null) {
                        return;
                    }
                    final AutoClearedValue autoClearedValue = this.f25049a;
                    g10.a(new h() { // from class: com.dena.mirrorman.AutoClearedValue$1$onCreate$1$1
                        @Override // androidx.lifecycle.h, androidx.lifecycle.m
                        public void g(u uVar2) {
                            p.h(uVar2, "owner");
                            autoClearedValue.f25047b = null;
                        }
                    });
                }
            }

            {
                this.f25048w = this;
            }

            @Override // androidx.lifecycle.h, androidx.lifecycle.m
            public void b(u uVar) {
                p.h(uVar, "owner");
                LiveData<u> b12 = this.f25048w.d().b1();
                p.g(b12, "fragment.viewLifecycleOwnerLiveData");
                b12.i(this.f25048w.d(), new a(this.f25048w));
            }
        });
    }

    public final Fragment d() {
        return this.f25046a;
    }

    @Override // mo.c
    /* renamed from: e */
    public T b(Fragment fragment, qo.h<?> hVar) {
        p.h(fragment, "thisRef");
        p.h(hVar, "property");
        T t10 = this.f25047b;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("should never call auto-cleared-value get when it might not be available");
    }

    @Override // mo.c
    /* renamed from: f */
    public void a(Fragment fragment, qo.h<?> hVar, T t10) {
        p.h(fragment, "thisRef");
        p.h(hVar, "property");
        p.h(t10, "value");
        this.f25047b = t10;
    }
}
