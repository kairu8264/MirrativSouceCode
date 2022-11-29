package mh;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements vi.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ z f41184a = new z();

    @Override // vi.a
    public final Object a(vi.g gVar) {
        if (gVar.s()) {
            return (Bundle) gVar.o();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(gVar.n());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", gVar.n());
    }
}
