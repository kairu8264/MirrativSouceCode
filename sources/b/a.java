package b;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f16660a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public volatile Context f16661b;

    public void a(b bVar) {
        if (this.f16661b != null) {
            bVar.a(this.f16661b);
        }
        this.f16660a.add(bVar);
    }

    public void b() {
        this.f16661b = null;
    }

    public void c(Context context) {
        this.f16661b = context;
        for (b bVar : this.f16660a) {
            bVar.a(context);
        }
    }
}
