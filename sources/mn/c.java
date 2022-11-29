package mn;

import android.annotation.SuppressLint;

/* loaded from: classes4.dex */
public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final a f41221a;

    /* renamed from: b  reason: collision with root package name */
    public final d<T> f41222b;

    /* renamed from: c  reason: collision with root package name */
    public final String f41223c;

    public c(a aVar, d<T> dVar, String str) {
        this.f41221a = aVar;
        this.f41222b = dVar;
        this.f41223c = str;
    }

    public T a() {
        return this.f41222b.b(this.f41221a.get().getString(this.f41223c, null));
    }

    @SuppressLint({"CommitPrefEdits"})
    public void b(T t10) {
        a aVar = this.f41221a;
        aVar.b(aVar.a().putString(this.f41223c, this.f41222b.a(t10)));
    }
}
