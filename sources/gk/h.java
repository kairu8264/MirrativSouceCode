package gk;

import android.os.Bundle;
import android.os.RemoteException;
import jk.o;

/* loaded from: classes3.dex */
public final class h extends dk.g {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ o f33643x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ k f33644y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, o oVar, o oVar2) {
        super(oVar);
        this.f33644y = kVar;
        this.f33643x = oVar2;
    }

    @Override // dk.g
    public final void a() {
        dk.f fVar;
        String str;
        String str2;
        String str3;
        try {
            str2 = this.f33644y.f33651b;
            Bundle a10 = ck.a.a("review");
            k kVar = this.f33644y;
            o oVar = this.f33643x;
            str3 = kVar.f33651b;
            this.f33644y.f33650a.e().F3(str2, a10, new j(kVar, oVar, str3));
        } catch (RemoteException e10) {
            fVar = k.f33649c;
            str = this.f33644y.f33651b;
            fVar.c(e10, "error requesting in-app review for %s", str);
            this.f33643x.d(new RuntimeException(e10));
        }
    }
}
