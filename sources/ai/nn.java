package ai;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class nn {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f7408a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7409b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7410c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7411d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7412e;

    public nn(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        this.f7408a = inputStream;
        this.f7409b = z10;
        this.f7410c = z11;
        this.f7411d = j10;
        this.f7412e = z12;
    }

    public static nn a(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        return new nn(inputStream, z10, z11, j10, z12);
    }

    public final InputStream b() {
        return this.f7408a;
    }

    public final boolean c() {
        return this.f7409b;
    }

    public final boolean d() {
        return this.f7410c;
    }

    public final long e() {
        return this.f7411d;
    }

    public final boolean f() {
        return this.f7412e;
    }
}
