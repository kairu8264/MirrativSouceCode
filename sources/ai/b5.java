package ai;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class b5 {

    /* renamed from: a  reason: collision with root package name */
    public String f2237a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f2238b;

    /* renamed from: c  reason: collision with root package name */
    public final e5 f2239c = new e5(null);

    /* renamed from: d  reason: collision with root package name */
    public final List f2240d = Collections.emptyList();

    /* renamed from: e  reason: collision with root package name */
    public final List f2241e = Collections.emptyList();

    public final b5 a(String str) {
        this.f2237a = str;
        return this;
    }

    public final b5 b(Uri uri) {
        this.f2238b = uri;
        return this;
    }

    public final k5 c() {
        Uri uri = this.f2238b;
        j5 j5Var = uri != null ? new j5(uri, null, null, null, this.f2240d, null, this.f2241e, null, null) : null;
        String str = this.f2237a;
        if (str == null) {
            str = "";
        }
        return new k5(str, new d5(0L, Long.MIN_VALUE, false, false, false, null), j5Var, new h5(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), o5.f7642t, null);
    }
}
