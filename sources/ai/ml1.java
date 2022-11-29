package ai;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ml1<T> implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<T> f6969a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6970b;

    /* renamed from: c  reason: collision with root package name */
    public final r30<T> f6971c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ nl1 f6972d;

    public /* synthetic */ ml1(nl1 nl1Var, WeakReference weakReference, String str, r30 r30Var, kl1 kl1Var) {
        this.f6972d = nl1Var;
        this.f6969a = weakReference;
        this.f6970b = str;
        this.f6971c = r30Var;
    }

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        T t10 = this.f6969a.get();
        if (t10 == null) {
            this.f6972d.f(this.f6970b, this);
        } else {
            this.f6971c.a(t10, map);
        }
    }
}
