package eh;

import ai.e43;
import ai.fr2;
import ai.hd0;
import ai.uj0;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class d0 implements e43<Uri> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ hd0 f30569a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f0 f30570b;

    public d0(f0 f0Var, hd0 hd0Var) {
        this.f30570b = f0Var;
        this.f30569a = hd0Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        try {
            hd0 hd0Var = this.f30569a;
            String valueOf = String.valueOf(th2.getMessage());
            hd0Var.s(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(Uri uri) {
        AtomicInteger atomicInteger;
        boolean z10;
        String str;
        Uri d62;
        fr2 fr2Var;
        Uri uri2 = uri;
        try {
            atomicInteger = this.f30570b.Q;
            atomicInteger.getAndIncrement();
            this.f30569a.v0(Collections.singletonList(uri2));
            z10 = this.f30570b.L;
            if (z10) {
                str = this.f30570b.T;
                d62 = f0.d6(uri2, str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                fr2Var = this.f30570b.J;
                fr2Var.b(d62.toString());
            }
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }
}
