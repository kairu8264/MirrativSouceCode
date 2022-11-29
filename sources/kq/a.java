package kq;

import androidx.lifecycle.v0;
import jo.h;
import jo.p;
import y4.e;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0552a f38937c = new C0552a(null);

    /* renamed from: a  reason: collision with root package name */
    public final v0 f38938a;

    /* renamed from: b  reason: collision with root package name */
    public final e f38939b;

    /* renamed from: kq.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0552a {
        public C0552a() {
        }

        public /* synthetic */ C0552a(h hVar) {
            this();
        }

        public final a a(v0 v0Var) {
            p.h(v0Var, "storeOwner");
            return new a(v0Var, null, 2, null);
        }

        public final a b(v0 v0Var, e eVar) {
            p.h(v0Var, "storeOwner");
            return new a(v0Var, eVar);
        }
    }

    public a(v0 v0Var, e eVar) {
        p.h(v0Var, "storeOwner");
        this.f38938a = v0Var;
        this.f38939b = eVar;
    }

    public final e a() {
        return this.f38939b;
    }

    public final v0 b() {
        return this.f38938a;
    }

    public /* synthetic */ a(v0 v0Var, e eVar, int i10, h hVar) {
        this(v0Var, (i10 & 2) != 0 ? null : eVar);
    }
}
