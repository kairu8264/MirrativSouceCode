package org.koin.androidx.scope;

import androidx.lifecycle.h;
import androidx.lifecycle.u;
import jo.p;
import jq.a;

/* loaded from: classes4.dex */
public final class LifecycleScopeDelegate$2 implements h {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ a<Object> f45548w;

    @Override // androidx.lifecycle.h, androidx.lifecycle.m
    public void b(u uVar) {
        p.h(uVar, "owner");
        a.a(this.f45548w);
    }

    @Override // androidx.lifecycle.h, androidx.lifecycle.m
    public void g(u uVar) {
        p.h(uVar, "owner");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Closing scope: ");
        sb2.append(a.b(this.f45548w));
        sb2.append(" for ");
        throw null;
    }
}
