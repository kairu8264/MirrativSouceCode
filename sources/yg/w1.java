package yg;

import ai.fo3;
import ai.ly;
import ai.ny;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import p.d;

/* loaded from: classes3.dex */
public final class w1 implements ly {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ny f61991a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f61992b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Uri f61993c;

    public w1(d2 d2Var, ny nyVar, Context context, Uri uri) {
        this.f61991a = nyVar;
        this.f61992b = context;
        this.f61993c = uri;
    }

    @Override // ai.ly
    public final void zza() {
        p.d a10 = new d.a(this.f61991a.c()).a();
        a10.f45629a.setPackage(fo3.a(this.f61992b));
        a10.a(this.f61992b, this.f61993c);
        this.f61991a.b((Activity) this.f61992b);
    }
}
