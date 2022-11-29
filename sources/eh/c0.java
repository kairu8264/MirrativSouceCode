package eh;

import ai.e43;
import ai.fr2;
import ai.hd0;
import ai.uj0;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c0 implements e43<ArrayList<Uri>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ hd0 f30566a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f0 f30567b;

    public c0(f0 f0Var, hd0 hd0Var) {
        this.f30567b = f0Var;
        this.f30566a = hd0Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        try {
            hd0 hd0Var = this.f30566a;
            String valueOf = String.valueOf(th2.getMessage());
            hd0Var.s(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(ArrayList<Uri> arrayList) {
        boolean z10;
        String str;
        Uri d62;
        fr2 fr2Var;
        ArrayList<Uri> arrayList2 = arrayList;
        try {
            this.f30566a.v0(arrayList2);
            z10 = this.f30567b.K;
            if (z10) {
                Iterator<Uri> it = arrayList2.iterator();
                while (it.hasNext()) {
                    Uri next = it.next();
                    if (f0.s6(next)) {
                        str = this.f30567b.T;
                        d62 = f0.d6(next, str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        fr2Var = this.f30567b.J;
                        fr2Var.b(d62.toString());
                    }
                }
            }
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }
}
