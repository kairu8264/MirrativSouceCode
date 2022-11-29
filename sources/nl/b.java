package nl;

import android.net.Uri;
import ol.c;
import vh.i;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f43701a;

    /* renamed from: b  reason: collision with root package name */
    public final ol.a f43702b;

    public b(ol.a aVar) {
        if (aVar == null) {
            this.f43702b = null;
            this.f43701a = null;
            return;
        }
        if (aVar.p() == 0) {
            aVar.w0(i.b().currentTimeMillis());
        }
        this.f43702b = aVar;
        this.f43701a = new c(aVar);
    }

    public Uri a() {
        String P;
        ol.a aVar = this.f43702b;
        if (aVar == null || (P = aVar.P()) == null) {
            return null;
        }
        return Uri.parse(P);
    }
}
