package vi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class k implements a<Void, g<List<g<?>>>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Collection f57373a;

    public k(Collection collection) {
        this.f57373a = collection;
    }

    @Override // vi.a
    public final /* bridge */ /* synthetic */ g<List<g<?>>> a(g<Void> gVar) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f57373a);
        return j.e(arrayList);
    }
}
