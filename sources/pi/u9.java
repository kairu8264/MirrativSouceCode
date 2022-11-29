package pi;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u9 implements s3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f48272a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ba f48273b;

    public u9(ba baVar, String str) {
        this.f48273b = baVar;
        this.f48272a = str;
    }

    @Override // pi.s3
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map<String, List<String>> map) {
        this.f48273b.m(i10, th2, bArr, this.f48272a);
    }
}
