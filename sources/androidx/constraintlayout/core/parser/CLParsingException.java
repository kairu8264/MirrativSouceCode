package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: w  reason: collision with root package name */
    public final String f14733w;

    /* renamed from: x  reason: collision with root package name */
    public final int f14734x;

    /* renamed from: y  reason: collision with root package name */
    public final String f14735y;

    public String a() {
        return this.f14733w + " (" + this.f14735y + " at line " + this.f14734x + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
