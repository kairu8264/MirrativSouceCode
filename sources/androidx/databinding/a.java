package androidx.databinding;

import androidx.databinding.h;

/* loaded from: classes.dex */
public class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public transient m f15019a;

    @Override // androidx.databinding.h
    public void a(h.a aVar) {
        synchronized (this) {
            if (this.f15019a == null) {
                this.f15019a = new m();
            }
        }
        this.f15019a.b(aVar);
    }

    @Override // androidx.databinding.h
    public void b(h.a aVar) {
        synchronized (this) {
            m mVar = this.f15019a;
            if (mVar == null) {
                return;
            }
            mVar.l(aVar);
        }
    }

    public void c(int i10) {
        synchronized (this) {
            m mVar = this.f15019a;
            if (mVar == null) {
                return;
            }
            mVar.f(this, i10, null);
        }
    }
}
