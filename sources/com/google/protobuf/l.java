package com.google.protobuf;

import com.google.protobuf.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f28157b = true;

    /* renamed from: c  reason: collision with root package name */
    public static volatile l f28158c;

    /* renamed from: d  reason: collision with root package name */
    public static final l f28159d = new l(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, r.e<?, ?>> f28160a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f28161a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28162b;

        public a(Object obj, int i10) {
            this.f28161a = obj;
            this.f28162b = i10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f28161a == aVar.f28161a && this.f28162b == aVar.f28162b;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f28161a) * 65535) + this.f28162b;
        }
    }

    public l() {
        this.f28160a = new HashMap();
    }

    public static l b() {
        l lVar = f28158c;
        if (lVar == null) {
            synchronized (l.class) {
                lVar = f28158c;
                if (lVar == null) {
                    lVar = f28157b ? fn.c.a() : f28159d;
                    f28158c = lVar;
                }
            }
        }
        return lVar;
    }

    public <ContainingType extends d0> r.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (r.e<ContainingType, ?>) this.f28160a.get(new a(containingtype, i10));
    }

    public l(boolean z10) {
        this.f28160a = Collections.emptyMap();
    }
}
