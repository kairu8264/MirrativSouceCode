package ai;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class s44 {

    /* renamed from: a  reason: collision with root package name */
    public final int f9715a;

    /* renamed from: b  reason: collision with root package name */
    public final List<p34> f9716b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9717c;

    /* renamed from: d  reason: collision with root package name */
    public final InputStream f9718d;

    public s44(int i10, List<p34> list, int i11, InputStream inputStream) {
        this.f9715a = i10;
        this.f9716b = list;
        this.f9717c = i11;
        this.f9718d = inputStream;
    }

    public final int a() {
        return this.f9715a;
    }

    public final List<p34> b() {
        return Collections.unmodifiableList(this.f9716b);
    }

    public final int c() {
        return this.f9717c;
    }

    public final InputStream d() {
        InputStream inputStream = this.f9718d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }
}
