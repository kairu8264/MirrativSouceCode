package ai;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public Uri f1793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1794b = 1;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f1795c = Collections.emptyMap();

    /* renamed from: d  reason: collision with root package name */
    public long f1796d;

    /* renamed from: e  reason: collision with root package name */
    public int f1797e;

    public final aa a(Uri uri) {
        this.f1793a = uri;
        return this;
    }

    public final aa b(Map<String, String> map) {
        this.f1795c = map;
        return this;
    }

    public final aa c(long j10) {
        this.f1796d = j10;
        return this;
    }

    public final aa d(int i10) {
        this.f1797e = 6;
        return this;
    }

    public final bc e() {
        Uri uri = this.f1793a;
        if (uri != null) {
            return new bc(uri, 0L, 1, null, this.f1795c, this.f1796d, -1L, null, this.f1797e, null, null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
