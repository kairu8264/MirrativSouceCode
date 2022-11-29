package q5;

import android.content.Context;
import android.os.Build;
import k5.k;
import t5.p;

/* loaded from: classes.dex */
public class d extends c<p5.b> {
    public d(Context context, w5.a aVar) {
        super(r5.g.c(context, aVar).d());
    }

    @Override // q5.c
    public boolean b(p pVar) {
        return pVar.f53201j.b() == k.CONNECTED;
    }

    @Override // q5.c
    /* renamed from: i */
    public boolean c(p5.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.d()) ? false : true;
        }
        return !bVar.a();
    }
}
