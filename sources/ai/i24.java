package ai;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class i24 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5102a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5103b;

    /* renamed from: c  reason: collision with root package name */
    public final List<h24> f5104c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f5105d;

    public i24(int i10, String str, List<h24> list, byte[] bArr) {
        this.f5102a = i10;
        this.f5103b = str;
        this.f5104c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f5105d = bArr;
    }
}
