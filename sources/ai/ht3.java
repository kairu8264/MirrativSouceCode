package ai;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ht3 implements a8 {

    /* renamed from: a  reason: collision with root package name */
    public final a8 f4995a;

    /* renamed from: b  reason: collision with root package name */
    public long f4996b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f4997c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, List<String>> f4998d;

    public ht3(a8 a8Var) {
        Objects.requireNonNull(a8Var);
        this.f4995a = a8Var;
        this.f4997c = Uri.EMPTY;
        this.f4998d = Collections.emptyMap();
    }

    @Override // ai.a8
    public final Map<String, List<String>> a() {
        return this.f4995a.a();
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        int b10 = this.f4995a.b(bArr, i10, i11);
        if (b10 != -1) {
            this.f4996b += b10;
        }
        return b10;
    }

    @Override // ai.a8
    public final void g() throws IOException {
        this.f4995a.g();
    }

    @Override // ai.a8
    public final Uri h() {
        return this.f4995a.h();
    }

    @Override // ai.a8
    public final void l(pm pmVar) {
        Objects.requireNonNull(pmVar);
        this.f4995a.l(pmVar);
    }

    @Override // ai.a8
    public final long m(bc bcVar) throws IOException {
        this.f4997c = bcVar.f2279a;
        this.f4998d = Collections.emptyMap();
        long m10 = this.f4995a.m(bcVar);
        Uri h10 = h();
        Objects.requireNonNull(h10);
        this.f4997c = h10;
        this.f4998d = a();
        return m10;
    }

    public final long q() {
        return this.f4996b;
    }

    public final Uri r() {
        return this.f4997c;
    }

    public final Map<String, List<String>> s() {
        return this.f4998d;
    }
}
