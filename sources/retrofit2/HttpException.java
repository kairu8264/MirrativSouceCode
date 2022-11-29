package retrofit2;

import er.s;
import java.util.Objects;

/* loaded from: classes4.dex */
public class HttpException extends RuntimeException {

    /* renamed from: w  reason: collision with root package name */
    public final int f51322w;

    /* renamed from: x  reason: collision with root package name */
    public final String f51323x;

    /* renamed from: y  reason: collision with root package name */
    public final transient s<?> f51324y;

    public HttpException(s<?> sVar) {
        super(a(sVar));
        this.f51322w = sVar.b();
        this.f51323x = sVar.g();
        this.f51324y = sVar;
    }

    public static String a(s<?> sVar) {
        Objects.requireNonNull(sVar, "response == null");
        return "HTTP " + sVar.b() + " " + sVar.g();
    }
}
