package rd;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends androidx.fragment.app.u {

    /* renamed from: h  reason: collision with root package name */
    public List<String> f51150h;

    /* renamed from: i  reason: collision with root package name */
    public final List<Fragment> f51151i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(List<String> list, List<? extends Fragment> list2, FragmentManager fragmentManager) {
        super(fragmentManager);
        jo.p.h(list, "titles");
        jo.p.h(list2, "fragments");
        jo.p.h(fragmentManager, "fragmentManager");
        this.f51150h = list;
        this.f51151i = list2;
    }

    @Override // j5.a
    public int c() {
        return this.f51151i.size();
    }

    @Override // androidx.fragment.app.u
    public Fragment q(int i10) {
        return this.f51151i.get(i10);
    }

    @Override // j5.a
    /* renamed from: t */
    public String e(int i10) {
        return this.f51150h.get(i10);
    }

    public final void u(List<String> list) {
        jo.p.h(list, "<set-?>");
        this.f51150h = list;
    }
}
