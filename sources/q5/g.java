package q5;

import android.content.Context;
import android.os.Build;
import k5.k;
import t5.p;

/* loaded from: classes.dex */
public class g extends c<p5.b> {
    public g(Context context, w5.a aVar) {
        super(r5.g.c(context, aVar).d());
    }

    @Override // q5.c
    public boolean b(p pVar) {
        return pVar.f53201j.b() == k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f53201j.b() == k.TEMPORARILY_UNMETERED);
    }

    @Override // q5.c
    /* renamed from: i */
    public boolean c(p5.b bVar) {
        return !bVar.a() || bVar.b();
    }
}
