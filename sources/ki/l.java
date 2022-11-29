package ki;

import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class l extends o {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ byte[] f38821t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f38822u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.google.android.gms.common.api.c cVar, byte[] bArr, String str) {
        super(cVar);
        this.f38821t = bArr;
        this.f38822u = str;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void l(c cVar) throws RemoteException {
        c cVar2 = cVar;
        j jVar = this.f38826s;
        byte[] bArr = this.f38821t;
        String str = this.f38822u;
        if (TextUtils.isEmpty(str)) {
            str = cVar2.j0("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((k) cVar2.B()).z0(jVar, bArr, str);
    }
}
