package m4;

import android.view.View;
import androidx.compose.ui.platform.z;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import jo.q;
import l0.c1;
import l0.i;
import l0.r;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40597a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final c1<v0> f40598b = r.c(null, C0591a.f40599w, 1, null);

    /* renamed from: m4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0591a extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0591a f40599w = new C0591a();

        public C0591a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return null;
        }
    }

    public final v0 a(i iVar, int i10) {
        iVar.x(-420916950);
        v0 v0Var = (v0) iVar.G(f40598b);
        if (v0Var == null) {
            v0Var = x0.a((View) iVar.G(z.k()));
        }
        iVar.O();
        return v0Var;
    }
}
