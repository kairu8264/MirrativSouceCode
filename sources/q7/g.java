package q7;

import android.annotation.SuppressLint;
import o7.u;
import q7.h;

/* loaded from: classes.dex */
public class g extends i8.g<m7.e, u<?>> implements h {

    /* renamed from: e  reason: collision with root package name */
    public h.a f48765e;

    public g(long j10) {
        super(j10);
    }

    @Override // q7.h
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // q7.h
    public /* bridge */ /* synthetic */ u c(m7.e eVar, u uVar) {
        return (u) super.k(eVar, uVar);
    }

    @Override // q7.h
    public /* bridge */ /* synthetic */ u d(m7.e eVar) {
        return (u) super.l(eVar);
    }

    @Override // q7.h
    public void e(h.a aVar) {
        this.f48765e = aVar;
    }

    @Override // i8.g
    /* renamed from: n */
    public int i(u<?> uVar) {
        if (uVar == null) {
            return super.i(null);
        }
        return uVar.a();
    }

    @Override // i8.g
    /* renamed from: o */
    public void j(m7.e eVar, u<?> uVar) {
        h.a aVar = this.f48765e;
        if (aVar == null || uVar == null) {
            return;
        }
        aVar.a(uVar);
    }
}
