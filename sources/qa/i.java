package qa;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u;

/* loaded from: classes2.dex */
public final class i extends u {

    /* renamed from: h  reason: collision with root package name */
    public final int f48853h;

    /* renamed from: i  reason: collision with root package name */
    public final io.l<Integer, Fragment> f48854i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(FragmentManager fragmentManager, int i10, io.l<? super Integer, ? extends Fragment> lVar) {
        super(fragmentManager);
        jo.p.h(fragmentManager, "fragmentManager");
        jo.p.h(lVar, "fragmentFactory");
        this.f48853h = i10;
        this.f48854i = lVar;
    }

    @Override // j5.a
    public int c() {
        return this.f48853h;
    }

    @Override // androidx.fragment.app.u
    public Fragment q(int i10) {
        return this.f48854i.invoke(Integer.valueOf(i10));
    }

    @Override // j5.a
    /* renamed from: t */
    public String e(int i10) {
        return "";
    }
}
