package ai;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zs2 {

    /* renamed from: a  reason: collision with root package name */
    public final gs2 f13106a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f13107b;

    public zs2(gs2 gs2Var, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f13107b = arrayList;
        this.f13106a = gs2Var;
        arrayList.add(str);
    }

    public final void a(String str) {
        this.f13107b.add(str);
    }

    public final gs2 b() {
        return this.f13106a;
    }

    public final ArrayList<String> c() {
        return this.f13107b;
    }
}
