package z5;

import android.content.Context;
import androidx.compose.ui.platform.z;
import jo.q;
import l0.c1;
import l0.r;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<x5.e> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f62567w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final x5.e invoke() {
            return null;
        }
    }

    public static c1<x5.e> a(c1<x5.e> c1Var) {
        return c1Var;
    }

    public static /* synthetic */ c1 b(c1 c1Var, int i10, jo.h hVar) {
        if ((i10 & 1) != 0) {
            c1Var = r.d(a.f62567w);
        }
        return a(c1Var);
    }

    public static final x5.e c(c1<x5.e> c1Var, l0.i iVar, int i10) {
        x5.e eVar = (x5.e) iVar.G(c1Var);
        return eVar == null ? x5.a.a((Context) iVar.G(z.g())) : eVar;
    }
}
